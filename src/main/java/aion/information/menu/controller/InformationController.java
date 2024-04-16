package aion.information.menu.controller;

import aion.information.menu.service.InformationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class InformationController {
    private final InformationService informationService;
}
