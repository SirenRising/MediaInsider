<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar Reseña - Media Insider</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css">
</head>
<body>

    <%@include file="navbar.jsp"%>
<div class="wrapper">
    <div class="container py-5 content">
<div class="container py-5">
    <h2 class="mb-4">Agregar Nueva Reseña Podcast</h2>
    <form action="guardarResena" method="post" class="needs-validation" novalidate>
        <div class="mb-3">
            <label for="titulo" class="form-label">Título:</label>
            <input type="text" class="form-control" id="titulo" name="titulo" required>
            <div class="invalid-feedback">
                Por favor, ingresa un título.
            </div>
        </div>
        <div class="mb-3">
            <label for="contenido" class="form-label">Contenido de la Reseña:</label>
            <textarea class="form-control" id="contenido" name="contenido" rows="4" required></textarea>
            <div class="invalid-feedback">
                Por favor, ingresa el contenido de la reseña.
            </div>
        </div>
        <div class="mb-3">
            <label for="calificacion" class="form-label">Calificación:</label>
            <select class="form-select" id="calificacion" name="calificacion" required>
                <option value="" disabled selected>Selecciona una calificación</option>
                <option value="1">1 estrella</option>
                <option value="2">2 estrellas</option>
                <option value="3">3 estrellas</option>
                <option value="4">4 estrellas</option>
                <option value="5">5 estrellas</option>
            </select>
            <div class="invalid-feedback">
                Por favor, selecciona una calificación.
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Guardar Reseña</button>
    </form>
</div>
</div>
</div>

    <%@include file="footer.jsp"%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
