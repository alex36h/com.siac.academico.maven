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
@Table(name = "persona")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findAllNotStd", query = "SELECT p FROM Persona p WHERE p.codigo NOT IN :ids"),
    @NamedQuery(name = "Persona.findByCodigo", query = "SELECT p FROM Persona p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Persona.findByIdentificacion", query = "SELECT p FROM Persona p WHERE p.identificacion = :identificacion"),
    @NamedQuery(name = "Persona.findByNombre", query = "SELECT p FROM Persona p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Persona.findByApellido", query = "SELECT p FROM Persona p WHERE p.apellido = :apellido"),
    @NamedQuery(name = "Persona.findByFechaNacimiento", query = "SELECT p FROM Persona p WHERE p.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Persona.findByDescripcion", query = "SELECT p FROM Persona p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Persona.findByTelefono", query = "SELECT p FROM Persona p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Persona.findByCorreo", query = "SELECT p FROM Persona p WHERE p.correo = :correo"),
    @NamedQuery(name = "Persona.findByGenero", query = "SELECT p FROM Persona p WHERE p.genero = :genero"),
    @NamedQuery(name = "Persona.findByDireccion", query = "SELECT p FROM Persona p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Persona.findByObservaciones", query = "SELECT p FROM Persona p WHERE p.observaciones = :observaciones"),
    @NamedQuery(name = "Persona.findByActivo", query = "SELECT p FROM Persona p WHERE p.activo = :activo")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Codigo")
    private Long codigo;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<Estudiante> estudianteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "docente")
    private List<Cursos> cursosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<Docentetrabajoanterior> docentetrabajoanteriorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<Docente> docenteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<Familiar> familiarList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<Credencial> credencialList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colaborador")
    private List<Cargosempleado> cargosempleadoList;

    public Persona() {
    }

    public Persona(Long codigo) {
        this.codigo = codigo;
    }

    public Persona(Long codigo, String identificacion, String nombre, String apellido, Date fechaNacimiento, boolean genero, boolean activo) {
        this.codigo = codigo;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.activo = activo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre.toUpperCase();
    }
    
    public String getNombreCompleto() {
        return (nombre+" "+apellido).toUpperCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido.toUpperCase();
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

    public List<Estudiante> getEstudianteList() {
        return estudianteList;
    }

    public void setEstudianteList(List<Estudiante> estudianteList) {
        this.estudianteList = estudianteList;
    }

    public List<Cursos> getCursosList() {
        return cursosList;
    }

    public void setCursosList(List<Cursos> cursosList) {
        this.cursosList = cursosList;
    }

    public List<Docentetrabajoanterior> getDocentetrabajoanteriorList() {
        return docentetrabajoanteriorList;
    }

    public void setDocentetrabajoanteriorList(List<Docentetrabajoanterior> docentetrabajoanteriorList) {
        this.docentetrabajoanteriorList = docentetrabajoanteriorList;
    }

    public List<Docente> getDocenteList() {
        return docenteList;
    }

    public void setDocenteList(List<Docente> docenteList) {
        this.docenteList = docenteList;
    }

    public List<Familiar> getFamiliarList() {
        return familiarList;
    }

    public void setFamiliarList(List<Familiar> familiarList) {
        this.familiarList = familiarList;
    }

    public List<Credencial> getCredencialList() {
        return credencialList;
    }

    public void setCredencialList(List<Credencial> credencialList) {
        this.credencialList = credencialList;
    }

    public List<Cargosempleado> getCargosempleadoList() {
        return cargosempleadoList;
    }

    public void setCargosempleadoList(List<Cargosempleado> cargosempleadoList) {
        this.cargosempleadoList = cargosempleadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Persona[ codigo=" + codigo + " ]";
    }
    
}
