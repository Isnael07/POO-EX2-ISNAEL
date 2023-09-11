public class Personagem {
    private String nome;
    private int pontosSaude;
    private int experiencia;


    public void SofrerDano(int dano){
        this.pontosSaude -= dano;
    }
    public void RecuperarSaude(int recuperarSaude){
        this.pontosSaude += recuperarSaude;
    }
    public void GanharExeriencia(int ganharExeperiencia){
        this.experiencia += ganharExeperiencia;
    }

}
