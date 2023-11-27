import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private List<Disciplina> disciplinasMinistradas;

    public Professor() {
        this.disciplinasMinistradas = new ArrayList<>();
    }

    public void addDisciplinaMinistrada(Disciplina disciplina) {
        this.disciplinasMinistradas.add(disciplina);
    }

    public List<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void imprimir() {
        System.out.println("Professor: " + getNome());
        System.out.println("Disciplinas ministradas:");
        for (Disciplina disciplina : disciplinasMinistradas) {
            System.out.println("- " + disciplina.getNome());
        }
    }
}