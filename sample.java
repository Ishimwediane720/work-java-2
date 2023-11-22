import java.io.*;
Class sample
 {
public static void main(String[] args)
    {
        sample ob1 = new sample();
    ob1.geekName();
    ob1.geekInstitute();

    }}
interface intfA {
    void geekName();
}
 
interface intfB extends intfA {
    void geekInstitute();
}
 class sample implements intfB {
    public void geekName()
    {
        System.out.println("Rohit");
    }
 
     public void geekInstitute()
    {
        System.out.println("JIIT");
    }
 
   