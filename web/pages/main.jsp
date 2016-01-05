<%-- 
    Document   : main.jsp
    Created on : Dec 29, 2015, 5:56:20 PM
    Author     : Home
--%>

<%@page import="authors.Author"%>
<%@page import="authors.AuthorList"%>
<%@page import="test_jdbc.TestJdbc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Онлайн библиотека</title>
        <link href="../CSS/style_main.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="container">
          <div class="header">
              <div class="logo">
              <img src="../images/333.png" alt="Логотип" name="logo" />
              </div>
               <div class="descr">
                    <h3>Онлайн библиотека Станислава</h3>
                </div>
                <div class="search_form">
              <form  name="search_form" method="POST">
                <img src="../images/222.png" width="20"
                                      height="21"/> 
                <input  type="text" name="search_String" value="" size="100" />
                    <input class="search_button" type="submit" value="Поиск" name="search_button" />
                    <select name="search_option">
                        <option>Название</option>
                        <option>Автор</option>
                      
                      
                    </select>
                    
                </form>
            </div>
  <div class="sidebar1">
                <h4>Список авторов:</h4>
                <ul class="nav">
                    <% AuthorList authorList = new AuthorList();
                        for (Author author : authorList.getAuthorList()) {
                    %>
                    <li><a href="#"><%=author.getName()%></a></li>

                    <%}%>
                </ul>
                <p>&nbsp;</p>
            </div>




            <div class="content">
                <h1>&nbsp;</h1>
                <p>&nbsp;</p>
            </div>
</div>

                    
        </div><!-- end .container -->
                
    </body>
</body>

</body>
</html>