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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author RForbes
 */
@Entity
@Table(name = "responsableestudiante")
@NamedQueries({
    @NamedQuery(name = "Responsableestudiante.findAll", query = "SELECT r FROM Responsableestudiante r"),
    @NamedQuery(name = "Responsableestudiante.findById", query = "SELECT r FROM Responsableestudiante r WHERE r.id = :id"),
    @NamedQuery(name = "Responsableestudiante.findByFechaRegistro", query = "SELECT r FROM Responsableestudiante r WHERE r.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "Responsableestudiante.findByActivo", query = "SELECT r FROM Responsableestudiante r WHERE r.activo = :activo")})
public class Responsableestudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @JoinColumn(name = "AnioLectivo", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Aniolectivo anioLectivo;
    @JoinColumns({
        @JoinColumn(name = "Credencial", referencedColumnName = "Codigo"),
        @JoinColumn(name = "Usuario", referencedColumnName = "Usuario")})
    @ManyToOne(optional = false)
    private Credencial credencial;
    @JoinColumn(name = "Estudiante", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Estudiante estudiante;
    @JoinColumn(name = "Familiar", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Familiar familiar;
    @JoinColumn(name = "Parentesco", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Parentesco parentesco;

    public Responsableestudiante() {
    }

    public Responsableestudiante(Long id) {
        this.id = id;
    }

    public Responsableestudiante(Long id, boolean activo) {
        this.id = id;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Aniolectivo getAnioLectivo() {
        return anioLectivo;
    }

    public void setAnioLectivo(Aniolectivo anioLectivo) {
        this.anioLectivo = anioLectivo;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public void setFamiliar(Familiar familiar) {
        this.familiar = familiar;
    }

    public Parentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(Parentesco parentesco) {
        this.parentesco = parentesco;
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
        if (!(object instanceof Responsableestudiante)) {
            return false;
        }
        Responsableestudiante other = (Responsableestudiante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Responsableestudiante[ id=" + id + " ]";
    }
    
}
