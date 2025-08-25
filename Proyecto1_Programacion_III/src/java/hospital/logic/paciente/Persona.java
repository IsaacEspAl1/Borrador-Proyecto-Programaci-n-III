package hospital.logic.paciente;

public class Persona {//aa
    //Atributos
    protected String nombre;
    protected String id;

    //Constructorers
    public Persona() {
        this.nombre = "";
        this.id = "";
    }

    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    //Setters | Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    //Metodos de la clase
}
