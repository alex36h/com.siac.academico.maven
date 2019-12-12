/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "aniolectivo")
@NamedQueries({
    @NamedQuery(name = "Aniolectivo.findAll", query = "SELECT a FROM Aniolectivo a"),
    @NamedQuery(name = "Aniolectivo.findById", query = "SELECT a FROM Aniolectivo a WHERE a.id = :id"),
    @NamedQuery(name = "Aniolectivo.findByNombre", query = "SELECT a FROM Aniolectivo a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Aniolectivo.findByFechaInicio", query = "SELECT a FROM Aniolectivo a WHERE a.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Aniolectivo.findByFechaFinal", query = "SELECT a FROM Aniolectivo a WHERE a.fechaFinal = :fechaFinal"),
    @NamedQuery(name = "Aniolectivo.findByActivo", query = "SELECT a FROM Aniolectivo a WHERE a.activo = :activo"),
    @NamedQuery(name = "Aniolectivo.findByDescripcion", query = "SELECT a FROM Aniolectivo a WHERE a.descripcion = :descripcion")})
public class Aniolectivo implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anioLectivo")
    private List<Responsableestudiante> responsableestudianteList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "a\u00f1oLectivo")
    private List<Cursos> cursosList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "Fecha_Final")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @Column(name = "Descripcion")
    private String descripcion;
    @JoinColumns({
        @JoinColumn(name = "Credencial", referencedColumnName = "Codigo"),
        @JoinColumn(name = "Usuario", referencedColumnName = "Usuario")})
    @ManyToOne(optional = false)
    private Credencial credencial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anioLecticvo")
    private List<Periodolectivo> periodolectivoList;

    public Aniolectivo() {
    }

    public Aniolectivo(Long id) {
        this.id = id;
    }

    public Aniolectivo(Long id, String nombre, Date fechaInicio, Date fechaFinal, boolean activo) {
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

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public List<Periodolectivo> getPeriodolectivoList() {
        return periodolectivoList;
    }

    public void setPeriodolectivoList(List<Periodolectivo> periodolectivoList) {
        this.periodolectivoList = periodolectivoList;
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
        if (!(object instanceof Aniolectivo)) {
            return false;
        }
        Aniolectivo other = (Aniolectivo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Aniolectivo[ id=" + id + " ]";
    }

    public List<Cursos> getCursosList() {
        return cursosList;
    }

    public void setCursosList(List<Cursos> cursosList) {
        this.cursosList = cursosList;
    }

    public List<Responsableestudiante> getResponsableestudianteList() {
        return responsableestudianteList;
    }

    public void setResponsableestudianteList(List<Responsableestudiante> responsableestudianteList) {
        this.responsableestudianteList = responsableestudianteList;
    }
    
}
