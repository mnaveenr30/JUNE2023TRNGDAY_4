import java.util.Scanner;
class Inputed_Table{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
char ch=' ';
for (int i=0;i<=10;i++){
System.out.print("\n"+num+ch+"*"+ch+i+"="+(num*i));
}
}
}