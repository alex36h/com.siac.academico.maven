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
@Table(name = "alergia")
@NamedQueries({
    @NamedQuery(name = "Alergia.findAll", query = "SELECT a FROM Alergia a"),
    @NamedQuery(name = "Alergia.findById", query = "SELECT a FROM Alergia a WHERE a.id = :id"),
    @NamedQuery(name = "Alergia.findByNombre", query = "SELECT a FROM Alergia a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Alergia.findByDescripcion", query = "SELECT a FROM Alergia a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Alergia.findByTratamientoBasico", query = "SELECT a FROM Alergia a WHERE a.tratamientoBasico = :tratamientoBasico")})
public class Alergia implements Serializable {

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
    @Column(name = "TratamientoBasico")
    private String tratamientoBasico;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alergia")
    private List<Antecedentealergiaestudiante> antecedentealergiaestudianteList;

    public Alergia() {
    }

    public Alergia(Long id) {
        this.id = id;
    }

    public Alergia(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public String getTratamientoBasico() {
        return tratamientoBasico;
    }

    public void setTratamientoBasico(String tratamientoBasico) {
        this.tratamientoBasico = tratamientoBasico;
    }

    public List<Antecedentealergiaestudiante> getAntecedentealergiaestudianteList() {
        return antecedentealergiaestudianteList;
    }

    public void setAntecedentealergiaestudianteList(List<Antecedentealergiaestudiante> antecedentealergiaestudianteList) {
        this.antecedentealergiaestudianteList = antecedentealergiaestudianteList;
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
        if (!(object instanceof Alergia)) {
            return false;
        }
        Alergia other = (Alergia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Alergia[ id=" + id + " ]";
    }
    
}
