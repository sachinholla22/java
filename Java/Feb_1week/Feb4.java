/*
 What is an ABSTRACTION ?
 ->Abstraction means hiding the complex implementation details of a system and exposing only the necessary features to the user.
 ->The idea is to provide a simplified of an object by focusing on what it does rather than how it does.
 ->Mainly reduces complexity and imporves efficiency and improves Security.
 (For Example if u have a application that is meant for calculations like add,subs,multiplciton etc 
 You dont show the backend to the user , u just show the GUI  )
 
 ABSTRACTION can be achieved using ->
 *)Abstract class
 *)Interfaces


 For ABstract class refer previous day notes ..its the same
 and also for the interface too ..Refer Previous day notes

 SO what is POLYMORPHISM?
 Poly means many , morphism means Behaviour

 like in simple terms take an example of me , im a college in office ,im a son to my parents ,
 im a customer when entered a shop and student in the college

 POLYMORPHISM Comes with 2 types ->
 1) Compile time.
 2)Run Time.

 if a behaviour defined at compile time -> It is compile time polymorphism
 if a behaviour defined at run time -> It is run time polymorphism

 Eg, Method Overloading->Compile time 
 Method Overriding->Run time

 Dynamic Method Dispatch
 eg
 class Computer{

}
class Laptop extends Computer{

}
public class Feb4 {
    
    public static void main(String[] args) {
        Computer cp=new Laptop();
    }

    
}

U can do like thislike Refer Computer and create an object of laptop ..because laptop is a part of computer and u can 
get the methods by referring it

But one thing , if u have a method overriding ,like

 class Computer{
public void internet(){
sout("Connected")}
}
class Laptop extends Computer{
public void internet(){
sout("Disonnected")
}
public class Feb4 {
    
    public static void main(String[] args) {
        Computer cp=new Laptop();
        cp.internet();
        //result in Disconnected becuase object is refered as laptop and it has been overridden

        //So if u want to get the value of computer then u cn also gv like
        //it basically cuts the first link of Laptop
        obj=new Computer();
        obj.internet();
        //result in Connected
    }

    
}

So collectively from the above example thats how runtime polymorphism works ..it behaves differnetly or different objects

What do u mean by CLASS and OBJECTS in Java?
Class is a blueprint for the creation of objects it defined the behaviour and variables so that what data and actions the objects created fro it will have 
Class doesnt store the data on its own ,it only defines the type of data and methods ,

Objects in other hand , is a instance of a class and holds the actual data 
When u create a object a class constructor is used to initalize it , and the object can access the fileds and methods defined by class

To declare the Object ,
ClassName objectName = new ClassName();

here ClassName is the actual name of the class ,
objectName is the name of object reference variable.
new , it is the keyword used to allocate memory fo rthe new Object
className() -> it is the constructor of the class , which initalizes th eobject ..


Can INTERFACE Extends Another Interface? 
Yes , it can extend the interface and inherit the behaviour of parent interface

eg,
interface Animal{
 void sound();
}
 // Child interface extending the Animal interface
interface Pet extends Animal {
    void play();
}

// A class implementing the Pet interface, which also implements the methods from Animal
class Dog implements Pet {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing.");
    }
}

 */


public class Feb4 {
    
    public static void main(String[] args) {
        
    }

    

}