<%--
  Created by IntelliJ IDEA.
  User: anton
  Date: 08.04.2020
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Your profile</title>
    <style>
      body { background: aqua; }
    </style>
  </head>
  <body>
  <r>
  <center>
    <h1>Your profile</h1>
  </center>
  </r>

      <form action="/profile" method="POST">

          <p><h2> What is your name? </h2></p>
          <p></p>
          <p>First name: <input type="text" name="firstName"></p>
          <p>Last name: <input type="text" name="lastName"></p>
          <p></p>
          <p> <h2> Are you over 18 years old? </h2></p>
          <div>
              <input type="radio" id="Yes"
                     name="age" value="1">
              <label for="Yes">Yes</label>

              <input type="radio" id="No"
                     name="age" value="0">
              <label for="No">No</label>
          </div>
          <p></p>
          <p><h2>Do you learn Java?</h2></p>
          <p></p>
          <div>
              <input type="radio" id="learn"
                     name="learn" value="1">
              <label for="learn">Yes</label>

              <input type="radio" id="noLearn"
                     name="learn" value="0">
              <label for="noLearn">No</label>
          </div>
          <p></p>
         <p><input type="submit" /> </form></p>

  </body>
</html>
