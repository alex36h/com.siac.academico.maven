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
@Table(name = "docentetrabajoanterior")
@NamedQueries({
    @NamedQuery(name = "Docentetrabajoanterior.findAll", query = "SELECT d FROM Docentetrabajoanterior d"),
    @NamedQuery(name = "Docentetrabajoanterior.findById", query = "SELECT d FROM Docentetrabajoanterior d WHERE d.id = :id"),
    @NamedQuery(name = "Docentetrabajoanterior.findByDuracion", query = "SELECT d FROM Docentetrabajoanterior d WHERE d.duracion = :duracion"),
    @NamedQuery(name = "Docentetrabajoanterior.findByLaborEjercida", query = "SELECT d FROM Docentetrabajoanterior d WHERE d.laborEjercida = :laborEjercida"),
    @NamedQuery(name = "Docentetrabajoanterior.findByObservaciones", query = "SELECT d FROM Docentetrabajoanterior d WHERE d.observaciones = :observaciones"),
    @NamedQuery(name = "Docentetrabajoanterior.findByRecomendaciones", query = "SELECT d FROM Docentetrabajoanterior d WHERE d.recomendaciones = :recomendaciones")})
public class Docentetrabajoanterior implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Column(name = "Duracion")
    private String duracion;
    @Column(name = "LaborEjercida")
    private String laborEjercida;
    @Column(name = "Observaciones")
    private String observaciones;
    @Column(name = "Recomendaciones")
    private String recomendaciones;
    @JoinColumn(name = "Colegio", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Colegio colegio;
    @JoinColumn(name = "Persona", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private Persona persona;

    public Docentetrabajoanterior() {
    }

    public Docentetrabajoanterior(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getLaborEjercida() {
        return laborEjercida;
    }

    public void setLaborEjercida(String laborEjercida) {
        this.laborEjercida = laborEjercida;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
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
        if (!(object instanceof Docentetrabajoanterior)) {
            return false;
        }
        Docentetrabajoanterior other = (Docentetrabajoanterior) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Docentetrabajoanterior[ id=" + id + " ]";
    }
    
}
