package projetofinalyoutube;

public class ProjetoFinalYouTube {

    public static void main(String[] args) {
        
        Video video[] = new Video[3];
        
        video[0] = new Video("Aula 1 You tube ");
        video[1] = new Video("Aula 2 You tube ");
        video[2] = new Video("Aula 3 You tube "); 
        
        Aluno aluno[] = new Aluno[2];
        
        aluno[0] = new Aluno("Paulo", 20, "Masculino", "Paulinho");
        
        System.out.println(aluno[0].toString());
        System.out.println(video[0].toString());
        
    }

}
