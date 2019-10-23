import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float Max = a;
        float Min = a;
        for (int i = 1; i < 10; i ++) {
            a = sc.nextFloat();
            if (Max < a) {
            Max = a;
        }
    else if (Min > a) {
            Min = a;
        }
    }
        System.out.printf("Max=%.2f\n",Max);
        System.out.printf("Min=%.2f\n",Min);
    }
}
