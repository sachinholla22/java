import java.util.*;

class Feb19{
    public static void main(String[] args){
        ForList list=new ForList();
        //list.forArrayLists();
        //list.forLinkedListQueue();
       // list.forSets();
       Number num=new Number();
       //System.out.println(num.sumOfDigits(123498));
      // num.reverseNum();
      Palindrom pali=new Palindrom();
      pali.palidromeString("maddiam");

        
      
    }
}


class ForList{
    public void forArrayLists(){
        List <Integer> nums=new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(33);
       

        nums.add(3,77);
       
        nums.add(1,90);
       
        nums.remove(3);
      

        for(int i=0;i<nums.size();i++){
            System.out.print(nums.get(i)+" ");
        }
        System.out.println();
        for(Integer num:nums){
            System.out.println(num);
        }
        System.out.println(nums.size());

       nums.set(1,83);
       System.out.println(nums);

    }

    public void forLinkedListQueue(){
        Queue <String> queue=new LinkedList<>();
        LinkedList <String> ll=new LinkedList<>();
       

        String names[]={"Sachin","Dhoni","modi","Saahil","Shewag","saa"};

        for(int i=0;i<names.length;i++){
            ll.add(names[i]);
        }
        System.out.println("Linked List is"+ll);
        for(int i=0;i<names.length;i++){
            if(names[i].toLowerCase().startsWith("s")){
                queue.add(names[i]);
            }
        }

      for(String str:queue){
      if(str.contains("e") && str.endsWith("g")){
        queue.remove(str);
      }
      }
        
      System.out.println(queue);

      queue.offer("rcb");
      System.out.println(queue);
      
ll.addFirst("rcb");
System.out.println(ll);
ll.addLast("Fixing SUper Kings");
System.out.println(ll);
System.out.println(queue.peek());
System.out.println(queue.poll());

    }

    public void forSets(){
        HashSet <Integer> set=new HashSet<>();
        int[] arr = {1, 2, 3, 4, 5, 6, 2};

          
        for (int num : arr) {
            if (set.add(num)) {
                System.out.println("enjoy " + num);
            }
        }
    }

    

  
}


class Number{
    public int sumOfDigits(int num){
        int sum=0;
        while (num>0){

           int digit =num%10;
            sum=sum+digit;
            num=num/10;
        }
        
        return sum;
    }

    public void reverseNum(){
        int num = 5392;
        int reversed = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed *10+ digit;
            num = num / 10;
        }
        
        System.out.println("Reversed number: " + reversed);
    }
}

class Palindrom{
    public void palidromeString(String str){
        char array[]=str.toCharArray();
        int start=0;
        int end=str.length()-1;
        boolean isPalindrome=true;

        while(start<end){
            if(array[start]!=array[end]){
isPalindrome=false;
break;

            }
            start++;
            end--;
            
        }
        if(isPalindrome){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}



