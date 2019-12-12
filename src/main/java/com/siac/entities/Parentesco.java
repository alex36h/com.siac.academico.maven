/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.entities;

import java.io.Serializable;
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

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "parentesco")
@NamedQueries({
    @NamedQuery(name = "Parentesco.findAll", query = "SELECT p FROM Parentesco p"),
    @NamedQuery(name = "Parentesco.findById", query = "SELECT p FROM Parentesco p WHERE p.id = :id"),
    @NamedQuery(name = "Parentesco.findByParentesco", query = "SELECT p FROM Parentesco p WHERE p.parentesco = :parentesco"),
    @NamedQuery(name = "Parentesco.findByActivo", query = "SELECT p FROM Parentesco p WHERE p.activo = :activo")})
public class Parentesco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Parentesco")
    private String parentesco;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parentesco")
    private List<Familiar> familiarList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parentesco")
    private List<Responsableestudiante> responsableestudianteList;

    public Parentesco() {
    }

    public Parentesco(Long id) {
        this.id = id;
    }

    public Parentesco(Long id, String parentesco, boolean activo) {
        this.id = id;
        this.parentesco = parentesco;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Familiar> getFamiliarList() {
        return familiarList;
    }

    public void setFamiliarList(List<Familiar> familiarList) {
        this.familiarList = familiarList;
    }

    public List<Responsableestudiante> getResponsableestudianteList() {
        return responsableestudianteList;
    }

    public void setResponsableestudianteList(List<Responsableestudiante> responsableestudianteList) {
        this.responsableestudianteList = responsableestudianteList;
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
        if (!(object instanceof Parentesco)) {
            return false;
        }
        Parentesco other = (Parentesco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Parentesco[ id=" + id + " ]";
    }
    
}
