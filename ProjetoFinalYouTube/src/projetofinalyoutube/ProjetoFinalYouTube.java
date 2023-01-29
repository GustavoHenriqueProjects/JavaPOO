package projetofinalyoutube;

public class ProjetoFinalYouTube {

    public static void main(String[] args) {

        Video video[] = new Video[3];
        Aluno aluno[] = new Aluno[2];

        video[0] = new Video("Aula 1 You tube ");
        video[1] = new Video("Aula 2 You tube ");
        video[2] = new Video("Aula 3 You tube ");
        
        aluno[0] = new Aluno("Paulo", 20, "Masculino", "Paulinho");
        
        Visualizacao visualizacao[] = new Visualizacao[2];
        visualizacao[0] = new Visualizacao(aluno[0], video[0]);
        visualizacao[0] = new Visualizacao(aluno[0], video[1]);
        visualizacao[0].avaliar();
        
        System.out.println(visualizacao[0].toString());
//        System.out.println(aluno[0].toString());
//        System.out.println(video[0].toString());
    }

}
