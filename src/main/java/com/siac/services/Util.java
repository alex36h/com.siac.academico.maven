
package com.siac.services;

import com.siac.entities.Credencial;
import static com.siac.main.Principal.panel;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.table.JTableHeader;
import utilidades.GestionEncabezadoTabla;

public class Util {

    private static Credencial credencial;
    public static final String ADD_OK = "Registro agregado correctamente";
    public static final String DATE_ERROR = "La fecha ingresada es incorrecta";
    public static final String ADD_ERROR = "Error al guardar registro";
    public static final String UPDATE_OK = "Registro actualizado correctamente";

    public static final String EDIT_OK = "Registro editado correctamente";

    public static final String SELECT = "Seleccione el registro";

    public static final String SELECT_DELETE = "Segur@ desesa eliminar el registro seleccionado?";
    public static final String SELECT_ANULAR = "Segur@ desesa anular el registro seleccionado?";

    public static final String ERROR_DELETE = "Error al Eliminar el Registro Seleccionado";
    public static final String ERROR_MESSAGE = "La operacion fallo con exito en: ";

    public enum Pantalla {
        Null, Banco, Moneda, TipoCambio
    }

    public static Credencial getCredencial(String usr) {
        JPACrud jpaCrud = new JPACrud();
        return jpaCrud.getCred(usr);
    }

