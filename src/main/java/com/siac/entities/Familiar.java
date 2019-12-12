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
@Table(name = "familiar")
@NamedQueries({
    @NamedQuery(name = "Familiar.findAll", query = "SELECT f FROM Familiar f"),
    @NamedQuery(name = "Familiar.findById", query = "SELECT f FROM Familiar f WHERE f.id = :id"),
    @NamedQuery(name = "Familiar.findByProfesion", query = "SELECT f FROM Familiar f WHERE f.profesion = :profesion"),
    @NamedQuery(name = "Familiar.findByCentroDeTrabajo", query = "SELECT f FROM Familiar f WHERE f.centroDeTrabajo = :centroDeTrabajo"),
    @NamedQuery(name = "Familiar.findByTelefonoTrabajo", query = "SELECT f FROM Familiar f WHERE f.telefonoTrabajo = :telefonoTrabajo"),
    @NamedQuery(name = "Familiar.findByDireccionTrabajo", query = "SELECT f FROM Familiar f WHERE f.direccionTrabajo = :direccionTrabajo"),
    @NamedQuery(name = "Familiar.findByCelularPersonal", query = "SELECT f FROM Familiar f WHERE f.celularPersonal = :celularPersonal"),
    @NamedQuery(name = "Familiar.findByFechaRegistro", query = "SELECT f FROM Familiar f WHERE f.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "Familiar.findByUsuario", query = "SELECT f FROM Familiar f WHERE f.usuario = :usuario"),
    @NamedQuery(name = "Familiar.findByActivo", query = "SELECT f FROM Familiar f WHERE f.activo = :activo")})
public class Familiar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Column(name = "Profesion")
    private String profesion;
    @Column(name = "CentroDeTrabajo")
    private String centroDeTrabajo;
    @Column(name = "TelefonoTrabajo")
    private String telefonoTrabajo;
    @Column(name = "DireccionTrabajo")
    private String direccionTrabajo;
    @Column(name = "CelularPersonal")
    private String celularPersonal;
    @Basic(optional = false)
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Basic(optional = false)
    @Column(name = "Usuario")
    private int usuario;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @JoinColumn(name = "Estudiante", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Estudiante estudiante;
    @JoinColumn(name = "Parentesco", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Parentesco parentesco;
    @JoinColumn(name = "Persona", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private Persona persona;
    @JoinColumn(name = "TipoResponsable", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Tiporesponsable tipoResponsable;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "familiar")
    private List<Responsableestudiante> responsableestudianteList;

    public Familiar() {
    }

    public Familiar(Long id) {
        this.id = id;
    }

    public Familiar(Long id, Date fechaRegistro, int usuario, boolean activo) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
        this.usuario = usuario;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCentroDeTrabajo() {
        return centroDeTrabajo;
    }

    public void setCentroDeTrabajo(String centroDeTrabajo) {
        this.centroDeTrabajo = centroDeTrabajo;
    }

    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }

    public String getDireccionTrabajo() {
        return direccionTrabajo;
    }

    public void setDireccionTrabajo(String direccionTrabajo) {
        this.direccionTrabajo = direccionTrabajo;
    }

    public String getCelularPersonal() {
        return celularPersonal;
    }

    public void setCelularPersonal(String celularPersonal) {
        this.celularPersonal = celularPersonal;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Parentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(Parentesco parentesco) {
        this.parentesco = parentesco;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Tiporesponsable getTipoResponsable() {
        return tipoResponsable;
    }

    public void setTipoResponsable(Tiporesponsable tipoResponsable) {
        this.tipoResponsable = tipoResponsable;
    }

    public List<Responsableestudiante> getResponsableestudianteList() {
        return responsableestudianteList;
    }

    public void setResponsableestudianteList(List<Responsableestudiante> responsableestudianteList) {
        this.responsableestudianteList = responsableestudianteList;
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
        if (!(object instanceof Familiar)) {
            return false;
        }
        Familiar other = (Familiar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Familiar[ id=" + id + " ]";
    }
    
}
