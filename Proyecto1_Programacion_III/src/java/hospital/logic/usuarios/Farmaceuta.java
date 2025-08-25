package hospital.logic.usuarios;

public class Farmaceuta extends Usuario {
    //Atributos

    //Constructores

    public Farmaceuta() {
        this.id = "";
        this.nombre = "";
        this.clave = "";
    }
    public Farmaceuta(String nombre, String id, String clave) {

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
        return "Farmaceuta";
    }
}
