
package com.siac.modelos;

import com.siac.entities.*;
import java.util.Vector;
import com.siac.services.JPACrud;
import static com.siac.services.Util.ERROR_MESSAGE;
import static com.siac.services.Util.getEstadoEstudiante;

import java.util.List;
import javax.accessibility.AccessibleState;


public class ComboModel {
    
    JPACrud x;
    int id;
    String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public List<ComboModel> fillMonedas() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Moneda dato : x.buscarTodo(Moneda.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillPais() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Pais dato : x.buscarTodo(Pais.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillAñosLectivos() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Aniolectivo dato : x.buscarTodo(Aniolectivo.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("fillAñosLectivos :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillAranceles() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Arancel dato : x.buscarTodo(Arancel.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillSerie() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Serierecibo dato : x.buscarTodo(Serierecibo.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("fillSerie :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillCiudad() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Ciudad dato : x.buscarTodo(Ciudad.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillTipoColegio() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Tipocolegio dato : x.buscarTodo(Tipocolegio.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillCargos() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Cargo dato : x.buscarTodo(Cargo.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
      
    public List<ComboModel> fillPersonas() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Persona dato : x.buscarTodo(Persona.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getCodigo().toString());
                dat.nombre = dato.getNombreCompleto().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillDocentes() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Docente dato : x.buscarTodo(Docente.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getPersona().getCodigo().toString());
                dat.nombre = dato.getPersona().getNombreCompleto().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillEstudiantes() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Estudiante dato : x.buscarTodo(Estudiante.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getPersona().getNombreCompleto().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillEnfermedades() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Enfermedad dato : x.buscarTodo(Enfermedad.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillAlergias() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Alergia dato : x.buscarTodo(Alergia.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillAsignaturas() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Asignaturas dato : x.buscarTodo(Asignaturas.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta fillAsignaturas:" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillPeriodoLectivo() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Periodolectivo dato : x.buscarTodo(Periodolectivo.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta fillPeriodoLectivo:" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillPlanesDeEstudio() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Planestudios dato : x.buscarTodo(Planestudios.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta fillPlanesDeEstudio:" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillFormaDePago() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Formapago dato : x.buscarTodo(Formapago.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillFamiliar() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Persona dato : x.buscarTodo(Persona.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getCodigo().toString());
                dat.nombre = dato.getNombreCompleto().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta fillFamiliar():" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillFormaDePagoApertura() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Formapago dato : x.getFormaPagosApertura()) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillBanco() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Banco dato : x.buscarTodo(Banco.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    
    public List<ComboModel> fillProfesion() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Profesion dato : x.buscarTodo(Profesion.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillColegios() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Colegio dato : x.buscarTodo(Colegio.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillAulas() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Aulas dato : x.buscarTodo(Aulas.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta fillAulas:" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillAsignaturasEstudianteNI() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Cursos dato : x.getCursosPeriodoActivoNI()) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getAsignaturas().getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.addElement(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta fillAsignaturasEstudiante:" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillParentesco() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Parentesco dato : x.buscarTodo(Parentesco.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getParentesco().toUpperCase().concat(" :").concat(""+dat.id);
                datos.addElement(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta fillParentesco():" + ex.getMessage());
        }
        return datos;
    }

    public List<ComboModel> fillTipoBeca() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Tipobeca dato : x.buscarTodo(Tipobeca.class)) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getId().toString());
                dat.nombre = dato.getNombre().toUpperCase().concat(" :").concat(""+dat.id);
                datos.addElement(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta fillTipoBeca():" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillEstadoEstudiante() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (int i =1; i <= 4; i++) {
                dat = new ComboModel();
                dat.id = i;
                dat.nombre = getEstadoEstudiante(i);
                datos.addElement(dat);
            }

        } catch (Exception ex) {
            System.err.println(ERROR_MESSAGE + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillColaborador() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Persona dato : x.getColaborador()) {
                dat = new ComboModel();
                dat.id = Integer.parseInt(dato.getCodigo().toString());
                dat.nombre = dato.getNombreCompleto().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillPermisos() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Rol dato : x.buscarTodo(Rol.class)) {
                dat = new ComboModel();
                dat.id = dato.getId();
                dat.nombre = dato.getNombre().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<ComboModel> fillRol() 
    {
        Vector<ComboModel> datos = new Vector<ComboModel>();
        ComboModel dat = null;
        x = new JPACrud();
        try {
            dat = new ComboModel();
            dat.setId(0);
            dat.setNombre("Seleccione...");
            datos.add(dat);

            for (Grupo dato : x.buscarTodo(Grupo.class)) {
                dat = new ComboModel();
                dat.id = dato.getCodigo();
                dat.nombre = dato.getNombre().concat(" :").concat(""+dat.id);
                datos.add(dat);
            }

        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
}
