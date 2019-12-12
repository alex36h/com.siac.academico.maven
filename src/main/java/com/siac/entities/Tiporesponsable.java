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
@Table(name = "tiporesponsable")
@NamedQueries({
    @NamedQuery(name = "Tiporesponsable.findAll", query = "SELECT t FROM Tiporesponsable t"),
    @NamedQuery(name = "Tiporesponsable.findById", query = "SELECT t FROM Tiporesponsable t WHERE t.id = :id"),
    @NamedQuery(name = "Tiporesponsable.findByTipoResponsable", query = "SELECT t FROM Tiporesponsable t WHERE t.tipoResponsable = :tipoResponsable"),
    @NamedQuery(name = "Tiporesponsable.findByDescripcion", query = "SELECT t FROM Tiporesponsable t WHERE t.descripcion = :descripcion")})
public class Tiporesponsable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Column(name = "TipoResponsable")
    private String tipoResponsable;
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoResponsable")
    private List<Familiar> familiarList;

    public Tiporesponsable() {
    }

    public Tiporesponsable(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoResponsable() {
        return tipoResponsable;
    }

    public void setTipoResponsable(String tipoResponsable) {
        this.tipoResponsable = tipoResponsable;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Familiar> getFamiliarList() {
        return familiarList;
    }

    public void setFamiliarList(List<Familiar> familiarList) {
        this.familiarList = familiarList;
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
        if (!(object instanceof Tiporesponsable)) {
            return false;
        }
        Tiporesponsable other = (Tiporesponsable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Tiporesponsable[ id=" + id + " ]";
    }
    
}
