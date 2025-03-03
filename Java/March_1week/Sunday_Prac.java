class Sunday_Prac{
    public static void main(String[] args){
// Animal an=new Animal();
// an.makeSound();
// Animal cat=new Cat();
// cat.makeSound();
//             Animal dog=new Dog();
//             dog.makeSound();
//             Animal.sleeps();

//             Dog g1=new Dog();
//             g1.makeSound();
//             Dog.sleeps();
//             g1.eats();

//SavingsAccount save=new SavingsAccount();

// try{
// save.withdraw(10000);
// }catch(InsufficientBalance e){
//     System.out.println(e);
// }
// save.display();

Books book=new Books("BJP wins","modi",99,978-3-16-148410-0);
book.display();

    }
}

class Animal{
    public void makeSound(){
        System.out.println("Animals make the sound");
    }
    public static void sleeps(){
System.out.println("Animal is sleeing");
    }

    public void eats(){
        System.out.println("All Animal eats");
    }
}

class Cat extends Animal{
public void makeSound(){
    System.out.println("Cat meows");
}
}

class Dog extends Cat{
    public void makeSound(){
        System.out.println("DOg barks");
    }

    public static void sleeps(){
        System.out.println("Currently Dog is Sleeping");
    }
}


abstract class Accounts{
    abstract void deposit(double amount);
    abstract void withdraw(double amount) throws InsufficientBalance;
   public void bankName(){
    System.out.println("SBI bank");
   }
}

class InsufficientBalance extends Exception{
    public InsufficientBalance(){
      super("NO balance");
    }
    }

class SavingsAccount extends Accounts{
    private int balance=1000;
    public void deposit(double amount){
        this.balance+=amount;
    }

    void withdraw(double amount) throws InsufficientBalance{
     if(amount>balance){
        throw new InsufficientBalance();
     }else{
        balance-=amount;
     }
    }
    public void display(){
        System.out.println("Amount is"+balance);
    }


}

class Books{
    private String title;
    private String author;
    private int price;
    private int isbnNumber;

    Books(String title,String author,int price,int isbnNumber){
        this.title=title;
        this.author=author;
        this.price=2*price;
        this.isbnNumber=isbnNumber;

    }

    public void display(){
        System.out.println("The title of the Book is "+title);
        System.out.println("The Author is"+author);
        System.out.println("Price of the Book is"+price);
        System.out.println("The Bn Number of the Book is"+isbnNumber);

    }

    public void compareTwoBooks(String book1, String book2){
        this.title=book1;
        this.title=book2;

        System.out.println("Book1 is"+book1);
System.out.println("Book2 is "+book2);
    }

}