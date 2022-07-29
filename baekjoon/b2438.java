import java.util.Scanner;

// 별찍기 - 1
public class b2438 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=0; i<a; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();

    }
}
