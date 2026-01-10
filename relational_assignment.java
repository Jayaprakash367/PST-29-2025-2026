public class relational_assignment {
  public static void main(String[] args) {
    int x =10;
    x += 5;
   
    System.out.println(x);
   int z =10;
    z -= 5;
   
    System.out.println(z);
    int k =10;
     k *= 5;
   
    System.out.println(k);
    int h =10;
    h /= 5;
   
    System.out.println(h);
    
    int j = 10;
    j  = 5;
    System.out.println(j);
     
    int no8=10;
    no8 &= 10;
    System.out.println(no8);
    
    int o,t;
     o=10;
     t=10;
    System.out.println(o==t);
    
     int r,e;
     r=1;
     e=10;
    System.out.println(r!=e);
    
     int num1, num2;
     num1=10;
     num2=10;
    System.out.println(num1 > num2);
    
     int num3, num4;
     num3=10;
     num4=10;
    System.out.println(num3 < num4);
    
    int num5, num6;
     num5=10;
     num6=10;
    System.out.println(num5 >= num6);
    
    int num7, num8;
     num7=10;
     num8=10;
    System.out.println(num7 <= num8);
     
     boolean isLoggedIn = true;
    boolean isAdmin = false;

    System.out.println("Regular user: " + (isLoggedIn && isAdmin));
    System.out.println("Has access: " + (isLoggedIn || isAdmin));
    System.out.println("Not logged in: " + (!isLoggedIn));
  }
}
