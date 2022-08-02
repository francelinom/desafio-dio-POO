import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setDescricao("Desafio de java para a dio");
        curso1.setTitulo("Curso java");
        curso1.setCargaHoraria(4);
//        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Ajudando devs com dúvidas");
        mentoria.setData(LocalDate.now());
//        System.out.print(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do curso top");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devFran = new Dev();
        devFran.setNome("Francelino");
        devFran.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devFran.getConteudosInscritos());

        devFran.progredir();

        System.out.println("Conteúdos Inscritos " + devFran.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devFran.getConteudosConcluidos());
        System.out.println("Conteúdos Concluídos " + devFran.calcularTotalXp());
    }
}
