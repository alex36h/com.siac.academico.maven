package com.ap.coreFact.entidad;

import com.ap.coreFact.util.Util;

import javax.persistence.*;
import javax.persistence.metamodel.SingularAttribute;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table
public class Permiso implements Serializable {

    public static volatile SingularAttribute<Permiso, Long> _orden;
    public static volatile SingularAttribute<Permiso, Boolean> _activo;
    public static volatile SingularAttribute<Permiso, Rol> _rol;

    private static final long serialVersionUID = 1L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column
    @Basic(optional = false)
    @Size(min = Util.TAM_MIN, max = Util.TAM_32)
    private String nombre;
    @ManyToOne(optional = false)
    @JoinColumn(name = Util.COL_ROL, referencedColumnName = Util.COL_CODIGO)
    private Rol rol;
    @Column
    @Basic(optional = false)
    private boolean padre;
    @ManyToOne
    @JoinColumn(name = Util.COL_SUBMENU, referencedColumnName = Util.COL_CODIGO)
    private Permiso submenu;
    @Column
    private String paquete;
    @Column
    private String formulario;
    @Column
    @Basic(optional = false)
    private short orden;

    public Permiso() {
    }

    public Permiso(long codigo) {
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public boolean isPadre() {
        return padre;
    }

    public void setPadre(boolean padre) {
        this.padre = padre;
    }

    public Permiso getSubmenu() {
        return submenu;
    }

    public void setSubmenu(Permiso submenu) {
        this.submenu = submenu;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }

    public short getOrden() {
        return orden;
    }

    public void setOrden(short orden) {
        this.orden = orden;
    }
}
