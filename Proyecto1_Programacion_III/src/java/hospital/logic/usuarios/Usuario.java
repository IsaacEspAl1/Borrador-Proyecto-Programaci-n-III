package hospital.logic.usuarios;

public abstract class Usuario {
    protected String id;
    protected String nombre;
    protected String clave;

    public Usuario() {
        this.id = "";
        this.nombre = "";
        this.clave = "111";
    }

    public Usuario(String id, String nombre, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.clave = clave;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }

    public void cmabiarClave(String nuevaClave) {
        this.clave =  nuevaClave;
    }

    public abstract String getTipoUsuario();

}
