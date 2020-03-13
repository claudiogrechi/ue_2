package ch.teko.prog.ue_1;

public class UnsereKlasse {

    private String name;
    private int alter;

    public UnsereKlasse(){
        alter = 18;
    }

    public UnsereKlasse(int pAlter){
        alter = pAlter;
    }

    public void setName(String pname){
        // kommentare
        /*

         ztjdzj

        */
        name = pname;
    }

    public String getName(){
        return name;
    }

    public void setAlter(int pAlter){
        alter = pAlter;
    }

    public int getAlter() {
        return alter;
    }

}
