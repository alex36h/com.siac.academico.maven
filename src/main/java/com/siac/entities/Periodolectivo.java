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
@Table(name = "periodolectivo")
@NamedQueries({
    @NamedQuery(name = "Periodolectivo.findAll", query = "SELECT p FROM Periodolectivo p"),
    @NamedQuery(name = "Periodolectivo.findById", query = "SELECT p FROM Periodolectivo p WHERE p.id = :id"),
    @NamedQuery(name = "Periodolectivo.findByNombre", query = "SELECT p FROM Periodolectivo p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Periodolectivo.findByDescripcion", query = "SELECT p FROM Periodolectivo p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Periodolectivo.findByFechaInicio", query = "SELECT p FROM Periodolectivo p WHERE p.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Periodolectivo.findByFechaFinal", query = "SELECT p FROM Periodolectivo p WHERE p.fechaFinal = :fechaFinal"),
    @NamedQuery(name = "Periodolectivo.findByTotalDiasPeriodo", query = "SELECT p FROM Periodolectivo p WHERE p.totalDiasPeriodo = :totalDiasPeriodo"),
    @NamedQuery(name = "Periodolectivo.findByActivo", query = "SELECT p FROM Periodolectivo p WHERE p.activo = :activo")})
public class Periodolectivo implements Serializable {

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
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "Fecha_Final")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Column(name = "TotalDiasPeriodo")
    private Integer totalDiasPeriodo;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @JoinColumn(name = "AnioLecticvo", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Aniolectivo anioLecticvo;
    @JoinColumns({
        @JoinColumn(name = "Credencial", referencedColumnName = "Codigo"),
        @JoinColumn(name = "Usuario", referencedColumnName = "Usuario")})
    @ManyToOne(optional = false)
    private Credencial credencial;

    public Periodolectivo() {
    }

    public Periodolectivo(Long id) {
        this.id = id;
    }

    public Periodolectivo(Long id, String nombre, Date fechaInicio, Date fechaFinal, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Integer getTotalDiasPeriodo() {
        return totalDiasPeriodo;
    }

    public void setTotalDiasPeriodo(Integer totalDiasPeriodo) {
        this.totalDiasPeriodo = totalDiasPeriodo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Aniolectivo getAnioLecticvo() {
        return anioLecticvo;
    }

    public void setAnioLecticvo(Aniolectivo anioLecticvo) {
        this.anioLecticvo = anioLecticvo;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
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
        if (!(object instanceof Periodolectivo)) {
            return false;
        }
        Periodolectivo other = (Periodolectivo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Periodolectivo[ id=" + id + " ]";
    }
    
}
