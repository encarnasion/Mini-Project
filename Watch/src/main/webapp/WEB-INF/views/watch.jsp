<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <meta charset="UTF-8">
      <script type="text/javascript">
         var timer;
         
         // setInterval 함수를 이용해 1초간격으로 proc.do 요청
         window.onload = function() {
               timer = window.setInterval(
               function(){
                  $.ajax({
                       url : "proc.do",
                       type : "POST",
                       cache : false,
                       success : function(response){
                          document.getElementById('watch').innerHTML ='현재시간은 '+response+" 입니다.";
                       }
                   });
               },1000);
           };
      </script>
   <title>Insert title here</title>
   </head>
   <body>
      <div id="watch"></div>
   </body>
</html>