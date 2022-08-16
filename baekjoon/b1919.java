import java.util.Scanner;

// 에너그램 만들기 
public class b1919 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int array[][] = new int[2][26];
        int result = 0;

        char[] words1 = sc.nextLine().toCharArray(); // String을 Char형 배열로 바꿔줌 
        char[] words2 = sc.nextLine().toCharArray();

        for(char ch : words1) {
            array[0][ch-'a']++; // ch-97과 같음 
        }

        for(char ch : words2) {
            array[1][ch-'a']++;
        }
        
        for(int i=0; i<26; i++) {
            result += Math.abs(array[0][i] - array[1][i]);
        }

        System.out.println(result);

        sc.close();
    }   
}
