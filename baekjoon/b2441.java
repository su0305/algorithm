import java.util.Scanner;

// 별찍기 - 4
public class b2441 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=0; i<a; i++) {
            for(int j=0; j<i; j++) {
               System.out.print(" ");
            }
            for(int k=a; k>i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();

    } 
}
