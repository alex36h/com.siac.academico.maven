/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "gruporol")
@NamedQueries({
    @NamedQuery(name = "Gruporol.findAll", query = "SELECT g FROM Gruporol g"),
    @NamedQuery(name = "Gruporol.findById", query = "SELECT g FROM Gruporol g WHERE g.id = :id"),
    @NamedQuery(name = "Gruporol.findByNombre", query = "SELECT g FROM Gruporol g WHERE g.nombre = :nombre"),
    @NamedQuery(name = "Gruporol.findByDescripcion", query = "SELECT g FROM Gruporol g WHERE g.descripcion = :descripcion"),
    @NamedQuery(name = "Gruporol.findByActivo", query = "SELECT g FROM Gruporol g WHERE g.activo = :activo")})
public class Gruporol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Activo")
    private Short activo;
    @OneToMany(mappedBy = "grupo")
    private List<Rol> rolList;

    public Gruporol() {
    }

    public Gruporol(Integer id) {
        this.id = id;
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

    public Short getActivo() {
        return activo;
    }

    public void setActivo(Short activo) {
        this.activo = activo;
    }

    public List<Rol> getRolList() {
        return rolList;
    }

    public void setRolList(List<Rol> rolList) {
        this.rolList = rolList;
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
        if (!(object instanceof Gruporol)) {
            return false;
        }
        Gruporol other = (Gruporol) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Gruporol[ id=" + id + " ]";
    }
    
}
