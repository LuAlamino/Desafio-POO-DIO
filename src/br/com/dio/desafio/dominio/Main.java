package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrção curso Java");
        curso1.setCargaHoraria((8));








        Curso curso2 = new Curso();
        curso2.setTitulo("curso Java");
        curso2.setDescricao("descrção curso JavaScript");
        curso2.setCargaHoraria((4));

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Aulas Expressas");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp.setNome("JAVA");
        bootcamp2.setNome("JAVASCRIPT");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.setDescricao("Aulas Java");

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas Alamino");
        devLucas.inscreverBootCamp(bootcamp);



        System.out.println("Conteudos Inscritos Lucas" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("---");
        System.out.println("Conteudos Inscritos Lucas" + devLucas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Lucas" + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao Joao");
        devJoao.inscreverBootCamp(bootcamp);



        System.out.println("Conteudos Inscritos joão" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteudos Inscritos joão" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


        //System.out.println(curso1);
        //System.out.println(curso2);








    }
}
