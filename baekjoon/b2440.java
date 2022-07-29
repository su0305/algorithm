import java.util.Scanner;

// 별찍기 - 3
public class b2440 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=a; i>0; i--) {
            for(int j=i; j>0; j--) { // 별 반복 
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();

    }
}
