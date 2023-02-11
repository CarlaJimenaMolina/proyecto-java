package service;

import domain.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EstudianteRepository;

import java.util.List;

@Service
public class EstudianteServiceImp implements EstudianteService{

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> listarEstudiantes() {
        return estudianteRepository.findAll();
    }
}
