import java.util.Scanner;

// 주사위 세개
public class b2480 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && b==c) { // 같은 눈이 3개일 경우 : 10000원 + (같은 눈) x 1000원
            System.out.println(10000 + a * 1000);

        } else if(a==b  || a==c) { // 같은 눈이 2개일 경우 : 1000원 + (같은 눈) x 100원 
            System.out.println(1000 + a * 100);

        } else if(b==c) {
            System.out.println(1000 + b * 100);

        } else { // 모두 다른 눈일 경우 : (그 중 가장 큰 눈) x 100원  
            int max = a;

            if(b > max) {
                max = b;
            }
            if(c > max) {
                max = c;
            }

            System.out.println(max * 100);
        }

        sc.close();

    }
}
