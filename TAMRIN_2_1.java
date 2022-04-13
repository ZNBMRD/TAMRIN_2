package tamrin_2_1;

import java.util.Scanner;

public class TAMRIN_2_1 {
    public static void Checker(){
        int x=0,y=0,z=0,s=0,a=0,b=0,c=0;
        Scanner input=new Scanner(System.in);
        System.out.print("please enter email address : ");
        String n=input.nextLine();
        int size=n.length();
        char[] ch=n.toCharArray();
        if(ch[0]=='0' ||ch[0]=='1' ||ch[0]=='2' ||ch[0]=='3' ||ch[0]=='4' ||ch[0]=='5' ||ch[0]=='6' ||ch[0]=='7' ||ch[0]=='8' ||ch[0]=='9' ||ch[0]=='_'){
            x++;
        }
        for(int i=0;i<size;i++){
            if(ch[i]=='@'){
                a=i;
            }
            if(ch[i]=='.'){
                b=i;
            }
        }
        if(a>b){
            y++;
        }
        size--;
        c=size-b;
        if(c > 3){
            z++;
        }
        for(int j=(b+1);j<=size;j++){
            if(ch[j]!='a'&& ch[j]!='b'&& ch[j]!='c'&& ch[j]!='d'&& ch[j]!='e'&& ch[j]!='f'&& ch[j]!='g'&& ch[j]!='h'&& ch[j]!='i'&& ch[j]!='j'&& ch[j]!='k'&& ch[j]!='l'&& ch[j]!='m'&& ch[j]!='n'&& ch[j]!='o'&& ch[j]!='p'&& ch[j]!='q'&& ch[j]!='r'&& ch[j]!='s'&& ch[j]!='t'&& ch[j]!='u'&& ch[j]!='v'&& ch[j]!='w'&& ch[j]!='x'&& ch[j]!='y'&& ch[j]!='z'){
                s++;
            }
        }
        if(x==0 && y==0 && z==0 && s==0){
            System.out.println("Email address is valid");
        }
        else{
            System.out.println("Email address is invalid");
        }
    }
    public static void main(String[] args) {
        Checker();  
    } 
}
