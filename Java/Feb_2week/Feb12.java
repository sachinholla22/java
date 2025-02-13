import java.util.Scanner;

public class Feb12 {
    public static void main(String[] args) {
      //  Pattern.printPattern();
      //Pattern.pattern1();
      Pattern pat=new Pattern();
      //pat.pattern3();
      Fibonacci fib=new Fibonacci();
      //fib.fib();
      int n=10;
      //System.out.println("The Fibonacci Series is "+n+fib.usingRecursion(n));
      SortArray sort=new SortArray();
      sort.test();
    }
}
class Pattern{
    public static void printPattern(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=i+1;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern1(){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
    public void pattern2(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public void pattern3(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


class Fibonacci{
     public void fib(){
        int first=0;
        int second=1;
        System.out.println("Enter the seris");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
if(num<2){
    System.out.println(num) ;
}
System.out.print(first+" " + second +" ");
        for(int i=2;i<num;i++){
        int sum=first+second;
        System.out.print(sum +" ");
first=second;
second=sum;
        }
     }

     public int usingRecursion(int num){
    

        if(num==0){
          return 0;
        }else if(num==1){
            return 1;
        }else{

        return usingRecursion(num-1)+usingRecursion(num-2);
        }
        


     }
}


class SortArray{
    public void sortAscending(){
        int arr[]={45,32,65,41,29,52};

        for(int i=0;i<arr.length-1;i++){
     if(arr[i]>arr[i+1]){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
      
     }

    
        }
       
    }

    public void test(){
        int x=10;
        int y=0;
        for(int i=0;i<x;i++){
        y=i+x;
        }
        System.out.println(y);
    }
}