    public static final String[] COL_MONEDA = {"Id", "Nombre", "Descripcion", "Activo"};
    public static final String[] COL_TIPO_COLEGIO = {"Id", "Nombre"};
    public static final String[] COL_TIPO_CAMBIO = {"Id", "MonedaBase", "MonedaCambio", "Fecha", "Cambio", "Activo"};
    public static final String[] COL_SERIE_RECIBO = {"Id", "Nombre", "Descripcion", "Activo"};
    public static final String[] COL_FORMA_PAGO = {"Id", "Nombre", "Descripcion", "Activo"};
    public static final String[] COL_ALERGIA = {"Id", "Nombre", "Descripcion", "Tratamiento"};
    public static final String[] COL_ARANCEL = {"Id", "Nombre", "Descripcion", "Precio", "Activo"};
    public static final String[] COL_ARANCEL_CAJA = {"Id", "Nombre", "Precio"};
    public static final String[] COL_ARANCEL_CAJA_DETALLE = {"Forma de pago", "Moneda", "Monto", "Banco", "Autorizado"};
    public static final String[] COL_ALERGIA_ANTECEDENTES = {"Id", "Estudiante", "Alergia", "Frecuencia", "Diagnostico", "Medicamentos","Enfermedad Actual"};
    public static final String[] COL_ANTECEDENTE_ENF_EST = {"Id", "Estudiante", "Enfermedad", "Diagnostico", "Fecha Ultima Recaida", "Medicamentos", "Estado Enfermedad"};
    public static final String[] COL_ASIGNATURAS = {"Id", "Nombre", "Descripcion", "Activo"};
    public static final String[] COL_CARGO = {"Id", "Nombre", "Descripcion", "Activo"};
    public static final String[] COL_CARGO_EMPLEADO = {"Id", "Cargo", "Colaborador", "Autorizado", "Activo"};
    public static final String[] COL_CIUDAD = {"Id", "Nombre", "Pais", "Activo"};
    public static final String[] COL_RESUMEN_MONEDA = {"Moneda", "Total"};
    public static final String[] COL_RESUMEN_FORMA_PAGO = {"Forma de Pago", "Moneda", "Total"};
    public static final String[] COL_COLEGIO = {"Id", "Nombre", "Tipo Colegio", "Pais", "Ciudad", "Direccio", "Telefono"};
    public static final String[] COL_PERSONAS = {"Codigo", "Nombre", "Apellido", "Fecha Nac", "Direccion",
        "Telefono", "Correo", "Observaciones", "Genero", "Activo"};
    public static final String[] COL_DOCENTE_TRABAJO_ANTERIOR = {"Id", "Nombre", "Apellido", "Colegio", "Labor Ejercida",
        "Duracion", "Observaciones", "Recomendaciones"};
    public static final String[] COL_ENFERMEDADES = {"Id", "Nombre", "Descripcion", "Nivel de Gravedad", "Tratamiento Basico"};
    public static final String[] COL_PARENTESCO = {"Id", "Parentesco", "Activo"};
    public static final String[] COL_PROFESION = {"Id", "Profesion", "Perfil", "Activo"};
    public static final String[] COL_PERIODOLECTIVO = {"Id", "Nombre", "Descripcion", "Año Lectivo", "Fecha Inicio", "Fecha Fin", "Activo"};
    public static final String[] COL_ANNOSLECTIVOS = {"Id", "Nombre", "Descripcion", "Fecha Inicio", "Fecha Fin", "Activo"};
    public static final String[] COL_PLANES_DE_ESTUDIOS = {"Id", "Nombre", "Descripcion", "Activo"};
    public static final String[] COL_TURNO = {"Id", "Nombre", "Descripcion", "Activo"};
    public static final String[] COL_DESCUENTO = {"Id", "Carnet", "Estudiante", "Arancel", "Fecha", "Pocentaje", "Usado"};
    public static final String[] COL_DOCENTE = {"Id", "Nombre", "Apellido", "Profesion", "Centro de Estudios", "Duración", "Desempeño", "Fecha Culminacion", "Activo"};
    public static final String[] COL_CURSOS = {"Codigo", "Año Lectivo", "Plan de Estudios","Docente","Asignatura","Aula","Codigo","Año"};  
    public static final String[] COL_PAIS = {"Id", "Nombre", "Activo"};
    public static final String[] COL_BECA = {"Id", "Carnet","Estudiante", "Porcentaje","Tipo Beca","Semestre","Activo","Apelada"};
    public static final String[] COL_RESPONSABLE_ESTUDIANTE = {"Id", "Estudiante", "Familiar","Año Lectivo", "Parentesco"};
    public static final String[] COL_CURSOINSCRIPCION = {"Id", "Asignatura", "Grupo","Aula","Año"};
    public static final String[] COL_ESTUDIANTE = {"Id", "Nombre", "Codigo MINED", "Telefono",
         "Tipo Sangre", "Observaciones", "Estado","Activo"};
    public static final String[] COL_CARTERA_RESUMEN_CONSOLIDADO = {"CARNET", "NOMBRE COMPLETO", "GRUPO","SALDO ANTERIOR",
        "ESTUDIO IS?","ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO"};
    public static final String[] COL_CARTERA_RESUMEN_CONSOLIDADO2 = {"No. ESTUDIANTES INSC.", "MONTO A RECIBIR $", "EXONERACIONES IS$","TOTAL INGRESOS IS$",
        "No. ESTUDIANTES INSC.", "MONTO A RECIBIR $", "EXONERACIONES IIS$","TOTAL INGRESOS IIS$",};
    public static final String[] FIL_NULL = {"Sin Opciones"};
    public static final String[] COL_RECIBOS_IMPRESION = {"Id", "ROC", "Carnet", "Recibimos de", "Arancel", "Total C$","Total U$","Anulado"};   
    public static final String[] COL_DEBE_PAGADO = {"Debe", "Pagado","Debe", "Pagado","Debe", "Pagado", "Debe", "Pagado","Debe", "Pagado","Debe", "Pagado"};
    public static final String[] COL_CURSO_INSCRIPCION = {"Id", "No. Carnet","Estudiante","I Bimestre","II Bimestre","Promedio IB","III Bimestre","IV Bimestre","Promedio IIB","Aprobado"};
    public static final String[] COL_DETALLE_DENOMINACIONES_CIERRE = {"Denominacion", "Cantidad", "Total"};
    public static final String[] COL_AUT_APERTURA = {"Id","Usuario","Fecha Apertura","Serie","ROC Inicial","Cerrada?","Autorizada?"};
    public static final String[] COL_COLABORADOR_CREDENCIAL = {"Id", "Nombre Completo", "Login", "Rol"};
    public static final String[] COL_ROL_GRUPO_USUARIO = {"Id", "Rol", "Permisos"};
    
