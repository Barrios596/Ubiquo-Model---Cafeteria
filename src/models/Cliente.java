package models;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
    private int id;
    private String email;
    private String nombre;
    private Pedido pedidoActual;
    private ArrayList<Tarjeta> tarjetas;
    private int numeroDeUsuarios;

    public Cliente(String email, String nombre) {
        this.id = Mecanismo().siguienteId;
        this.email = email;
        this.nombre = nombre;
        this.pedidoActual = new Pedido();
        this.tarjetas = new ArrayList<>();
    }

    public void agregarMetodoDePago(String numero, Date vencimiento) {
        this.tarjetas.add(new Tarjeta(numero, vencimiento));
    }

    public void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void agregarAPedido(Item item, String descripcion) {
        item.agregarComentarios(descripcion);
        this.pedidoActual.agregarAlPedido(item);
    }

    public void eliminarDelPedido(int indice) {
        this.pedidoActual.eliminarDelPedido(indice);
    }

    public int siguienteId() {
        return numeroDeUsuarios++;
    }
}
