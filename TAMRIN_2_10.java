package tamrin_2_10;
import java.util.Scanner;
public class TAMRIN_2_10 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("input your base >> ");
        int n = input . nextInt();
        System.out.print("input your power >> ");
        int power = input . nextInt();
        input.close();
        System.out.println(cal(n , power));

        
    }
    static int cal(int n , int power){
        if(n ==1 || power == 0){return 1;}
        else {
            return n * cal(n, power-1);
        }
    }
}