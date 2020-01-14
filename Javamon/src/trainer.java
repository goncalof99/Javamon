import java.util.ArrayList;

public class trainer {
    private String nome;
    private int javaballs;
    private int potions;
    private int rare_candies;
    private int money;
    ArrayList<javamon> party = new ArrayList();

    public trainer(String nome, int javaballs, int potions, int rare_candies, int money,ArrayList<javamon> party) {
        this.nome = nome;
        this.javaballs = javaballs;
        this.potions = potions;
        this.rare_candies = rare_candies;
        this.money = money;
        this.party = party;
    }

    public void info() {
        System.out.println("Na tua mochila tens: ");
        System.out.println(" - " + this.money + " Javadollar");
        System.out.println(" - " + this.javaballs + " Javabolas");
        System.out.println(" - " + this.potions + " Poçoes de vida");
        System.out.println(" - " + this.rare_candies + " Doces Raros");
    }

    public String getName(){
        return this.nome;
    }

    public ArrayList<javamon> getParty() {
        return this.party;
    }
}
