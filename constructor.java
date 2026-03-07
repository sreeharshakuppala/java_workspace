



// class with constructor


   class Book
    {
        String name;
        int age;

        Book() 
        {
            System.out.println("Default Constructor");
        }

        Book(String n, int a) {
            this.name = n;
            this.age = a;
        }

        void display() {
            System.out.println(name);
            System.out.println(age);

        }

    }

public class constructor 
{
    public static void main(String[] args) 
    {

            Book s1 = new Book("harsha", 22);
            s1.display();

    }

    
}


