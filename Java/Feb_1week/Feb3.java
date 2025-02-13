//February 3

/*
 OOPS conecpts in Java
 it is a way of designing programs by creating the objects that interact with each other.It 
 Helps to organize the code ,making it resuable , modular and easier to maintain.

 #Simula is the first programming language where everything is OOP concepts

 # Four main concepts of OOPS are 
 1)Encapsulation
 2)Inheritance 
 3)Polymorphism
 4)Abstraction

 So what is ENCAPSULATION ?
 ->Wrapping data(variables) and code (methods) together in a class.
->Uses Private variables and public methods to control access.
->It protects the data from unintended Modifications
(In simple words its like no one from outside world can use it)
->We use Private access modifier So the variables are only accesible in the same class
-> So only way to access or extract those data is by methods .Check example codes below for more info.

Note : Why use of Encapsulation :
1)Data Security-Preventsdirect modifications of variables
2)Control-Only specific methods can change values
3)Ezy maintiance and code flexibility



2)What is INHERITANCE?
->Its simply mean that one class(child) can inherit properties and methods from 
another class(Parent).
-> It helps in code reusability and reduces redundancy.
(So in simple words you can use the superclass properties and methods)
How Inheritance works?
-> Parent class(superclass) contains common propeties and methods.
->The child class(subclass) inherits those properties and can add its own methods.
->You need to use extends Keyword to implement inheritance.

Types of Inheritance
1)Single Inheritance
->Inherits the method and property from single parent class.
2)Multilevel Inheritance
->Inherits from parents class and again child class gets inherited by another child class
3)Hierarchical Inheritance
->here multiple subclass can inheit from a single superclass
4)Multiple Inheritance 
->Java doesnot support multiple inheritance directly through classes but can support through interface
eg
interface Animal {
    void sound();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}


3)What is METHOD OVERRIDING?
->It means the subclass(child class) overrides the method of parent class(superclass)


4)What is Abstract Class?
A class which contains the abstract keyword in its declaration is called abstract class
syntax:
abstract class A{
//some code
}
ABSTACT METHOS -> A method without a body.
We cannot create a object for abstract class

For eg,
abstract class Animal{
}

class Dog extends Animal{
}
class Main{
public static void main(String[] args){
Animal an=new Animal();  //cant create like this 
Dog dg=new Dog(); //you can create like this
}}


-> It may or maynot contain abstract methods
->It can have abstrct or non abstract methods 
->If a class contain partial implementation then we should declare a class as abstract ..
eg,,
class A {
void testing(){
}
}
-> To use abstract class u need to inerit it from sub class(child class)
-> But if a class has atleast 1 abstract method ..then it must be declared as abstract class


So Why do we use ABSTRACT CLASS? 
..suppose u have 2 class called Dog  and Lion
 and it has a commong method like eats().. So define it 2 times the same method repeteadly use ,
 an abstract class and abstract method .. eg,

 abstract class Animal{
 void eats(){
 }
 }

 class Dog extends Animal {
 void eats(){
 sout("Dog is eating")}
 }

  class Lion extends Animal {
 void eats(){
 sout("Lion is eating")}
 }


 What is an INTERFACE?
 ->INTERFACE is like a Class that contains only abstract methods (method without body)
 and it doesnt contain the concrete methods unlike the abstract class ..
 In Interface by default the methods are public and  also abstract methods when implementing in other class You need to give public 
 and also if u declare the variable inside the interface ,by default it will be public +static+final variable (u cant access directly),

 U use 'implement' keyword for implement it in other class
 and also if u give implements to interface u compulsary need to define those abstract methods

 So, INTERFACES are mainly used for multiple inheritances 

 */

 
import java.util.Scanner;
public class Feb3{
    public static void main(String[] args){
        Encapsulation ep=new Encapsulation();
        ChildInheritance ci=new ChildInheritance();
       
        ci.eats();
        ChildInheritance.sleeps();
         ci.ridesBike();
         ci.studies();
         ci.goesToGym();

        ep.age=34;
        ep.email="sachin@gmail.com";

        ep.setName("Sachin");
        System.out.println("The name is "+ep.getName());
        System.out.println("The Age is "+ep.age);
        System.out.println("The Email is "+ep.email);
    }

}

class Encapsulation{
    private int  age;
    public String email;
    private String name;
    public void setName(String newName){
        name=newName;
    }
    public String getName(){
        return name;
    }
}

class Inheritance{
    public void eats(){
        System.out.println("Im eating");
    }
    public static void sleeps(){
        System.out.println("Im sleeping");
    }

    void goesToGym(){
        System.out.println("I go to gym");
    }

}

class ChildInheritance extends Inheritance{
    public void ridesBike(){
        System.out.println("Im riding the bike");
    }
    public void studies(){
        System.out.println("I will study everyday");
    }

    //METHOD OVERRIDING
    void goesToGym(){
        System.out.println("I go to gym every alternate days");
    }
}



