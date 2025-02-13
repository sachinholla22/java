public class PraciceFeb5 {
    public static void main(String[] args) {

    //     AccessModifier am=new AccessModifier();

    //     System.out.println(AccessModifier.num5);
    //    System.out.println(am.num3);
    //     System.out.println(am.num4);
    //    System.out.println(am.num2);

    //    am.getSum();
    //    am.setName("Sachin");
    //    System.out.println(am.getName());
    // Gym vf=new VitFit();
    // vf.fees();

    // VitFit vf1=new VitFit();
    // vf1.equipments();
    // GoldsGym gold=new GoldsGym();
    // gold.hasRestRoom();

//     Computer cs=new Laptop();
//     cs.displayType();
// Computer.hasCPU();

// GPU gp=new GPU();
// gp.gpuType();

// ForPolyMorphism fp=new ForPolyMorphism();

// System.out.println(fp.add(4,5,8));
// System.out.println(fp.add(4,2));

// Animal an=new Dog();

// an.wings();


// Dog dg=new Dog();
// dg.wings();

// Dog.eats();

// A a=new A();
// a.callA();

X x=new X(3,4);
x.Disp();
    }
}


class AccessModifier{
    private int num1=10;
    private String name="Sachin";
    protected int num2=15;
    int num3=20;
    public int num4=30;

    public static int num5=50;

    protected void getSum(){
       System.out.println(num1+220);
    }

    public  void setName(String nm){
        this.name=nm;
    }
    protected String getName(){
        return name;
    }
}


interface Gym{
    void fees();
    void equipments();
}

interface MultiGym{
    String room="1st floor";
void hasRestRoom();
}
class CultFit implements Gym{
    public void fees(){
        System.out.println("Gym fee is Rupees 1500 per month");
    }
    public void equipments(){
        System.out.println("All Equipments");
    }
}

class VitFit implements Gym{
    public void fees(){
        System.out.println("1000 per mont");
    }
    public void equipments(){
        System.out.println("Bit old Equipments");
    }
    void trainers(){
        System.out.println("Has Trainers");
    }

}


class GoldsGym implements Gym,MultiGym{
    public void fees(){
        System.out.println("Gym fee is Rupees 5000 per month");
    }
    public void equipments(){
        System.out.println("Most MOdern Equipments");
    }

    public void hasRestRoom(){
        System.out.printf("The restroom is in %s",room);
    }
}



abstract class Computer{
    public static void hasCPU(){
        System.out.println("It Has the CPU");
    }
    abstract void displayType();
}

class Laptop extends Computer{
    public void displayType(){
        System.out.println("Its an Oled Screen");
    }
     



}

class GPU extends Laptop{
    void gpuType(){
        System.out.println("Nvdiea Gtx 1650");
    }
}



class ForPolyMorphism{
    public  int add(int a, int b){
        return a+b;

    }

int add(int a ,int b ,int c){
    return a+b+c;

}
int add (int a, int b, int c ,int d){
    return a+b+c+d;
}
   
}



class Animal{
    private void hasWings(){
        System.out.println("Its has WIngs");
    }

    public void wings(){
        hasWings();
    }
}


class Dog extends Animal{
    String myName;
    public void wings(){
        System.out.println("No it doesn have wings");
    }

    public static void eats(){
        System.out.println("Eating");
    }
    public Dog(){
        System.out.println("Dog Barks");
        System.out.println(myName="The name is sachin");
    }
}


class A{
    int number;

    A(){

        number=69;
    }
    
    void callA(){
        System.out.println("The Value of Number is "+number);
    }
}

class X{
    int x ,y;
    X(int a,int b){
        x=a;
        y=b;

    }
    void Disp(){
        System.out.printf("The value of A and B is %d, %d",x,y);
    }
}