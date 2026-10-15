import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random r = new Random();
        for(int i=0; i<6; ) {
            int x = r.nextInt(50);

            boolean jest = lista.contains(x);
            if (jest != true){
                //lista.remove(i-1);
                //x = r.nextInt(50);
                lista.add(x);
                i++;
            }
            //lista.add(x);
        }
        System.out.println(lista);
        System.out.println(args);
    }
}

