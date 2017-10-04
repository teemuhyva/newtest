package springbootrest.springbootrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springbootrest.springbootrest.entity.HenkilotEntity;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<HenkilotEntity, Long> {

    List<HenkilotEntity> findByEtunimi(String etunimi);
}
