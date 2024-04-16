package aion.information.menu.repository;

import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import aion.information.menu.entity.item.Armor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArmorRepository extends JpaRepository<Armor,Long> {
    @Modifying
    @Query("update Armor a set " +
            "a.name = :newName, " +
            "a.level = :newLevel, " +
            "a.defense = :newDefense, " +
            "a.magicResist = :newMagicResist, " +
            "a.avoid = :newAvoid, " +
            "a.etc = :newEtc, " +
            "a.value = :newValue, " +
            "a.jobs = :newJobs " +
            "where a.id = :id")
    void updateArmor(@Param("id") Long id,
                     @Param("newName") String newName,
                     @Param("newLevel") int newLevel,
                     @Param("newDefense") int newDefense,
                     @Param("newMagicResist") int newMagicResist,
                     @Param("newAvoid") int newAvoid,
                     @Param("newEtc") String newEtc,
                     @Param("newValue") Value newValue,
                     @Param("newJobs") List<Job> newJobs);
}
