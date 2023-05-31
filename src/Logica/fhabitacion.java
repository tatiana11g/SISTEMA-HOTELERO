
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.vhabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
 public class fhabitacion {
 private Conexion mysql= new Conexion();
 private Connection  cn = mysql.conectar();  
 private String sSQL ="";
 public Integer totalregistros;
 
  //crear metodos para mostrar los registros
 public DefaultTableModel mostrar(String buscar){
     DefaultTableModel modelo;
     // Declaramos array vector para guardar los datos de las columnas
     String [] titulos={"ID","Numero","Piso","Descripcion","Caracteristicas","Precio","Estado","Tipo Habitacion"};
     // Declaramos array que almacena  los registros y se inicializa  en blanco
     String [] registro= new String [8]; // new string para inicializar o crear el objeto en blanco
     //se inicializa o se limpia la variable
     totalregistros=0;
     //instanciamos la variable modelo y le enviamos la informacion
     modelo = new DefaultTableModel(null,titulos);
     //Instruccion SQL para almacenar los registros
     sSQL= "select * from habitacion where piso like'%" + buscar + "%'  order by idhabitacion";
     //Capturador de  errores
     try {
         // crear objeto para sentecias SQL
         Statement st = cn.createStatement();
         //Crear objeto ResulSet para obtener datos de columans y el metodo  no trae  conjunto de datos de la sentecia sql
         ResultSet rs = st.executeQuery(sSQL);
         // ejecuta y evalua el rs registro por registro metodo next()
         while(rs.next())  {
                 //Arreglo va ser igual a lo que evalua rs la condicion y lo manda 
                 registro[0]= rs.getString("idhabitacion");
                 registro[1]= rs.getString("Numero");
                 registro[2]= rs.getString("piso");
                 registro[3]= rs.getString("descripcion");
                 registro[4]= rs.getString("caracteristicas");
                 registro[5]= rs.getString("precio_diario");
                 registro[6]= rs.getString("estado");
                 registro[7]= rs.getString("tipo_habitacion");
                 // cuenta la fila 
                 totalregistros=totalregistros+1;       
              //agrega datos del arreglo al objeto en filas
              modelo.addRow(registro);
         }   
        return modelo;
     } catch (Exception e) {
         JOptionPane.showConfirmDialog(null,e);
         return null;
     }
 }
 
 public DefaultTableModel mostrarvista(String buscar){
     DefaultTableModel modelo;
     // Declaramos array vector para guardar los datos de las columnas
     String [] titulos={"ID","Numero","Piso","Descripcion","Caracteristicas","Precio","Estado","Tipo Habitacion"};
     // Declaramos array que almacena  los registros y se inicializa  en blanco
     String [] registro= new String [8]; // new string para inicializar o crear el objeto en blanco
     //se inicializa o se limpia la variable
     totalregistros=0;
     //instanciamos la variable modelo y le enviamos la informacion
     modelo = new DefaultTableModel(null,titulos);
     //Instruccion SQL para almacenar los registros
     sSQL= "select * from habitacion where piso like'%" + buscar + "%' and estado='Disponible' order by idhabitacion";
     //Capturador de  errores
     try {
         // crear objeto para sentecias SQL
         Statement st = cn.createStatement();
         //Crear objeto ResulSet para obtener datos de columans y el metodo  no trae  conjunto de datos de la sentecia sql
         ResultSet rs = st.executeQuery(sSQL);
         // ejecuta y evalua el rs registro por registro metodo next()
         while(rs.next())  {
                 //Arreglo va ser igual a lo que evalua rs la condicion y lo manda 
                 registro[0]= rs.getString("idhabitacion");
                 registro[1]= rs.getString("Numero");
                 registro[2]= rs.getString("piso");
                 registro[3]= rs.getString("descripcion");
                 registro[4]= rs.getString("caracteristicas");
                 registro[5]= rs.getString("precio_diario");
                 registro[6]= rs.getString("estado");
                 registro[7]= rs.getString("tipo_habitacion");
                 // cuenta la fila 
                 totalregistros=totalregistros+1;       
              //agrega datos del arreglo al objeto en filas
              modelo.addRow(registro);
         }   
        return modelo;
     } catch (Exception e) {
         JOptionPane.showConfirmDialog(null,e);
         return null;
     }
 }
 
 
 
 //Este metodo lleva objeto de  tipo vhabitacion para acceder a metodos get set
 public boolean Insertar(vhabitacion dts){
    
     sSQL="insert into habitacion(Numero,piso,descripcion,caracteristicas,precio_diario,estado,tipo_habitacion)"+
             "values (?,?,?,?,?,?,?)";
     
     try {
         //Creamos objeto la manejar la sentencia SQL asignandole datos de conexion
         PreparedStatement pst = cn.prepareStatement(sSQL);
         // Pasarle el valor  asignado a los ? para que luego se  ejecute pst o la sentencia SQL
         // asiganar el valora ?  con el valor obtenido del txt
         pst.setString(1,dts.getNumero());
         pst.setString(2,dts.getPiso());
         pst.setString(3,dts.getDescripcion());
         pst.setString(4,dts.getCaracteristicas());
         pst.setDouble(5,dts.getPrecio_diario());
         pst.setString(6,dts.getEstado());
         pst.setString(7,dts.getTipo_habitacion());
         // se ejecuta el objeto pst
         int n= pst.executeUpdate();
          if (n!=0){
             return true;
         }
         else{
             return false;
         }
         
     } catch (Exception e) {
         JOptionPane.showConfirmDialog(null,e);
         return false;
           
     }  
 }
 
 
  //Este metodo lleva objeto de  tipo vhabitacion para acceder a metodos get set
 public boolean editar (vhabitacion dts){
     
    sSQL="update habitacion set Numero=?, piso=?,descripcion=?,caracteristicas=?,precio_diario=?, estado=?, tipo_habitacion=?"+
            "where idhabitacion=?";
     try {
          //Creamos objeto la manejar la sentencia SQL asignandole datos de conexion
         PreparedStatement pst = cn.prepareStatement(sSQL);
          // Pasarle el valor  asignado a los ? para que luego se  ejecute pst o la sentencia SQL
         // asiganar el valora ?  con el valor obtenido del txt aqui se envia los datos al pst
         pst.setString(1,dts.getNumero());
         pst.setString(2,dts.getPiso());
         pst.setString(3,dts.getDescripcion());
         pst.setString(4,dts.getCaracteristicas());
         pst.setDouble(5,dts.getPrecio_diario());
         pst.setString(6,dts.getEstado());
         pst.setString(7,dts.getTipo_habitacion());
         pst.setInt(8,dts.getIdhabitacion());
         
         // se ejecuta el objeto pst
         int n= pst.executeUpdate();
         if (n!=0){
             return true;
         }
         else{
             return false;
         }
         }catch (Exception e) {
         JOptionPane.showConfirmDialog(null, e);
           return false;      
     }        
 }
 
 
  public boolean desocupar (vhabitacion dts){
     
     sSQL="update habitacion set estado='Disponible'"+
               " where idhabitacion=?";
           //alt + 39
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIdhabitacion());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }       
 }

  
  public boolean ocupar (vhabitacion dts){
     
      sSQL="update habitacion set estado='Ocupado'"+
               " where idhabitacion=?";
           //alt + 39
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIdhabitacion());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       } 
 }

  public boolean Eliminar (vhabitacion dts){
     sSQL="delete from habitacion where idhabitacion=?";
      try {
         //Creamos objeto la manejar la sentencia SQL asignandole datos de conexion
         PreparedStatement pst = cn.prepareStatement(sSQL);
         // Pasarle el valor  asignado a los ? para que luego se  ejecute pst o la sentencia SQL
         // asiganar el valora ?  con el valor obtenido del txt aqui se envia los datos al pst
         pst.setInt(1,dts.getIdhabitacion()); //Solo se pasa el dato Idhabitacion porque se elimina  todo el registro
          // se ejecuta el objeto pst
         int n= pst.executeUpdate();
         if (n!=0){
             return true;
         }
         else{
             return false;
         }
         
     } catch (Exception e) {
         JOptionPane.showConfirmDialog(null, e);
         return false;
     }
         
 }

    public void setNumero(String ccg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
 
 
 
 
 
 
 
 
 
}



 

    

