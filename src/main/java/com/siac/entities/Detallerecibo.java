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
@Table(name = "detallerecibo")
@NamedQueries({
    @NamedQuery(name = "Detallerecibo.findAll", query = "SELECT d FROM Detallerecibo d"),
    @NamedQuery(name = "Detallerecibo.findByRecibo", query = "SELECT d FROM Detallerecibo d WHERE d.recibo.id = :recibo"),
    @NamedQuery(name = "Detallerecibo.findById", query = "SELECT d FROM Detallerecibo d WHERE d.id = :id"),
    @NamedQuery(name = "Detallerecibo.findByReferencia", query = "SELECT d FROM Detallerecibo d WHERE d.referencia = :referencia"),
    @NamedQuery(name = "Detallerecibo.findByMonto", query = "SELECT d FROM Detallerecibo d WHERE d.monto = :monto")})
public class Detallerecibo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Column(name = "Referencia")
    private String referencia;
    @Basic(optional = false)
    @Column(name = "Monto")
    private double monto;
    @JoinColumn(name = "Banco", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Banco banco;
    @JoinColumn(name = "FormaPago", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Formapago formaPago;
    @JoinColumn(name = "Moneda", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Moneda moneda;
    @JoinColumn(name = "Recibo", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Recibo recibo;

    public Detallerecibo() {
    }

    public Detallerecibo(Long id) {
        this.id = id;
    }

    public Detallerecibo(Long id, double monto) {
        this.id = id;
        this.monto = monto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
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

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
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
        if (!(object instanceof Detallerecibo)) {
            return false;
        }
        Detallerecibo other = (Detallerecibo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Detallerecibo[ id=" + id + " ]";
    }
    
}
