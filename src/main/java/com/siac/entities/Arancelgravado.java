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
@Table(name = "arancelgravado")
@NamedQueries({
    @NamedQuery(name = "Arancelgravado.findAll", query = "SELECT a FROM Arancelgravado a"),
    @NamedQuery(name = "Arancelgravado.findById", query = "SELECT a FROM Arancelgravado a WHERE a.id = :id"),
    @NamedQuery(name = "Arancelgravado.findBySemestre", query = "SELECT a FROM Arancelgravado a WHERE a.semestre = :semestre"),
    @NamedQuery(name = "Arancelgravado.findByActivo", query = "SELECT a FROM Arancelgravado a WHERE a.activo = :activo")})
public class Arancelgravado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Semestre")
    private String semestre;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @JoinColumn(name = "Arancel", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Arancel arancel;

    public Arancelgravado() {
    }

    public Arancelgravado(Integer id) {
        this.id = id;
    }

    public Arancelgravado(Integer id, String semestre, boolean activo) {
        this.id = id;
        this.semestre = semestre;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
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
        if (!(object instanceof Arancelgravado)) {
            return false;
        }
        Arancelgravado other = (Arancelgravado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Arancelgravado[ id=" + id + " ]";
    }
    
}
