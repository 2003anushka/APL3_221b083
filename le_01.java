/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {

  
   String name;
   int age;

 
   void setName(String n) {
    this.name = n;
  }

  
   String getName() {
    return this.name;
  }

  
   void setage(int a) {
    this.age = a;
  }

 
   int getage() {
    return this.age;
  }


  public static void main(String[] args) {
    
    Main s1 = new Main();

    s1.setName("Anushka");
    s1.setage(17);


    System.out.println(s1.getName()+" "+s1.getage());


 
  }}

