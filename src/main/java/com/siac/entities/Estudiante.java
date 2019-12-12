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
@Table(name = "estudiante")
@NamedQueries({
    @NamedQuery(name = "Estudiante.findAll", query = "SELECT e FROM Estudiante e"),
    @NamedQuery(name = "Estudiante.find", query = "SELECT e.persona.codigo FROM Estudiante e"),
    @NamedQuery(name = "Estudiante.findById", query = "SELECT e FROM Estudiante e WHERE e.id = :id"),
    @NamedQuery(name = "Estudiante.findByCarnet", query = "SELECT e FROM Estudiante e WHERE e.carnet = :carnet"),
    @NamedQuery(name = "Estudiante.findByCodMINED", query = "SELECT e FROM Estudiante e WHERE e.codMINED = :codMINED"),
    @NamedQuery(name = "Estudiante.findByTelefono", query = "SELECT e FROM Estudiante e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "Estudiante.findByTipoSangre", query = "SELECT e FROM Estudiante e WHERE e.tipoSangre = :tipoSangre"),
    @NamedQuery(name = "Estudiante.findByObservaciones", query = "SELECT e FROM Estudiante e WHERE e.observaciones = :observaciones"),
    @NamedQuery(name = "Estudiante.findByFechaIngreso", query = "SELECT e FROM Estudiante e WHERE e.fechaIngreso = :fechaIngreso"),
    @NamedQuery(name = "Estudiante.findByFechaRegistro", query = "SELECT e FROM Estudiante e WHERE e.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "Estudiante.findByActivo", query = "SELECT e FROM Estudiante e WHERE e.activo = :activo")})
public class Estudiante implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante")
    private List<Beca> becaList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante")
    private List<Responsableestudiante> responsableestudianteList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante")
    private List<Pagoestudiante> pagoestudianteList;

    @Column(name = "carnet")
    private String carnet;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Column(name = "CodMINED")
    private String codMINED;
    @Basic(optional = false)
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "TipoSangre")
    private String tipoSangre;
    @Column(name = "Observaciones")
    private String observaciones;
    @Column(name = "FechaIngreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Basic(optional = false)
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @Basic(optional = false)
    @Column(name = "Estado")
    private int estado;
    
    @JoinColumns({
        @JoinColumn(name = "Credencial", referencedColumnName = "Codigo"),
        @JoinColumn(name = "Usuario", referencedColumnName = "Usuario")})
    @ManyToOne(optional = false)
    private Credencial credencial;
    @JoinColumn(name = "Persona", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private Persona persona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante")
    private List<Antecedenteenfestudiante> antecedenteenfestudianteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante")
    private List<Antecedentealergiaestudiante> antecedentealergiaestudianteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante")
    private List<Familiar> familiarList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante")
    private List<Cursoinscripcion> cursoinscripcionList;

    public Estudiante() {
    }

    public Estudiante(Long id) {
        this.id = id;
    }

    public Estudiante(Long id, String telefono, Date fechaRegistro, boolean activo) {
        this.id = id;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodMINED() {
        return codMINED;
    }

    public void setCodMINED(String codMINED) {
        this.codMINED = codMINED;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
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

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public List<Antecedenteenfestudiante> getAntecedenteenfestudianteList() {
        return antecedenteenfestudianteList;
    }

    public void setAntecedenteenfestudianteList(List<Antecedenteenfestudiante> antecedenteenfestudianteList) {
        this.antecedenteenfestudianteList = antecedenteenfestudianteList;
    }

    public List<Antecedentealergiaestudiante> getAntecedentealergiaestudianteList() {
        return antecedentealergiaestudianteList;
    }

    public void setAntecedentealergiaestudianteList(List<Antecedentealergiaestudiante> antecedentealergiaestudianteList) {
        this.antecedentealergiaestudianteList = antecedentealergiaestudianteList;
    }

    public List<Familiar> getFamiliarList() {
        return familiarList;
    }

    public void setFamiliarList(List<Familiar> familiarList) {
        this.familiarList = familiarList;
    }

    public List<Cursoinscripcion> getCursoinscripcionList() {
        return cursoinscripcionList;
    }

    public void setCursoinscripcionList(List<Cursoinscripcion> cursoinscripcionList) {
        this.cursoinscripcionList = cursoinscripcionList;
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
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Estudiante[ id=" + id + " ]";
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public List<Pagoestudiante> getPagoestudianteList() {
        return pagoestudianteList;
    }

    public void setPagoestudianteList(List<Pagoestudiante> pagoestudianteList) {
        this.pagoestudianteList = pagoestudianteList;
    }

    public List<Responsableestudiante> getResponsableestudianteList() {
        return responsableestudianteList;
    }

    public void setResponsableestudianteList(List<Responsableestudiante> responsableestudianteList) {
        this.responsableestudianteList = responsableestudianteList;
    }

    public List<Beca> getBecaList() {
        return becaList;
    }

    public void setBecaList(List<Beca> becaList) {
        this.becaList = becaList;
    }
    
}
