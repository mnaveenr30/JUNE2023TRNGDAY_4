import java.util.Scanner;
class Swapp01{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
System.out.println("\nBefore Swpping values are:\t"+num1+"\t"+num2);
num1=num1*num2;
num2=num1/num2;
num1=num1/num2;
System.out.println("\nAfter Swpping values are:\t"+num1+"\t"+num2);
}
}
