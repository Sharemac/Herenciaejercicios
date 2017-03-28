
package ejercicioherencia;


public class EjercicioHerencia {

    
    public static void main(String[] args) {
        
        Profesor p = new Profesor("dir", "123", "poo");
        double notas[] = {5,5,5,5};
        Estudiante e = new Estudiante(notas, p, "V", "456", "poo");
        System.out.println(e.getDireccion());
        System.out.println(e.getAsignado().getDireccion());
        System.out.println(e.getMateria());
        System.out.println(e.calcularPromedio());
        
    }
    
}
