package models;

class Item {
    private String nombre;
    private String descripcion;
    int precio;
    private String comentarios;

    public Item(String nombre, String descripcion, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    void agregarComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
