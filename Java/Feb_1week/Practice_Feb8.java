import java.util.Scanner;
public class Practice_Feb8 {
public static void main(String[] args) {
    // Practice_Feb8 feb8=new Practice_Feb8();
    // feb8.printPrime(4);
  Patterns pattern=new Patterns();
//   pattern.pattern1();
//   pattern.pattern2();
//   pattern.pattern3();
//   pattern.pattern4();
// pattern.pattern5();
// pattern.pattern6();
// pattern.pattern7();
// pattern.pattern8();pattern.pattern8();
// pattern.pattern9();
pattern.pattern10();
}

public void printPrime(int n){
    boolean isPrime=false;
   for(int i=2;i<=n;i++){

for(int j=2;j<=n/2;j++){
 if(i%j==0){
    isPrime=false;
 }
 else{
    isPrime=true;
   
 }
 if(isPrime){
    System.out.println(i);
 }
}
   }

}

}

class Patterns{
    public void pattern1(){

        int n=5;
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println("");
        }
    }
    public void pattern2(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
System.out.print("*");
            }
            System.out.println("");
        }

    }
    public void pattern3(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
System.out.print(j);
            }
            System.out.println("");
        }

    }
    public void pattern4(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
System.out.print(i);
            }
            System.out.println("");
        }

    }
    public void pattern5(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i;j++){
System.out.print("*");
            }
            System.out.println("");
        }

    }
    public void pattern6(){
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
System.out.print(j);
            }
            System.out.println("");
        }

    }

    public void pattern7(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
System.out.print("*");
            }
            System.out.println("");
        }

    }

    public void pattern8(){
int n=5;
for(int i=0;i<n;i++){
    for(int j=0;j<i;j++){
        System.out.print(" ");
    }
    for(int j=0;j<2*n-(2*i+1);j++){
        System.out.print("*");
    }
   
    System.out.println(" ");
}
    }

    public void pattern9(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
           
            System.out.println(" ");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            } System.out.println(" ");
        }
       
            }

        public void pattern10(){
            int n=5;
            for(int i=0;i<=2*n-1;i++){

                int star=i;
                if(i>n){
                    star=2*n-i;
                }
                for(int j=1;j<=star;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            
        }    
}
