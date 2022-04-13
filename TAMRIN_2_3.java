package tamrin_2_3;
import java.util.Scanner;
public class TAMRIN_2_3 {
    public static void compress( String n ){
        int i= -1,f=0,z=0,x=0;
        int size=n.length();
        char[]ch2=new char[size];
        char[] ch=n.toCharArray();
        while(z<size){
            if(ch[z]==' '){
                x++;
            }
            z++;
        }
        if(x!=0){
                do{
                i++;
            }while(ch[i]!=' ');
            for(int j=0;j<size;j++){
                for(int t=(j+1);t<size;t++){
                    if(ch[j]!=' '){
                        if(ch[j]==ch[t]){
                            ch[t]=' ';
                        }
                    }
                }
            }
            for(int g=0;g<size;g++){
                if(g!=i){
                    if(ch[g]!=' '){
                        ch2[f]=ch[g];
                        f++;
                    }
                }
                if(g==i){
                    ch2[f]=' ';
                    f++;
                }
            }
        }
        if(x==0){
            for(int j=0;j<size;j++){
                for(int t=(j+1);t<size;t++){
                    if(ch[j]==ch[t]){
                        ch[t]=' ';
                    }
                }
            }
            for(int g=0;g<size;g++){
                if(ch[g]!=' '){
                    ch2[f]=ch[g];
                    f++;
                }
            }
        }
        ch=ch2;
        System.out.println( ch );
    }    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("please enter a string : ");
        String n=input.nextLine();
        System.out.println();
        compress(n);
    }    
}
