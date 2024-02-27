class ManipulaEvolucaoNivel implements ManipulaEvolucao {
    private int nivelEvolucao;
    private ManipulaEvolucao proximoManipulador;

    public ManipulaEvolucaoNivel(int nivelEvolucao) {
        this.nivelEvolucao = nivelEvolucao;
    }

    @Override
    public void setProximoManipulador(ManipulaEvolucao proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    @Override
    public void evoluir(Pokemon pokemon) {
        if (pokemon.getNivel() >= nivelEvolucao) {
            System.out.println(pokemon.getNome() + " atingiu o nível de evolução de " + pokemon.getNivel() + " e evolui para a próxima forma!");
        } else if (proximoManipulador != null) {
            System.out.println(pokemon.getNome() + " não atingiu o nível de evolução de " + nivelEvolucao + ". Passando para o próximo manipulador.");
            proximoManipulador.evoluir(pokemon);
        } else {
            System.out.println(pokemon.getNome() + " não pode evoluir mais. Ativando ManipulaSemEvolucao.");
            new ManipulaSemEvolucao().evoluir(pokemon);
        }
    }
}