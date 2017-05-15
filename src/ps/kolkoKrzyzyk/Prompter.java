package ps.kolkoKrzyzyk;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prompter {
    private Gracz player1;
    private Gracz player2;
    private List<ArrayList<String>> plansza;
    private ArrayList<String> a1;


    public void setPlyers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Imie pierwszego gracza: ");
        String p1 = in.nextLine();
        System.out.println("Figura: 1-kolo lub 2-krzyzyk ");
        int t1 = in.nextInt();
        this.player1 = new Gracz(p1, t1);

        System.out.println("Imie drugiego gracza: ");
        String p2 = in.nextLine();
        int t2;
        if (t1 == 1)
            t2 = 2;
        else t2 = 1;
        this.player2 = new Gracz(p2, t2);

        System.out.println(player1.getGraczImie() + " " + player1.getFig() + " vs "
                + player2.getGraczImie() + " " + player2.getFig());
    }


    public List<ArrayList<String>> rysujPlansze() {

        List<ArrayList<String>> a = new ArrayList<>();

        a1 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            a1.add("_");
        }
        for (int i = 0; i < 3; i++) {
            a.add(i, a1);
        }

        System.out.println(a);

        return this.plansza = a;
    }

    public void gra() {
        boolean flaga = true;

        do {
            player1.ruch();
            uaktualnijPlansze(player1, player1.getWiersz(), player1.getKolumna());
            player2.ruch();
            uaktualnijPlansze(player2, player2.getWiersz(), player2.getKolumna());

            if (wygrana()) {
                flaga = false;
            }

        } while (flaga);


    }

    private void uaktualnijPlansze(Gracz p, int i, int w) {
        a1.set(i - 1, p.getZnak());
        plansza.set(w - 1, a1);
    }

    private boolean wygrana() {
        boolean flag = true;
        if (a1.get(0) == a1.get(1) && a1.get(1) == a1.get(2)){
            return true;}
            else if (plansza.get(0).get(0)==plansza.get(0).get(0)&&plansza.get(0).get(0)==plansza.get(0).get(0))
            return true;
        else if (plansza.get(0).get(1)==plansza.get(0).get(1)&&plansza.get(0).get(1)==plansza.get(0).get(1))
            return true;
        else if (plansza.get(0).get(2)==plansza.get(0).get(2)&&plansza.get(0).get(2)==plansza.get(0).get(2))
            return true;
        else if (plansza.get(1).get(0)==plansza.get(1).get(0)&&plansza.get(1).get(0)==plansza.get(1).get(0))
            return true;
        else if (plansza.get(1).get(1)==plansza.get(1).get(1)&&plansza.get(1).get(1)==plansza.get(1).get(1))
            return true;
        else if (plansza.get(1).get(2)==plansza.get(1).get(2)&&plansza.get(1).get(2)==plansza.get(1).get(2))
            return true;
        else if (plansza.get(2).get(0)==plansza.get(2).get(0)&&plansza.get(2).get(0)==plansza.get(2).get(0))
            return true;
        else if (plansza.get(2).get(1)==plansza.get(2).get(1)&&plansza.get(2).get(1)==plansza.get(2).get(1))
            return true;
        else if (plansza.get(2).get(2)==plansza.get(2).get(2)&&plansza.get(2).get(2)==plansza.get(2).get(2))
            return true;
        else if (plansza.get(0).get(0)==plansza.get(1).get(1)&&plansza.get(1).get(1)==plansza.get(2).get(2))
            return true;
        else if (plansza.get(0).get(2)==plansza.get(1).get(1)&&plansza.get(2).get(2)==plansza.get(2).get(0))
            return true;
            else
            return false;
        }
    }






