package aion.information.menu.repository;

import aion.information.menu.dto.InformationDto;
import aion.information.menu.entity.information.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InformationRepository extends JpaRepository<Information, Long> {

    @Modifying
    @Query("update Information i set i.name = :newName, i.content = :newContent where i.id = :baseId")
    void updateInfo(@Param("baseId") Long baseId,
                    @Param("newName") String newName,
                    @Param("newContent") String newContent);

    @Query("select new aion.information.menu.dto.InformationDto(i.name, i.content )" +
            " from Information i")
    List<InformationDto> findAllByDto();
}
