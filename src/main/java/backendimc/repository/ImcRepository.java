package backendimc.repository;

import backendimc.entity.ImcDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImcRepository extends JpaRepository<ImcDetails, Integer> {

}
