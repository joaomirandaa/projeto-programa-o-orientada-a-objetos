import java.util.List;
import java.util.ArrayList;

public class Disciplina{
    private String nome;
    private List<Aluno> alunos;
    private List<Curso> cursos;
    private Professor professorResponsavel;

    public Disciplina() {
        this.alunos = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setProfessorResponsavel(Professor professor) {
        this.professorResponsavel = professor;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void imprimir() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Alunos na disciplina:");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }

        System.out.println("Cursos relacionados:");
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getNome());
        }

        System.out.println("Professor responsavel: " + professorResponsavel.getNome());
    }
}
