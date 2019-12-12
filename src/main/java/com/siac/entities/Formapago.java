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
@Table(name = "formapago")
@NamedQueries({
    @NamedQuery(name = "Formapago.findAll", query = "SELECT f FROM Formapago f"),
    @NamedQuery(name = "Formapago.findAllForApertura", query = "SELECT f FROM Formapago f WHERE UPPER(f.nombre) LIKE :nombre"),
    @NamedQuery(name = "Formapago.findById", query = "SELECT f FROM Formapago f WHERE f.id = :id"),
    @NamedQuery(name = "Formapago.findByNombre", query = "SELECT f FROM Formapago f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Formapago.findByDescripcion", query = "SELECT f FROM Formapago f WHERE f.descripcion = :descripcion"),
    @NamedQuery(name = "Formapago.findByActivo", query = "SELECT f FROM Formapago f WHERE f.activo = :activo")})
public class Formapago implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formaPago")
    private List<Detalleiniciocaja> detalleiniciocajaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formaPago")
    private List<Detallerecibo> detallereciboList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formaPago")
    private List<Detallecierrecaja> detallecierrecajaList;

    public Formapago() {
    }

    public Formapago(Long id) {
        this.id = id;
    }

    public Formapago(Long id, String nombre, boolean activo) {
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
        if (!(object instanceof Formapago)) {
            return false;
        }
        Formapago other = (Formapago) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Formapago[ id=" + id + " ]";
    }
    
}
