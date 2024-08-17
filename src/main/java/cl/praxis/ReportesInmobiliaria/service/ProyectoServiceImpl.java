package cl.praxis.ReportesInmobiliaria.service;

import cl.praxis.ReportesInmobiliaria.persistence.entities.ProyectoEntity;
import cl.praxis.ReportesInmobiliaria.persistence.repositories.ProyectoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoServiceImpl implements ProyectoService{

    ProyectoRepository repository;

    public ProyectoServiceImpl(ProyectoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProyectoEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public ProyectoEntity findOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public ProyectoEntity create(ProyectoEntity proyecto) {
        return repository.save(proyecto);
    }

    @Override
    public boolean update(ProyectoEntity proyecto) {
        ProyectoEntity result = repository.save(proyecto);
        return result != null;
    }

    @Override
    public boolean delete(Long id) {
        boolean exist = repository.existsById(id);
        if (exist){
            repository.deleteById(id);
        }
        return exist;
    }
}
