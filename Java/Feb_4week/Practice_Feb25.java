import java.util.*;
public class Practice_Feb25{
    public static void main(String[] args) {
        // Mythread mt=new Mythread();
        // mt.start();
        // anotherThread at=new anotherThread();
        // at.start();
        // at.myTry();
        Practice prac=new Practice();
       // System.out.println(prac.sumOfDigits(5686));
        //System.out.println(prac.digitsSum(5686));
        //System.out.println(prac.reverseNumber(78329));

        int arr[]={ 1, 4, 6, 3, 7, 5, 2};
        //System.out.println(prac.missingNum(arr));
        int arr1[]={10,20,30};
        int arr2[]={5,16,28};
       // prac.mergeTwoSortedArray(arr1,arr2);
       //prac.mergeWithoutCollections(arr1,arr2);
       //prac.findPairSums(arr, 13);
      // prac.rotateArrayByOnePlace(arr);
      System.out.println(Thread.currentThread().getName());

Thread.currentThread().setPriority(Thread.MAX_PRIORITY-1);
System.out.println(Thread.currentThread().getPriority());
    }
}

class Mythread extends Thread{
     public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
            try{
                Thread.sleep(100);

            }catch(InterruptedException e){
                System.out.println("An Error occured");
            }
        }
     }

}

class anotherThread extends Thread{
    public void run(){
        
        for(char alpha='A'; alpha<='J';alpha++ ){
            System.out.println(alpha);
            try{
                Thread.sleep(100);

            }catch(InterruptedException e){
                System.out.println("An Error occured");
            }
        }
    }
    public void myTry(){
        System.out.println("Im testing here");
        for(int i=1;i<=10;i++){
            System.out.println("hello");
        }
    }
}



class Practice{
    public int sumOfDigits(int num){
        String str=Integer.toString(num);

    char[] arr=str.toCharArray();
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum +=arr[i]-'0';
        }

        return sum;
    }

    public int digitsSum(int num){
        int sum=0;
        while(num>0){
int digits=num%10;
sum+=digits;
num=num/10;
        }
        return sum;
    }


    public int reverseNumber(int num){
        int reverse=0;
      while(num>0){
        
        int digits=num%10;
    
       
       reverse=reverse*10+digits;
        num=num/10;

      }

        return reverse;
    }

    public int missingNum(int []arr){
        int n=arr.length+1;

        int sum=(n*(n+1)/2);

    int arrSum=0;

    for(int i=0;i<arr.length;i++){
        arrSum+=arr[i];

    }
    int missing=sum-arrSum;
    return missing;



    }

    public void mergeTwoSortedArray(int arr1[],int[] arr2){
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            list.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            list.add(arr2[i]);
        }

        Collections.sort(list);
        System.out.print(list);
    }

    public void mergeWithoutCollections(int arr1[],int arr2[]){
        int merge[]=new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            merge[i]=arr1[i];
        }

        for(int j=0;j<arr2.length;j++){
            merge[arr1.length+j]=arr2[j];
        }

        for(int i=0;i<merge.length;i++){
            for(int j=i+1;j<merge.length;j++){
                if(merge[i]>merge[j]){
                    int temp=merge[i];
                    merge[i]=merge[j];
                    merge[j]=temp;
                }
            }
        }
        for(int i=0;i<merge.length;i++){
            System.out.print(merge[i]+",");
        }
       
    }

    public void findPairSums(int arr[], int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
               
                System.out.print(i+","+j+"\n");
               
            }
              
            }
        }
    }

    public void rotateArrayByOnePlace(int arr[]){
       
int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            
            arr[i-1]=arr[i];
//             if(i==arr.length-1)
// {
//     arr[i]=88;
// }  

      }
      arr[arr.length-1]=temp;

for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+",");
}
        

    }



}

//Find All Substrings of a String
//Longest Substring without Repeating Characters