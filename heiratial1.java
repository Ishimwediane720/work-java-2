class GFG {
      public static void main(String[] args) {
          C c = new C();
          c.set_C(5);
          c.set_A(50);
           
          B b = new B();
          b.set_B(10);
          b.set_A(15);}}
class A {
    int a;
    void set_A(int x) { 
          a = x; 
          System.out.println("Setting A's value to = " + x);
   }}
class B extends A {
    int b;
    void set_B(int x) { 
      b = x; 
      System.out.println("Setting B's value to = " + b);
    }}
class C extends A {
    int c;
    void set_C(int x) {
      c = x;
      System.out.println("Setting C's value to = " + c);
    }}
 