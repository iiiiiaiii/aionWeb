package aion.information.menu.controller;

import aion.information.menu.dto.SkillDto;
import aion.information.menu.entity.Job;
import aion.information.menu.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SkillController {
    private final SkillService skillService;

    @GetMapping("/skill")
    public String skillList(Model model) {
        List<SkillDto> allInfo = skillService.findAllByDto();
        model.addAttribute("allInfo", allInfo);
        return "skill/skill";
    }

    @GetMapping("/skill/{job}")
    public String jobSkillList(@PathVariable Job job, Model model) {
        List<SkillDto> allInfo = skillService.findJobDto(job);
        model.addAttribute("allInfo", allInfo);
        return "skill/skill";
    }
}
