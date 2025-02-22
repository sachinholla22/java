import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
class Feb21{
    public static void main(String[] args) {
        Animal dog=new Dog("binny",13);
// dog.display();

// Animal ani=new Animal("mikky",10);
// ani.display();
//Cat cat=new Cat("Gunda",2);
//cat.display();

Hyundai car=new Hyundai(2003, "i20" );
// car.fuelType();
//B b=new B();

Practice prac=new Practice();
//prac.perfectNumber(9);
// prac.perfectNumbersRange(2,1000);
// prac.perfects();
int arr[]={6,3,1,9,5};
//prac.sortArray(arr);
// prac.sumOfEvenOdd(arr);
prac.getFrequencey();
    }
}

class Animal{
    String name;
    int age;

 Animal(String name,int age){
    this.name=name;
    this.age=age;
 }
 public void display(){
    System.out.println("The name is "+name+ "And age is"+age);
 }
 public void makesSOund(){
    System.out.println("ANimal makes sound");
 }
}

class Dog extends Animal{
    Dog(String name,int age){
        super(name,age);

    }
     
    public void display(){
        super.makesSOund();
        System.out.println("Dogs is barking");
    }
}

class Cat extends Dog{
    Cat(String name,int age){
        super(name,age);
    }
    public void display(){
        super.display();
    }

}


class Car{
    String name;
    int model;
int speed;
public void maxSpeed(int speed){
this.speed=speed;
}
    Car(String name, int model){
        this.name=name;
        this.model=model;
    }

    public void fuelType(){
        System.out.println("Its a petrol");
    }
}

class Hyundai extends Car{
    Hyundai(int model,String name){
        super(name,model);
    }

    public void speed(int speed){
        this.speed=speed;
    }

    public void fuelType(){
    super.fuelType();
        System.out.println("Its electric");
    }
}


class A{
    public A(){
        System.out.println("This is From A");
    }
     A(int a){
         System.out.println("int a");
    }
}
class B extends A{
    B(){
        super(6);
        System.out.println("This is from B");
    }
B(int b){
    super(b);
    System.out.println("Int from B");
}

}


class Practice{
    public void perfectNumber(int n){
        ArrayList <Integer> array=new ArrayList<>();
        int sum=0;


        for(int i=1;i<n;i++){
           if(n%i==0){
             array.add(i);
           }
        }
Iterator <Integer> it=array.iterator();

while (it.hasNext()){
    sum=sum+it.next();
}
if(sum==n){
    System.out.println("true");
}
else{
    System.out.println("false");
}


    }

    public void perfectNumbersRange(int start,int end){
        boolean isPerfect=false;
        for(int i=start;i<=end;i++){
         int num=i;
         ArrayList <Integer> arr=new ArrayList<>();

         int sum=0;

         for(int j=1;j<num;j++){

            if(num%j==0){
              arr.add(j);
            }
         }

         Iterator<Integer> it=arr.iterator();

         while(it.hasNext()){
            sum=sum+it.next();
         }

         if(sum==num){
            isPerfect=true;
            System.out.println(num);
         }



        }
        if(!isPerfect){
            System.out.println("No perfect number in this range");
        }

        

    }

    public void perfects(){
        int num=6;
        int sum=1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }

    public void sortArray(int arr[]){

        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
          }
        }
        for(int array:arr){
            System.out.print(array+ "");
        }
        

    }

    public void sumOfEvenOdd(int array[]){
        int evenSum=0;
        int oddSum=0;

        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                evenSum+=array[i];
            }else if(array[i]%2==1){
                oddSum+=array[i];

            }
        }
        System.out.println("The sum of even number in an array is "+evenSum);
        System.out.println("The sum of odd number in an array is "+oddSum);
    }

    public void getFrequencey(){
        int arr[]={2,3,5,2,9,8,5};

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            //if the key element is already present
            if(map.containsKey(arr[i])){
map.put(arr[i],map.get(arr[i])+1);

            }else{
                map.put(arr[i],1);
            }
        }

     for(int array:map.keySet()){
        System.out.println(array +" "+map.get(array));
     }

    }
}

