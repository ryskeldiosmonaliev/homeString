import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

       PrintWriter file = new PrintWriter(new FileWriter("Rs.txt"));
        file.write(" A a,\n B b,\n C c,\n D d,\n E e,\n F f,\n G g,\n H h,\n I i,\n J j,\n K k,\n L l,\n " +
                "M m,\n N n,\n O o,\n P p,\n Q q,\n R r,\n S s,\n T t,\n U u,\n V v,\n W w,\n X x,\n Y y,\n Z z,\n");
        for (int i = 1; i <10 ; i++) {
            file.println(" "+i);
        }
        file.close();

        FileReader reader = new FileReader("Rs.txt");
        Scanner scanner = new Scanner(reader);
        int count = 0;
        while(scanner.hasNextLine()){
            count++;
            System.out.println(count+scanner.nextLine());
        }
    }
}