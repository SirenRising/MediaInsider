<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulario de Contacto</title>
    <!-- Agrega el enlace al archivo CSS de Bootstrap -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>

    <%@include file="navbarout.jsp"%>
    
        <div class="wrapper">
    <div class="container py-5 content">

<div class="container py-5">
    <div class="row justify-content-center">
        <div class="col-lg-6">
            <div class="card shadow">
                    <div class="card-header bg-purple text-white text-center" style="background-color: #70107E; color: white;">
                       <h4 class="mb-0">Formulario de Contacto</h4>
                    </div>
                <div class="card-body">
							<form action="${pageContext.request.contextPath}/contacto" method="POST">
                        <div class="mb-3">
                            <label for="nombre" class="form-label">Nombre</label>
                            <input type="text" class="form-control" id="nombre" name="nombre" required>
                        </div>
                        <div class="mb-3">
                            <label for="email" class="form-label">Email</label>
                            <input type="email" class="form-control" id="email" name="email" required>
                        </div>
                        <div class="mb-3">
                            <label for="mensaje" class="form-label">Mensaje</label>
                            <textarea class="form-control" id="mensaje" name="mensaje" rows="4" required></textarea>
                        </div>
                            <button type="submit" class="btn btn-block" style="background-color: #70107E; color: white;">Enviar Mensaje</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
</div>

    <%@include file="footer.jsp"%>
    
        <!-- Agrega el enlace al archivo JavaScript de Bootstrap o tus propios scripts -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script><!-- Agrega el enlace al archivo JavaScript de Bootstrap o tus propios scripts -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

<!-- Agrega el enlace al archivo JavaScript de Bootstrap -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
