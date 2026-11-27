package pe.edu.uls.demospringdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLibro {

    @Autowired
    ServiceLibro service;

    @GetMapping("/libros")
    public List<Libro> consultarLibros() {
        return service.consultarTodos();
    }

    @PostMapping("/libro/nuevo")
    public Libro registrarLibro(@RequestBody Libro nuevo) {
        return service.registrar(nuevo);
    }
}