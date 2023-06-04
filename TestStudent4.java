class Student3{
int rollno;
String name;
void insertRecord(int r,String n){
rollno=r;
name=n;
}
void displayinformation(){System.out.println("\n"+rollno+"\t"+name);}
}
class TestStudent4{
public static void main(String args[]){
Student3 s1=new Student3();
Student3 s2=new Student3();
s2.insertRecord(222,"Aryan");
s1.insertRecord(111,"Karan");
s1.displayinformation();
s2.displayinformation();
}
}