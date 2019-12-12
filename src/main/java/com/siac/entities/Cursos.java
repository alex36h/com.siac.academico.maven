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


@Entity
@Table(name = "cursos")
@NamedQueries({
    @NamedQuery(name = "Cursos.findAll", query = "SELECT c FROM Cursos c"),
    @NamedQuery(name = "Cursos.findByPLActual", query = "SELECT c FROM Cursos c WHERE C.añoLectivo.activo =:activo AND c.anio =:anio AND C.cupo > :cupo"),
    @NamedQuery(name = "Cursos.findById", query = "SELECT c FROM Cursos c WHERE c.id = :id"),
    @NamedQuery(name = "Cursos.findByCupo", query = "SELECT c FROM Cursos c WHERE c.cupo = :cupo"),
    @NamedQuery(name = "Cursos.findByActivo", query = "SELECT c FROM Cursos c WHERE c.activo = :activo"),
    @NamedQuery(name = "Cursos.findByCodigo", query = "SELECT c FROM Cursos c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Cursos.findByAnio", query = "SELECT c FROM Cursos c WHERE c.anio = :anio")})
public class Cursos implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cursos")
    private List<Cursoinscripcion> cursoinscripcionList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Cupo")
    private int cupo;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @Basic(optional = false)
    @Column(name = "Codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "Anio")
    private int anio;
    @JoinColumn(name = "A\u00f1oLectivo", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Aniolectivo añoLectivo;
    @JoinColumn(name = "Asignaturas", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Asignaturas asignaturas;
    @JoinColumn(name = "Aula", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Aulas aula;
    @JoinColumns({
        @JoinColumn(name = "Credencial", referencedColumnName = "Codigo"),
        @JoinColumn(name = "Usuario", referencedColumnName = "Usuario")})
    @ManyToOne(optional = false)
    private Credencial credencial;
    @JoinColumn(name = "Docente", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private Persona docente;
    @JoinColumn(name = "PlanEstudios", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Planestudios planEstudios;

    public Cursos() {
    }

    public Cursos(Long id) {
        this.id = id;
    }

    public Cursos(Long id, int cupo, boolean activo, String codigo, int anio) {
        this.id = id;
        this.cupo = cupo;
        this.activo = activo;
        this.codigo = codigo;
        this.anio = anio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Aniolectivo getAñoLectivo() {
        return añoLectivo;
    }

    public void setAñoLectivo(Aniolectivo añoLectivo) {
        this.añoLectivo = añoLectivo;
    }

    public Asignaturas getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignaturas asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Aulas getAula() {
        return aula;
    }

    public void setAula(Aulas aula) {
        this.aula = aula;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public Persona getDocente() {
        return docente;
    }

    public void setDocente(Persona docente) {
        this.docente = docente;
    }

    public Planestudios getPlanEstudios() {
        return planEstudios;
    }

    public void setPlanEstudios(Planestudios planEstudios) {
        this.planEstudios = planEstudios;
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
        if (!(object instanceof Cursos)) {
            return false;
        }
        Cursos other = (Cursos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Cursos[ id=" + id + " ]";
    }

    public List<Cursoinscripcion> getCursoinscripcionList() {
        return cursoinscripcionList;
    }

    public void setCursoinscripcionList(List<Cursoinscripcion> cursoinscripcionList) {
        this.cursoinscripcionList = cursoinscripcionList;
    }
    
}
