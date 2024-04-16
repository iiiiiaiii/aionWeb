package aion.information.menu.repository;

import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import aion.information.menu.entity.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item,Long> {
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
    @Modifying
    @Query("update Accessory a set " +
            "a.name = :newName, " +
            "a.level = :newLevel, " +
            "a.magicResist = :newMagicResist, " +
            "a.etc = :newEtc " +
            "where a.id = :id")
    void updateAccessory(@Param("id") Long id,
                         @Param("newName") String newName,
                         @Param("newLevel") int newLevel,
                         @Param("newMagicResist") int newMagicResist,
                         @Param("newEtc") String newEtc);
}
