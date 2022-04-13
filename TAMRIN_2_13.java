package tamrin_2_13;
import java.util.Scanner;

public class TAMRIN_2_13{
public static int Akerman(int m,int n) {
    if(m==0){
        return n+1;
    }
if(n==0){
    return Akerman(m-1,1);
}
return Akerman(m-1, Akerman(m,n-1));
}
public static void main(String[] args) {
    
    Scanner input= new Scanner(System.in);
    System.out.print("Enter a number: >> ");
    int m = input . nextInt();
    System.out.print("Enter a number: >> " );
    int n = input . nextInt();
    input.close();
    System.out.println(Akerman(m , n));

}



}