<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado de Cards</title>
        <!-- Agrega los enlaces a los archivos CSS de Bootstrap y tus propios estilos -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css">
    <!-- Agrega el enlace al archivo CSS de Bootstrap -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>

    <%@include file="navbar.jsp"%>
    
<div class="wrapper">
    <div class="container py-5 content">
<div class="container py-5">
    <h2 class="mb-4">Series</h2>
    
          <div class="container mt-4">
        <a href="agregarresserie" class="btn btn-primary" class="btn btn-block" style="background-color: #70107E; color: white;">Agregar Nueva Reseña</a>
    </div>
    
    <ul class="list-group">
        <li class="list-group-item">
            <div class="card">
                <img src="imagen1.jpg" class="card-img-top" alt="Imagen 1">
                <div class="card-body">
                    <h5 class="card-title">Título de la Tarjeta 1</h5>
                    <p class="card-text">Descripción de la tarjeta 1.</p>
                </div>
            </div>
        </li>
        <li class="list-group-item">
            <div class="card">
                <img src="imagen2.jpg" class="card-img-top" alt="Imagen 2">
                <div class="card-body">
                    <h5 class="card-title">Título de la Tarjeta 2</h5>
                    <p class="card-text">Descripción de la tarjeta 2.</p>
                </div>
            </div>
        </li>
        <li class="list-group-item">
            <div class="card">
                <img src="imagen3.jpg" class="card-img-top" alt="Imagen 3">
                <div class="card-body">
                    <h5 class="card-title">Título de la Tarjeta 3</h5>
                    <p class="card-text">Descripción de la tarjeta 3.</p>
                </div>
            </div>
        </li>
        <!-- Agregar más tarjetas aquí -->
    </ul>
</div>
</div>
</div>

    <%@include file="footer.jsp"%>
    
    <!-- Agrega el enlace al archivo JavaScript de Bootstrap o tus propios scripts -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

<!-- Agrega el enlace al archivo JavaScript de Bootstrap -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
