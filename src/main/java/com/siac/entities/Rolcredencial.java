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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "rolcredencial")
@NamedQueries({
    @NamedQuery(name = "Rolcredencial.findAll", query = "SELECT r FROM Rolcredencial r"),
    @NamedQuery(name = "Rolcredencial.getMenusByCredencial",
    query = "SELECT gr FROM Rolcredencial rc, Rol r, Gruporol gr where rc.rol.id = r.id and gr.id = r.grupo.id and rc.credencial.credencialPK.codigo =:credencial GROUP BY gr.nombre ORDER BY gr.nombre"),        
    @NamedQuery(name = "Rolcredencial.getFormsByCredencial",
    query = "SELECT r FROM Rolcredencial rc, Rol r where rc.rol.id = r.id and rc.credencial.credencialPK.codigo =:credencial GROUP BY r.nombre ORDER BY r.nombre"),        
    @NamedQuery(name = "Rolcredencial.findById", query = "SELECT r FROM Rolcredencial r WHERE r.id = :id")})
public class Rolcredencial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumns({
        @JoinColumn(name = "Credencial", referencedColumnName = "Codigo"),
        @JoinColumn(name = "Usuario", referencedColumnName = "Usuario")})
    @ManyToOne
    private Credencial credencial;
    @JoinColumn(name = "Rol", referencedColumnName = "Id")
    @ManyToOne
    private Rol rol;

    public Rolcredencial() {
    }

    public Rolcredencial(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
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
        if (!(object instanceof Rolcredencial)) {
            return false;
        }
        Rolcredencial other = (Rolcredencial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Rolcredencial[ id=" + id + " ]";
    }
    
}
