import br.com.dio.desafio.dominio.Aluno;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //Cursos
        Curso curso1 = new Curso("Aprendendo GIT", "git", (short) 10);
        Curso curso2 = new Curso("Aprendendo JS", "js", (short) 20);
        Curso curso3 = new Curso("Aprendendo C#", "C#", (short) 10);

        //Mentorias
        Mentoria mentoria1 = new Mentoria("Mentoria Java", "M", LocalDateTime.now());
        Mentoria mentoria2 = new Mentoria("Mentoria GIT", "M", LocalDateTime.now());

        //Alunos
        Aluno gabriel = new Aluno("Gabriel", LocalDate.of(2004,12,7));
        Aluno guilherme = new Aluno("Guilherme", LocalDate.of(2003,11,23));
        Aluno ihasmin = new Aluno("Ihasmin", LocalDate.of(2004,12,5));

        //Bootcamps
        Bootcamp bootcamp1 = new Bootcamp("Bootcamp 1", "b1", LocalDateTime.now(), LocalDateTime.of(LocalDate.of(2023,3,31),LocalTime.of(23,59)));

        bootcamp1.cadastrarConteudo(curso1);
        bootcamp1.cadastrarConteudo(curso2);
        bootcamp1.cadastrarConteudo(mentoria1);
        bootcamp1.cadastrarConteudo(mentoria2);

        bootcamp1.matricular(gabriel);
        bootcamp1.matricular(guilherme);
        bootcamp1.matricular(ihasmin);


        //Execuções principais
        System.out.println(gabriel.getConteudosInscritos());
        System.out.println(gabriel.getConteudosFinalizados());

        gabriel.inscreverConteudo(curso3);
        gabriel.finalizarConteudo(curso3);

        bootcamp1.finalizarBootcamp(gabriel);

        System.out.println("Experiência : " + gabriel.getExperiencia());
        System.out.println("Conteúdos inscritos : " + gabriel.getConteudosInscritos());
        System.out.println("Conteúdos finalizados : " +gabriel.getConteudosFinalizados());

    }
}