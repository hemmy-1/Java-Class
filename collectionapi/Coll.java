import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Coll {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i<10; i++){
            Random r = new Random();
            c.add(r.nextInt(100));
        }

       Collections.sort(c);
       Collections.reverse(c);

       System.out.println(c);

    }
}
