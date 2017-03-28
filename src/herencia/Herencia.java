
package herencia;


public class Herencia {

    public static void main(String[] args) {
       A a = new A(5);
        System.out.println(a.getA1());
        a.xx();
        
        B b = new B(5,6);
        b.xx();
        b.yy();
        
        B c = new B(5,7);
    }
    
}
