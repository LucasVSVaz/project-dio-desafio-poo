package br.com.dio.project.poo.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Developer {

    private String name;
    @EqualsAndHashCode.Include
    private Set<Contents> subscribedContents = new LinkedHashSet<>();
    @EqualsAndHashCode.Include
    private Set<Contents> completedContents = new LinkedHashSet<>();


    public void registerBootcamp(Bootcamp bootcamp) {
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevelopers().add(this);
    }

    public void progress() {
        Optional<Contents> firstContents = this.subscribedContents.stream().findFirst();
        if (firstContents.isPresent()) {
            this.completedContents.add(firstContents.get());
            this.subscribedContents.remove(firstContents.get());
        }
        System.err.println("Você não está matriculado em nenhum conteúdo");
    }

    public double calcTotalXp() {
        return this.completedContents.stream().mapToDouble(Contents::calcXp).sum();
    }
}
