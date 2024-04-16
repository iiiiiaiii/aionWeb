package aion.information.menu.controller;

import aion.information.menu.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class SkillController {
    private final SkillService skillService;
}
