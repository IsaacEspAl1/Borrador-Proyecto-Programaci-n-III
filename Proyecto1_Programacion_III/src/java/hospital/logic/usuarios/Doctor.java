package hospital.logic.usuarios;

public class Doctor extends Usuario {
    //Atributos
    private String especialidad;

    //Constructores

    public Doctor() {
        this.id = "";
        this.nombre = "";
        this.especialidad = "";
        this.clave = "";
    }

    public Doctor(String nombre, String id, String especialidad, String clave) {
        this.nombre = nombre;
        this.id = id;
        this.especialidad = especialidad;
        this.clave = clave;
    }
    //Setters | Getters
    public String getEspecialidad() {
        return especialidad;
    }

    public String getClave() {
        return clave;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    //Metodos de la clase

    public String toString(){
        return nombre + " " + id + " " + especialidad + " " + clave;
    }

    @Override
    public String getTipoUsuario() {
        return "Medico";
    }
}
