<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.5.0/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.btn-purple {
	background-color: #70107E;
	color: white;
	border-color: #70107E;
}
</style>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-black">
		<div class="container">
			<a class="navbar-brand" href="/portafolio/"> <img
				src="${pageContext.request.contextPath}/res/img/logo.svg"
				alt="Logo de Media Insider" class="navbar-logo"
				style="width: 150px; height: 100px">
			</a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse ms-auto" id="navbarNav">
				<ul class="navbar-nav ms-auto">
					<li class="nav-item active"><a class="nav-link" href="/portafolio/">Inicio</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/portafolio/series">Series</a></li>
					<li class="nav-item"><a class="nav-link" href="/portafolio/podcast">Podcast</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/portafolio/about">Sobre
							nosotros</a></li>
					<li class="nav-item"><a class="nav-link" href="/portafolio/contacto">Contacto</a>
					</li>
					<li class="nav-item"><a class="nav-link btn btn-purple"
						href="/portafolio/login">Iniciar Sesión</a></li>
				</ul>
			</div>
		</div>
	</nav>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.5.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
