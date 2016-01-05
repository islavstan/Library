

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Онлайн библиотека</title>
        <link href="CSS/style_index.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="main">
            <div class="content">
                <p class="title"><img src="images/111.jpg" width="76"
                                      height="77" hspace="10" vspace="10"
                                      align="middle"</p>
                <p class="title">Онлайн библиотека</p>
                <p class="text">Добро пожаловать в онлайн библиотеку, где вы 
                    сможете найти любую книгу на ваш вкус. Доступны функции поиска, просмотра, сортировки и многие другие.</p>
            <p class="text">Проект находится в разработке, поэтому дизайн и функционал будет постоянно дорабатываться.</p>
            <p class="text">По всем вопросам обращайтесь по адресу <a href="mailto:islavstan@gmail.com">islavstan@gmail.com</a></p>
                <p>&nbsp;</p>
  </div>

            <div class="login_div">
                <p class="title"">Для входа введит свои данные:</p>
 
                <form class="login_form"  name="username" action="pages/main.jsp" method="POST">
                Имя:<input type="text" name="username" value="" size="20" />
                
                    <input type="submit" value="Войти" />
                                </form>
 </div>

            <div class="footer">
                Разработчик: Стас Горобец, 2016г.
            </div>
        </div>


    </body>
</html>

