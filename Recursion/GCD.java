
import java.util.Scanner;

public class GCD {

    static int findGCD(int x, int y) {
        if(x==0&&y==0)
            return 0;
        if (x == 0) {
            return y;
        } else {
            return findGCD(y % x, x);
        }
    }

    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();
            int res = findGCD(x, y);
            if(res==0)
                System.out.println("invalid input");
            else
                System.out.println(res);
        }
    }

}
