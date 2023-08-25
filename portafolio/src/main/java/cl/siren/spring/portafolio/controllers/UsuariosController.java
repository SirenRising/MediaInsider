package cl.siren.spring.portafolio.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.siren.spring.portafolio.model.entity.Usuarios;
import cl.siren.spring.portafolio.model.repository.IUsuariosRepository;
import cl.siren.spring.portafolio.model.service.UsuariosService;

@Controller
public class UsuariosController {
	
	@Autowired 
	private UsuariosService usuariosService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
    @Autowired
    private IUsuariosRepository usrepo;

    @RequestMapping(value = "/registro")
    public ModelAndView mostrarLogin() {
        return new ModelAndView("registro");
    }
    
    @PostMapping(value="/registro")
    public String crearUsuario(
            @RequestParam String nombre,
            @RequestParam String correo,
            @RequestParam String contraseña,
            @RequestParam String confirmarContraseña,
            Model model) 
    
    {
        Usuarios usuario = new Usuarios();
        usuario.setNombreUsuario(nombre);
        usuario.setEmailUsuario(correo);
        usuario.setPassUsuario(passwordEncoder.encode(contraseña));

        usrepo.save(usuario);

        model.addAttribute("mensaje", "Registro exitoso. Inicie sesión.");

        return "login";
        }
		
    
	
	@RequestMapping(value ="/ListadoUsuarios",method = RequestMethod.GET)
	public ModelAndView listarUsuarios() {
		ArrayList<Usuarios> listarUsuarios = new ArrayList<>();
		listarUsuarios = usuariosService.obtenerUsuarios();
		
		return new ModelAndView ("listadousuarios","listarusuarios",listarUsuarios);
	}
	
	@RequestMapping(value = "/eliminarusuario")
    public ModelAndView mostrarUsuarios(ModelMap model,
            @RequestParam("idRescatado") int id) {
        
		usuariosService.borrarUsuario(id);
        model.addAttribute("mensaje", "Usuario eliminado con éxito");
        return new ModelAndView("redirect:/listadousuarios", model);
    }
		
}

