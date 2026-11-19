package agh.po.symulator; //jedżDo(Pozycja cel)

public class Samochód {
    boolean stanWłączenia;
    String nrRejest;
    String model;
    int prędkosć_max;

    Silnik silnik;
    SkrzyniaBiegów skrzynia;

    public void włącz(){
        silnik.uruchom();
        stanWłączenia = true;
    }
    public void wyłącz(){
        silnik.zatrzymaj();
        stanWłączenia = false;
        skrzynia.aktualnyBieg = 0;
    }
    public void jedźDo(Pozycja cel){

    }
    public void getWaga(){

    }
    public void getAktPrędkość(){

    }
    public void getAktPozycja(){

    }

    public Samochód(String )

    public static void main(String[] args){
        Samochód auto = new Samochód();
        auto.włącz();
        auto.skrzynia.zwiększBieg();

    }
}
