package exercicio07_projetolivro_trabalhandocomclassesencapsulamento;

public class Exercicio07_ProjetoLivro_TrabalhandoComClassesEncapsulamento {

    public static void main(String[] args) {

        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[2];

        pessoa[0] = new Pessoa(
                "Fernanda Regina",
                "Feminino",
                15);

        pessoa[1] = new Pessoa(
                "Paulo Vinivius",
                "Masculino",
                19);
        
        livro[0] = new Livro(
                "Jovens Perguntam",
                "Jw.org",
                100,
                pessoa[0]);
        
        livro[1] = new Livro(
                "Apostila Vida e Ministério",
                "Jw.org",
                20,
                pessoa[1]);
        
        //toString retorna uma string, por isso se utiliza o system.out.println
        livro[0].abrir();
        livro[0].folhear(23);
        System.out.println(livro[0].detalhes());

                
        livro[1].abrir();
        livro[1].folhear(6);
        System.out.println(livro[1].detalhes());

    }

}
