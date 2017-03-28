
package ejercicioherencia;


public class Estudiante extends Persona {
    private double notas[];
    private Profesor asignado;

    public Estudiante(double[] notas, Profesor asignado, String direccion, String telefono, String materia) {
        super(direccion, telefono, materia);
        this.notas = notas;
        this.asignado = asignado;
        
    }

    public double[] getNotas() {
        return notas;
    }

    public Profesor getAsignado() {
        return asignado;
    }
    
    
    public double calcularPromedio(){
        double resultado = 0;
        for(double nota: notas){
            resultado += nota;
        }
        return resultado/notas.length;        
    }
    
}
