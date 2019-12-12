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
@Table(name = "iniciocaja")
@NamedQueries({
      @NamedQuery(name = "Iniciocaja.findAll", query = "SELECT i FROM Iniciocaja i")
    , @NamedQuery(name = "Iniciocaja.findAllOrderById", query = "SELECT i FROM Iniciocaja i ORDER BY i.id DESC")
    , @NamedQuery(name = "Iniciocaja.findById", query = "SELECT i FROM Iniciocaja i WHERE i.id = :id")
    , @NamedQuery(name = "Iniciocaja.findByFecha", query = "SELECT i FROM Iniciocaja i WHERE i.fecha = :fecha")
    , @NamedQuery(name = "Iniciocaja.findBYCredencialSerie", query = "SELECT i FROM Iniciocaja i WHERE i.cerrado = :cerrado and i.serie.id = :serie and i.credencial.credencialPK.usuario = :usuario")   
    , @NamedQuery(name = "Iniciocaja.findByNumero", query = "SELECT i FROM Iniciocaja i WHERE i.numero = :numero")
    , @NamedQuery(name = "Iniciocaja.findByCredendial", query = "SELECT i FROM Iniciocaja i WHERE i.cerrado = :cerrado and i.credencial.credencialPK.usuario = :usuario")
    , @NamedQuery(name = "Iniciocaja.findByCerrado", query = "SELECT i FROM Iniciocaja i WHERE i.cerrado = :cerrado")
    , @NamedQuery(name = "Iniciocaja.find", query = "SELECT i FROM Iniciocaja i WHERE i.cerrado = :cerrado and i.serie.id = :serie and i.credencial.credencialPK.usuario = :usuario")
    , @NamedQuery(name = "Iniciocaja.find2", query = "SELECT i FROM Iniciocaja i WHERE i.cerrado = :cerrado and i.serie.id = :serie")
    , @NamedQuery(name = "Iniciocaja.findS", query = "SELECT i FROM Iniciocaja i WHERE i.cerrado = :cerrado and i.credencial.credencialPK.usuario = :usuario")})
public class Iniciocaja implements Serializable {

    @Basic(optional = false)
    @Column(name = "Autorizado")
    private boolean autorizado;

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
    @Column(name = "Cerrado")
    private boolean cerrado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inicioCaja")
    private List<Cierrecaja> cierrecajaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inicioCaja")
    private List<Detalleiniciocaja> detalleiniciocajaList;
    @JoinColumns({
        @JoinColumn(name = "Credencial", referencedColumnName = "Codigo"),
        @JoinColumn(name = "Usuario", referencedColumnName = "Usuario")})
    @ManyToOne(optional = false)
    private Credencial credencial;
    @JoinColumn(name = "Serie", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Serierecibo serie;

    public Iniciocaja() {
    }

    public Iniciocaja(Long id) {
        this.id = id;
    }

    public Iniciocaja(Long id, Date fecha, int numero, boolean cerrado) {
        this.id = id;
        this.fecha = fecha;
        this.numero = numero;
        this.cerrado = cerrado;
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

    public boolean getCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    public List<Cierrecaja> getCierrecajaList() {
        return cierrecajaList;
    }

    public void setCierrecajaList(List<Cierrecaja> cierrecajaList) {
        this.cierrecajaList = cierrecajaList;
    }

    public List<Detalleiniciocaja> getDetalleiniciocajaList() {
        return detalleiniciocajaList;
    }

    public void setDetalleiniciocajaList(List<Detalleiniciocaja> detalleiniciocajaList) {
        this.detalleiniciocajaList = detalleiniciocajaList;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Iniciocaja)) {
            return false;
        }
        Iniciocaja other = (Iniciocaja) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Iniciocaja[ id=" + id + " ]";
    }

    public boolean getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }
    
}
