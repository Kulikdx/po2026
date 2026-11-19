package agh.po.symulator;

public class Silnik {
    int maxObroty;
    int obroty;

    public void uruchom(){
        obroty = 800;
    }

    public void zatrzymaj(){
        obroty = 0;
    }
}
