




// learning encapsulation
 
class learnEncapsulation
{
    private String name;
    private int age;

    public void setAge(int age) //setter
    {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge()  //getter
    {

        return age;
    }
}

public class encapsulation 
{
    public static void main(String[] args)
    {

        learnEncapsulation l1 = new learnEncapsulation();
        l1.setAge(22);
        System.out.println(l1.getAge());

    }


    
}
