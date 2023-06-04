class Student3{
int id;
String name;
}
class TestStudent3{
public static void main(String args[]){
Student3 s1=new Student3();
Student3 s2=new Student3();
s2.id=102;
s2.name="Amit";
s1.id=101;
s1.name="Sonoo";
System.out.println(s1.id+"\n"+s1.name+"\n"+s2.id+"\n"+s2.name);
}
}