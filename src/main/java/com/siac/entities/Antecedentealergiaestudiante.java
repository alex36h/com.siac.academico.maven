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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "antecedentealergiaestudiante")
@NamedQueries({
    @NamedQuery(name = "Antecedentealergiaestudiante.findAll", query = "SELECT a FROM Antecedentealergiaestudiante a"),
    @NamedQuery(name = "Antecedentealergiaestudiante.findById", query = "SELECT a FROM Antecedentealergiaestudiante a WHERE a.id = :id"),
    @NamedQuery(name = "Antecedentealergiaestudiante.findByFrecuencia", query = "SELECT a FROM Antecedentealergiaestudiante a WHERE a.frecuencia = :frecuencia"),
    @NamedQuery(name = "Antecedentealergiaestudiante.findByDiagnosticoAlergia", query = "SELECT a FROM Antecedentealergiaestudiante a WHERE a.diagnosticoAlergia = :diagnosticoAlergia"),
    @NamedQuery(name = "Antecedentealergiaestudiante.findByMedicamentos", query = "SELECT a FROM Antecedentealergiaestudiante a WHERE a.medicamentos = :medicamentos")})
public class Antecedentealergiaestudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Frecuencia")
    private String frecuencia;
    @Column(name = "DiagnosticoAlergia")
    private String diagnosticoAlergia;
    @Basic(optional = false)
    @Column(name = "Medicamentos")
    private String medicamentos;
    @JoinColumn(name = "Alergia", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Alergia alergia;
    @JoinColumn(name = "Estudiante", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Estudiante estudiante;

    public Antecedentealergiaestudiante() {
    }

    public Antecedentealergiaestudiante(Long id) {
        this.id = id;
    }

    public Antecedentealergiaestudiante(Long id, String frecuencia, String medicamentos) {
        this.id = id;
        this.frecuencia = frecuencia;
        this.medicamentos = medicamentos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getDiagnosticoAlergia() {
        return diagnosticoAlergia;
    }

    public void setDiagnosticoAlergia(String diagnosticoAlergia) {
        this.diagnosticoAlergia = diagnosticoAlergia;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Alergia getAlergia() {
        return alergia;
    }

    public void setAlergia(Alergia alergia) {
        this.alergia = alergia;
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
        if (!(object instanceof Antecedentealergiaestudiante)) {
            return false;
        }
        Antecedentealergiaestudiante other = (Antecedentealergiaestudiante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Antecedentealergiaestudiante[ id=" + id + " ]";
    }
    
}
