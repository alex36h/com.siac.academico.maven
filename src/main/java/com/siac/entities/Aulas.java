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
@Table(name = "aulas")
@NamedQueries({
    @NamedQuery(name = "Aulas.findAll", query = "SELECT a FROM Aulas a"),
    @NamedQuery(name = "Aulas.findById", query = "SELECT a FROM Aulas a WHERE a.id = :id"),
    @NamedQuery(name = "Aulas.findByNombre", query = "SELECT a FROM Aulas a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Aulas.findByDescripcion", query = "SELECT a FROM Aulas a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Aulas.findByCapacidad", query = "SELECT a FROM Aulas a WHERE a.capacidad = :capacidad"),
    @NamedQuery(name = "Aulas.findByUbicacion", query = "SELECT a FROM Aulas a WHERE a.ubicacion = :ubicacion"),
    @NamedQuery(name = "Aulas.findByActivo", query = "SELECT a FROM Aulas a WHERE a.activo = :activo")})
public class Aulas implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aula")
    private List<Cursos> cursosList;

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
    @Column(name = "Capacidad")
    private int capacidad;
    @Basic(optional = false)
    @Column(name = "Ubicacion")
    private String ubicacion;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;

    public Aulas() {
    }

    public Aulas(Long id) {
        this.id = id;
    }

    public Aulas(Long id, String nombre, int capacidad, String ubicacion, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
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
        if (!(object instanceof Aulas)) {
            return false;
        }
        Aulas other = (Aulas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Aulas[ id=" + id + " ]";
    }

    public List<Cursos> getCursosList() {
        return cursosList;
    }

    public void setCursosList(List<Cursos> cursosList) {
        this.cursosList = cursosList;
    }
    
}
