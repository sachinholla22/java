import java.util.*;

class Practice_Mar1{
    public static void main(String[] args) {
        Practice prac=new Practice();
        int arr1[]={2,5,8,13};
        int arr2[]={3,6,9,15};
        int arr[]={0,3,5,0,7,1};
        //prac.mergeTwoSorted(arr1, arr2);
       // prac.mergeUsingCollections(arr1,arr2);
     //  prac.countMissingElem(arr);
     //prac.moveZerosEnd(arr);
     prac.maxSubArray(arr);
    }
}

class Practice{
    public void mergeTwoSorted(int arr1[], int arr2[]){
        int mergedArr[]=new int [arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            mergedArr[i]=arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            mergedArr[arr1.length+i]=arr2[i];
        }

        for(int i=0;i<mergedArr.length;i++){
          for(int j=i+1;j<mergedArr.length;j++){
            if(mergedArr[i]>mergedArr[j]){
                int temp=mergedArr[i];
                mergedArr[i]=mergedArr[j];
                mergedArr[j]=temp;
            }
          }
        }

        for(int i=0;i<mergedArr.length;i++){
            System.out.print(mergedArr[i]+" ");
        }
       
    }

    public void mergeUsingCollections(int arr1[],int arr2[]){
        ArrayList <Integer> list=new ArrayList<>();
     for(int i=0;i<arr1.length;i++){
        list.add(arr1[i]);
     }
     for(int i=0;i<arr2.length;i++){
        list.add(arr2[i]);
     }

     Collections.sort(list);

     Iterator <Integer> it=list.iterator();

     while(it.hasNext()){
        System.out.print(it.next()+" ");
     }
    }

    public void countMissingElem(int arr[]){
      int n=arr.length+1;
int finalSum=(n*(n+1)/2);
      int sum=0;
      for(int i=0;i<arr.length;i++){
        sum+=arr[i];

      }

    int res=finalSum-sum;
    System.out.println(res);

    }


    public void moveZerosEnd(int arr[]){
    int count=0;

    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            count++;
        }
    }
    int newArr[]=new int[arr.length-count];
int j=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            newArr[j]=arr[i];
            j++;
        }
    }

    for(int i=0;i<newArr.length;i++)
{
    System.out.print(newArr[i]+" ");
}

for(int i=arr.length-count;i<arr.length;i++){
    System.out.print("0 ");
}
    
    }


    public void maxSubArray(int []arr){
        int max=arr[0];
        int curr=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;i<arr.length;i++){
           curr=arr[i]+arr[j];
            }
           
    
        }
        if(curr>max){
            max=curr;
        }

       
System.out.println(max);

    }
}