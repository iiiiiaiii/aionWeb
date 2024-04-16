package aion.information.menu.repository;

import aion.information.menu.entity.Job;
import aion.information.menu.entity.skill.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface SkillRepository extends JpaRepository<Skill,Long> {

    @Modifying
    @Query("update Skill s set " +
            "s.name = :newName, " +
            "s.level = :newLevel, " +
            "s.coolTime = :newCoolTime, " +
            "s.content = :newContent, " +
            "s.job = :newJob " +
            "where s.id = :id")
    void updateSkill(@Param("id") Long id,
                     @Param("newName") String newName,
                     @Param("newLevel") int newLevel,
                     @Param("newCoolTime") int newCoolTime,
                     @Param("newContent") String newContent,
                     @Param("newJob") Job newJob);
}
