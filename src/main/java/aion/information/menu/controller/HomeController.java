package aion.information.menu.controller;

import aion.information.menu.dto.InformationDto;
import aion.information.menu.entity.information.Information;
import aion.information.menu.service.InformationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class HomeController {

    private final InformationService informationService;

    @GetMapping("/")
    public String home(Model model) {
        List<InformationDto> allInfo = informationService.findAllByDto();
        model.addAttribute("allInfo", allInfo);
        return "home";
    }
}
