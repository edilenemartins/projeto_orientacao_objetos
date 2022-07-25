import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do Curso de JavaScript");
        curso2.setCargaHoraria(80);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Descrição Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEdilene = new Dev();
        devEdilene.setNome("Edilene");
        devEdilene.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Edilene: " + devEdilene.getConteudosInscritos());
        devEdilene.progredir();
        System.out.println("Conteúdos Inscritos de Edilene: " + devEdilene.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Edilene: " + devEdilene.getConteudosConcluidos());
        devEdilene.progredir();
        System.out.println("Xp: " + devEdilene.calcularTotalXp());

        System.out.println("-----------------------------------------------------------------------------");

        Dev devMarcio = new Dev();
        devMarcio.setNome("Márcio");
        devMarcio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Márcio: " + devMarcio.getConteudosInscritos());
        devMarcio.progredir();
        devMarcio.progredir();
        devMarcio.progredir();
        System.out.println("Conteúdos Inscritos de Márcio: " + devMarcio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Márcio: " + devMarcio.getConteudosConcluidos());
        System.out.println("Xp: " + devMarcio.calcularTotalXp());
    }

}
