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
@Table(name = "rolgrupousuario")
@NamedQueries({
    @NamedQuery(name = "Rolgrupousuario.findAll", query = "SELECT r FROM Rolgrupousuario r"),
    @NamedQuery(name = "Rolgrupousuario.findByGrupo", query = "SELECT r FROM Rolgrupousuario r WHERE r.grupo.codigo =:grupo"),
    @NamedQuery(name = "Rolgrupousuario.findById", query = "SELECT r FROM Rolgrupousuario r WHERE r.id = :id")})
public class Rolgrupousuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @JoinColumn(name = "Grupo", referencedColumnName = "codigo")
    @ManyToOne
    private Grupo grupo;
    @JoinColumn(name = "Rol", referencedColumnName = "Id")
    @ManyToOne
    private Rol rol;

    public Rolgrupousuario() {
    }

    public Rolgrupousuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
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
        if (!(object instanceof Rolgrupousuario)) {
            return false;
        }
        Rolgrupousuario other = (Rolgrupousuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Rolgrupousuario[ id=" + id + " ]";
    }
    
}
