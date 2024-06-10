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




        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
