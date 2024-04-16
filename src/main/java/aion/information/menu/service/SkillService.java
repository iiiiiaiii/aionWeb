package aion.information.menu.service;

import aion.information.menu.controller.form.SkillForm;
import aion.information.menu.dto.SkillDto;
import aion.information.menu.entity.Job;
import aion.information.menu.entity.skill.Skill;
import aion.information.menu.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SkillService {
    private final SkillRepository skillRepository;

    @Transactional
    public void save(Long id) {
        skillRepository.findById(id);
    }

    @Transactional
    public void delete(Skill skill) {
        skillRepository.delete(skill);
    }

    @Transactional
    public void deleteAll() {
        skillRepository.deleteAll();
    }

    @Transactional
    public void updateSkill(Long id, SkillForm skillForm) {

        String name = skillForm.getName();
        int level = skillForm.getLevel();
        int coolTime = skillForm.getCoolTime();
        String content = skillForm.getContext();
        Job job = skillForm.getJob();

        skillRepository.updateSkill(id, name, level, coolTime, content, job);
    }

    public List<SkillDto> findAllByDto() {
        return skillRepository.findAllByDto();
    }
}
