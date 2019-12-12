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
@Table(name = "enfermedad")
@NamedQueries({
    @NamedQuery(name = "Enfermedad.findAll", query = "SELECT e FROM Enfermedad e"),
    @NamedQuery(name = "Enfermedad.findById", query = "SELECT e FROM Enfermedad e WHERE e.id = :id"),
    @NamedQuery(name = "Enfermedad.findByNombre", query = "SELECT e FROM Enfermedad e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Enfermedad.findByDescripcion", query = "SELECT e FROM Enfermedad e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "Enfermedad.findByNivelGravedad", query = "SELECT e FROM Enfermedad e WHERE e.nivelGravedad = :nivelGravedad"),
    @NamedQuery(name = "Enfermedad.findByTratamientoBasico", query = "SELECT e FROM Enfermedad e WHERE e.tratamientoBasico = :tratamientoBasico")})
public class Enfermedad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "NivelGravedad")
    private String nivelGravedad;
    @Column(name = "TratamientoBasico")
    private String tratamientoBasico;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "enfermedad")
    private List<Antecedenteenfestudiante> antecedenteenfestudianteList;

    public Enfermedad() {
    }

    public Enfermedad(Long id) {
        this.id = id;
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

    public String getNivelGravedad() {
        return nivelGravedad;
    }

    public void setNivelGravedad(String nivelGravedad) {
        this.nivelGravedad = nivelGravedad;
    }

    public String getTratamientoBasico() {
        return tratamientoBasico;
    }

    public void setTratamientoBasico(String tratamientoBasico) {
        this.tratamientoBasico = tratamientoBasico;
    }

    public List<Antecedenteenfestudiante> getAntecedenteenfestudianteList() {
        return antecedenteenfestudianteList;
    }

    public void setAntecedenteenfestudianteList(List<Antecedenteenfestudiante> antecedenteenfestudianteList) {
        this.antecedenteenfestudianteList = antecedenteenfestudianteList;
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
        if (!(object instanceof Enfermedad)) {
            return false;
        }
        Enfermedad other = (Enfermedad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Enfermedad[ id=" + id + " ]";
    }
    
}
