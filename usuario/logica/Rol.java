package com.ap.coreFact.entidad;

import com.ap.coreFact.util.Util;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Basic(optional = false)
    @Column
    @Size(min = Util.TAM_MIN, max = Util.TAM_64)
    private String nombre;
    @Basic(optional = false)
    @Column
    private short orden;

    public Rol() {
    }

    public Rol(long codigo) {
        this.codigo = codigo;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getOrden() {
        return orden;
    }

    public void setOrden(short orden) {
        this.orden = orden;
    }
}
