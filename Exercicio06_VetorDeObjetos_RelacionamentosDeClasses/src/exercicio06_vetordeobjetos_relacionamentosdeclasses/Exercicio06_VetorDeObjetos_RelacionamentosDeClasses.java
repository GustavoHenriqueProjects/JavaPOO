package exercicio06_vetordeobjetos_relacionamentosdeclasses;

public class Exercicio06_VetorDeObjetos_RelacionamentosDeClasses {

    public static void main(String[] args) {

        /*
        Lutador lutador = new Lutador(
                "Paulo Vinicius", 
                "Brasileiro",
                20, 
                (float)1.80, 
                80, 
                1, 
                2);
         */
        // Com vetor de 6 posições para preencher informação
                
        Lutador lutador[] = new Lutador[6];

        lutador[0] = new Lutador(
                "Paulo Vinicius",
                "Brasileiro",
                20,
                1.80f,
                80,
                2,
                3);

        lutador[1] = new Lutador(
                "Fernanda Regina",
                "Estados Unidos",
                19,
                1.70f,
                70,
                1,
                2);

        lutador[2] = new Lutador(
                "Arnaldo Antônio",
                "Estados Unidos",
                50,
                1.73f,
                80,
                0,
                2);
                
        lutador[3] = new Lutador(
                "Marilda Regina",
                "França",
                49,
                1.60f,
                79,
                2,
                6);
        
         lutador[4] = new Lutador(
                "Ana Regina",
                "Rússia",
                39,
                1.90f,
                89,
                2,
                3);
         
          lutador[5] = new Lutador(
                "João Silva",
                "Arabia",
                59,
                1.70f,
                89,
                1,
                2);

        lutador[0].status();
        lutador[1].status();
        lutador[2].status();
        lutador[3].status();
        lutador[4].status();
        lutador[5].status();
        
    }
}
