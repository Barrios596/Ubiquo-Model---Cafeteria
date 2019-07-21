package models;

import java.util.ArrayList;

class Pedido {

    private ArrayList<Item> items;
    private Tarjeta metodoDePago;
    private String ubicacion;
    private String estado;
    private String empleado;

    Pedido(){
        this.items = new ArrayList<>();
        this.estado = "Preparando pedido.";
    }

    void eliminarDelPedido(int indice) {
        this.items.remove(indice);
    }

    void agregarAlPedido(Item item) {
        this.items.add(item);
    }

    void indicarUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    int costoTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.precio;
        }
        return total;
    }

    void enviarPedido() {
        this.estado = "Pedido enviado. El nombre del empleado que lleva el pedido es " + empleado + ".";
    }

    void pedidoEntregado() {
        this.estado = "Pedido entregado por el empleado " + empleado + ".";
    }
}
