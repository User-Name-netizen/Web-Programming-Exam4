<!DOCTYPE html>
<%@ page session="false" %>
<html>
  <head>
    <meta charset="utf-8" />
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/survey.css" type="text/css" />
  </head>

  <body>
    <h1>Survey Result</h1>

    <p></p>

    <label>First Name:</label>
    <span>${user.firstName}</span><br />
    <label>Last Name:</label>
    <span>${user.lastName}</span><br />
    <label>Email:</label>
    <span>${user.email}</span><br />
    <label>Date of Birth:</label>
    <span>${user.dateOfBirth}</span><br />
    <label>Heard from:</label>
    <span>${user.heardFrom}</span><br />
    <label>Wants updates:</label>
    <span>${user.wantsUpdates}</span><br />
    <label>Email OK:</label>
    <span>${user.emailOK}</span><br />
    <label>Preferred Contact:</label>
    <span>${user.contactVia}</span><br />
    <p></p>

    <form action="surveyServlet" method="get">
      <input type="hidden" name="action" value="join" />
      <input type="submit" value="Back to Survey" />
    </form>
  </body>
</html>
