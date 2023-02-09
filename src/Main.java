import java.util.*;

public class Main {

    public enum ChiFouMi {
        PIERRE("PIERRE : elle domine le ciseau mais se fait engloutir par la feuille"),
        FEUILLE("FEUILLE : elle engloutie la pierre mais se fait couper par le ciseau"),
        CISEAU("CISEAU : il découpe la feuille mais se fait détruire par la pierre");

        private final String about;
        ChiFouMi(String power) {
            this.about = power;
        }
        public String bat() {
            return this.about;
        }
    }
    public static void main(String[] args) {

        List<ChiFouMi> list = new ArrayList<>();
        list.add(ChiFouMi.PIERRE);
        list.add(ChiFouMi.FEUILLE);
        list.add(ChiFouMi.CISEAU);

        int tirage = 0;
        int score = 0;

        Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenue dans le jeu du CHIFOUMI, la partie dure 3 manches :");
            System.out.println("Saisissez la lettre 'p' pour choisir la pierre");
            System.out.println("Saisissez la lettre 'f' pour choisir la feuille");
            System.out.println("Saisissez la lettre 'c' pour le ciseau");
            System.out.println("C'est parti :");

        for(int i = 0; i <= 2; i++) {
            tirage = 1 + (int)(Math.random() * ((2 - 1) + 1));
            char choice = sc.nextLine().charAt(0);
            System.out.println(list.get(tirage).bat());

            switch(choice) {
                case 'p':
                    if(tirage < 1) {
                        System.out.println("Égalité !");
                    }
                    else if(tirage > 1) {
                        System.out.println("Gagné !");
                        score++;
                    }
                    else {
                        System.out.println("Perdu !");
                    }
                    break;

                case 'f':
                    if(tirage < 1) {
                        System.out.println("Gagné !");
                        score++;
                    }
                    else if(tirage > 1) {
                        System.out.println("Perdu !");
                    }
                    else {
                        System.out.println("Égalité !");
                    }
                    break;

                case 'c':
                    if(tirage < 1) {
                        System.out.println("Perdu !");
                    }
                    else if(tirage > 1) {
                        System.out.println("Égalité !");
                    }
                    else {
                        System.out.println("Gagné !");
                        score++;
                    }
                    break;

                default:
                    System.out.println("ERREUR, veuillez saisir une de ces trois lettres : 'p', 'f', 'c'.");
            }
        }

        System.out.println("Ton score final est de "+score+"/3");
        sc.close();
    }
}