<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]>      <html class="no-js"> <!--<![endif]-->
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="">
        <style>
            .container{
                 width:400px;
                 height:500px;
                 text-align: auto;
                 margin: auto;
               background-color: royalblue;
               padding: 10px;
            }
            .form{
                margin: auto;
                margin-left: 10mm;
              height: 100mm;
            }
            h3{
                text-align: center;
            }
              .checkbox{
          color: gold;
          height:100px;
         }
         .form-control{
         margin-top:auto		;
         }
         
        </style>
    </head>
    <body>
  <div class="container">
    <div class="card"></div>
    <h3>Complex Form</h3>
      <div class="alert alert-danger" role="alert">
      <form:errors path="student.*"/>
       </div>
   <div class="form">
    <form action="./cform" method="post">  
        <label for="html">your name</label><br>
        <input type="text" name="yourname" placeholder="enter your name" style="height:20px"/><br><br>
        <label for="html">your id</label><br>
        <input type="text" name="yourid" placeholder="enter your id" style="height:20px"/><br><br>
        <label for="html">your dob</label><br>
        <input type="text" name="dob" placeholder="dd/mm/yy" style="height:20px"/><br><br>
       
         <div class="checkbox" name="courses">select Language<br>
        <input type="Checkbox" name="courses" value="java" Checked>java<br>
        <input type="Checkbox" name="courses" value="c++">C++<br>
        <input type="Checkbox" name="courses" value=".Net">.Net
       </div>
             
            <div class="form-control mt-5px">Select your gender<br>
             <input type="radio" name="gender" value="male"> Male
              <input type="radio" name="gender" value="female"> Female
            </div>
              
               

     <div  style="text-align:center " >
          <div style="margin-top:10px"/>
         <button style="backgrount-color:red" type="submit">Sign up</button>
    </div>
    </form>

  </div>
    
    </body>
</html>