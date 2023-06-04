class Student{
int rollno;
String name;
Student(){rollno=0;name=null;}
Student(int r,String n){
rollno=r;
name=n;
}
void displayInformation(){System.out.println(rollno
+"\t"+name);}
}
class Student5{
public static void main(String args[]){
Student s1;
s1=new Student();
Student s2=new Student(111,"Pawan");
s1.displayInformation();
s2.displayInformation();
}
}
