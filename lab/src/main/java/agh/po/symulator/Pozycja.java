package agh.po.symulator;

public class Pozycja {
    double x; // współrzędna X
    double y; // współrzedna y

    void akualizujPozycję(double deltaX, double deltaY){
        x = x + deltaX;
        y = y + deltaY;
    }

    String getPozycja() {
        return "";
    }
}
