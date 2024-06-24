public class Jogador extends Personagem{
    
    private int qtdVidas;

    public Jogador(String nome, String raca, String carisma, String forca, String destreza, String sabedoria,
            String história, int qtdVidas) {
        super(nome, raca, carisma, forca, destreza, sabedoria, história);
        this.qtdVidas = qtdVidas;
    }

    public int getQtdVidas() {
        return qtdVidas;
    }

    public void setQtdVidas(int qtdVidas) {
        this.qtdVidas = qtdVidas;
    }

    @Override
    public String toString() {

        return super.toString() + "\nQuantidade de vidas: " + qtdVidas + ";";
    }
}
