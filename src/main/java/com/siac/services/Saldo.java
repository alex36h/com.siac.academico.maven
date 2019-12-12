
package com.siac.services;

import com.siac.entities.Formapago;
import com.siac.entities.Recibo;
import java.util.List;

public class Saldo {
    private Formapago formaPago;
    private List<Total> totales;
    private Recibo recibo;

    public Saldo() {
        super();
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

    public Saldo(Formapago formaPago, List<Total> totales) {
        this.formaPago = formaPago;
        this.totales = totales;
    }

    public Saldo(Formapago formaPago, List<Total> totales, Recibo recibo) {
        this.formaPago = formaPago;
        this.totales = totales;
        this.recibo = recibo;
    }
    
    public Formapago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(Formapago formaPago) {
        this.formaPago = formaPago;
    }

    public List<Total> getTotales() {
        return totales;
    }

    public void setTotales(List<Total> totales) {
        this.totales = totales;
    }
}
