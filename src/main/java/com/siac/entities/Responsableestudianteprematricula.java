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
@Table(name = "responsableestudianteprematricula")
@NamedQueries({
    @NamedQuery(name = "Responsableestudianteprematricula.findAll", query = "SELECT r FROM Responsableestudianteprematricula r"),
    @NamedQuery(name = "Responsableestudianteprematricula.findById", query = "SELECT r FROM Responsableestudianteprematricula r WHERE r.id = :id"),
    @NamedQuery(name = "Responsableestudianteprematricula.findByEstudiante", query = "SELECT r FROM Responsableestudianteprematricula r WHERE r.estudiante = :estudiante"),
    @NamedQuery(name = "Responsableestudianteprematricula.findByIdentificacion", query = "SELECT r FROM Responsableestudianteprematricula r WHERE r.identificacion = :identificacion"),
    @NamedQuery(name = "Responsableestudianteprematricula.findByNombre", query = "SELECT r FROM Responsableestudianteprematricula r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Responsableestudianteprematricula.findByApellido", query = "SELECT r FROM Responsableestudianteprematricula r WHERE r.apellido = :apellido"),
    @NamedQuery(name = "Responsableestudianteprematricula.findByFechaNacimiento", query = "SELECT r FROM Responsableestudianteprematricula r WHERE r.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Responsableestudianteprematricula.findByDescripcion", query = "SELECT r FROM Responsableestudianteprematricula r WHERE r.descripcion = :descripcion"),
    @NamedQuery(name = "Responsableestudianteprematricula.findByTelefono", query = "SELECT r FROM Responsableestudianteprematricula r WHERE r.telefono = :telefono"),
    @NamedQuery(name = "Responsableestudianteprematricula.findByCorreo", query = "SELECT r FROM Responsableestudianteprematricula r WHERE r.correo = :correo"),
    @NamedQuery(name = "Responsableestudianteprematricula.findByGenero", query = "SELECT r FROM Responsableestudianteprematricula r WHERE r.genero = :genero"),
    @NamedQuery(name = "Responsableestudianteprematricula.findByDireccion", query = "SELECT r FROM Responsableestudianteprematricula r WHERE r.direccion = :direccion"),
    @NamedQuery(name = "Responsableestudianteprematricula.findByObservaciones", query = "SELECT r FROM Responsableestudianteprematricula r WHERE r.observaciones = :observaciones"),
    @NamedQuery(name = "Responsableestudianteprematricula.findByActivo", query = "SELECT r FROM Responsableestudianteprematricula r WHERE r.activo = :activo")})
public class Responsableestudianteprematricula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Estudiante")
    private long estudiante;
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
    @Column(name = "Descripcion")
    private String descripcion;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "responsableEstudiantePreMatricula")
    private List<Prematricula> prematriculaList;

    public Responsableestudianteprematricula() {
    }

    public Responsableestudianteprematricula(Long id) {
        this.id = id;
    }

    public Responsableestudianteprematricula(Long id, long estudiante, String identificacion, String nombre, String apellido, Date fechaNacimiento, boolean genero, boolean activo) {
        this.id = id;
        this.estudiante = estudiante;
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

    public long getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(long estudiante) {
        this.estudiante = estudiante;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public List<Prematricula> getPrematriculaList() {
        return prematriculaList;
    }

    public void setPrematriculaList(List<Prematricula> prematriculaList) {
        this.prematriculaList = prematriculaList;
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
        if (!(object instanceof Responsableestudianteprematricula)) {
            return false;
        }
        Responsableestudianteprematricula other = (Responsableestudianteprematricula) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Responsableestudianteprematricula[ id=" + id + " ]";
    }
    
}
