public class Practice_Feb28{
    public static void main(String[] args) {
        
// Practice prac=new Practice();
// int arr[]={4,5,6,2,4,8,6};
// prac.removeDuplicates(arr);
// MyThread mt=new MyThread();
// mt.start();
// System.out.println(mt.getName());

// System.out.println(Thread.currentThread().getName());
// AsunchronousExample as=new AsunchronousExample();
// Thread t1=new Thread(()->as.downloadFile());
// Thread t2=new Thread(()->as.printFile());
// // t1.start();
// as.downloadFile();



// t2.start();
// as.processFile();
Counter co=new Counter();
ThreadCounter tr=new ThreadCounter(co);
ThreadCounter t2=new ThreadCounter(co);
tr.start();
t2.start();
try{
tr.join();
t2.join();
}catch(Exception e){
    
}
System.out.println(co.getCounts());
    }
}


class Practice{
    public void removeDuplicates(int arr[]){
      int k=-1;

      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
         if(arr[i]==arr[j]){
            k=i;
            
         }
        }
      }

      System.out.print(k);
    }


  
}


class MyThread extends Thread{
    public void run(){
        System.out.println("modi");
    }

}


class AsunchronousExample{
    public void downloadFile(){
        System.out.println("Started Downloading");
        try{
Thread.sleep(2000);

        }catch(InterruptedException e){
            System.out.println("Errow!!!!"+e);
        }
    System.out.println("Finished downloading");

    }

    public void processFile(){
        System.out.println("Processing File has started");
        try{
Thread.sleep(5000);

        }catch(InterruptedException e){
            System.out.println("Errow!!!!"+e);
        }
        System.out.println("Finished processing");

    }

    public void printFile(){
        System.out.println("printing file");
    }
}


class Counter{
    private int count=0;
    public synchronized void increment(){
        count++;
    }

    public int getCounts(){
        return count;
    }
}

class ThreadCounter extends Thread{
    public Counter counter;

    public  ThreadCounter(Counter counter){
        this.counter=counter;
    }

    public void run(){
        for(int i=0;i<1000;i++){
        counter.increment();
        }
    }


}