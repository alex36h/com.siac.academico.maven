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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "rol")
@NamedQueries({
    @NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r"),
    @NamedQuery(name = "Rol.findById", query = "SELECT r FROM Rol r WHERE r.id = :id"),
    @NamedQuery(name = "Rol.findByNombre", query = "SELECT r FROM Rol r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Rol.findByDescripcion", query = "SELECT r FROM Rol r WHERE r.descripcion = :descripcion"),
    @NamedQuery(name = "Rol.findByAccion", query = "SELECT r FROM Rol r WHERE r.accion = :accion"),
    @NamedQuery(name = "Rol.findByActivo", query = "SELECT r FROM Rol r WHERE r.activo = :activo")})
public class Rol implements Serializable {

    @OneToMany(mappedBy = "rol")
    private List<Rolcredencial> rolcredencialList;

    @ManyToMany(mappedBy = "rolList")
    private List<Credencial> credencialList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Accion")
    private String accion;
    @Column(name = "Activo")
    private Short activo;
    @OneToMany(mappedBy = "rol")
    private List<Rolgrupousuario> rolgrupousuarioList;
    @JoinColumn(name = "Grupo", referencedColumnName = "Id")
    @ManyToOne
    private Gruporol grupo;
    @Column(name = "Paquete")
    private String paquete;

    public Rol() {
    }

    public Rol(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public Short getActivo() {
        return activo;
    }

    public void setActivo(Short activo) {
        this.activo = activo;
    }

    public List<Rolgrupousuario> getRolgrupousuarioList() {
        return rolgrupousuarioList;
    }

    public void setRolgrupousuarioList(List<Rolgrupousuario> rolgrupousuarioList) {
        this.rolgrupousuarioList = rolgrupousuarioList;
    }

    public Gruporol getGrupo() {
        return grupo;
    }

    public void setGrupo(Gruporol grupo) {
        this.grupo = grupo;
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
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Rol[ id=" + id + " ]";
    }

    public List<Credencial> getCredencialList() {
        return credencialList;
    }

    public void setCredencialList(List<Credencial> credencialList) {
        this.credencialList = credencialList;
    }

    public List<Rolcredencial> getRolcredencialList() {
        return rolcredencialList;
    }

    public void setRolcredencialList(List<Rolcredencial> rolcredencialList) {
        this.rolcredencialList = rolcredencialList;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }
}
