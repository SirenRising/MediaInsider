<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Media Insider - Tu Fuente de Reseñas</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css">
</head>
<body>

    <%@include file="navbar.jsp"%>

<section class="hero bg-secondary text-white text-center py-5">
    <div class="container">
        <h1 class="display-4 mb-3">Bienvenido a Media Insider</h1>
        <p class="lead">Explora y comparte reseñas de tus series y podcast favoritos.</p>
        <a href="#reseñas" class="btn btn-light btn-lg mt-3">Explorar Reseñas</a>
    </div>
</section>

<section id="reseñas" class="py-5">
    <div class="container">
        <h2 class="text-center mb-4">Reseñas Destacadas</h2>
        <div class="row row-cols-1 row-cols-md-3 g-4">
            <div class="col">
                <div class="card h-100">
                </div>
            </div>
        </div>
    </div>
</section>

<section class="bg-light py-5">
    <div class="container">
        <h2 class="text-center mb-4">Nuevas Reseñas</h2>
        <div class="row row-cols-1 row-cols-md-3 g-4">
            <div class="col">
                <div class="card h-100">
                </div>
            </div>
        </div>
    </div>
</section>

<section class="py-5 text-center">
    <div class="container">
        <h2 class="mb-4">Únete a nuestra Comunidad</h2>
        <p>Comenta, califica y comparte tus propias reseñas.</p>
        <a href="/portafolio/registro" style="background-color: #70107E; color: white" class="btn btn-primary btn-lg">Regístrate</a>
    </div>
</section>

    <%@include file="footer.jsp"%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
