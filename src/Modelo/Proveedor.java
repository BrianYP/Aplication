
package Modelo;

public class Proveedor {
    private int id;
    private int ruc;
    private String nombre;
    private int telefono;
    private String direcion;
    private String razon;
    
    //--------------------------------------------------------------------------CONSTRUCTORES

    public Proveedor() {
    }

    public Proveedor(int id, int ruc, String nombre, int telefono, String direcion, String razon) {
        this.id = id;
        this.ruc = ruc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direcion = direcion;
        this.razon = razon;
    }
    
    //--------------------------------------------------------------------------GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
    
}
