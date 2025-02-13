import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;


public class Practice_feb12 {
    public static void main(String[] args) {
        // CreateFile create=new CreateFile();
        // CreateFile.createFile("/home/sachin-holla/Parent/Child/javaTest.txt" );
        // WriteToFile write=new Write();
        // write.writeFile("/home/sachin-holla/Parent/Child/javaTest.txt");
        // BufferWriting bwriting=new ForBuffered();
        // bwriting.write("/home/sachin-holla/var/www/bufferWriting.txt");

        //     Reading read=new Reading();
        //     Reading.readFile("/home/sachin-holla/Fintech/backend/forLoans.js");
        //     ForBufferedReading br=new ForBufferedReading();
        //     br.bufferReadFile("/home/sachin-holla/testnextjs/package.json" );
    ForSerialization sez=new ForSerialization("Dhoni", 44);
    try{
ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("/home/sachin-holla/testnextjs/ser.sz"));
out.writeObject(sez);
System.out.println("Object has been serialized");
    }catch(IOException e){
        System.out.println("Cannot Serialization");
    }
    }
}


class CreateFile{
    public static void createFile(String fileName){
        try{
            File file=new File(fileName);

            if(!file.exists()){
                System.out.println("File Doesnot exists Creating now");
                file.createNewFile();
            }else{
                System.out.println("File Already Exists");

            }
        }catch(IOException e){
            System.out.println("File creation got abonded");
        }
    }
}

interface WriteToFile{
void writeFile(String fileName);

}

class Write implements WriteToFile{
    public void writeFile(String files){
        try{
FileWriter writer=new FileWriter(files);
writer.write("Testig the file");
writer.write("\n This is the Second Line");
writer.close();
        }catch(IOException e ){
            System.out.println("Cannot Write File");
        
    }
}

}

abstract class BufferWriting{
    public void getString(){
        System.out.println("From Abstract method");
    }
    abstract void write(String fileName);
}

class ForBuffered extends BufferWriting{
    public void write(String file){

        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter(file));
            bw.write("Testing Buffered Writinfg");
            bw.newLine();
            bw.write("Ayush Badoni");
            bw.newLine();
            bw.write("By clicking on SIGN ME UP, you agree to Newsweek's <a target=\"_blank\" href=\"https://www.newsweek.com/terms-service\">Terms of Use</a> & <a target=\"_blank\" href=\"https://www.newsweek.com/privacy-policy\">Privacy Policy</a>.\n" + //
                                "<span class=\"newsletter-type-span\">You may unsubscribe at any time.");
            bw.close();

        }catch(IOException e){
            System.out.println("Cnnot Buffer Write");
        }
    }
    

}


class Reading{
    public static void readFile(String files){
        try{
         FileReader fr=new FileReader(files);
         int lines;
         while((lines=fr.read())!=-1){
System.out.println(lines);
         }

        }catch(IOException e){
            System.out.println("Cannot read a file");
        }
    }
}


class ForBufferedReading{
    public void bufferReadFile(String fileName){
        try{
           BufferedReader br=new BufferedReader(new FileReader(fileName));
           String lines;
           while((lines=br.readLine())!=null){
            System.out.println(lines);
           }
        }catch(IOException e ){
            System.out.println("");
        }
    }
}


class ForSerialization implements Serializable{
    public String name;
    int age;

    ForSerialization(String name,int age){
        this.name=name;
        this.age=age;

    }

    public void getDetails(){
        System.out.println(name);
        System.out.println(age);
    }

}
