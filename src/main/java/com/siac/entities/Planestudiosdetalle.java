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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "planestudiosdetalle")
@NamedQueries({
    @NamedQuery(name = "Planestudiosdetalle.findAll", query = "SELECT p FROM Planestudiosdetalle p"),
    @NamedQuery(name = "Planestudiosdetalle.findById", query = "SELECT p FROM Planestudiosdetalle p WHERE p.id = :id"),
    @NamedQuery(name = "Planestudiosdetalle.findByCreditos", query = "SELECT p FROM Planestudiosdetalle p WHERE p.creditos = :creditos"),
    @NamedQuery(name = "Planestudiosdetalle.findByHorasClase", query = "SELECT p FROM Planestudiosdetalle p WHERE p.horasClase = :horasClase"),
    @NamedQuery(name = "Planestudiosdetalle.findByActivo", query = "SELECT p FROM Planestudiosdetalle p WHERE p.activo = :activo")})
public class Planestudiosdetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Column(name = "Creditos")
    private Integer creditos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HorasClase")
    private Float horasClase;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @JoinColumn(name = "Asignaturas", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Asignaturas asignaturas;
    @JoinColumns({
        @JoinColumn(name = "Credencial", referencedColumnName = "Codigo"),
        @JoinColumn(name = "Usuario", referencedColumnName = "Usuario")})
    @ManyToOne(optional = false)
    private Credencial credencial;
    @JoinColumn(name = "PlanEstudios", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Planestudios planEstudios;

    public Planestudiosdetalle() {
    }

    public Planestudiosdetalle(Long id) {
        this.id = id;
    }

    public Planestudiosdetalle(Long id, boolean activo) {
        this.id = id;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Float getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(Float horasClase) {
        this.horasClase = horasClase;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Asignaturas getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignaturas asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public Planestudios getPlanEstudios() {
        return planEstudios;
    }

    public void setPlanEstudios(Planestudios planEstudios) {
        this.planEstudios = planEstudios;
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
        if (!(object instanceof Planestudiosdetalle)) {
            return false;
        }
        Planestudiosdetalle other = (Planestudiosdetalle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Planestudiosdetalle[ id=" + id + " ]";
    }
    
}
