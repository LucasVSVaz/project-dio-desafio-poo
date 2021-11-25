package br.com.dio.project.poo.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Mentoring extends Contents {

    private LocalDate date;

    @Override
    public double calcXp() {
        return PATTERN_XP + 20d;
    }


    @Override
    public String toString() {
        return "Mentoria {" +
                "Título:" + getTitle()
                + " - Descrição:" + getDescription()
                + " - Data: " + date
                + "}";
    }
}
