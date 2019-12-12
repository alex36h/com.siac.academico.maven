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
@Table(name = "turno")
@NamedQueries({
    @NamedQuery(name = "Turno_1.findAll", query = "SELECT t FROM Turno_1 t"),
    @NamedQuery(name = "Turno_1.findById", query = "SELECT t FROM Turno_1 t WHERE t.id = :id"),
    @NamedQuery(name = "Turno_1.findByNombre", query = "SELECT t FROM Turno_1 t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Turno_1.findByDescripcion", query = "SELECT t FROM Turno_1 t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Turno_1.findByInicio", query = "SELECT t FROM Turno_1 t WHERE t.inicio = :inicio"),
    @NamedQuery(name = "Turno_1.findByFin", query = "SELECT t FROM Turno_1 t WHERE t.fin = :fin"),
    @NamedQuery(name = "Turno_1.findByActivo", query = "SELECT t FROM Turno_1 t WHERE t.activo = :activo")})
public class Turno_1 implements Serializable {

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
    @Column(name = "Inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inicio;
    @Basic(optional = false)
    @Column(name = "Fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fin;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;

    public Turno_1() {
    }

    public Turno_1(Long id) {
        this.id = id;
    }

    public Turno_1(Long id, String nombre, Date inicio, Date fin, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
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

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
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
        if (!(object instanceof Turno_1)) {
            return false;
        }
        Turno_1 other = (Turno_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Turno_1[ id=" + id + " ]";
    }
    
}
