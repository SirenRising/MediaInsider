<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulario de Registro</title>
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
                       <h4 class="mb-0">Formulario de Registro</h4>
                    </div>
                <div class="card-body">
							<form action="${pageContext.request.contextPath}/registro" method="POST">
									<div class="mb-3">
										<label for="nombre" class="form-label">Nombre</label> <input
											type="text" class="form-control" id="nombre" name="nombre"
											required>
									</div>
									<div class="mb-3">
										<label for="correo" class="form-label">Correo
											Electrónico</label> <input type="email" class="form-control"
											id="correo" name="correo" required>
									</div>
									<div class="mb-3">
										<label for="contraseña" class="form-label">Contraseña</label>
										<input type="password" class="form-control" id="contraseña"
											name="contraseña" required>
									</div>
									<div class="mb-3">
										<label for="confirmarContraseña" class="form-label">Confirmar
											Contraseña</label> <input type="password" class="form-control"
											id="confirmarContraseña" name="confirmarContraseña" required>
									</div>
									<button type="submit" class="btn btn-block"
										style="background-color: #70107E; color: white;">Registrarse</button>
								</form>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
</div>
	<%@include file="footer.jsp"%>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
