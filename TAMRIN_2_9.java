package tamrin_2_9;
import java.util.Scanner;


public class TAMRIN_2_9{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(" input your number >> ");

        int n = input.nextInt();
        
        input.close();

        int count = 1 ;

    
        System.out.println(point(n,count));

    }
    
    static int point(int n,int count){

        if (count < n){

            System.out.println(count);

            return count = point(n,count+1) ;
        }
        
        if(n<=0){

            if (count > n){

                System.out.println(count);

                return count = point(n,count-1) ;
            }
        }
        return n;
        
    }
}