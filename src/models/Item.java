package models;

class Item {
    String nombre;
    String descripcion;
    int precio;
    String comentarios;

    void agregarComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
