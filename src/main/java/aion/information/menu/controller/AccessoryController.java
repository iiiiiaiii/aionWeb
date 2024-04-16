package aion.information.menu.controller;

import aion.information.menu.dto.AccessoryDto;
import aion.information.menu.service.AccessoryService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AccessoryController {

    private final AccessoryService accessoryService;

    @GetMapping("/accessory/neck")
    public String neck(Model model) {
        List<AccessoryDto> allInfo = accessoryService.findAllByDto();
        model.addAttribute("allInfo", allInfo);
        return "items/accessory/neck";
    }
}
