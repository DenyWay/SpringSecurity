<%-- 
    Document   : login
    Created on : 24.05.2017, 15:21:36
    Author     : DenyWay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type=text/css href="../css/style.css">
        <script type="text/javascript" href="../javaScript/javascript.js"></script>
        <title>Введите логин и пароль</title>      
    </head>
    <body>
        <div id=popup_enter class=popup>
            <div class=popup__top>                   
                <div id=title class=popup__title>Вход в АС "Винни-Пух"</div>
            </div>
            <div class="popup__form clearfix">
    		<form method=post name="loginForm" action="/Bki/j_security_check">
                    <div class=item>
                        <label id=label-USERNAME for=field-username>Имя пользователя</label>
                        <input id=field-username type=text name="j_username"> 
                    </div>
                    <div class=item>
                        <label id=label-PASSWORD for=field-password>Пароль</label>
                        <input id=field-password type=password name=j_password> 
                    </div>
                    <button type=submit onmousedown="MouseDown(this);" onmouseup="MouseUp(this);" onmouseover="MouseOver(this);" onmouseout="MouseOut(this);">
                        <div id=label-LOGON_SUBMIT_BUTTON_CAPTION onclick="javascript:document.loginForm.submit(); return false;">Вход</div>
                    </button> 
		</form>
            </div>
        </div>
    </body>
</html>
