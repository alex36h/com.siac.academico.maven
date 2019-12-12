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
@Table(name = "antecedenteenfestudiante")
@NamedQueries({
    @NamedQuery(name = "Antecedenteenfestudiante.findAll", query = "SELECT a FROM Antecedenteenfestudiante a"),
    @NamedQuery(name = "Antecedenteenfestudiante.findById", query = "SELECT a FROM Antecedenteenfestudiante a WHERE a.id = :id"),
    @NamedQuery(name = "Antecedenteenfestudiante.findByDiagnosticoEnfermedad", query = "SELECT a FROM Antecedenteenfestudiante a WHERE a.diagnosticoEnfermedad = :diagnosticoEnfermedad"),
    @NamedQuery(name = "Antecedenteenfestudiante.findByFechaUltimaRecaida", query = "SELECT a FROM Antecedenteenfestudiante a WHERE a.fechaUltimaRecaida = :fechaUltimaRecaida"),
    @NamedQuery(name = "Antecedenteenfestudiante.findByMedicamentos", query = "SELECT a FROM Antecedenteenfestudiante a WHERE a.medicamentos = :medicamentos"),
    @NamedQuery(name = "Antecedenteenfestudiante.findByEstadoEnfermedad", query = "SELECT a FROM Antecedenteenfestudiante a WHERE a.estadoEnfermedad = :estadoEnfermedad")})
public class Antecedenteenfestudiante implements Serializable {

    @Basic(optional = false)
    @Column(name = "EstadoEnfermedad")
    private boolean estadoEnfermedad;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Column(name = "DiagnosticoEnfermedad")
    private String diagnosticoEnfermedad;
    @Column(name = "FechaUltimaRecaida")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaRecaida;
    @Basic(optional = false)
    @Column(name = "Medicamentos")
    private String medicamentos;
    @JoinColumn(name = "Enfermedad", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Enfermedad enfermedad;
    @JoinColumn(name = "Estudiante", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Estudiante estudiante;

    public Antecedenteenfestudiante() {
    }

    public Antecedenteenfestudiante(Long id) {
        this.id = id;
    }

    public Antecedenteenfestudiante(Long id, String medicamentos, boolean estadoEnfermedad) {
        this.id = id;
        this.medicamentos = medicamentos;
        this.estadoEnfermedad = estadoEnfermedad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiagnosticoEnfermedad() {
        return diagnosticoEnfermedad;
    }

    public void setDiagnosticoEnfermedad(String diagnosticoEnfermedad) {
        this.diagnosticoEnfermedad = diagnosticoEnfermedad;
    }

    public Date getFechaUltimaRecaida() {
        return fechaUltimaRecaida;
    }

    public void setFechaUltimaRecaida(Date fechaUltimaRecaida) {
        this.fechaUltimaRecaida = fechaUltimaRecaida;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }


    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
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
        if (!(object instanceof Antecedenteenfestudiante)) {
            return false;
        }
        Antecedenteenfestudiante other = (Antecedenteenfestudiante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Antecedenteenfestudiante[ id=" + id + " ]";
    }

    public boolean getEstadoEnfermedad() {
        return estadoEnfermedad;
    }

    public void setEstadoEnfermedad(boolean estadoEnfermedad) {
        this.estadoEnfermedad = estadoEnfermedad;
    }
    
}
