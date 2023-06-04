class Rectangle{
int length;
int width;
void insert(int i,int w){
length=i;
width=w;
}
void calculateArea(){System.out.println(length*width);}
}
class TestRectangle1{
public static void main(String args[]){
Rectangle R1=new Rectangle(),R2=new Rectangle();
R1.insert(11,5);
R2.insert(3,15);
R1.calculateArea();
R2.calculateArea();
}
}