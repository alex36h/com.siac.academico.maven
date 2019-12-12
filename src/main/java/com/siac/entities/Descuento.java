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
@Table(name = "descuento")
@NamedQueries({
    @NamedQuery(name = "Descuento.findAll", query = "SELECT d FROM Descuento d")
    , @NamedQuery(name = "Descuento.findByMesPeriodo", query = "SELECT SUM(d.porcentaje) FROM Descuento d WHERE d.arancel.id IN :ids")
    , @NamedQuery(name = "Descuento.findById", query = "SELECT d FROM Descuento d WHERE d.id = :id")
    , @NamedQuery(name = "Descuento.findByPorcentaje", query = "SELECT d FROM Descuento d WHERE d.porcentaje = :porcentaje")
    , @NamedQuery(name = "Descuento.findByEstudiante", query = "SELECT d FROM Descuento d WHERE d.estudiante = :estudiante")
    , @NamedQuery(name = "Descuento.findByEstudianteArancel", query = "SELECT d FROM Descuento d WHERE d.estudiante = :estudiante and d.arancel.id =:arancel")
    , @NamedQuery(name = "Descuento.findByFecha", query = "SELECT d FROM Descuento d WHERE d.fecha = :fecha")
    , @NamedQuery(name = "Descuento.findByUsado", query = "SELECT d FROM Descuento d WHERE d.usado = :usado")})
public class Descuento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Porcentaje")
    private double porcentaje;
    @Basic(optional = false)
    @Column(name = "Estudiante")
    private String estudiante;
    @Basic(optional = false)
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "Usado")
    private boolean usado;
    @JoinColumn(name = "Arancel", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Arancel arancel;

    public Descuento() {
    }

    public Descuento(Long id) {
        this.id = id;
    }

    public Descuento(Long id, double porcentaje, String estudiante, Date fecha, boolean usado) {
        this.id = id;
        this.porcentaje = porcentaje;
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.usado = usado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean getUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public Arancel getArancel() {
        return arancel;
    }

    public void setArancel(Arancel arancel) {
        this.arancel = arancel;
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
        if (!(object instanceof Descuento)) {
            return false;
        }
        Descuento other = (Descuento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Descuento[ id=" + id + " ]";
    }
    
}
