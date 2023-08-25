document.addEventListener("DOMContentLoaded", function() {
    const loginForm = document.getElementById("loginForm");
    
    loginForm.addEventListener("submit", function(event) {
        event.preventDefault();
        
        const username = document.getElementById("username").value;
        const password = document.getElementById("password").value;
        
        // Aquí puedes agregar lógica para enviar los datos a través de AJAX o cualquier otro método que prefieras
        
        // Ejemplo de alerta para demostrar el envío de datos
        alert(`Usuario: ${username}\nContraseña: ${password}`);
    });
});
