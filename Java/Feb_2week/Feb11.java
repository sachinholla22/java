import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class Feb11{

public static void main(String[] args){
try{
File file=new File("dummy.txt");
if(!file.exists()){
System.out.println("File Doesnt exists before");
file.createNewFile();
System.out.println("Now created a new file");
}else{
System.out.println("File exists in the location");
}}catch(IOException e){
System.out.println("Cannot Create a file");

}
WriteFile wf=new WriteFile();
wf.getWriteFile("dummy.txt");
ReadFile rf=new ReadFile();
ReadFile.readFiles("dummy.txt");

GetFileInfo gi =new GetFileInfo();
gi.getInfo("FileHandler.class");
}

}



class WriteFile{
    public void getWriteFile(String fileName){
    try{
    FileWriter writer=new FileWriter(fileName);
    writer.write("\n Jai Modi");
    writer.write("\n Dayananda Salian");
    writer.write("\n E sala cup namde guru");
    writer.close();
    }catch(IOException e){
    System.out.println("Cannot Write File");
    e.printStackTrace();
    }
    
    }
    }

    class ReadFile{
        protected static void readFiles(String files){
        try{
        BufferedReader bf=new BufferedReader(new FileReader("dummy.txt"));
        String lines;
        while((lines=bf.readLine())!=null){
        System.out.println(lines);
        
        }
        
        }catch(IOException e){
        System.out.println("Cannot read");
        }
        }
        
        }
           
 
        class GetFileInfo{
            public void getInfo(String files){
                File file=new File(files);
                if(file.exists()){
                    System.out.println("Get Name"+file.getName());
                    System.out.println("Readable"+file.canRead());
                    System.out.println("Writable"+file.canWrite());
                    System.out.println("Absoulte path "+file.getAbsolutePath());
                    System.out.println("Get length in bytes"+file.length());
                }
            }
        }
