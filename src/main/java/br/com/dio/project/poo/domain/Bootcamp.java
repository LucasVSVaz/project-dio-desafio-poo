package br.com.dio.project.poo.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);
    @EqualsAndHashCode.Include
    private Set<Developer> registeredDevelopers = new HashSet<>();
    @EqualsAndHashCode.Include
    private Set<Contents> contents = new LinkedHashSet<>();
}
