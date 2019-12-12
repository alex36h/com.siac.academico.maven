/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "moneda")
@NamedQueries({
    @NamedQuery(name = "Moneda.findAll", query = "SELECT m FROM Moneda m"),
    @NamedQuery(name = "Moneda.findById", query = "SELECT m FROM Moneda m WHERE m.id = :id"),
    @NamedQuery(name = "Moneda.findByNombre", query = "SELECT m FROM Moneda m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "Moneda.findByDescripcion", query = "SELECT m FROM Moneda m WHERE m.descripcion = :descripcion"),
    @NamedQuery(name = "Moneda.findByActivo", query = "SELECT m FROM Moneda m WHERE m.activo = :activo")})
public class Moneda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "moneda")
    private List<Detalleiniciocaja> detalleiniciocajaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "monedaBase")
    private List<Tipocambio> tipocambioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "monedaCambio")
    private List<Tipocambio> tipocambioList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "moneda")
    private List<Detallerecibo> detallereciboList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "moneda")
    private List<Detallecierrecaja> detallecierrecajaList;

    public Moneda() {
    }

    public Moneda(Long id) {
        this.id = id;
    }

    public Moneda(Long id, String nombre, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Detalleiniciocaja> getDetalleiniciocajaList() {
        return detalleiniciocajaList;
    }

    public void setDetalleiniciocajaList(List<Detalleiniciocaja> detalleiniciocajaList) {
        this.detalleiniciocajaList = detalleiniciocajaList;
    }

    public List<Tipocambio> getTipocambioList() {
        return tipocambioList;
    }

    public void setTipocambioList(List<Tipocambio> tipocambioList) {
        this.tipocambioList = tipocambioList;
    }

    public List<Tipocambio> getTipocambioList1() {
        return tipocambioList1;
    }

    public void setTipocambioList1(List<Tipocambio> tipocambioList1) {
        this.tipocambioList1 = tipocambioList1;
    }

    public List<Detallerecibo> getDetallereciboList() {
        return detallereciboList;
    }

    public void setDetallereciboList(List<Detallerecibo> detallereciboList) {
        this.detallereciboList = detallereciboList;
    }

    public List<Detallecierrecaja> getDetallecierrecajaList() {
        return detallecierrecajaList;
    }

    public void setDetallecierrecajaList(List<Detallecierrecaja> detallecierrecajaList) {
        this.detallecierrecajaList = detallecierrecajaList;
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
        if (!(object instanceof Moneda)) {
            return false;
        }
        Moneda other = (Moneda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Moneda[ id=" + id + " ]";
    }
    
}
