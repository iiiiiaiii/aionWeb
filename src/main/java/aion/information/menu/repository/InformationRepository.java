package aion.information.menu.repository;

import aion.information.menu.entity.information.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InformationRepository extends JpaRepository<Information, Long> {

    @Modifying
    @Query("update Information i set i.name = :newName, i.content = :newContent where i.id = :id")
    void updateInfo(@Param("id") Long id,
                    @Param("newName") String newName,
                    @Param("newContent") String newContent);
}
