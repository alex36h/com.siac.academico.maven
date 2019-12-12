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
@Table(name = "mensualidadesperiodo")
@NamedQueries({
    @NamedQuery(name = "Mensualidadesperiodo.findAll", query = "SELECT m FROM Mensualidadesperiodo m"),
    @NamedQuery(name = "Mensualidadesperiodo.findById", query = "SELECT m FROM Mensualidadesperiodo m WHERE m.id = :id"),
    @NamedQuery(name = "Mensualidadesperiodo.findByMes", query = "SELECT m FROM Mensualidadesperiodo m WHERE m.mes = :mes"),
    @NamedQuery(name = "Mensualidadesperiodo.findByMesAnio", query = "SELECT m FROM Mensualidadesperiodo m WHERE m.mes >= :mes1 AND m.mes <= :mes2 AND m.anio =:anio"),
    @NamedQuery(name = "Mensualidadesperiodo.findByAnio", query = "SELECT m FROM Mensualidadesperiodo m WHERE m.anio = :anio"),
    @NamedQuery(name = "Mensualidadesperiodo.findByAnioII", query = "SELECT m.arancel.id FROM Mensualidadesperiodo m WHERE m.anio = :anio"),
    @NamedQuery(name = "Mensualidadesperiodo.findByActivo", query = "SELECT m FROM Mensualidadesperiodo m WHERE m.activo = :activo")})
public class Mensualidadesperiodo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "mes")
    private int mes;
    @Basic(optional = false)
    @Column(name = "anio")
    private int anio;
    @Column(name = "activo")
    private Boolean activo;
    @JoinColumn(name = "arancel", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Arancel arancel;

    public Mensualidadesperiodo() {
    }

    public Mensualidadesperiodo(Integer id) {
        this.id = id;
    }

    public Mensualidadesperiodo(Integer id, int mes, int anio) {
        this.id = id;
        this.mes = mes;
        this.anio = anio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
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
        if (!(object instanceof Mensualidadesperiodo)) {
            return false;
        }
        Mensualidadesperiodo other = (Mensualidadesperiodo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Mensualidadesperiodo[ id=" + id + " ]";
    }
    
}
