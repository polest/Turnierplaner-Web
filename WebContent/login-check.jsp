<jsp:useBean id="user" class="Model.UserData" scope="session"/>
<jsp:setProperty name="user" property="*"/> 
<%
	 response.sendRedirect( "welcome.jsp" );
%>