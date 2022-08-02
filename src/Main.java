import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setDescricao("Desafio de java para a dio");
        curso1.setTitulo("Curso java");
        curso1.setCargaHoraria(4);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Ajudando devs com dúvidas");
        mentoria.setData(LocalDate.now());
        System.out.print(mentoria);
    }
}
