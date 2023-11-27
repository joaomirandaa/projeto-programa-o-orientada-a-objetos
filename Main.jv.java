public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");

        Professor professor1 = new Professor();
        professor1.setNome("Dr. Silva");

        Professor professor2 = new Professor();
        professor2.setNome("Profa. Hially");

        Curso curso1 = new Curso();
        curso1.setNome("Engenharia");

        Curso curso2 = new Curso();
        curso2.setNome("Ciência da Computação");

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matemática");
        disciplina1.setProfessorResponsavel(professor1);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Programação");
        disciplina2.setProfessorResponsavel(professor2);

        aluno1.addDisciplina(disciplina1);
        aluno2.addDisciplina(disciplina2);

        professor1.addDisciplinaMinistrada(disciplina1);
        professor2.addDisciplinaMinistrada(disciplina2);

        curso1.addDisciplina(disciplina1);
        curso2.addDisciplina(disciplina2);

        disciplina1.addAluno(aluno1);
        disciplina2.addAluno(aluno2);

        aluno1.imprimir();
        System.out.println();

        professor1.imprimir();
        System.out.println();

        curso1.imprimirCurso();
        System.out.println();

        disciplina1.imprimir();
    }
}
