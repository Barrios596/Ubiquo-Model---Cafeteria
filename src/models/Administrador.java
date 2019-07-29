package models;

public class Administrador {
    private int id;
    private String clave;

    public Administrador(int id, String clave){
        this.id = id;
        this.clave= clave;
    }

    public int get_id(){
        return this.id;
    }

    public String get_clave(){
        return this.clave;
    }

}

