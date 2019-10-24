import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println();
        for (int r=1;r<=n;r++){
            for (int m=1;m<=n;m++){
                System.out.printf(" %d",r*m);

            }
            System.out.println();}
    }

}


