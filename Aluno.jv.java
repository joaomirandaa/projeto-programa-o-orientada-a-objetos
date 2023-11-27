import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<Disciplina> disciplinas;

    public Aluno() {
        this.disciplinas = new ArrayList<>();
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void imprimir() {
        System.out.println("Aluno: " + getNome());
        System.out.println("Disciplinas:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("- " + disciplina.getNome());
        }
    }
}
