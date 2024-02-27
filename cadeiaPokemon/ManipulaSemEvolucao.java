class ManipulaSemEvolucao implements ManipulaEvolucao {
    @Override
    public void setProximoManipulador(ManipulaEvolucao proximoManipulador) {
    }

    @Override
    public void evoluir(Pokemon pokemon) {
        System.out.println(pokemon.getNome() + " não pode evoluir");
    }
}