import java.util.*;
public class Practice_Feb26{
    public static void main(String[] args) throws InterruptedException {
        Practice prac=new Practice();
        ExampleThread et=new ExampleThread();
        ExampleThread et2=new ExampleThread();
        ExampleThread et3=new ExampleThread();
        // et.start();
        // et.join();
        // et2.start();
        // et3.start();
      
        // et2.join();
        // et3.join();

    //     int arr1[]={3,9,11,39};
    //     int arr2[]={1,5,8,13,19,27,45,78};
    //    // prac.merge2ArrayManually(arr1,arr2);
    //    //prac.mergeUsingCOllections(arr1, arr2);
    //    //prac.rotateByOneLeft(arr2);
    //    //prac.rotateByK(arr2,2);
    //    //prac.reverseOptimized(arr1,2);
    //    //prac.rotateRightByK(arr2,3);
    //    prac.reverseOptimized(arr2, 3);

//     MyThread mt=new MyThread();
//     System.out.println("jaimodi");
//     //mt.start();
//     AnotherThread at=new AnotherThread();
//     Third tt=new Third();
  
//  tt.start();
//  tt.join();
//  at.start();
//    Thread.sleep(400);
 
//    System.out.println(tt.getState());

 //  System.out.println(tt.getState());
    
    //at.start();
   // System.out.println(at.currentThread().getState());
//     System.out.println(at.currentThread().getName());
//     System.out.println(mt.currentThread().getName());
// at.currentThread().setName("MY_TESTING");
// System.out.println(at.currentThread().getName());
// at.currentThread().setPriority(Thread.MAX_PRIORITY-1);
// System.out.println(Thread.currentThread().getPriority());

int arr[]={4,0,5,2,1,0,8,0,32,4};
ArraysProblems ap=new ArraysProblems();
ap.nonZeros(arr);
    }


}

class Practice{
   public void merge2ArrayManually(int arr1[],int arr2[]){
    int finalArr[]=new int[arr1.length+arr2.length];

    for(int i=0;i<arr1.length;i++){
        finalArr[i]=arr1[i];
    }
    for(int i=0;i<arr2.length;i++){
        finalArr[arr1.length+i]=arr2[i];
    }

    for(int i=0;i<finalArr.length;i++){
        for(int j=i+1;j<finalArr.length;j++){
            if(finalArr[i]>finalArr[j]){
                int temp=finalArr[i];
                finalArr[i]=finalArr[j];
                finalArr[j]=temp;
            }
        }
    }

    for(int i=0;i<finalArr.length;i++){
        System.out.print(finalArr[i]+" ");
    }
   } 

   public void mergeUsingCOllections(int arr1[],int arr2[]){
    LinkedList<Integer>list=new LinkedList<>();
    for(int i=0;i<arr1.length;i++){
        list.add(arr1[i]);
    }

    for(int i=0;i<arr2.length;i++){
        list.add(arr2[i]);
    }

    Collections.sort(list);

    System.out.println(list);
   }


   public void rotateByOneLeft(int arr[]){
    int temp=arr[0];
    for(int i=1;i<arr.length;i++){
        arr[i-1]=arr[i];
        // if(i==arr.length-1){
        //     arr[i]=temp;
        // }
    }
    arr[arr.length-1]=temp;

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

   }

   public void rotateByK(int arr[],int k){
    int temp[]=new int[k];
    for(int i=0;i<k;i++){
        temp[i]=arr[i];
    }

    for(int i=k;i<arr.length;i++){
        arr[i-k]=arr[i];
    }
int j=0;
    for(int i=arr.length-k;i<arr.length;i++){
        arr[i]=temp[j];
        j++;
    }

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
   }

   public void reverse(int arr[],int start,int end){
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
   }

   public void reverseOptimized(int arr[], int k){
int size=arr.length;
if(k>size){
    k=k%size;
}

reverse(arr,0,size-1);
reverse(arr,0,size-k-1);
reverse(arr,size-k,size-1);
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
   }


   public void rotateRightByK(int arr[],int k){
    int temp[]=new int[k];
    
    for(int i=0;i<k;i++){
        temp[i]=arr[arr.length-k+i];
    }

  
     for(int i=arr.length-1;i>=k;i--){
        arr[i]=arr[i-k];
     }

     int j=0;
     for(int i=0;i<k;i++){
        arr[i]=temp[j];
        j++;
     }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }


   }

   public void optimisedRightK(int arr[],int k){
    int size=arr.length;
    if(k>size){
        k=k%size;

    }

    reverse(arr,0,size-1);
    reverse(arr,0,k-1);
    reverse(arr,k,size-1);

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
   }
}


class MyThread extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
 System.out.println(i);

 try{
    Thread.sleep(500);

 }catch(InterruptedException e){
    System.out.println("An error");
 }
        }
    }
}

class AnotherThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(502);
    
            }catch(InterruptedException e){
                System.out.println("AN ERROR");
            }
        }

        System.out.println("This is from Another Method "+Thread.currentThread().getName()); 
        
    }


}

class Third extends Thread {
    public void run(){
        MyThread mt=new MyThread();
        mt.start();
       
        System.out.println(Thread.currentThread().getState());
try{
     mt.join();
Thread.sleep(5000);
System.out.println("Executing Third");
}catch(InterruptedException e){
    System.out.println("Error occured");
}
    }
}


class ExampleThread extends Thread{
    public void run(){
        try{
System.out.println(Thread.currentThread().getId()+"Thread is starting");
Thread.sleep(500);
System.out.println(Thread.currentThread().getId()+"FInishing the thread");
        }catch(InterruptedException e){

            System.out.println(e);
        }
    }
}

class ArraysProblems{
    public void nonZeros(int arr[]){
        int nonZerocount=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                nonZerocount++;
            }
            
        }

        int nonZero[]=new int[nonZerocount];
      

        for(int i=0,j=0;i<arr.length;i++){
            if(arr[i]!=0){
               nonZero[j++]=arr[i];
            }
        }

        for(int i=0;i<nonZero.length;i++){
            System.out.print(nonZero[i]+" ");
        }
        for (int i = nonZero.length; i < arr.length; i++) {
            System.out.print("0 ");
        }
    }
}

