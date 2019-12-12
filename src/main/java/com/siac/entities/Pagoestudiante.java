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
@Table(name = "pagoestudiante")
@NamedQueries({
    @NamedQuery(name = "Pagoestudiante.findAll", query = "SELECT p FROM Pagoestudiante p"),
    @NamedQuery(name = "Pagoestudiante.findEstudianteByDistinct", query = "SELECT DISTINCT p.estudiante.carnet FROM Pagoestudiante p"),
    @NamedQuery(name = "Pagoestudiante.findByEstudiante", query = "SELECT p FROM Pagoestudiante p WHERE p.estudiante.carnet = :estudiante and p.pagado IS NULL ORDER BY p.id ASC"),
    @NamedQuery(name = "Pagoestudiante.findByEstudianteAnio", query = "SELECT p FROM Pagoestudiante p WHERE p.estudiante.carnet = :estudiante and p.anio = :anio ORDER BY p.id ASC"),
    @NamedQuery(name = "Pagoestudiante.findById", query = "SELECT p FROM Pagoestudiante p WHERE p.id = :id"),
    @NamedQuery(name = "Pagoestudiante.findByMes", query = "SELECT p FROM Pagoestudiante p WHERE p.mes = :mes"),
    @NamedQuery(name = "Pagoestudiante.findByEstudianteROC", query = "SELECT p FROM Pagoestudiante p WHERE p.estudiante.carnet =:carnet and p.recibo.id =:roc"),
    @NamedQuery(name = "Pagoestudiante.findByEstado", query = "SELECT COUNT(p.pagado) FROM Pagoestudiante p WHERE p.anio = :anio and p.mes = :mes and p.pagado = :pagado GROUP BY p.arancel,p.mes,p.pagado"),
    @NamedQuery(name = "Pagoestudiante.findByAnio", query = "SELECT p FROM Pagoestudiante p WHERE p.anio = :anio"),
    @NamedQuery(name = "Pagoestudiante.findByPagado", query = "SELECT p FROM Pagoestudiante p WHERE p.pagado = :pagado"),
    @NamedQuery(name = "Pagoestudiante.findByTipoCancelacion", query = "SELECT p FROM Pagoestudiante p WHERE p.tipoCancelacion = :tipoCancelacion")})
public class Pagoestudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Mes")
    private int mes;
    @Basic(optional = false)
    @Column(name = "Anio")
    private int anio;
    @Column(name = "Pagado")
    private Boolean pagado;
    @Column(name = "TipoCancelacion")
    private Integer tipoCancelacion;
    @JoinColumn(name = "Arancel", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Arancel arancel;
    @JoinColumn(name = "Estudiante", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Estudiante estudiante;
    @JoinColumn(name = "Recibo", referencedColumnName = "Id")
    @ManyToOne
    private Recibo recibo;

    public Pagoestudiante() {
    }

    public Pagoestudiante(Long id) {
        this.id = id;
    }

    public Pagoestudiante(Long id, int mes, int anio) {
        this.id = id;
        this.mes = mes;
        this.anio = anio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    public Integer getTipoCancelacion() {
        return tipoCancelacion;
    }

    public void setTipoCancelacion(Integer tipoCancelacion) {
        this.tipoCancelacion = tipoCancelacion;
    }

    public Arancel getArancel() {
        return arancel;
    }

    public void setArancel(Arancel arancel) {
        this.arancel = arancel;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
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
        if (!(object instanceof Pagoestudiante)) {
            return false;
        }
        Pagoestudiante other = (Pagoestudiante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Pagoestudiante[ id=" + id + " ]";
    }
    
}
