import java.util.Scanner;

// 알파벳 개수 
public class b10808 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int [] num = new int[26];

        for(int i=0; i<word.length(); i++) {
            // charAt() : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해준다. 
            num[word.charAt(i) - 97]++; // -97을 해주는 이유는 아스키코드에서 알파벳이 97번부터 시작하기 때문이다.
        }

        for(int i=0; i<26; i++) {
            System.out.print(num[i] + " ");
        }

        sc.close();
        
    }
}
