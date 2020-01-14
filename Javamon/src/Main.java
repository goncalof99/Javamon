import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static javamon[] bicho = new javamon[6];
    static ArrayList<trainer> treinador = new ArrayList<>();
    static ArrayList<javamon> criaturas = new ArrayList<>();
    static ArrayList<javamon> defaultBichos = new ArrayList<>();
    static ArrayList<javamon> party1 = new ArrayList<>();
    static trainer avatar = null;
    static trainer adversario = null;
    static int seleccao;
    static int i = 0;
    static int move = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //declaracao de objetos

        inicialGameConfigs();
        System.out.println("Tananananananananananannnnnn, esperas isto não e Game of Thrones música errada");
        System.out.println("Bem-vindo, eu sou o professor Pinheiro e como não tenho nada para fazer ando a distribuir bixos estranhos, se isto fosse hoje em dia pensavam que era droga.");
        System.out.println("Enfim, qual é o teu nome?");
        for (int i = 0; i < treinador.size(); i++) {
            System.out.println((i + 1) + " - " + treinador.get(i).getName());
        }
        System.out.print(">> ");
        seleccao = input.nextInt();
        seleccao--;
        avatar = treinador.get(seleccao);
        treinador.remove(seleccao);

        // for (javamon javamon: avatar.getParty()) {
        //   System.out.println(javamon.getNome());
        //}


        // avatar.getParty();
        if (seleccao <= 4) {
            escolhaAdversario(seleccao);
        } else {
            while (seleccao > 4) {
                System.out.println("Desculpa não percebi o teu nome podes repetir? (Seleciona um nº de 1 a 4)");
                System.out.print(">> ");
                seleccao = input.nextInt();

            }
            seleccao--;
            avatar = treinador.get(seleccao);
            treinador.remove(seleccao);
            escolhaAdversario(seleccao);
        }
    }

    public static void inicialGameConfigs() {

        //criaçao de javamons

        criaturas.add(new javamon("Picaxú", "Elétrico", 1, "Thunder Shock"));
        criaturas.add(new javamon("Xarizarde", "Fogo", 2, "Fire blast"));
        criaturas.add(new javamon("Poliswag", "Água", 3, "Hydro Pump"));
        criaturas.add(new javamon("Triko", "Relva", 4, "Solar Beam"));
        criaturas.add(new javamon("Bonyta", "Fogo", 5, "Ember"));
        criaturas.add(new javamon("MewDois", "Psiquico", 6, "Confusion"));
        criaturas.add(new javamon("Squirt", "Água", 7, "Water Gun"));
        criaturas.add(new javamon("GeoDude", "Pedra", 8, "Earth Quacke"));

        //criação de partys

        party1.add(criaturas.get(0));
        party1.add(criaturas.get(3));
        party1.add(criaturas.get(4));
        party1.add(criaturas.get(2));
        party1.add(criaturas.get(5));

        //criação de treinadores

        treinador.add(new trainer("Ashe", 6, 5, 1, 100, party1));
        treinador.add(new trainer("Broca", 6, 5, 1, 200, party1));
        treinador.add(new trainer("Jacinta", 6, 5, 1, 300, party1));
        treinador.add(new trainer("Mistica", 6, 5, 1, 400, party1));
    }


    public static void escolhaAdversario(int k) {
        System.out.println("Como estás, " + avatar.getName() + " ?");
        avatar.info();
        for (int i = 0; i < avatar.getParty().size(); i++) {
            System.out.println(avatar.getParty().get(i).getNome());
        }
        System.out.println("Bastante giro ahn? Vá agora se homem e escolhe um adversário");
        for (int i = 0; i < treinador.size(); i++) {
            System.out.println((i + 1) + " - " + treinador.get(i).getName());
        }
        System.out.print(">> ");
        seleccao = input.nextInt();
        seleccao--;
        adversario = treinador.get(seleccao);
        if (seleccao != k && seleccao < 4) {
            //jogo();
        } else {
            while (seleccao == k || seleccao > 4) {
                if (seleccao == k) {
                    System.out.println("Desculpa não podes lutar contra ti mesmo. Escolhe alguem diferente do " + avatar.getName());
                    System.out.print(">> ");
                    seleccao = input.nextInt();
                    seleccao--;
                    adversario = treinador.get(seleccao);

                } else {
                    while (seleccao > 4 && seleccao != k) {
                        System.out.println("Escolhe um nº entre 1 e 4.");
                        System.out.print(">> ");
                        seleccao = input.nextInt();
                        seleccao--;
                        adversario = treinador.get(seleccao);
                    }
                }
                //jogo();
            }

        }
    }
}
