package main;

import br.com.dio.project.poo.domain.Bootcamp;
import br.com.dio.project.poo.domain.Course;
import br.com.dio.project.poo.domain.Developer;
import br.com.dio.project.poo.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        Course course1 = new Course();
        course1.setTitle("Curso Java");
        course1.setDescription("Descrição - Curso Java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Curso JavaScript");
        course2.setDescription("Descrição - Curso JavaScript");
        course2.setWorkload(8);


        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoria em Java");
        mentoring.setDescription("Descrição - Mentoria Java");
        mentoring.setDate(LocalDate.now());

//        System.out.println(course1);
//        System.out.println(course2);
//        System.out.println(mentoring);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição - Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);


        Developer developer1 = new Developer();
        developer1.setName("Lucas");
        developer1.registerBootcamp(bootcamp);
        System.out.println("Conteúdos em que o(a) " + developer1.getName() + " está inscrito(a): "
                + developer1.getSubscribedContents());
//        developer1.progress();
//
//        System.out.println("Conteúdos concluidos pelo(a): " + developer1.getName() + developer1.getCompletedContents());

        System.out.println("XP: " + developer1.calcTotalXp());



        Developer developer2 = new Developer();
        developer2.setName("Marilene");
        developer2.registerBootcamp(bootcamp);
        System.out.println("Conteúdos em que o(a) " + developer2.getName() + " está inscrito(a): "
                + developer2.getSubscribedContents());

//        developer2.progress();

//        System.out.println("Conteúdos concluidos pelo(a): " + developer2.getName() + developer2.getCompletedContents());

    }
}
