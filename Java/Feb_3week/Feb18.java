import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
class Feb18{
    public static void main(String[] args) {
    //     try{
    //      openFile("dhoni.txt");
    //     }catch(FileNotFoundException e){
    //         System.out.println( "Get Message is "+e.getMessage());
    //     }
    // }
    // static void openFile(String Filename) throws FileNotFoundException{
    //  throw new FileNotFoundException("No Such FIles");

    // ForEncapsulation enc=new ForEncapsulation();
    // enc.setDatas("modi",75, "banglore");
    // enc.getDatas();
    // System.out.println(enc.City);
    Practice prac=new Practice();
    // int arr[]={4,6,7,2,12};
    // prac.TwoSum( arr, 14);

    prac.perfectNumber();

     }

}

class ForEncapsulation{
    private String name;
    private int age;
    public String City;
    private int modifyData(){
        return age+5;
            }

    public  void setDatas(String name,int age, String City){
        this.name=name;
        this.age=age;
        this.City=City;

    }

    public void getDatas(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("City is "+City);
        ForEncapsulation enc=new  ForEncapsulation();
        enc.modifyData();
    }

   
}

class Practice{
    protected void TwoSum(int array[],int target){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==target){
                    System.out.print(i +" "+ j);

                }

            }
        }

    }

    public void perfectNumber(){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
if(num<1){
    System.out.println("Please enter a number  greater than 1");
}

ArrayList<Integer> list=new ArrayList<>();

for(int i=1;i<=num;i++){
    for(int j=1;j<=i;j++){
        if(i%j==0){
            System.out.print(i);
        list.add(i);
        break;
        }
    }
}
System.out.print(list);

    }
}