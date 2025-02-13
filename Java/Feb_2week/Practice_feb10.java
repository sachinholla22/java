
import java.io.File;
import java.io.FileWriter;
public class Practice_feb10 {
    public static void main(String[] args) {
        Animal an=new Animal("Cow");
        Animal animal=new Animal("Cow","DOg");
animal.getAnotherName();
try{
    //creating a file
File file=new File("testing.txt");
file.createNewFile();
//writing a file
FileWriter fw=new FileWriter("testing.txt");
fw.write("This is testing file\n");
fw.close();
//reading a file    

}catch(Exception e){
    System.out.println("Handle the error!!");
}


    }
}


class Animal{
    String name;
    String name1;
    Animal(String names){
        this.name=names;

    }
    Animal(String name,String name1){
        this.name=name;
        this.name1=name1;
    }
    public String getName(){
return name;
    }

    public void getAnotherName(){
    System.out.println(name);
    System.out.println(name1);
    }
}


