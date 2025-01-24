<%@page language = "java" %>

<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Spring Boot MVC</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>


    <!--- Form container to store ID and Name of Alien--->
              <div class="form-container">

                <h2>Welcome to the Alien</h2>

                <form action="addAlien">
                    <div class="form-group">
                        <label for="id">Enter the ID</label>
                        <input type="text" id="id" name="id" required>
                    </div>

                    <div class="form-group">
                        <label for="aname">Enter the Name</label>
                        <input type="text" id="aname" name="aname" required>
                    </div>

                    <p> Added Alien is: ${alien}</p>

                    <button type="submit" class="submit-button">Submit</button>
                </form>
            </div>

             <!--- Form container to add two numbers--->
                     <!---
              <div class="form-container">

                <h2>Contact Form</h2>

                <form action="add">
                    <div class="form-group">
                        <label for="num1">Enter the first Num</label>
                        <input type="text" id="num1" name="num1" required>
                    </div>

                    <div class="form-group">
                        <label for="num2">Enter the second Num</label>
                        <input type="text" id="num2" name="num2" required>
                    </div>

                    <div class = "result-section">
                          <!--- Result : <%= session.getAttribute("result")%> --->
                          Result : ${result}
                    </div>

                    <button type="submit" class="submit-button">Submit</button>
                </form>
            </div>

                    --->

</body>
</html>