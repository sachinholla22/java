public class Practice_Feb6 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;
        try{
            c=a/b;
        }catch(Exception e){
            System.out.println("Something went wrong"+e);
        }
System.out.println("The result is "+c);
    }

}
