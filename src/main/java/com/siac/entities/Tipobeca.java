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
@Table(name = "tipobeca")
@NamedQueries({
    @NamedQuery(name = "Tipobeca.findAll", query = "SELECT t FROM Tipobeca t"),
    @NamedQuery(name = "Tipobeca.findById", query = "SELECT t FROM Tipobeca t WHERE t.id = :id"),
    @NamedQuery(name = "Tipobeca.findByNombre", query = "SELECT t FROM Tipobeca t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipobeca.findByDescripcion", query = "SELECT t FROM Tipobeca t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Tipobeca.findByActivo", query = "SELECT t FROM Tipobeca t WHERE t.activo = :activo")})
public class Tipobeca implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoBeca")
    private List<Beca> becaList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;

    public Tipobeca() {
    }

    public Tipobeca(Integer id) {
        this.id = id;
    }

    public Tipobeca(Integer id, String nombre, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipobeca)) {
            return false;
        }
        Tipobeca other = (Tipobeca) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Tipobeca[ id=" + id + " ]";
    }

    public List<Beca> getBecaList() {
        return becaList;
    }

    public void setBecaList(List<Beca> becaList) {
        this.becaList = becaList;
    }
    
}
