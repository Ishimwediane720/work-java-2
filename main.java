import java.io.*;
Class main{
public static void main(String[] args)
    {
        sample ob1 = new sample();
      ob1.geekName();
        ob1.geekInstitute();
        ob1.geekBranch();
    }} 
interface intfA {
    void geekName();
}
 
interface intfB {
    void geekInstitute();
}
 interface intfC extends intfA, intfB {
    void geekBranch();
}
 class sample implements intfC {
    public void geekName() { System.out.println("Rohit"); }
 
    public void geekInstitute()
    {
        System.out.println("JIIT");
    }
 
    public void geekBranch() { System.out.println("CSE"); }
 
    