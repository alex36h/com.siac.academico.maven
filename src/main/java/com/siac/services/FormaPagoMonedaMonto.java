
package com.siac.services;

import com.siac.entities.Banco;
import com.siac.entities.Formapago;
import com.siac.entities.Moneda;
import java.util.List;
import java.util.Objects;

public class FormaPagoMonedaMonto {
    private final Formapago formaPago;
    private final Moneda moneda;
    private float monto;
    private final String referencia;
    private final Banco banco;

    public FormaPagoMonedaMonto(Formapago formaPago, Moneda moneda, float monto,
            String referencia, Banco banco) {
        super();
        this.formaPago = formaPago;
        this.moneda = moneda;
        this.monto = monto;
        this.referencia = referencia;
        this.banco = banco;
    }

    public Formapago getFormaPago() {
        return formaPago;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getReferencia() {
        return referencia;
    }

    public Banco getBanco() {
        return banco;
    }
    
    public boolean existe(List<FormaPagoMonedaMonto> lista) {
        boolean existe = false;
        for (FormaPagoMonedaMonto obj : lista) {
            if (this.equals(obj)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public void sumar(List<FormaPagoMonedaMonto> lista) {
        for (FormaPagoMonedaMonto obj : lista) {
            if (this.equals(obj)) {
                obj.setMonto(obj.getMonto() + monto);
                break;
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FormaPagoMonedaMonto) {
            FormaPagoMonedaMonto tmp = (FormaPagoMonedaMonto) obj;
            return tmp.getFormaPago().equals(formaPago) && tmp.getMoneda().equals(moneda);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.formaPago);
        hash = 37 * hash + Objects.hashCode(this.moneda);
        return hash;
    }

}
