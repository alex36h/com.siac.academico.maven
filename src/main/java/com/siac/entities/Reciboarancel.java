
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
@Table(name = "reciboarancel")
@NamedQueries({
    @NamedQuery(name = "Reciboarancel.findAll", query = "SELECT r FROM Reciboarancel r"),
    @NamedQuery(name = "Reciboarancel.findByArancelEstudiante", query = "SELECT SUM(r.monto) FROM Reciboarancel r WHERE r.recibo.estudiante =:estudiante AND r.arancel.id =:arancel"),
    @NamedQuery(name = "Reciboarancel.findByEstudianteInscripcion", query = "SELECT r.id FROM Reciboarancel r WHERE r.recibo.estudiante =:est AND UPPER(r.arancel.nombre) LIKE :arancel"),
    @NamedQuery(name = "Reciboarancel.findById", query = "SELECT r FROM Reciboarancel r WHERE r.id = :id"),
    @NamedQuery(name = "Reciboarancel.findByDescuentoId", query = "SELECT r FROM Reciboarancel r WHERE r.descuentoId = :descuentoId"),
    @NamedQuery(name = "Reciboarancel.findByPorcentajeDescuento", query = "SELECT r FROM Reciboarancel r WHERE r.porcentajeDescuento = :porcentajeDescuento"),
    @NamedQuery(name = "Reciboarancel.findByMonto", query = "SELECT r FROM Reciboarancel r WHERE r.monto = :monto"),
    @NamedQuery(name = "Reciboarancel.findByAbono", query = "SELECT r FROM Reciboarancel r WHERE r.abono = :abono"),
    @NamedQuery(name = "Reciboarancel.findByTipo", query = "SELECT r FROM Reciboarancel r WHERE r.tipo = :tipo"),
    @NamedQuery(name = "Reciboarancel.findByEstudianteFecha", query = "SELECT r FROM Reciboarancel r WHERE r.recibo.estudiante =:est and r.recibo.fecha >= :fechaInicio and r.recibo.fecha <= :fechaFin and r.arancel.nombre like :arancel"),
    @NamedQuery(name = "Reciboarancel.findByHoy", query = "SELECT r FROM Reciboarancel r WHERE r.recibo.fecha >= :fecha")})
public class Reciboarancel implements Serializable {

    public static int BECA = 1, NORMAL = 0; //tiene beca o es un registro normal
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Column(name = "DescuentoId")
    private Integer descuentoId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PorcentajeDescuento")
    private Double porcentajeDescuento;
    @Basic(optional = false)
    @Column(name = "Monto")
    private double monto;
    @Basic(optional = false)
    @Column(name = "Abono")
    private boolean abono;
    @Column(name = "Tipo")
    private Integer tipo;
    @JoinColumn(name = "Arancel", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Arancel arancel;
    @JoinColumn(name = "Recibo", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Recibo recibo;

    public Reciboarancel() {
    }

    public Reciboarancel(Long id) {
        this.id = id;
    }

    public Reciboarancel(Long id, double monto, boolean abono) {
        this.id = id;
        this.monto = monto;
        this.abono = abono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDescuentoId() {
        return descuentoId;
    }

    public void setDescuentoId(Integer descuentoId) {
        this.descuentoId = descuentoId;
    }

    public Double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean getAbono() {
        return abono;
    }

    public void setAbono(boolean abono) {
        this.abono = abono;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Arancel getArancel() {
        return arancel;
    }

    public void setArancel(Arancel arancel) {
        this.arancel = arancel;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
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
        if (!(object instanceof Reciboarancel)) {
            return false;
        }
        Reciboarancel other = (Reciboarancel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Reciboarancel[ id=" + id + " ]";
    }
    
}
