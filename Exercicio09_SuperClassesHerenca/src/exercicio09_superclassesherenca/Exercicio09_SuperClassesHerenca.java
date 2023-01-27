package exercicio09_superclassesherenca;

public class Exercicio09_SuperClassesHerenca {

    public static void main(String[] args) {

        Professor professor1 = new Professor();
        Visitante visitante1 = new Visitante();
        Bolsista bolsista1 = new Bolsista();
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Paulo Vicius");
        aluno1.setSexo("Masculino");
        aluno1.setIdade(19);
        aluno1.setCurso("Mêcanica");
        aluno1.setMatricula(123);
        System.out.println(aluno1.toString());
        aluno1.pagarMensalidade();
        System.out.println("-------------------");

        professor1.setNome("Arnaldo");
        professor1.setSexo("Masculino");
        professor1.setIdade(52);
        professor1.setEspecialidade("Pioneiro");
        professor1.setSalario(4200);
        System.out.println(professor1.toString());
        professor1.receberAumento(2000);
        System.out.println("--------------------");

    }

}
