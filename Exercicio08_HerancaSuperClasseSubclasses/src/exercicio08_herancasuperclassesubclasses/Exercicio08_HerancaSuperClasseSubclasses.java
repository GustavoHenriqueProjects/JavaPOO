package exercicio08_herancasuperclassesubclasses;

public class Exercicio08_HerancaSuperClasseSubclasses {

    public static void main(String[] args) {

        //Instancia um objeto para cada classe
        Pessoa pessoa1 = new Pessoa();
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();
        Funcionario funcionario1 = new Funcionario();

        pessoa1.setNome("Fernanda Regina");
        pessoa1.setIdade(16);
        pessoa1.setSexo("Feminino");

        aluno1.setNome("Paulo Vinicius");
        aluno1.setIdade(19);
        aluno1.setSexo("Masculino");

        aluno1.setCurso("Futebol");
        professor1.setNome("Arnaldo Antônio");
        professor1.setSexo("Masculino");
        professor1.setIdade(52);
        professor1.setSalario(3000);

        funcionario1.setNome("Marilda Tiago");
        funcionario1.setSexo("Feminino");
        funcionario1.setIdade(50);
        funcionario1.setSetor("Logistica");

        System.out.println(pessoa1.toString());
        System.out.println(professor1.toString());
        System.out.println(aluno1.toString());
        System.out.println(funcionario1.toString());
        
    }

}
