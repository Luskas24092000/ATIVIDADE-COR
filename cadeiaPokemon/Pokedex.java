public class Pokedex {

    public static void main(String[] args) {
        ManipulaEvolucao evolucaoPorNivel16 = new ManipulaEvolucaoNivel(16);
        ManipulaEvolucao evolucaoFinal = new ManipulaEvolucaoNivel(100);
        ManipulaEvolucao semEvolucao = new ManipulaSemEvolucao();


        evolucaoPorNivel16.setProximoManipulador(evolucaoFinal);
        evolucaoFinal.setProximoManipulador(semEvolucao);


        Pokemon charmander = new Pokemon("Charmander", 17);
        System.out.println("Exemplo 1: Evolução do Charmander:");
        evolucaoPorNivel16.evoluir(charmander);
        System.out.println();


        Pokemon squirtle = new Pokemon("Squirtle", 10);
        System.out.println("Exemplo 2: Evolução do Squirtle:");
        evolucaoPorNivel16.evoluir(squirtle);


    }
}
