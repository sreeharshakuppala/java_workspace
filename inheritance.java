


class Parent 
{
    String name;

    void eat()
    {
        System.out.println("Farming");
    }

}

class child extends Parent 
{
    int rollno;
    String name;

    //  child()
    // {
    //     System.out.println("you need default child constructor!");
    // }
    child(int roll,String name)
    {
        this.rollno = roll;
        this.name = name;
    }

    void study() 
    {
        System.out.println("studying");
    }

}

class grandChild extends child {
    public grandChild() {

        super(240, "naveen");
    }

    void earn() {
        System.out.println("earning");
    }

}


public class inheritance 
{
    public static void main(String[] args)
    {
        Parent p1 = new Parent();
        child c1 = new child(420, "Harsha");
        grandChild g1 = new grandChild();
        c1.study();
        System.out.println(c1.rollno);
        System.out.println(c1.name);
        g1.earn();
        g1.eat();
        System.out.println(g1.name);
        
    }


}
