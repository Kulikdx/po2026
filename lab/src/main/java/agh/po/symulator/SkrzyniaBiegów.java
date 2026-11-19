package agh.po.symulator;

public class SkrzyniaBiegów {
    int aktualnyBieg;
    int ilośćBiegów;

    public void zwiększBieg(){
        if (aktualnyBieg<ilośćBiegów){
            aktualnyBieg = aktualnyBieg + 1;
        }
        else return;
    }

    public void zmniejszBieg(){
        if(aktualnyBieg>0){
            aktualnyBieg = aktualnyBieg - 1;
        }
        else return;
    }
}
