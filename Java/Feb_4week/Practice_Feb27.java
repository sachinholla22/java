import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Collections;

class Practice_Feb27{
    public static void main(String[] args) throws InterruptedException{
        // Practice prac=new Practice();
        // int arr[]={3,0,6,0,8,1,0,4};
        // //prac.moveZerosManually(arr);
        // //prac.zerosOptimized(arr);
        // int arr1[]={2,8,11,19};
        // int arr2[]={2,5,11,16,21,24,33};
        // //prac.unionOf2sortedArrays(arr1,arr2);
        // prac.rotateByk(arr2, 3);

    //     MyThread mt=new MyThread();
    //     MyThread mt1=new MyThread();
    //     MyThread mt2=new MyThread();
    //     mt.setPriority(Thread.MIN_PRIORITY);
    //     mt1.setPriority(Thread.NORM_PRIORITY-2);
    //     mt2.setPriority(Thread.MAX_PRIORITY);

    //      //mt.start();
    //    //  mt.interrupt();
    //     // mt.join();
    //     // mt.interrupt();
       
    //     Thread t=new Thread(new FinalThread("dhoni"));
    //     Thread t2=new Thread(new FinalThread("kohli"));

    //     t.start();
    //     t2.start();

      
    //     AnotherThread2 at=new AnotherThread2();
    //     Thread tr=new Thread(at);
    Practice2 prac=new Practice2();
    int arr1[]={2,3,5,6,9};
    int arr2[]={3,4,6,10,23};
    prac.intersection(arr1,arr2);
        //tr.start();
      

    }
}

class Practice{
    public void moveZerosManually(int arr[]){
int count=0;

for(int i=0;i<arr.length;i++){
    if(arr[i]!=0){
        count++;
    }
}

int newArr[]=new int[count];

System.out.println(newArr.length);

 for(int i=0,j=0;i<arr.length;i++){
     if(arr[i]!=0){
        newArr[j]=arr[i];
        j++;
    }
    
}
for(int i=0;i<newArr.length;i++){
    System.out.print(newArr[i]+" ");
 }
 for(int i=newArr.length;i<arr.length;i++){
    System.out.print("0");
 }
    }

    public void zerosOptimized(int arr[]){
        int j=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        

        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
j++;

            }

        }
        System.out.println("Value of j is now"+j);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public void unionOf2sortedArrays(int arr1[],int arr2[]){
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            list.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            list.add(arr2[i]);
        }
        Collections.sort(list);
        LinkedHashSet<Integer> set=new LinkedHashSet<>(list);

        System.out.print(set+" ");

        
    }

    public void rotateByk(int arr[],int k){
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[arr.length-k+i];
        }

       for(int i=arr.length-1;i>=k;i--){
       arr[i]=arr[i-k];

       }

       for(int i=0,j=0;i<k;i++){
        arr[i]=temp[j];
        j++;
       }

       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }


}



class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getId()+"Id from First method");
        System.out.println(Thread.currentThread().getName()+"is Starting");
        int arr[]={2,3,5,7,9};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            try{
                Thread.sleep(2000);
    
            }catch(InterruptedException e){
                System.out.println("Eooro!");
            }

        }
System.out.println(Thread.currentThread().getClass()+"Is the class");
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName()+"Is Stopping");

     

    }
}

class AnotherThread2 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName()+"is Starting");
        for(int i=0;i<5;i++){
            System.out.println("Hello");
        } 
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName()+"Is Stopping");

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    }
}


class FinalThread implements Runnable{
    String name;
    FinalThread(String name){
        this.name=name;
    }
    public void run(){
       
        for(int i=0;i<3;i++){
System.out.println(Thread.currentThread().getName()+"is running");
            Thread.yield();
        }
        System.out.println();
    }
}


class Practice2{
    public void intersection(int arr1[],int arr2[]){
       int vis[]=new int [arr1.length];
ArrayList <Integer> list=new ArrayList<>();
        
for(int i=0;i<arr1.length;i++){
    for(int j=0;j<arr2.length;j++){
if(arr1[i]==arr2[j]&& vis[i]==0){
    list.add(arr1[i]);
    vis[i]=1;
    break;
}
    }

}
System.out.println(list);
      


    }
}