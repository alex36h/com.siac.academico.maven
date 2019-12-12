package com.ap.coreFact.entidad;


import com.ap.coreFact.util.Util;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long codigo;
    @Column
    @Basic(optional = false)
    @Size(min = Util.TAM_MIN, max = Util.TAM_32)
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = Util.COL_GRUPO)
    private List<Usuario> usuarioList;

    public Grupo() {
    }

    public Grupo(long codigo) {
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

}
