import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> typy = new ArrayList<>();

        for (String arg : args) {
            typy.add(Integer.parseInt(arg));
        }

        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int x = r.nextInt(50);
            boolean jest = lista.contains(x);
            if (jest != true && x !=0) {
                //lista.remove(i-1);
                //x = r.nextInt(50);
                lista.add(x);
                i++;
            }
            //lista.add(x);
        }
        System.out.println("Twoje typy: " + typy);
        System.out.println("Wylosowane liczby: " + lista);

        int t = 0;

        for (int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if (typy.get(j).equals(lista.get(i))) {
                    t++;
                }
            }
        }
        System.out.println("Liczba trafień: " + t);
    }
}
