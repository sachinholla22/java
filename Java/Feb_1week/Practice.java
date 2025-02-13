/*
 So if u want to access the private variable inside the same class then u must also give Object creation and refer it 
 */

public class Practice{
    public static void main(String[] args){
      
Car car=new Car();
MotorCycle mc=new MotorCycle();
// car.year();
// car.model();
// car.numDoors();
// mc.year();
// mc.engineType();
// car.displayInfo();
// mc.displayInfo();
// Vechicle vc =new Vechicle();
// vc.make();

// Kitten kt=new Kitten();
// kt.sleeps();
// kt.drinksMilk();
// kt.eats();

// Animal dog=new Dog();
// dog.sleeps();

// Bank bb=new Bank();
// Bank.hasAccount();
// Account ac=new Account();
// ac.getAccount();

Mercedes mrc=new Mercedes();
mrc.model();
mrc.make();
mrc.color();

BMW bmw=new BMW();
bmw.make();
bmw.model();

G5 g5=new G5();
g5.make();
g5.model();
g5.color();
    }

}

class Vechicle{
    void make(){
System.out.println("Blue");
    }

    void model(){
        System.out.println("xt-234");

    }

    void year(){
System.out.println("2002");
    }

    void displayInfo(){
        System.out.println("This is Vechicle Info");
    }
}

class Car extends Vechicle{
    void numDoors(){
System.out.println("4 doors");
    }
    void displayInfo(){
        System.out.println("This is Car info");
    }
}

class MotorCycle extends Vechicle{
    void engineType(){
        System.out.println("125cc");

    }
    void displayInfo(){
        System.out.println("This is Bike Info");
    }
}



interface Animal{
    void eats();
    void sleeps();
}

class Dog implements Animal{
    void bark(){
        System.out.println("The Dog is barking");
    }
    public void eats(){
        System.out.println("The Dog Eats");
    }
    public void sleeps(){
        System.out.println("The Dogs sleeps");
    }
}

class Cat implements Animal{
    public void eats(){
        System.out.println("Cat eats");
    }
    public void sleeps(){
        System.out.println("Cat sleeps");
    }
}

class Kitten extends Cat{
    public void drinksMilk(){
        System.out.println("Kitten baby mikki");
    }
}



//Hierarchy INheritance
class Bank{
    private  int balance;
    public static void hasAccount(){
        Bank bb=new Bank();
        bb.balance=40;//made this because i cannot  access non static variable directly
        System.out.println("THe user has account");
    }
}

class Account extends Bank{
public void getAccount(){
  
System.out.println("This is get Account");

}

class Branch extends Bank{
    public void branch(){
        System.out.println("This is Surathkal branch");
    }
}
}



abstract class Cars{
    abstract public void model();
    void make(){
        System.out.println("This year");
    }
abstract public void color();

} 
class BMW extends Cars{
    public void model(){
        System.out.println("2002");
    }
   public  void color(){
        System.out.println("green");
    }
}

class Mercedes extends Cars{
    public void model(){
        System.out.println("2008");
    }
   public  void color(){
        System.out.println("black");
    }
}


class G5 extends Mercedes{
    public void model(){
        System.out.println("2012");
    }
   public  void color(){
        System.out.println("gray");
    }
}
