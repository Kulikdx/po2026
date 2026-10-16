package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto_Pelne_Trafienie {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> typy = new ArrayList<>();

        for (String arg : args) {
            typy.add(Integer.parseInt(arg));
        }

        long startCzasu = System.currentTimeMillis();
        Random r = new Random();
        int t = 0;
        int ilosc = 0;
        while (t != 6) {
            t = 0;
            lista.clear();
            for (int i = 0; i < 6; ) {
                int x = r.nextInt(50);
                boolean jest = lista.contains(x);
                if (jest != true && x != 0) {
                    lista.add(x);
                    i++;
                }
            }

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (typy.get(j).equals(lista.get(i))) {
                        t++;
                    }
                }
            }
            ilosc ++;
        }
        long koniecCzasu = System.currentTimeMillis();
        long czas = koniecCzasu - startCzasu;
        System.out.println("Twoje typy: " + typy);
        System.out.println("Wylosowane liczby: " + lista);
        System.out.println("Liczba trafień: " + t);
        System.out.println("Czas działania programu: " + czas + " ms");
        System.out.println("Liczba losowań do trafienia 6: " + ilosc);
    }
}