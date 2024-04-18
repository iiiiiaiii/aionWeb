package aion.information.menu.controller;

import aion.information.menu.dto.WeaponDto;
import aion.information.menu.entity.WeaponKind;
import aion.information.menu.service.WeaponService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class WeaponController {
    private final WeaponService weaponService;

    @GetMapping("/weapon")
    public String weaponList(Model model) {
        List<WeaponDto> allInfo = weaponService.findAllByDto();
        model.addAttribute("allInfo", allInfo);
        return "items/weapon";
    }

    @GetMapping("/weapon/{weaponKind}")
    public String weaponKindList(@PathVariable WeaponKind weaponKind, Model model) {
        List<WeaponDto> allInfo = weaponService.findKindDto(weaponKind);
        model.addAttribute("allInfo", allInfo);
        return "items/weapon";
    }
}
