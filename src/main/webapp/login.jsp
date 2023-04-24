<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ShopNest:Login</title>
<%@include file="allcss.jsp"%>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<div class="container p-3">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body p-4">
						<h4 class="text-center p-1">
							<b>LOGIN</b>
						</h4>
						<form action="log" method="post">
							<div class="input-group my-3">
								<div class="input-group-text">
									<i class="fa-solid fa-user"></i>
								</div>
								<input type="text" class="form-control" placeholder="User name"
									required="required" name="uname">
							</div>
							<div class="input-group my-3">
								<div class="input-group-text">
									<i class="fa-solid fa-lock"></i>
								</div>
								<input type="text" class="form-control" placeholder="Password"
									required="required" name="password">
							</div>
							<div class="text-center d-grid my-3">
								<button type="submit" class="btn btn-primary text-white"
									style="font-size: 20px;">Log In</button>
								<div class="my-2">
									<a href="home.jsp" class="text-primary">Forgotten password?</a>
								</div>
								<div style="border-bottom: 1px solid #a0a0a0;"></div>
							</div>
							<div class="btn btn-success d-grid col-8 mx-auto mt-4">
								<a href="register.jsp" class="text-white">Create new account</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>