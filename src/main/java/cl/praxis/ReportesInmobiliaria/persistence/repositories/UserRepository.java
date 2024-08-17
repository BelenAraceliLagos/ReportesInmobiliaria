package cl.praxis.ReportesInmobiliaria.persistence.repositories;

import cl.praxis.ReportesInmobiliaria.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findUserEntityByUsername(String username);

}
