<%@ tag body-content="scriptless" pageEncoding="UTF-8"%>
<%@ tag trimDirectiveWhitespaces="true"%>
<%@ attribute name="value" type="java.lang.String" required="true" %>
<%
	value=value.replace("\n","\n<br>");
	value=value.replace("&","&amp;");
	value=value.replace(" ","&nbsp;");
%>
<%= value %>