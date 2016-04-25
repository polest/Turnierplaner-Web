<jsp:useBean id="user" class="Model.User" scope="session"/>
<jsp:setProperty name="user" property="*"/> 
<%
	 response.sendRedirect( "welcome.jsp" );
%>