import java.util.*;
class Practice_Feb24{
    public static void main(String[] args){
//         int arr[]={2,8,5,4,9,1};
// Practice prac=new Practice();

// prac.rotateArray(arr, 3);
int[] arr1={1,2,3,4,9,3,92,9,34};
int [] arr2={4,5,6,1};

//Stack st=new Stack(3);
UsingCollections uc=new UsingCollections();
//uc.findCommonElems(arr1,arr2);
//uc.findInterSection(arr1,arr2);
//uc.sort2Arrays(arr1, arr2);
// uc.manuallyMerge2Arrays(arr1, arr2);
// MyThread t = new MyThread();
// t.start();
// uc.getDuplicateElems(arr1);

MyThread mt=new MyThread();
AnotherThread at=new AnotherThread();
mt.start();
try{
    Thread.sleep(5);
}catch(InterruptedException e){
    System.out.println("Error!!");
}
at.start();


    }
}

class Practice{
    public void rotateArray(int arr[], int k){
      
        int size=arr.length;
        if(k>size){
            k=k%size;
        }
      
        reverse(arr, 0, size-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, size-1);

        for(int i:arr){
            System.out.print(i+" ,");
        }
       

    }

    public void reverse(int arr[], int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
}


class Stack{
    public int arr[];
    public int top=-1;
    public int size;

    public Stack(int size){
        this.size=size;
        arr=new int[size];

    }

    public boolean isEmpty(){
      return top==-1;

    }

    public boolean isFull(){
 return top>=size-1;

           
    }

    public void push(int elem ){
        if(isFull()){
            System.out.println("Cannot add the elements its already full");
        }else{
            top++;
            arr[top]=elem;
        }

    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Cannot Remove further elements already its Empty");
            return -1;
        }else{
return arr[top--];

       }

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Cannot peek the elements its already empty");
            return -1;
        }
        else{
            return arr[top];

        }
    }

}



class UsingCollections{

    public void findCommonElems(int[] arr1, int[] arr2){
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        for(int i:arr1){
            list1.add(i);
        }
        for(int j:arr2){
            list2.add(j);
        }

        Iterator <Integer> it1=list1.iterator();
        Iterator <Integer> it2=list2.iterator();
HashSet<Integer> set=new HashSet<>();
while(it1.hasNext()){
    set.add(it1.next());
}
while(it2.hasNext()){
    set.add(it2.next());
}

for(int i:set){
    System.out.print(i+" ");
}
   
        
    }

    public void findInterSection(int[] arr1,int arr2[]){
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();

        for (int i:arr1){
            hs1.add(i);
        }

        for (int i:arr2){
            hs2.add(i);
        }

        hs1.retainAll(hs2);

        Iterator <Integer> it1=hs1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

    }

    public void sort2Arrays(int arr1[],int arr2[]){
        HashSet <Integer> set=new HashSet<>();
        List <Integer> list=new ArrayList<>();
        
        for(int i:arr1){
            list.add(i);
        }
        for(int i:arr2){
            list.add(i);
        }

        Collections.sort(list);
    
}


public void manuallyMerge2Arrays(int arr1[],int arr2[]){
    int mergedArrr[]=new int[arr1.length+arr2.length];

    for(int i=0;i<arr1.length;i++){
        mergedArrr[i]=arr1[i];

    }

    for(int j=0;j<arr2.length;j++){
        mergedArrr[arr1.length+j]=arr2[j];
    }

    for(int i=0;i<mergedArrr.length;i++){
        for(int j=i+1;j<mergedArrr.length;j++){
            if(mergedArrr[i]>mergedArrr[j]){
                int temp=mergedArrr[i];
                mergedArrr[i]=mergedArrr[j];
                mergedArrr[j]=temp;
            }
        }
    }

    for(int i=0;i<mergedArrr.length;i++){
        System.out.print(mergedArrr[i]+" ");
    }
}

public void getDuplicateElems(int arr[]){
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<arr.length;i++){
        if(!set.add(arr[i])){
            System.out.println(arr[i]);
        }
    }
}
}


class MyThread extends Thread {
    public void run() {
      for(int i=1;i<=10;i++){
        System.out.println(i);
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            System.out.println("Error!!");
        }
      }
    }
}

class AnotherThread extends Thread{
    public void run(){
        for(int i=0;i<11;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println("Error!!");
            }
        }
    }
}


