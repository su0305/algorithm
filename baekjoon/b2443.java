import java.util.Scanner;

// 별찍기 - 6 
public class b2443 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=a; i>0; i--) {

            for(int j=a-i; j>0; j--) { // 공백출력 
                System.out.print(" "); 
            }

            for(int k=2*i-1; k>0; k--) { // 별출력 
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
