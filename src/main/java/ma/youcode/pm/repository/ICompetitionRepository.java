package ma.youcode.pm.repository;

import ma.youcode.pm.model.Competition;
import ma.youcode.pm.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface ICompetitionRepository extends JpaRepository<Competition, String> {
    boolean existsByCode(String code);
    boolean existsByDate(LocalDate date);
//    Optional<Competition> findByCode(String code);

}
