
package com.siac.services;

import com.siac.entities.Arancel;

public class Documento {

    private Arancel arancel;
    private Long descuentoId;
    private float porcentajeDescuento, monto, montoCord;
    private boolean abono;

    public Documento() {
        super();
    }

    public Documento(Arancel arancel, Long descuentoId, float porcentajeDescuento, float monto, float montoCord, boolean abono) {
        this.arancel = arancel;
        this.descuentoId = descuentoId;
        this.porcentajeDescuento = porcentajeDescuento;
        this.monto = monto;
        this.abono = abono;
        this.montoCord = montoCord;
    }
    
    public Arancel getArancel() {
        return arancel;
    }

    public void setArancel(Arancel arancel) {
        this.arancel = arancel;
    }

    public Long getDescuentoId() {
        return descuentoId;
    }

    public void setDescuentoId(Long descuentoId) {
        this.descuentoId = descuentoId;
    }

    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(float porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public boolean isAbono() {
        return abono;
    }

    public void setAbono(boolean abono) {
        this.abono = abono;
    }

    public float getMontoCord() {
        return montoCord;
    }

    public void setMontoCord(float montoCord) {
        this.montoCord = montoCord;
    }
}