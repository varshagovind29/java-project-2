<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body style="background-color: lightblue" >
<h1 style="color:red" align="center" >Interview Selection Application</h1><br><br>
<form:form action="saveSelectionAppDto" modelAttribute="selectionAppDto">

<div align="center">
<label><B>Candidate Name: </B></label> 
        <input type="text" placeholder="   Enter Name " required>
        <br><br>
        <label><B>Gender</B></label>
            <br>
             <input type="radio" name="gender" id="male" ><label for="male">Male</label>
             <input type="radio"name="gender" id="f"><label for="f">Female</label>
             <input type="radio" name="gender" id="o"><label for="o">Others</label>
            
            <br><br>
            
             <span><B>Phone no: </B> </span>
            <input type="tel" maxlength="13" minlength="10" value="+91"  required >
            <br><br>
            <span><B>Date of Birth: </B></span>
            <input type="date" required>
            <br><br>
            <span><B>E-mail Id: </B> </span>
            <input type="email"  placeholder="  Enter Email" required >
            <br><br>

            <legend><B>Interesting in:  </B> 
                <select>
                    <option>-------select------</option>
                <option value="">Associate Role</option>
                <option value="">SME Role</option>
                </select>
            </legend>
            <br><br>

                <legend>
                    <B>Location Preference: </B>
                <select>
                    <option>-------select------</option>
                    <option value=" ">chennai</option>
                    <option value=" ">Bangalore</option>
                
                </select>
                </legend>
                <br><br>

                <legand><B>Experience in: </B>
                    <select>
                        <option> ---------select----------</option>
                        <option value="">Teaching Experience</option>
                        <option value="">Assesment Experience</option>
                    </select>
                </legand>
                <br><br>

                <legend><B>Number of Experience: </B>
                    <select name="" id="">
                        <option>-------select------</option>
                        <option value="">0-1Y</option>
                        <option value="">1-3Y</option>
                        <option value="">3-5Y</option>
                        <option value="">5-10Y</option>
                    </select>
                </legend>
                <br><br>
                
                <legend><B>Subject Specialization:</B>
                    <select >
                        <option>-------select-------</option>
                        <option value="">Maths</option>
                        <option value="">Science</option>
                        <option value="">Social Studies</option>
                        <option value="">English</option>
                        <option value="">Kannada</option>
                    </select>

                </legend>
                <br><br>
                <legend><B>Available for Joining: </B>
                    <select>
                        <option>-------select------</option>
                        <option value="">Immediate</option>
                        <option value="">15Days</option>
                        <option value="">30Days</option>
                        <option value="">60Days</option>
                        
                    </select>

                </legend>
            </div>
	<br><br>
	
	</div>
	
	<div class="sum" align="center">
                <a href=" "><button>Submit</button></a>
            </div>
            </form:form>
</body>
</html>