package org.launchcode.techjobs.persistent.models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job(Employer employer, List<Skill> skills) {
        this.employer = employer;
        this.skills = skills;
    }

    public Job() {}

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}


