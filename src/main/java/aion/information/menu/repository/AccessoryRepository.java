package aion.information.menu.repository;

import aion.information.menu.entity.item.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccessoryRepository extends JpaRepository<Accessory,Long> {
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
