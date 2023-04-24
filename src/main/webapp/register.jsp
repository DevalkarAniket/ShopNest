<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ShopNest:Registration</title>
<%@include file="allcss.jsp"%>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<div class="container p-3">
		<div class="row me-5">
			<div class="col-md-5 offset-md-4">
				<div class="card">
					<div class="card-body p-4">
						<h4 class="text-center p-1">
							<b>REGISTRATION &nbsp;PAGE</b>
						</h4>
						<form class="mx-auto" action="reg" method="post">
							<div class="input-group my-3">
								<div class="input-group-text">
									<i class="fa-solid fa-user"></i>
								</div>
								<input type="text" class="form-control" placeholder="User name"
									required="required" name="uname">
							</div>
							<div class="input-group my-3">
								<div class="input-group-text">
									<i class="fa-solid fa-envelope"></i>
								</div>
								<input type="text" class="form-control" placeholder="Email"
									required="required" name="email">

							</div>
							<div class="input-group my-3">
								<div class="input-group-text">
									<i class="fa-solid fa-lock"></i>
								</div>
								<input type="text" class="form-control" placeholder="Password"
									required="required" name="password">

							</div>

							<div class="input-group my-3">
								<div class="input-group-text">
									<i class="fa-solid fa-location-dot"></i>
								</div>
								<input type="text" class="form-control" placeholder="Address"
									required="required" name="address">

							</div>

							<label class="form-check-label" for="inlineRadio1">Gender
								<i class="fa-solid fa-circle-question"></i>
							</label>
							<div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" name="gender" type="radio"
										id="inlineRadio1" value="male"> <label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female"> <label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio3" value="other"> <label
										class="form-check-label" for="inlineRadio3">Other</label>
								</div>
							</div>


							<div class="my-3 form-check">
								<input type="checkbox" name="check" class="form-check-input">
								<label class="form-check-label">Agree Terms & Conditions</label>
							</div>
							<div class="text-center d-flex">
								<button type="submit"
									class="btn btn-success col-md-6 offset-md-3">Register</button>
							</div>
							<div style="border-bottom: 1px solid #a0a0a0;" class="my-2"></div>

							<p class="text-center">
								Already a user? <a href="login.jsp" class="text-primary">Login</a>
							</p>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>