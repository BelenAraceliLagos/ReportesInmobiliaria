package cl.praxis.ReportesInmobiliaria.controller;

import cl.praxis.ReportesInmobiliaria.persistence.entities.ProyectoEntity;
import cl.praxis.ReportesInmobiliaria.service.ProyectoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyectos")
public class ProyectoRestController {

    private final ProyectoService service;

    public ProyectoRestController(ProyectoService service) {
        this.service = service;
    }

    private HttpStatus status = HttpStatus.OK;

    @GetMapping("/listaproyectos")
    public List<ProyectoEntity> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProyectoEntity> findOne(@PathVariable("id") Long id){

        ProyectoEntity proyecto = service.findOne(id);

        if (proyecto == null){
            status = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<>(proyecto, status);
    }



    @PostMapping("/nuevoproyecto")
    public ResponseEntity<ProyectoEntity> create(@RequestBody ProyectoEntity proyecto){
        ProyectoEntity proyectoCreado = service.create(proyecto);

        if (proyectoCreado == null){
            status = HttpStatus.CONFLICT;
        } else {
            status = HttpStatus.CREATED;
        }

        return new ResponseEntity<>(proyectoCreado, status);
    }
}
