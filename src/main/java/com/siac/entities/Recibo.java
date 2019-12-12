/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "recibo")
@NamedQueries({
      @NamedQuery(name = "Recibo.findAll", query = "SELECT r FROM Recibo r")
    , @NamedQuery(name = "Recibo.findByHoy", query = "SELECT r FROM Recibo r WHERE r.fecha >= :fecha")
    , @NamedQuery(name = "Recibo.findById", query = "SELECT r FROM Recibo r WHERE r.id = :id")
    , @NamedQuery(name = "Recibo.findByFecha", query = "SELECT r FROM Recibo r WHERE r.fecha = :fecha")
    , @NamedQuery(name = "Recibo.findByNumero", query = "SELECT r FROM Recibo r WHERE r.numero = :numero")
    , @NamedQuery(name = "Recibo.findByDe", query = "SELECT r FROM Recibo r WHERE r.de = :de")
    , @NamedQuery(name = "Recibo.findByEstudiante", query = "SELECT r FROM Recibo r WHERE r.estudiante = :estudiante")
    , @NamedQuery(name = "Recibo.findByObservacion", query = "SELECT r FROM Recibo r WHERE r.observacion = :observacion")
    , @NamedQuery(name = "Recibo.findByTotalDol", query = "SELECT r FROM Recibo r WHERE r.totalDol = :totalDol")
    , @NamedQuery(name = "Recibo.findByTotalCor", query = "SELECT r FROM Recibo r WHERE r.totalCor = :totalCor")
    , @NamedQuery(name = "Recibo.findByHoySerie", query = "SELECT r FROM Recibo r WHERE r.fecha >= :fecha and r.serie.id = :serie and r.credencial.credencialPK.usuario = :usuario")
    , @NamedQuery(name = "Recibo.findByEstCred", query = "SELECT r FROM Recibo r WHERE r.estudiante = :estudiante and r.numero = :numero and r.serie.id = :serie and r.credencial.credencialPK.usuario = :usuario")    
    , @NamedQuery(name = "Recibo.findByAnulado", query = "SELECT r FROM Recibo r WHERE r.anulado = :anulado")})
public class Recibo implements Serializable {

    @OneToMany(mappedBy = "recibo")
    private List<Pagoestudiante> pagoestudianteList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "Numero")
    private int numero;
    @Basic(optional = false)
    @Column(name = "De")
    private String de;
    @Basic(optional = false)
    @Column(name = "Estudiante")
    private String estudiante;
    @Column(name = "Observacion")
    private String observacion;
    @Basic(optional = false)
    @Column(name = "TotalDol")
    private double totalDol;
    @Basic(optional = false)
    @Column(name = "TotalCor")
    private double totalCor;
    @Basic(optional = false)
    @Column(name = "Anulado")
    private boolean anulado;
    @JoinColumns({
        @JoinColumn(name = "Credencial", referencedColumnName = "Codigo"),
        @JoinColumn(name = "Usuario", referencedColumnName = "Usuario")})
    @ManyToOne(optional = false)
    private Credencial credencial;
    @JoinColumn(name = "Serie", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Serierecibo serie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recibo")
    private List<Reciboarancel> reciboarancelList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recibo")
    private List<Detallerecibo> detallereciboList;

    public Recibo() {
    }

    public Recibo(Long id) {
        this.id = id;
    }

    public Recibo(Long id, Date fecha, int numero, String de, String estudiante, double totalDol, double totalCor, boolean anulado) {
        this.id = id;
        this.fecha = fecha;
        this.numero = numero;
        this.de = de;
        this.estudiante = estudiante;
        this.totalDol = totalDol;
        this.totalCor = totalCor;
        this.anulado = anulado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public double getTotalDol() {
        return totalDol;
    }

    public void setTotalDol(double totalDol) {
        this.totalDol = totalDol;
    }

    public double getTotalCor() {
        return totalCor;
    }

    public void setTotalCor(double totalCor) {
        this.totalCor = totalCor;
    }

    public boolean getAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public Serierecibo getSerie() {
        return serie;
    }

    public void setSerie(Serierecibo serie) {
        this.serie = serie;
    }

    public List<Reciboarancel> getReciboarancelList() {
        return reciboarancelList;
    }

    public void setReciboarancelList(List<Reciboarancel> reciboarancelList) {
        this.reciboarancelList = reciboarancelList;
    }

    public List<Detallerecibo> getDetallereciboList() {
        return detallereciboList;
    }

    public void setDetallereciboList(List<Detallerecibo> detallereciboList) {
        this.detallereciboList = detallereciboList;
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
        if (!(object instanceof Recibo)) {
            return false;
        }
        Recibo other = (Recibo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Recibo[ id=" + id + " ]";
    }

    public List<Pagoestudiante> getPagoestudianteList() {
        return pagoestudianteList;
    }

    public void setPagoestudianteList(List<Pagoestudiante> pagoestudianteList) {
        this.pagoestudianteList = pagoestudianteList;
    }
    
}
