package models;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Mecanismo{
    private Queue<Pedido> pedidosPorPreparar;
    private ArrayList<Pedido> pedidosDespachados;
    private boolean sesionActiva; 
    private static Administrador adminPermitido;
    private static int numeroDeUsuarios;

    public Mecanismo(Administrador admin){
        this.pedidosDespachados = new ArrayList<>();
        this.pedidosPorPreparar = new LinkedList<>(); 
        this.sesionActiva = false;
        this.adminPermitido = admin;
        this.numeroDeUsuarios = 0;
    }


    public void iniciar_sesion(int id, String clave){
        if (adminPermitido.get_clave()== clave && adminPermitido.get_id() == id ){
            sesionActiva= true;
        }
    }

    public void ingresar_pedido(Pedido nuevoPedido){
        if (sesionActiva){
            this.pedidosPorPreparar.add(nuevoPedido);
        }
    }
    public void despachar_pedido(){
        Pedido pedidoDespachado;

        if (sesionActiva){
            pedidoDespachado= this.pedidosPorPreparar.remove();
            this.pedidosDespachados.add(pedidoDespachado);
        }
    }

    public Integer cierre_de_caja(){
        if (sesionActiva){
            int total = 0;
            for (Pedido pedido: pedidosDespachados){
                total += pedido.costoTotal();
            }
            return total;
        }

        return null;
    }

    public int siguienteId() {
        return numeroDeUsuarios++;
    }
}




