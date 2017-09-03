package article.command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.service.ArticleContentNotFoundException;
import article.service.ArticleData;
import article.service.ArticleNotFoundException;
import article.service.DeleteArticleService;
import article.service.DeleteRequest;
import article.service.PermissionChecker;
import article.service.PermissionDeniedException;
import article.service.ReadArticleService;
import auth.service.User;
import mvc.command.CommandHandler;

public class DeleteArticleHandler implements CommandHandler{

	private ReadArticleService readService = new ReadArticleService();
	private DeleteArticleService deleteService = new DeleteArticleService();
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception{
		String noVal = req.getParameter("no");
		int articleNum = Integer.parseInt(noVal);

		User authUser =(User) req.getSession().getAttribute("authUser");
		ArticleData articleData = readService.getArticle(articleNum, true);
		if(!PermissionChecker.canModify(authUser.getId(), articleData.getArticle())){
			res.sendError(HttpServletResponse.SC_FORBIDDEN);
			return null;
		}
		DeleteRequest delReq = new DeleteRequest(authUser.getId(), articleNum);

		try{
			deleteService.delete(delReq);
			return "/WEB-INF/view/deleteSuccess.jsp";
		}catch(ArticleNotFoundException e){
			res.sendError(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}catch(PermissionDeniedException e){
			res.sendError(HttpServletResponse.SC_FORBIDDEN);
			return null;
		}

	}
	
}
