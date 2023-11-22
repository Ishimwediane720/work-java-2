import java.io.*;
class interface {
public static void main (String[] args)
{
sample ob1 = new sample();
ob1.prutorName();
ob1.prutorInstitute();
ob1.prutorBranch();
}
}
interface intfA
{
void prutorName();
}
interface intfB
{
void prutorInstitute();
}
interface intfC extends intfA, intfB
{
void prutorBranch();
}
class sample implements intfC
{
public void prutorName()
{
System.out.println("prutor");
}
public void prutorInstitute()
{
System.out.println("IITK");
}
public void prutorBranch()
{
System.out.println("CSE");
}
