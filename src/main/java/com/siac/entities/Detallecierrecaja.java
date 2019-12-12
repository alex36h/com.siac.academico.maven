/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "detallecierrecaja")
@NamedQueries({
    @NamedQuery(name = "Detallecierrecaja.findAll", query = "SELECT d FROM Detallecierrecaja d"),
    @NamedQuery(name = "Detallecierrecaja.findById", query = "SELECT d FROM Detallecierrecaja d WHERE d.id = :id"),
    @NamedQuery(name = "Detallecierrecaja.findByMonto", query = "SELECT d FROM Detallecierrecaja d WHERE d.monto = :monto")})
public class Detallecierrecaja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Monto")
    private double monto;
    @JoinColumn(name = "CierreCaja", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Cierrecaja cierreCaja;
    @JoinColumn(name = "FormaPago", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Formapago formaPago;
    @JoinColumn(name = "Moneda", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Moneda moneda;

    public Detallecierrecaja() {
    }

    public Detallecierrecaja(Long id) {
        this.id = id;
    }

    public Detallecierrecaja(Long id, double monto) {
        this.id = id;
        this.monto = monto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cierrecaja getCierreCaja() {
        return cierreCaja;
    }

    public void setCierreCaja(Cierrecaja cierreCaja) {
        this.cierreCaja = cierreCaja;
    }

    public Formapago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(Formapago formaPago) {
        this.formaPago = formaPago;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallecierrecaja)) {
            return false;
        }
        Detallecierrecaja other = (Detallecierrecaja) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Detallecierrecaja[ id=" + id + " ]";
    }
    
}
