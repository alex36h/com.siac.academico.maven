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
@Table(name = "serierecibo")
@NamedQueries({
    @NamedQuery(name = "Serierecibo.findAll", query = "SELECT s FROM Serierecibo s"),
    @NamedQuery(name = "Serierecibo.findById", query = "SELECT s FROM Serierecibo s WHERE s.id = :id"),
    @NamedQuery(name = "Serierecibo.findByNombre", query = "SELECT s FROM Serierecibo s WHERE UPPER(s.nombre) = :nombre"),
    @NamedQuery(name = "Serierecibo.findByDescripcion", query = "SELECT s FROM Serierecibo s WHERE s.descripcion = :descripcion"),
    @NamedQuery(name = "Serierecibo.findByActivo", query = "SELECT s FROM Serierecibo s WHERE s.activo = :activo")})
public class Serierecibo implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "serie")
    private List<Iniciocaja> iniciocajaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "serie")
    private List<Recibo> reciboList;

    public Serierecibo() {
    }

    public Serierecibo(Long id) {
        this.id = id;
    }

    public Serierecibo(Long id, String nombre, boolean activo) {
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

    public List<Iniciocaja> getIniciocajaList() {
        return iniciocajaList;
    }

    public void setIniciocajaList(List<Iniciocaja> iniciocajaList) {
        this.iniciocajaList = iniciocajaList;
    }

    public List<Recibo> getReciboList() {
        return reciboList;
    }

    public void setReciboList(List<Recibo> reciboList) {
        this.reciboList = reciboList;
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
        if (!(object instanceof Serierecibo)) {
            return false;
        }
        Serierecibo other = (Serierecibo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Serierecibo[ id=" + id + " ]";
    }
    
}
