import java.util.Scanner;

// Strfry
/**
 * Strfry 함수는 입력된 문자열을 무작위로 재열여 새로운 문자열을 만들어낸다. 
 * 두 개의 문자열에 대해, 2번째 문자열이 1번째 문자열에 strfry 함수를 적용하여 얻어질 수 있는지 판단 
 */
public class b11328 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 테스트 케이스의 수 
        
        for (int i=0; i<n; i++){
            int[] alpa = new int[26]; // 각 문자의 개수를 저장하는 배열 

            /**
             * String.toCharArray()
             *  : 문자열을 한글자씩 쪼개서 Char타입의 배열에 넣어주는 메소드 
             *  : String을 Char형 배열로 바꾼다.
             *      -   String s1 = "Hello World";
                        char[] charArr = s1.toCharArray();
             *  : char형 배열을 합쳐서 String으로 만들 수 있다. 
             *      -   String s2 = new String(charArr);
             *  */  
            char[] words1 = sc.next().toCharArray(); 
            char[] words2 = sc.next().toCharArray(); 

            for (char ch : words1) { // 첫번째 단어의 알파벳 수를 세어준다. 
                alpa[ch-97]++; // -97 해주는 이유는 아스키코드에서 알파벳은 97부터 시작하기 때문 
            } 

            for (char ch : words2) { // 두번째 단어의 알파벳들은 빼서 알파벳 개수가 0인지 확인. 
                alpa[ch-97]--; 
            }
            boolean check = true;

            for (int j : alpa) {
                if(j != 0) check = false;
            }
                
            System.out.println(check ? "Possible" : "Impossible");

        } 
        
        sc.close();

    }
}
