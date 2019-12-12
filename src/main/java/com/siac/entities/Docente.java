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
 * @author AdminSistema
 */
@Entity
@Table(name = "docente")
@NamedQueries({
    @NamedQuery(name = "Docente.findAll", query = "SELECT d FROM Docente d"),
    @NamedQuery(name = "Docente.findById", query = "SELECT d FROM Docente d WHERE d.id = :id"),
    @NamedQuery(name = "Docente.findByCentroDeEstudio", query = "SELECT d FROM Docente d WHERE d.centroDeEstudio = :centroDeEstudio"),
    @NamedQuery(name = "Docente.findByDuracion", query = "SELECT d FROM Docente d WHERE d.duracion = :duracion"),
    @NamedQuery(name = "Docente.findByDesempeno", query = "SELECT d FROM Docente d WHERE d.desempeno = :desempeno"),
    @NamedQuery(name = "Docente.findByFechaCulminacion", query = "SELECT d FROM Docente d WHERE d.fechaCulminacion = :fechaCulminacion"),
    @NamedQuery(name = "Docente.findByActivo", query = "SELECT d FROM Docente d WHERE d.activo = :activo")})
public class Docente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Column(name = "CentroDeEstudio")
    private String centroDeEstudio;
    @Column(name = "Duracion")
    private String duracion;
    @Column(name = "Desempeno")
    private String desempeno;
    @Column(name = "FechaCulminacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCulminacion;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @JoinColumn(name = "Persona", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private Persona persona;
    @JoinColumn(name = "Profesion", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Profesion profesion;

    public Docente() {
    }

    public Docente(Long id) {
        this.id = id;
    }

    public Docente(Long id, boolean activo) {
        this.id = id;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCentroDeEstudio() {
        return centroDeEstudio;
    }

    public void setCentroDeEstudio(String centroDeEstudio) {
        this.centroDeEstudio = centroDeEstudio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDesempeno() {
        return desempeno;
    }

    public void setDesempeno(String desempeno) {
        this.desempeno = desempeno;
    }

    public Date getFechaCulminacion() {
        return fechaCulminacion;
    }

    public void setFechaCulminacion(Date fechaCulminacion) {
        this.fechaCulminacion = fechaCulminacion;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Profesion getProfesion() {
        return profesion;
    }

    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
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
        if (!(object instanceof Docente)) {
            return false;
        }
        Docente other = (Docente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Docente[ id=" + id + " ]";
    }
    
}
