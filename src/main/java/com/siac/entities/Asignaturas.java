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
import javax.persistence.JoinColumns;
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
@Table(name = "asignaturas")
@NamedQueries({
    @NamedQuery(name = "Asignaturas.findAll", query = "SELECT a FROM Asignaturas a"),
    @NamedQuery(name = "Asignaturas.findById", query = "SELECT a FROM Asignaturas a WHERE a.id = :id"),
    @NamedQuery(name = "Asignaturas.findByNombre", query = "SELECT a FROM Asignaturas a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Asignaturas.findByDescripcion", query = "SELECT a FROM Asignaturas a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Asignaturas.findByActivo", query = "SELECT a FROM Asignaturas a WHERE a.activo = :activo")})
public class Asignaturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "asignaturas")
    private List<Cursos> cursosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "asignaturas")
    private List<Planestudiosdetalle> planestudiosdetalleList;
    @JoinColumns({
        @JoinColumn(name = "Credencial", referencedColumnName = "Codigo"),
        @JoinColumn(name = "Usuario", referencedColumnName = "Usuario")})
    @ManyToOne(optional = false)
    private Credencial credencial;

    public Asignaturas() {
    }

    public Asignaturas(Long id) {
        this.id = id;
    }

    public Asignaturas(Long id, String nombre, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre.toUpperCase();
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

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Cursos> getCursosList() {
        return cursosList;
    }

    public void setCursosList(List<Cursos> cursosList) {
        this.cursosList = cursosList;
    }

    public List<Planestudiosdetalle> getPlanestudiosdetalleList() {
        return planestudiosdetalleList;
    }

    public void setPlanestudiosdetalleList(List<Planestudiosdetalle> planestudiosdetalleList) {
        this.planestudiosdetalleList = planestudiosdetalleList;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
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
        if (!(object instanceof Asignaturas)) {
            return false;
        }
        Asignaturas other = (Asignaturas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Asignaturas[ id=" + id + " ]";
    }
    
}
