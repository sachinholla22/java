public class Feb22{
    public static void main(String[] args) {
        Practice prac=new Practice();
       // prac.reverseNumberUsingCharArray(47238);

      // System.out.println(prac.reverseNumberNormally(84913));
      //prac.fibonacci(1);
      //System.out.println(prac.palindrome("maddum"));
      //prac.primeNumber(15);
      int[] arr={4,5,1,9,7,3};
      prac.rotateArrayByK(arr, 2);
    }
}

class Practice{
    public void  reverseNumberUsingCharArray(int num){
        String str=Integer.toString(num);
       char[] character=str.toCharArray();
       for(int i=character.length-1;i>=0;i--){
 System.out.print(character[i]);

       }
    }

    public int reverseNumberNormally(int num){
        int reverse=0;
         
      
        return reverse;
    }

    public void fibonacci(int n){
        int first=0;
        int second=1;
        
        if(n==0){
            
            return;
        }else if(n==1){
            System.out.print(first);
            return;
        }
        System.out.print(first+","+second+",");

        for(int i=2;i<n;i++){
            int temp=first+second;
            System.out.print(temp+",");
            first=second;second=temp;
        }
    }

    public boolean palindrome(String str){
        boolean isPalindorme=true;
       
        char[] arr=str.toCharArray();
int start=0;
int end=arr.length-1;
while(start<end){
    if(arr[start]!=arr[end]){
        isPalindorme=false;
        
    }
    start++;
    end--;
}

        return isPalindorme;


    }

    public void primeNumber(int n){
        if(n==1||n==0){
            System.out.println("Its not a prime number");
        }
      
        for(int i=2;i<=n;i++){
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++){
              
             if(i%j==0){
             isPrime=false;
               
             }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }

    public void rotateArrayByK(int[] arr,int k){
        int size=arr.length;
        if(k>size){
            k=k%size;
        }
reverseArray(arr);
reverseK(arr,k);
reverseRemaining(arr,k,size-1);
       
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverseArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

        }
    }
    public static void reverseK(int arr[],int k){
        int start=0;
        int end=k-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static void reverseRemaining(int[] arr,int start,int end){
while(start<end){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
    }
  
}

}