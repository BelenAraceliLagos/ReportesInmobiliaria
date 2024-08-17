package cl.praxis.ReportesInmobiliaria.service;

import cl.praxis.ReportesInmobiliaria.persistence.entities.ProyectoEntity;

import java.util.List;

public interface ProyectoService {

    List<ProyectoEntity> findAll();
    ProyectoEntity findOne(Long id);
    ProyectoEntity create(ProyectoEntity proyecto);
    boolean update(ProyectoEntity proyecto);
    boolean delete(Long id);
}
