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
@Table(name = "cursoinscripcion")
@NamedQueries({
    @NamedQuery(name = "Cursoinscripcion.findAll", query = "SELECT c FROM Cursoinscripcion c"),
    @NamedQuery(name = "Cursoinscripcion.findById", query = "SELECT c FROM Cursoinscripcion c WHERE c.id = :id"),
    @NamedQuery(name = "Cursoinscripcion.findByEstudianteCarnet", query = "SELECT c FROM Cursoinscripcion c WHERE c.estudianteCarnet = :estudianteCarnet"),
    @NamedQuery(name = "Cursoinscripcion.findByCICalificacionIBimestre", query = "SELECT c FROM Cursoinscripcion c WHERE c.cICalificacionIBimestre = :cICalificacionIBimestre"),
    @NamedQuery(name = "Cursoinscripcion.findByCICalificacionIIBimestre", query = "SELECT c FROM Cursoinscripcion c WHERE c.cICalificacionIIBimestre = :cICalificacionIIBimestre"),
    @NamedQuery(name = "Cursoinscripcion.findByCICalificacionPrimedioIS", query = "SELECT c FROM Cursoinscripcion c WHERE c.cICalificacionPrimedioIS = :cICalificacionPrimedioIS"),
    @NamedQuery(name = "Cursoinscripcion.findByCICalificacionIIIBimestre", query = "SELECT c FROM Cursoinscripcion c WHERE c.cICalificacionIIIBimestre = :cICalificacionIIIBimestre"),
    @NamedQuery(name = "Cursoinscripcion.findByCICalificacionIVBimestre", query = "SELECT c FROM Cursoinscripcion c WHERE c.cICalificacionIVBimestre = :cICalificacionIVBimestre"),
    @NamedQuery(name = "Cursoinscripcion.findByCICalificacionPrimedioIIS", query = "SELECT c FROM Cursoinscripcion c WHERE c.cICalificacionPrimedioIIS = :cICalificacionPrimedioIIS"),
    @NamedQuery(name = "Cursoinscripcion.findByCICalificacionFinal", query = "SELECT c FROM Cursoinscripcion c WHERE c.cICalificacionFinal = :cICalificacionFinal"),
    @NamedQuery(name = "Cursoinscripcion.findByFechaInscripcion", query = "SELECT c FROM Cursoinscripcion c WHERE c.fechaInscripcion = :fechaInscripcion"),
    @NamedQuery(name = "Cursoinscripcion.findByCIAprobado", query = "SELECT c FROM Cursoinscripcion c WHERE c.cIAprobado = :cIAprobado"),
    @NamedQuery(name = "Cursoinscripcion.findByActivo", query = "SELECT c FROM Cursoinscripcion c WHERE c.activo = :activo"),
    @NamedQuery(name = "Cursoinscripcion.findLastByEst", query = "SELECT c FROM Cursoinscripcion c WHERE c.estudiante.carnet =:est ORDER BY c.id DESC"),
    @NamedQuery(name = "Cursoinscripcion.findAprobadoByEst", query = "SELECT c FROM Cursoinscripcion c WHERE c.estudiante.carnet =:estudiante AND c.cursos.añoLectivo.id =:anioLectivo AND (c.cIAprobado =:aprobado OR c.cIAprobado IS NULL)"),
    @NamedQuery(name = "Cursoinscripcion.findByISEM", query = "SELECT c.cursos FROM Cursoinscripcion c WHERE c.fechaInscripcion > :finicio AND c.fechaInscripcion < :ffin AND c.estudianteCarnet =:estudiante"),
    @NamedQuery(name = "Cursoinscripcion.findByEstudiante", query = "SELECT c.cursos FROM Cursoinscripcion c WHERE c.estudiante.carnet =:carnet AND c.cursos.añoLectivo.nombre like :anio"),
})
public class Cursoinscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "EstudianteCarnet")
    private String estudianteCarnet;
    @Column(name = "CICalificacionIBimestre")
    private Integer cICalificacionIBimestre;
    @Column(name = "CICalificacionIIBimestre")
    private Integer cICalificacionIIBimestre;
    @Column(name = "CICalificacionPrimedioIS")
    private Integer cICalificacionPrimedioIS;
    @Column(name = "CICalificacionIIIBimestre")
    private Integer cICalificacionIIIBimestre;
    @Column(name = "CICalificacionIVBimestre")
    private Integer cICalificacionIVBimestre;
    @Column(name = "CICalificacionPrimedioIIS")
    private Integer cICalificacionPrimedioIIS;
    @Column(name = "CICalificacionFinal")
    private Integer cICalificacionFinal;
    @Column(name = "FechaInscripcion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInscripcion;
    @Column(name = "CIAprobado")
    private Boolean cIAprobado;
    @Column(name = "Activo")
    private Boolean activo;
    @JoinColumns({
        @JoinColumn(name = "Credencial", referencedColumnName = "Codigo"),
        @JoinColumn(name = "Usuario", referencedColumnName = "Usuario")})
    @ManyToOne(optional = false)
    private Credencial credencial;
    @JoinColumn(name = "Cursos", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Cursos cursos;
    @JoinColumn(name = "Estudiante", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Estudiante estudiante;

    public Cursoinscripcion() {
    }

    public Cursoinscripcion(Long id) {
        this.id = id;
    }

    public Cursoinscripcion(Long id, String estudianteCarnet) {
        this.id = id;
        this.estudianteCarnet = estudianteCarnet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstudianteCarnet() {
        return estudianteCarnet;
    }

    public void setEstudianteCarnet(String estudianteCarnet) {
        this.estudianteCarnet = estudianteCarnet;
    }

    public Integer getCICalificacionIBimestre() {
        return cICalificacionIBimestre;
    }

    public void setCICalificacionIBimestre(Integer cICalificacionIBimestre) {
        this.cICalificacionIBimestre = cICalificacionIBimestre;
    }

    public Integer getCICalificacionIIBimestre() {
        return cICalificacionIIBimestre;
    }

    public void setCICalificacionIIBimestre(Integer cICalificacionIIBimestre) {
        this.cICalificacionIIBimestre = cICalificacionIIBimestre;
    }

    public Integer getCICalificacionPrimedioIS() {
        return cICalificacionPrimedioIS;
    }

    public void setCICalificacionPrimedioIS(Integer cICalificacionPrimedioIS) {
        this.cICalificacionPrimedioIS = cICalificacionPrimedioIS;
    }

    public Integer getCICalificacionIIIBimestre() {
        return cICalificacionIIIBimestre;
    }

    public void setCICalificacionIIIBimestre(Integer cICalificacionIIIBimestre) {
        this.cICalificacionIIIBimestre = cICalificacionIIIBimestre;
    }

    public Integer getCICalificacionIVBimestre() {
        return cICalificacionIVBimestre;
    }

    public void setCICalificacionIVBimestre(Integer cICalificacionIVBimestre) {
        this.cICalificacionIVBimestre = cICalificacionIVBimestre;
    }

    public Integer getCICalificacionPrimedioIIS() {
        return cICalificacionPrimedioIIS;
    }

    public void setCICalificacionPrimedioIIS(Integer cICalificacionPrimedioIIS) {
        this.cICalificacionPrimedioIIS = cICalificacionPrimedioIIS;
    }

    public Integer getCICalificacionFinal() {
        return cICalificacionFinal;
    }

    public void setCICalificacionFinal(Integer cICalificacionFinal) {
        this.cICalificacionFinal = cICalificacionFinal;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Boolean getCIAprobado() {
        return cIAprobado;
    }

    public void setCIAprobado(Boolean cIAprobado) {
        this.cIAprobado = cIAprobado;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
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
        if (!(object instanceof Cursoinscripcion)) {
            return false;
        }
        Cursoinscripcion other = (Cursoinscripcion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Cursoinscripcion[ id=" + id + " ]";
    }
    
}
