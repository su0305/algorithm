import java.util.Scanner;

// 윷놀이
public class b2490 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        int[] arr = new int[4]; 
        int count = 0;
        
        for(int i=0; i<3; i++) {
            for(int j=0; j<arr.length; j++) {
                arr[i] = sc.nextInt();

                if(arr[i] == 1) { // 1 == 등, 0 == 배
                    count++;
                }
            }
            switch(count) {
                case 0: 
                    System.out.println("D");
                    break;
                case 1:
                    System.out.println("C");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("A");
                    break;
                case 4:
                    System.out.println("E");
                    break;
            }
            count = 0;
        }

        sc.close();
        
    }
    
}
