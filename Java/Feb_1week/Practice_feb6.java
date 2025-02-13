import java.util.*;
class Practice_feb6{
    public static void main(String args[]){
        MissingNum mn=new MissingNum();
        // mn.getMissing();
        // int arr[]={1,2,3,4,6,7,8};
        // int n=8;
        // mn.anotherApproach(arr,n);
        // ReverseString rv=new Reverse();
        // rv.reverseNormally("MOdi");
        // Reverse r=new Reverse();
        // r.reverseUsingArray("Dhoni");

        // PalindromeCheck pc= new PalindromeCheck();
        // System.out.println(pc.palindromeCheck("madamg"));
        // FindLargest lar=new FindLargest();
        // lar.findLargestElem();
    //     AnotherPalindrome ap=new AnotherPalindrome();
    //    System.out.println(ap.getPalindrome("dcbcr"));
    FindDuplicate fd=new FindDuplicate();
    fd.getDuplicateArray();

    }
}

class MissingNum{
//     public void getMissing(){
//         int arr[]={1,2,3,4,5,6,7,9};

//         System.out.println("THe lenght is "+arr.length);
//         int sum=0;
//         int n=9;
//         int sum1=0;
//         for(int j=1;j<=n;j++){
// sum1=sum1+j;
//         }
//         System.out.println("The sum of j is "+ sum1);
//         for(int i=0;i<arr.length;i++){
          
//            sum=sum+arr[i];
//         }
//         System.out.println("The sum is "+sum);
//         int res=sum1-sum;
//         System.out.println("The missing number is "+res);

//     }


public void anotherApproach(int arr[], int n){



    int res=(n*(n+1))/2;
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];

    }
   int MissingNum=res-sum;
   System.out.println("The missing num is"+MissingNum);
    
}
}


interface ReverseString{
void reverseNormally(String s);

}
interface AnotherReverse{
    void reverseUsingArray(String str);
}
class Reverse implements ReverseString,AnotherReverse{
    public void reverseNormally(String s){
        String str="";
        for (int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);

        }
        System.out.println("The reversed String is "+str);
    
    }

    public void reverseUsingArray(String newStr){
        char Arr[]=newStr.toCharArray();
        
        for(int i=Arr.length-1;i>=0;i--){
            System.out.print(Arr[i]);
        }


    }
}


abstract class Palindrome{
    abstract  boolean palindromeCheck(String str);
}

class PalindromeCheck extends Palindrome{
    public  boolean palindromeCheck(String str){

        String newString="";
        boolean isPalindrome=true;
        for(int i=str.length()-1;i>=0;i--){
            newString += str.charAt(i);
        }

        if(newString.equals(str)){
            isPalindrome=true;
        }else{
            isPalindrome=false;
        }

        return isPalindrome;

    }
}

class FindLargest{
    protected void findLargestElem(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");

        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The Array is "+arr+" ");

        int lar=0;
        int small=arr[0];
        for(int myArr:arr){
            if(myArr>lar){
                lar=myArr;
            }
            if(myArr<small){
                small=myArr;
            }
        }
        System.out.println("The largest element in the provided array is "+lar);
        System.out.println("The smallest element in the provided array is "+small);
    }
}

class AnotherPalindrome{
    public  boolean getPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        char arr[]=str.toCharArray();
         
        while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;


        }
        return true;

    }
}

class FindDuplicate{
    public void getDuplicateArray(){
        int arr[]={1,2,3,5,3,7,8,2,10};
        
        List<Integer> dup = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length-1;j++){
            if(arr[i]==arr[j]){
                dup.add(arr[i]);
            }
           
           }
        }
        System.out.println("THe Duplicat Elements are"+dup);
    }

}