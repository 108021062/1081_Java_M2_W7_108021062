import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = x/2;
        boolean flag = true;
        for (int i = 2; i <= y; i++) {
            if (x % i == 0) {
                flag = false;
            }
            if (flag) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
