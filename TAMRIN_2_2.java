package tamrin_2_2;

import java.util.Scanner;

public class TAMRIN_2_2 {
    public static boolean Checker( String n , String m ){
        boolean x,y=false,z=false,s=false;
        int a=0;
        x=n.equals(m);
        int size=n.length();
        char[] ch=n.toCharArray();
        for(int i=0;i<size;i++){
            if(ch[i]=='0' ||ch[i]=='1' ||ch[i]=='2' ||ch[i]=='3' ||ch[i]=='4' ||ch[i]=='5' ||ch[i]=='6' ||ch[i]=='7' ||ch[i]=='8' ||ch[i]=='9'){
                a++;
            }
        }
        if(a!=0){
            y=true;
        }
        if(size>=8){
            z=true;
        }
        for(int j=0;j<size;j++){
            if(ch[j]!='a'&& ch[j]!='b'&& ch[j]!='c'&& ch[j]!='d'&& ch[j]!='e'&& ch[j]!='f'&& ch[j]!='g'&& ch[j]!='h'&& ch[j]!='i'&& ch[j]!='j'&& ch[j]!='k'&& ch[j]!='l'&& ch[j]!='m'&& ch[j]!='n'&& ch[j]!='o'&& ch[j]!='p'&& ch[j]!='q'&& ch[j]!='r'&& ch[j]!='s'&& ch[j]!='t'&& ch[j]!='u'&& ch[j]!='v'&& ch[j]!='w'&& ch[j]!='x'&& ch[j]!='y'&& ch[j]!='z' && ch[j]!='A'&& ch[j]!='B'&& ch[j]!='C'&& ch[j]!='D'&& ch[j]!='E'&& ch[j]!='F'&& ch[j]!='G'&& ch[j]!='H'&& ch[j]!='I'&& ch[j]!='J'&& ch[j]!='K'&& ch[j]!='L'&& ch[j]!='M'&& ch[j]!='N'&& ch[j]!='O'&& ch[j]!='P'&& ch[j]!='Q'&& ch[j]!='R'&& ch[j]!='S'&& ch[j]!='T'&& ch[j]!='U'&& ch[j]!='V'&& ch[j]!='W'&& ch[j]!='X'&& ch[j]!='Y'&& ch[j]!='Z'&& ch[j]!='0'&& ch[j]!='1'&& ch[j]!='2'&& ch[j]!='3'&& ch[j]!='4'&& ch[j]!='5'&& ch[j]!='6'&& ch[j]!='7'&& ch[j]!='8'&& ch[j]!='9'){
                s=true;
            }
        }
        if(x==true && y==true && z==true && s==true){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean nm;
        Scanner input=new Scanner(System.in);
        System.out.print("please enter the first string : ");
        String n=input.nextLine();
        System.out.println();
        System.out.print("please enter the second string : ");
        String m=input.nextLine();
        nm=Checker(n,m);
        System.out.println(nm);
    }   
}
