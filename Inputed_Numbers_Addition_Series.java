
import java.util.Scanner;
class Inputed_Numbers_Addition_Series{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3,num4;
if(num1>num2){
num3=num1;
num4=num2;
}
else{
num3=num2;
num4=num1;
}
char ch=',';
for (int i=0;i<=num3;i+=num4){
System.out.print(i);
if((i+num4)>=num3){
break;
}
System.out.print(ch);
}
}
}