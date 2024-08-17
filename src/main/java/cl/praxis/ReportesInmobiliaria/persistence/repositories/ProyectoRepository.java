package cl.praxis.ReportesInmobiliaria.persistence.repositories;

import cl.praxis.ReportesInmobiliaria.persistence.entities.ProyectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<ProyectoEntity, Long> {
}
