package ps.kolkoKrzyzyk;


import java.util.Scanner;

public class Gra {

    public static void main(String[] args) {
        boolean flaga;
        do {
            System.out.printf("1 - nowa gra\n2 - koniec");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i == 1)
                flaga = true;
            else
                flaga = false;
            Prompter start = new Prompter();
            start.rysujPlansze();
            start.setPlyers();
            start.gra();
        }while (flaga);
    }
}
