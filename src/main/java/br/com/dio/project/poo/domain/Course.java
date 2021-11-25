package br.com.dio.project.poo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course extends Contents {

    private Integer workload;

    @Override
    public double calcXp() {
        return PATTERN_XP * workload;
    }

    @Override
    public String toString() {
        return "Course{"
                + "Título:" + getTitle()
                + " - Descrição: " + getDescription()
                + " - Carga Horária=" + workload +
                '}';
    }
}
