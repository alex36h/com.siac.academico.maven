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
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "prematricula")
@NamedQueries({
    @NamedQuery(name = "Prematricula.findAll", query = "SELECT p FROM Prematricula p"),
    @NamedQuery(name = "Prematricula.findById", query = "SELECT p FROM Prematricula p WHERE p.id = :id"),
    @NamedQuery(name = "Prematricula.findByIdentificacion", query = "SELECT p FROM Prematricula p WHERE p.identificacion = :identificacion"),
    @NamedQuery(name = "Prematricula.findByNombre", query = "SELECT p FROM Prematricula p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Prematricula.findByApellido", query = "SELECT p FROM Prematricula p WHERE p.apellido = :apellido"),
    @NamedQuery(name = "Prematricula.findByFechaNacimiento", query = "SELECT p FROM Prematricula p WHERE p.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Prematricula.findByTelefono", query = "SELECT p FROM Prematricula p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Prematricula.findByCorreo", query = "SELECT p FROM Prematricula p WHERE p.correo = :correo"),
    @NamedQuery(name = "Prematricula.findByGenero", query = "SELECT p FROM Prematricula p WHERE p.genero = :genero"),
    @NamedQuery(name = "Prematricula.findByDireccion", query = "SELECT p FROM Prematricula p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Prematricula.findByObservaciones", query = "SELECT p FROM Prematricula p WHERE p.observaciones = :observaciones"),
    @NamedQuery(name = "Prematricula.findByActivo", query = "SELECT p FROM Prematricula p WHERE p.activo = :activo")})
public class Prematricula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Identificacion")
    private String identificacion;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "Apellido")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "Genero")
    private boolean genero;
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "Observaciones")
    private String observaciones;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @JoinColumn(name = "ResponsableEstudiantePreMatricula", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Responsableestudianteprematricula responsableEstudiantePreMatricula;

    public Prematricula() {
    }

    public Prematricula(Long id) {
        this.id = id;
    }

    public Prematricula(Long id, String identificacion, String nombre, String apellido, Date fechaNacimiento, boolean genero, boolean activo) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean getGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Responsableestudianteprematricula getResponsableEstudiantePreMatricula() {
        return responsableEstudiantePreMatricula;
    }

    public void setResponsableEstudiantePreMatricula(Responsableestudianteprematricula responsableEstudiantePreMatricula) {
        this.responsableEstudiantePreMatricula = responsableEstudiantePreMatricula;
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
        if (!(object instanceof Prematricula)) {
            return false;
        }
        Prematricula other = (Prematricula) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Prematricula[ id=" + id + " ]";
    }
    
}
