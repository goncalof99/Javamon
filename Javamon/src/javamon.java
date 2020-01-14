public class javamon {
    private String nome;
    private String tipo;
    private int number;
    private int lvl;
    private int hp_max;
    private int hp_atual;
    private String ataque;
    private int dano;

    public javamon(String nome, String tipo, int number, String ataque) {
        this.nome = nome;
        this.tipo = tipo;
        this.number = number;
        this.ataque = ataque;
        this.lvl = 1;
        this.hp_max = this.lvl * 30;
        this.hp_atual = this.hp_max;
        this.dano = this.lvl * 10;
    }

    public String getNome(){
        return this.nome;
    }
}