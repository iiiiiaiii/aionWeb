package aion.information.menu.controller;

import aion.information.menu.service.AccessoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class AccessoryController {

    private final AccessoryService accessoryService;
}
