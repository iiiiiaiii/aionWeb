package aion.information.menu;

import aion.information.menu.entity.Job;
import aion.information.menu.entity.Value;
import aion.information.menu.entity.WeaponKind;
import aion.information.menu.entity.information.Information;
import aion.information.menu.entity.item.Weapon;
import aion.information.menu.service.ArmorService;
import aion.information.menu.service.InformationService;
import aion.information.menu.service.WeaponService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Init {
    private final ArmorService armorService;
    private final WeaponService weaponService;
    private final InformationService informationService;

    @PostConstruct
    public void init() {
        Information information = new Information("칼출", "찬트싸우러가는거");
        informationService.save(information);

        List<Job> swordJob = Arrays.asList(Job.검성, Job.수호성, Job.살성, Job.궁성);
        weaponService.save(new Weapon("타오르는 구원의 장검",60, Value.영웅,swordJob,"206-252",1078,1109,0,364,0,"공격 속도 +19%,공격력 +46, 물리 치명타 +78, 마법 적중+70, 생명력 +530 ", WeaponKind.장검));
    }
}

