package ps.kolkoKrzyzyk;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prompter {
    private Gracz player1;
    private Gracz player2;
    private List<ArrayList<Object>> plansza;
    private ArrayList<Object> a1;


    public void setPlyers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Imie pierwszego gracza: ");
        String p1 = in.nextLine();
        System.out.println("Figura: 1-kolo lub 2-krzyzyk ");
        int t1 = in.nextInt();
        this.player1 = new Gracz(p1,t1);

        System.out.println("Imie drugiego gracza: ");
        String p2 = in.nextLine();
        int t2;
        if (t1==1)
            t2=2;
        else t2=1;
        this.player2 = new Gracz(p2,t2);

        System.out.println(player1.getGraczImie() +" "+ player1.getFig()+ " vs "
                +player2.getGraczImie()+" "+player2.getFig());
    }


    public List<ArrayList<Object>> rysujPlansze() {

        List<ArrayList<Object>> a = new ArrayList<>();

         a1 = new ArrayList<>();

//        for (int i = 2; i < 6; i++) {
//            if (i % 2 == 0) {
//                a1.add(i-2, ".");
//
//            } else {
//                a1.add(i-2, "|");
//            }
//        }
        for (int i = 0; i < 3; i++){
            a1.add("_");
        }
            for (int i = 0; i <= 3; i++) {
            a.add(i,a1);
        }

        System.out.println(a);

        return this.plansza = a;
    }
    public void gra(){
        Scanner sc = new Scanner(System.in);
        boolean flaga =true;

        do
        {
            player1.ruch();
            uaktualnijPlansze(player1,player1.getWiersz(),player1.getKolumna());
            player2.ruch();
            uaktualnijPlansze(player2,player2.getWiersz(),player2.getKolumna());

            if (wygrana()){
                flaga =false;
            }

        }while(flaga);



    }

    private void uaktualnijPlansze(Gracz p, int i, int w) {
        a1.set(i,p.getZnak());
        plansza.set(w,a1);
    }

    private boolean wygrana() {
        return false;
    }
}



