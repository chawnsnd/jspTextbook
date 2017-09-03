//콘텐츠에 대한 데이터를 담음(기존 콘텐츠 VO와 아티클 VO를 같이 나타낸 VO)

package article.service;

import article.model.Article;
import article.model.ArticleContent;

public class ArticleData {
	
	private Article article;
	private ArticleContent content;
	
	public ArticleData(Article article, ArticleContent content){
		this.article=article;
		this.content=content;
	}

	public Article getArticle() {
		return article;
	}

	public ArticleContent getContent() {
		return content;
	}
	
	

}
