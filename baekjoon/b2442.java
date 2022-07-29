import java.util.Scanner;

// 별찍기 - 5 
public class b2442 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        
        for(int i=1; i<=a; i++) {
            for(int j=a-i; j>=1; j--) { // 공백출력 
                System.out.print(" ");
            }

            for(int k=1; k<=i*2-1; k++) { // 별 출력 
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();

    }
}
