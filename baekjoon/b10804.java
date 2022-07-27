import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 카드 역배치 
public class b10804 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> cardList = new ArrayList<Integer>();

        for(int i=0; i<20; i++) {
            cardList.add(i+1);
        }

        for(int i=0; i<10; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            Collections.reverse(cardList.subList(a-1, b)); // 역순 
        }

        for(int i=0; i<cardList.size(); i++) {
            System.out.print(cardList.get(i) + " ");
        }

        // System.out.println(cardList);



        // 역순 x -> 내림차순 
        // int[] card = new int[20];
        
        // for(int i=0; i<card.length; i++) { // 1부터 20까지 
        //     card[i] += i+1;
        // }

        // Integer[] integerCard = Arrays.stream(card).boxed().toArray(Integer[]::new); // 내림차순은 Integer로 -> reverseOrder() 사용하기위해 

        // for(int i=0; i<10; i++) {
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();

        //     Arrays.sort(integerCard, a-1, b, Comparator.reverseOrder());
        // } 

        // // System.out.println(Arrays.toString(integerCard));
        
        // for(int i=0; i<card.length; i++) {
        //     System.out.print(integerCard[i] + " ");
        // }
        
        sc.close();

    }
}
