package br.com.dio.project.poo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Contents {

    protected static final double PATTERN_XP = 10d;

    private String title;
    private String description;

    public abstract double calcXp();
}
