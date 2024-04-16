package aion.information.menu.controller;

import aion.information.menu.service.ArmorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
public class ArmorController {

    private final ArmorService armorService;
}
