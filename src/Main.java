import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Phyton");
        curso2.setDescricao("Descricao Curso Phyton");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao Mentoria de Java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMario = new Dev();
        devMario.setNome("Mario");
        devMario.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Mario: " + devMario.getConteudosInscritos());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        devMario.progredir();
        devMario.progredir();
        devMario.progredir();
        System.out.println("Conteudos Inscritos Mario: " + devMario.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Mario: " + devMario.getConteudosConcluidos());
        System.out.println("XP: " + devMario.calcularTotalXp());

        System.out.println("================================================================================================================================================");


        Dev devJoana = new Dev();
        devJoana.setNome("Joana");
        devJoana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joana: " + devJoana.getConteudosInscritos());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        devJoana.progredir();
        devJoana.progredir();
        devJoana.progredir();
        System.out.println("Conteudos Inscritos Joana: " + devJoana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joana: " + devJoana.getConteudosConcluidos());
        System.out.println("XP: " + devJoana.calcularTotalXp());
    }

}
