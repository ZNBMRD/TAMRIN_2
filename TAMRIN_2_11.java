package tamrin_2_11;
import java.util.Scanner;

public class TAMRIN_2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the word, please ");
        String word = input.next();


        if (word.length()%2==0)
        {
            if (two_side_zoj(word, word.length() - 1, 0) == 1) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        if (word.length()%2!=0)
        {
            if (two_side_fard(word, word.length() - 1, 0) == 1) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        

    }
    static int two_side_zoj(String word, int j, int i) {
        if(i<word.length()/2 && j>=word.length()/2) {
            if (word.charAt(i) == word.charAt(j)) {
                return two_side_zoj(word, j - 1,i + 1 );
            }
            else{return 0;}
        }
        return 1;
       
    }

    static int two_side_fard(String word, int j, int i) {
        if(i<word.length()/2 && j>word.length()/2) {
            if (word.charAt(i) == word.charAt(j)) {
                return two_side_fard(word, j - 1,i + 1 );
            }
            else{return 0;}
        }
        return 1;
       
    }

}