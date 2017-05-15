package ps.kolkoKrzyzyk;


public class Figura {
    private int typ;
    private String name;

    public Figura(int typ) {
        this.typ = typ;
        setName(typ);

    }

    public void setName(int t) {
        if (t ==1){
            this.name = "Kolo";
        }
        else{
            this.name = "Krzyzyk";
        }
    }

    public String getName() {
        return name;
    }
}


