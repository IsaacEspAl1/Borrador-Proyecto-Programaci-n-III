package hospital.logic.usuarios;

public class Administrador extends Usuario {
    public Administrador() {
        this.id = "";
        this.nombre = "";
        this.clave = "";
    }
    public Administrador(String nombre, String id, String clave) {

        this.nombre = nombre;
        this.id = id;
        this.clave = clave;
    }
    //Setters | Getters
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    //Metodos de la clase

    public String toString() {
        return nombre + " " + id + " " + clave;
    }

    @Override
    public String getTipoUsuario() {
        return "Administrador";
    }
}
