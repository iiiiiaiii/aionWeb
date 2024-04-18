package aion.information.menu.repository;

import aion.information.menu.dto.AccessoryDto;
import aion.information.menu.dto.WeaponDto;
import aion.information.menu.entity.AccessoryKind;
import aion.information.menu.entity.Value;
import aion.information.menu.entity.WeaponKind;
import aion.information.menu.entity.item.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccessoryRepository extends JpaRepository<Accessory,Long> {
    @Modifying
    @Query("update Accessory a set " +
            "a.name = :newName, " +
            "a.level = :newLevel, " +
            "a.value = :newValue, " +
            "a.magicResist = :newMagicResist, " +
            "a.accessoryKind = :newAccessoryKind, " +
            "a.etc = :newEtc " +
            "where a.id = :id")
    void updateAccessory(@Param("id") Long id,
                         @Param("newName") String newName,
                         @Param("newLevel") int newLevel,
                         @Param("newValue")Value value,
                         @Param("newMagicResist") int newMagicResist,
                         @Param("newAccessoryKind") AccessoryKind accessoryKind,
                         @Param("newEtc") String newEtc);

    @Query("select new aion.information.menu.dto.AccessoryDto(a.name, a.level, a.magicResist, a.etc)" +
            " from Accessory a" +
            " order by a.accessoryKind, a.level, a.name")
    List<AccessoryDto> findAllByDto();

    @Query("select new aion.information.menu.dto.AccessoryDto(a.name, a.level, a.magicResist, a.etc)" +
            " from Accessory a" +
            " where a.accessoryKind = :searchKind" +
            " order by a.level, a.name")
    List<AccessoryDto> findKindDto(AccessoryKind searchKind);
}
