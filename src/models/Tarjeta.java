package models;

import java.util.Date;

public class Tarjeta {

    private String numero;
    private Date vencimiento;

    public Tarjeta(String numero, Date vencimiento) {
        this.numero = numero;
        this.vencimiento = vencimiento;
    }

    public boolean fechaValida() {
        return new Date().before(vencimiento);
    }
}
