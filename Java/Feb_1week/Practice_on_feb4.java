import java.util.Scanner;
public class Practice_on_feb4 {
 public static void main(String[] args){
Beginner bg=new Beginner();
//bg.evenOrOdd();
//System.out.println(Beginner.factorial(5));
//System.out.println(Beginner.usingRecursionFactorial(7));
//System.out.println(Beginner.fibonacci(7));
//Beginner.isPrime();
bg.forString();
 }   
}

class Beginner{
    public void evenOrOdd(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
try{
int num=sc.nextInt();
if(num%2==0){
    System.out.println("Its an Even NUmber");
}else{
    System.out.println("Its odd");
}

    }catch(Exception e){
System.out.println("Please enter a valid Integer");
    }
}



public static int  factorial(int num){
     int fact=1;

    for (int i=1;i<=num;i++){
     
        
            fact=fact*i;

    }
    return fact;


}

public static int usingRecursionFactorial(int num){
   
  
if(num==0 ||num==1){
    return 1;
}
return num*usingRecursionFactorial(num-1);



    

}

public static int fibonacci(int n){
    if(n==0){
        return 0;
    }else if(n==1){
        return 1;

    }
    return fibonacci(n-1)+fibonacci(n-2);

}

public static void isPrime(){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    boolean isPrime=true;

    for (int i=2;i<Math.sqrt(num);i++){
        if(num==0){
           isPrime=false;
        }else if(num==0){
            isPrime=false;
        }else{
            if(num%i==0){
                isPrime=false;
                break;
            }else if (num%i==1){
                isPrime=true;
            }
        }
    }
    if(isPrime==true){
        System.out.println("Its a Prime NUmber");
    }else{
        System.out.println("Its not a prime");
    }
}

public void forString(){
    String str=new String("Hello Guys");
    char arr[]=str.toCharArray();

    for (int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]+"");
    }


    String otherStr="Jai Modi";
    String empty="";
    for(int i=otherStr.length()-1;i>=0;i--){
        empty +=otherStr.charAt(i);

    }
    System.out.print(empty+" ");
}

}
