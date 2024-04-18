package aion.information.menu.controller;

import aion.information.menu.dto.ArmorDto;
import aion.information.menu.entity.ArmorKind;
import aion.information.menu.service.ArmorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ArmorController {

    private final ArmorService armorService;

    @GetMapping("/armor")
    public String armorList(Model model) {
        List<ArmorDto> allInfo = armorService.findAllByDto();
        model.addAttribute("allInfo", allInfo);
        return "items/armor";
    }

    @GetMapping("/armor/{armorKind}")
    public String armorKindList(@PathVariable ArmorKind armorKind, Model model) {
        List<ArmorDto> allInfo = armorService.findKindDto(armorKind);
        model.addAttribute("allInfo", allInfo);
        return "items/armor";
    }
}
