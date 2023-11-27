import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso() {
        this.disciplinas = new ArrayList<>();
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    // Adicionando métodos para manipulação do atributo 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void imprimirCurso() {
        System.out.println("Curso: " + getNome());
        System.out.println("Disciplinas no curso:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("- " + disciplina.getNome());
        }
    }
}
