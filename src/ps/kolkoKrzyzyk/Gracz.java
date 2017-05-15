package ps.kolkoKrzyzyk;


import java.util.Scanner;

public class Gracz {

    private String GraczImie;
    private Figura fig;
    private String znak;
    private int kolumna,wiersz;


    public Gracz(String graczImie, int i) {
        GraczImie = graczImie;
        fig=new Figura(i);

    }

    public String getGraczImie() {
        return GraczImie;
    }

    public String getFig() {
        return fig.getName();
    }
    public void ruch(){
        System.out.println(this.getGraczImie()+" ruch:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nr kolumny od 1 do 3");
        kolumna = sc.nextInt();
        System.out.println("Podaj nr wiersza od 1 do 3");
        wiersz = sc.nextInt();

    }

    public String getZnak() {
        if (fig.getName().equals("Kolo"))
            return "O";
        else  return "X";

    }

    public int getKolumna() {
        return kolumna;
    }

    public int getWiersz() {
        return wiersz;
    }
}
