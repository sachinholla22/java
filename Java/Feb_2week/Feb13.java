import java.util.Scanner;

public class Feb13 {
    public static void main(String[] args) {
        Pattern pat=new Pattern();
        // pat.pattern4();
        Strings str=new Strings();
        //str.string1();
        ForArmStrong arm=new ForArmStrong();
        //arm.getArmStrong();
        Numbers num=new Numbers();
       // num.isPrimeNum();
      // num.fibonacci(5);
     // num.armStronginRange();
     num.countDigits();
    }
}

class Pattern{
    public void pattern1(){
        int num=6;
       for(int i=1;i<=num;i++){
        for(int j=1;j<=num-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
       }

    }
    public void pattern2(){
        int rows = 5; // You can change this to adjust the size of the triangle

        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars to right-align the triangle
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Print the stars for the current row
            for (int k = 1; k <= rows-i+1; k++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }


    void pattern3(){
        int n=6;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    void pattern4(){
        int n=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

class Strings{
    public void string1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the URL of the Website");
        try{
            String url=sc.nextLine();
            boolean isCompany=false;
            boolean isOganization=false;
            boolean isIndian=false;
            if(url.endsWith(".com") && url.startsWith("www") || url.startsWith("https") || url.startsWith("http")){
                isCompany=true;

            }else if(url.endsWith(".org")&& url.startsWith("www") || url.startsWith("https") || url.startsWith("http")){
                 isOganization=true;
            }else if(url.endsWith(".in")&& url.startsWith("www") || url.startsWith("https") || url.startsWith("http")){
                 isIndian=true;

            }else{
                System.out.println("The Url doesnt belong to either of Company ,Organization or Indian etc");
            }

            if(isCompany){
                System.out.println("Its company");
            }else if(isOganization){
                System.out.println("The url is from Organization");
            }else if(isIndian){
                System.out.println("The url is from Indian Website");
            }

        }catch(Exception e){
            System.out.println("Please Enter a valid url");
        }
    }
}


class ForArmStrong{
    public void getArmStrong(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked for ArmStrong");
        int num=sc.nextInt();
        int temp=num;
        int noofDigits=0;

        while(temp>0){
            temp=temp/10;
            noofDigits++;
        }

        temp=num;
        double sum=0;
        while(temp>0){
            int digits=temp%10;
            double power=Math.pow(digits,noofDigits);
            sum=sum+power;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("Its an armstrong number");
        }else{
            System.out.println("Its not an armstrong number");
        }
    }
}

class Numbers{
    public void isPrimeNum(){
        int num=15;

        for(int i=2;i<=num;i++){
          
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
             
             if(i%j==0){
                    isPrime=false;
                    break;
                    
                 } 
               
            }

             if(isPrime){
                System.out.print(i+" ");
            }
           
        }
       


    }

    public void fibonacci(int num){
        int first=0;
        int second=1;
        if (num==0){
            System.out.println(num);
        }else if(num==1){
            System.out.println(num);
        }
System.out.print(first+","+second+",");
        if(num>1){
            for(int i=2;i<num;i++){
                int sum=first+second;
                System.out.print(sum+",");
                first=second;
                second=sum;
                
            }
        }
    }

    public void armStronginRange(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the starting range");
       int starting=sc.nextInt();
       System.out.println("Enter the ending range");
       int end=sc.nextInt();
       boolean isArmStrong=false;
       for(int i=starting;i<=end;i++){

        
         int num=i;
         int numOfDigits=Integer.toString(num).length();
         int sum=0;
         while(num>0){
            int digits=num%10;
            int pow=(int)Math.pow(digits,numOfDigits);
            sum=sum+pow;
            num=num/10;

         }
         if(sum==i){
            System.out.println(i+" ");
            isArmStrong=true;
         }
        


       }
       if(!isArmStrong){
        System.out.println("No armstrong found");
       }
    }

    public void countDigits(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
int count=0;
        while(num>0){
            num=num/10;
count++;
        }
        System.out.println(count);

    }
}