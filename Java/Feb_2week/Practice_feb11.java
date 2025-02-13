import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Practice_feb11 {
    public static void main(String[] args) {
      // FileHandler files=new FileHandler();
     //  files.forFiles("Notes_feb10.txt");
     String[] names={"Sachin","Shewag","Gambir"};

// try{
//        FileWriter fw=new FileWriter("Notes_feb11.txt",true);
//        fw.write("Append");
//        for(String name:names){
//         fw.write("\n"+name);
//        }
//        fw.close();
// }catch(IOException e){
//     System.out.println("Cannot Write in the FIle "+e);
// }

// try{
//     BufferedReader bf=new BufferedReader(new FileReader("Notes_feb11.txt"));
//     String line;
// while((line=bf.readLine())!=null){
// System.out.println(line);

// }
// bf.close();

// }catch(IOException e){
//     System.out.println("Cannot read");
// }
MultiDimArray md=new MultiDimArray();
md.multiDim();
    }
}

class FileHandler{
    public void forFiles(String fileName){
        File file=new File(fileName);
        
            if(file.exists()){
                System.out.println("File Already Exists");
            }else{
                System.out.println("File doesnot Exists");
            }

            try{
                if(file.createNewFile()){
                    System.out.println("File created at "+file.getName());
                }else{
                    System.out.println("FIle already Exists");
                }
            }catch(IOException e){
                System.out.println("Cannot create a file");
            }

            
        
    }
}


class MultiDimArray{
    public void multiDim(){
        System.out.println("Enter the number of Rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        System.out.println("ENter the COlumns");

        int cols=sc.nextInt();

        int array[][]=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                array[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(array[i][j]);

            }
            System.out.println();
        }

    }
}

