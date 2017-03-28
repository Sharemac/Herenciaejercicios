
package ejercicioherencia;


public class Persona {
    protected String direccion;
    protected String telefono;
    protected String materia;

    public Persona(String direccion, String telefono, String materia) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.materia = materia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    

}
