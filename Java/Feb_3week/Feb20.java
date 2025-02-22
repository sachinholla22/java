import  java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;

public class Feb20 {
    public static void main(String[] args) {

//         int arr[]={42,63,94,81,56};

//         ArrayList <Integer> array=new ArrayList<>();
//         HashSet <String> set=new HashSet<>();
//         HashMap <String , Integer> map=new HashMap<>();
       


//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2==0){
//                 array.add(arr[i]);
//             }
//         }
//         Iterator <Integer> iterator=array.iterator();

//         while(iterator.hasNext()){
//             System.out.println(iterator.next());
//         }
         
       
//         System.out.println(array.size());

//         map.put("Sachin",23);
//         map.put("dhoni",44);
//         map.put("kohli",36);


//         for(String str:map.keySet()){
//             System.out.println(str);
//         }
//         for(int num:map.values()){
//             System.out.println(num);
//         }
// //to get both ,
// for(String str:map.keySet()){
//     System.out.println("THe key is "+str+" "+"Value is "+map.get(str));
// }
// Collections.sort(array);
// System.out.println(array);
LogicBuilding logic=new LogicBuilding();
logic.armStrong(10,100);
    }
 


}


class LogicBuilding{
    public void armStrong(int start,int end){
        boolean isArmstrong=false;
        for(int i=start;i<=end;i++){
int num=i;
int noofdigits=0;
while(num>0){
    num=num/10;
    noofdigits++;
}
num=i;
int sum=0;
while(num>0){
    int digits=num%10;
    int pow=(int) Math.pow(digits,noofdigits);
sum=sum+pow;
num=num/10;

}
if(sum==i){
    isArmstrong=true;
    System.out.print(sum+ " ");
}
        }
        if(!isArmstrong){
            System.out.println("NO armstron number found in this range");
        }
    }
}


