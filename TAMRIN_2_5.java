package tamrin_2_5;
import java.util.Scanner;
public class TAMRIN_2_5 {
    public static void Ao( String n ){
        int x=0,y=0,z=0,h=0;
        int size=n.length();
        char[]ch2=new char[size];
        char[] ch=n.toCharArray();
        for(int i=0;i<size;i++){
            ch2[i]=ch[i];
            if(ch[i] == ' '){
                for(int j=x;j<i;j++){
                    if( ch2[j]=='a' || ch2[j]=='A' || ch2[j]=='e' || ch2[j]=='E' || ch2[j]=='o' || ch2[j]=='O' || ch2[j]=='i' || ch2[j]=='I' || ch2[j]=='u' || ch2[j]=='U' ){
                        y++;
                    }
                }
                if(y == 0){
                    z++;
                }
                x=i+1;
                y=0;
            }
            h=i;
        }
        for(int k=x;k<=h;k++){
            if( ch2[k]=='a' || ch2[k]=='A' || ch2[k]=='e' || ch2[k]=='E' || ch2[k]=='o' || ch2[k]=='O' || ch2[k]=='i' || ch2[k]=='I' || ch2[k]=='u' || ch2[k]=='U' ){
                y++;
            } 
        }
        if(y == 0){
            z++;
        }
        System.out.println( "---> " + z );
        System.out.println();
    }    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("please enter a string : ");
        String n=input.nextLine();
        System.out.println();
        Ao(n);
    }    
}