    private static JPACrud x;

    public static String getSiNo(boolean b) {
        return b ? "Si" : "No";
    }

    public static String getSiNo(int b) {
        if (b == 0) {
            return "No";
        } else {
            return "Si";
        }
    }
    
    public static String getEstadoEstudiante(int b) {
        switch (b) {
            case 1:
                return "Activo";
            case 2:
                return "Egresado";
            case 3:
                return "Trasladado";
            case 4:
                return "Expulsado";
            default:
                return "";
        }
    }
    
    public static int getSelectedIndex(String obj)
    {
        System.out.println("sub ----> "+obj.substring(obj.indexOf(":")+1, obj.length()));
        return Integer.parseInt(obj.substring(obj.indexOf(":")+1, obj.length()));
    }

    public static Boolean getBoolean(String b) {
        if (b == "Si") {
            return true;
        } else {
            return false;
        }
    }

    public static String getGenero(boolean b) {
        return b ? "Masculino" : "Femenino";
    }

    public static Calendar toCalendar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }
    
    public static Date getDate(){
        Date currentDate = Date.from(Instant.now());
        return currentDate;
    }
    
    public static boolean fechaValida(Calendar date)
    {
        if(date.after(toCalendar(Date.from(Instant.now()))))
            return false;
        else            
            return true;
    }
    
    public static int getYear() {
            LocalDate localDate = LocalDate.parse(java.time.LocalDate.now().toString());
            return localDate.getYear();
    }

    public static DefaultTableModel getModel(String[] cols, boolean editable) {
        DefaultTableModel model = new DefaultTableModel(null, cols) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return editable;
            }
        };
        return model;
    }

    public static void fillComboBox(String[] items, JComboBox comboBox) {
        for (String i : items) {
            comboBox.addItem(i);
        }
    }
    
    public static JTableHeader getTableHeader(JTable jTable1)
    {
        JTableHeader jtableHeader;
        jtableHeader = jTable1.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        return jtableHeader;
    }

    public static void setLookAndFeelWindows() throws Exception {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            throw new Exception("No existe la Vista de Windows");
        } catch (Exception e) {
            throw new Exception("Error desconocido al establecer la vista de Windows");
        }
    }

    public static void limpiarJTable(DefaultTableModel modelo) {
        int filas = modelo.getRowCount();
        if (filas > 0) {
            for (int i = 0; i < filas; i++) {
                modelo.removeRow(0);
            }
        }
    }
    
    
    public static boolean serieValida(String nombre)
    {
        try {
            x = new JPACrud();
            if(x.getSerieByNombre(nombre) == null)
                return true;
            else
                return false;
           
        } catch (Exception e) {
            System.out.println("validarSerie "+e);
        }
        return false;
    }
    
    public static void addInternal(JInternalFrame frameInterno) { 
            boolean temp = false; 
            try { 
                for (JInternalFrame frame : panel.getAllFrames()) 
                { 
                    frame.setIcon(true);
                    if (frame.getClass() == frameInterno.getClass()) 
                    { 
                        temp = true; frame.setIcon(false); frame.setSelected(true); 
                    } 
                } 
            } catch (PropertyVetoException ex) { System.out.println(ex); } 
            if (!temp) 
            {
                frameInterno.setVisible(true); 
                panel.add(frameInterno, JLayeredPane.MODAL_LAYER); 
                panel.setSelectedFrame(frameInterno); 
                
                Dimension desktopSize = panel.getSize();
                Dimension FrameSize = frameInterno.getSize();
                frameInterno.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
            } }
    
}
