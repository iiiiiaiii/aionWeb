package aion.information.menu.controller;

import aion.information.menu.service.WeaponService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
public class WeaponController {
    private final WeaponService weaponService;
}
