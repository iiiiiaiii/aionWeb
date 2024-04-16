package aion.information.menu.repository;

import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import aion.information.menu.entity.item.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WeaponRepository extends JpaRepository<Weapon,Long> {
    @Modifying
    @Query("update Weapon w set " +
            "w.name = :newName, " +
            "w.level = :newLevel, " +
            "w.attack = :newAttack, " +
            "w.accuracy = :newAccuracy, " +
            "w.weaponArmor = :newWeaponArmor, " +
            "w.weaponSpeed = :newWeaponSpeed, " +
            "w.critical = :newCritical, "+
            "w.magicAttack = :newMagicAttack, " +
            "w.magicAccuracy = :newMagicAccuracy, " +
            "w.magicCritical = :newMagicCritical, " +
            "w.etc = :newEtc, " +
            "w.value = :newValue, " +
            "w.jobs = :newJobs " +
            "where w.id = :id")
    void updateWeapon(@Param("id") Long id,
                      @Param("newName") String newName,
                      @Param("newLevel") int newLevel,
                      @Param("newAttack") String newAttack,
                      @Param("newAccuracy") int newAccuracy,
                      @Param("newWeaponArmor") int newWeaponArmor,
                      @Param("newWeaponSpeed") float newWeaponSpeed,
                      @Param("newCritical") int newCritical,
                      @Param("newMagicAttack") int newMagicAttack,
                      @Param("newMagicAccuracy") int newMagicAccuracy,
                      @Param("newMagicCritical") int newMagicCritical,
                      @Param("newEtc") String newEtc,
                      @Param("newValue") Value newValue,
                      @Param("newJobs") List<Job> newJobs);

}