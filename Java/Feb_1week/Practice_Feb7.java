import java.util.ArrayList;

import javax.crypto.SealedObject;
public class Practice_Feb7 {
    public static void main(String[] args) {
        // Practice_Feb7 feb7=new Practice_Feb7();
      int array[]={11,24,22,45,65,65,49};
        // int newArr[]={1};
        // Practice_Feb7.getMaxElement(array);
        // Practice_Feb7.getMinElement(newArr);
        // PalindromeOfArrays pa=new PalindromeOfArrays();
        // pa.isPalindrome(array);
    //     SumOfElements sum=new SumOfElements();
    //     System.out.println(sum.sumofElems(array));
    //   System.out.println(SumOfElements.productOfElems(array));
    // SecondLargest sl=new SecondLargest();
    // sl.myTry(array);
    // sl.official(array);
    // sl.anotherTry(array);
    int anotherArray[]={1,2,3,4,4,5};
    SortedElement sort=new SortedElement();
    System.out.println(sort.isSorted(anotherArray));
    }

    public static void getMaxElement(int arr[]){
        int maxVal=0;
        if(arr.length==1){
            System.out.println(arr);
        }
        for(int newArr:arr){
            if(newArr>maxVal){
                maxVal=newArr;
            }
        }
        System.out.println(maxVal);
    }

    public static void getMinElement(int arr[]){
       
        if(arr.length==1){
            System.out.println(arr);
        }
        int minVal=arr[0];
        for(int newArr:arr){
            if(newArr<minVal){
                minVal=newArr;
            }
        }
        System.out.println(minVal);
    }
}


class PalindromeOfArrays{
    public void isPalindrome(int arr[]){
boolean isPalindromes=false;
        if(arr.length==1){
     System.out.println(isPalindromes=false);

                   }
    
    int left=0;
    int right=arr.length-1;
    while(left<right){
        if(arr[left]==arr[right]){
   isPalindromes=true;
        }else{
            isPalindromes=false;
        }
        left++;
        right--;
    }

    System.out.println(isPalindromes);
    
}
}

class SumOfElements{
    public int sumofElems(int arr[]){
        int sum=0;
        for(int array:arr){
            sum=sum+array;
        }
return sum;

    }

    static int productOfElems(int arr[]){
        int product=1;
        
        for(int array:arr){
            product=product*array;
        }
return product;
    }
}


class SecondLargest{
    public void myTry(int arr[]){
        int largest=0;
        for(int array:arr){
            if(array>largest){
                largest=array;
            }
        }
        ArrayList<Integer> dynamic=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=largest){
                dynamic.add(arr[i]);
            }
        }
        int secondLargest=0;

        for( int finalArray:dynamic){
            if(finalArray>secondLargest){
                secondLargest=finalArray;
            }
        }

        System.out.println(secondLargest);
    }

    public void anotherTry(int arr[]){
        int largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        int secondLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);

    }

    public void official(int[] arr){
        int largest=0;
        int secondLargest=0;
        for(int array:arr){
            if(array>largest){
                secondLargest=largest;
                largest=array;
            }else if(array<largest && array>secondLargest ){
                secondLargest=array;
            }
        }
        System.out.println(secondLargest);
    }
}

class SortedElement{
    public boolean isSorted(int arr[]){
       boolean isSORTED=false;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
               isSORTED=true;
            }else if (arr[i]>arr[i+1]){
                isSORTED=false;
            }
        }
        return isSORTED;
    }
}

