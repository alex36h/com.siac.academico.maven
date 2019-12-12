/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "tipocambio")
@NamedQueries({
    @NamedQuery(name = "Tipocambio.findAll", query = "SELECT t FROM Tipocambio t"),
    @NamedQuery(name = "Tipocambio.findById", query = "SELECT t FROM Tipocambio t WHERE t.id = :id"),
    @NamedQuery(name = "Tipocambio.findByFecha", query = "SELECT t FROM Tipocambio t WHERE t.fecha = :fecha"),
    @NamedQuery(name = "Tipocambio.findByCambio", query = "SELECT t FROM Tipocambio t WHERE t.cambio = :cambio")})
public class Tipocambio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "Cambio")
    private double cambio;
    @JoinColumn(name = "MonedaBase", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Moneda monedaBase;
    @JoinColumn(name = "MonedaCambio", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Moneda monedaCambio;

    public Tipocambio() {
    }

    public Tipocambio(Long id) {
        this.id = id;
    }

    public Tipocambio(Long id, Date fecha, double cambio) {
        this.id = id;
        this.fecha = fecha;
        this.cambio = cambio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public Moneda getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(Moneda monedaBase) {
        this.monedaBase = monedaBase;
    }

    public Moneda getMonedaCambio() {
        return monedaCambio;
    }

    public void setMonedaCambio(Moneda monedaCambio) {
        this.monedaCambio = monedaCambio;
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
        if (!(object instanceof Tipocambio)) {
            return false;
        }
        Tipocambio other = (Tipocambio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Tipocambio[ id=" + id + " ]";
    }
    
}
