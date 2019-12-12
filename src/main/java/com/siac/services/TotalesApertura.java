
package com.siac.services;

import com.siac.entities.Moneda;
import com.siac.entities.Recibo;


public class TotalesApertura {
    private Moneda moneda;
    private float monto;
    private Recibo recibo;

    public TotalesApertura() {
        super();
    }

    public TotalesApertura(Moneda moneda, float monto) {
        this();
        this.moneda = moneda;
        this.monto = monto;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
}