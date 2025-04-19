class Animal{
String name;
int age;
Animal(String name,int age){
this.name=name;
this.age=age;
}
void Display(){
System.out.println("Name :"+name);
System.out.println("Age :"+age);
}
}
class Dog extends Animal{
Dog(String name,int age){
super(name,age);
}
}
class Cat extends Animal{
Cat(String name,int age){
super(name,age);
}
}
class Main{
public static void main(String []args){
Dog a=new Dog ("Tommy",2);
a.Display(); 


}}