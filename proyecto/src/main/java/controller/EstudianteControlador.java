package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import repository.EstudianteRepository;
import service.EstudianteService;

@Controller
public class EstudianteControlador {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/estudiantes")
    public String listarEstudiantes(Model model){
        model.addAttribute("estudiantes", estudianteService.listarEstudiantes());
        return "estudiantes";
    }
}
