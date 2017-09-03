<%@ tag body-content="scriptless" pageEncoding="UTF-8"%>
<%@ tag trimDirectiveWhitespaces="true"%>
<%@ attribute name="value" type="java.lang.String" required="true" %>
<%
	value=value.replace("\n<br>", "\n");
	value=value.replace("&amp;", "&");
	value=value.replace("&it;", "<");
	value=value.replace("&nbsp;", " ");
%>
<%= value %>