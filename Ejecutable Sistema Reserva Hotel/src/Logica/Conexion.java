/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Conexion {
   
    public String db ="dbreservahotelparaiso";
    
    // si nos conectaramos a workbench
    //public String url="jdbc:mysql://localhost:3306/"+ db;
    //public String url="jdbc:mysql://127.0.0.1/" +db;
    
    // nos conectamos al servidor cambiando ip  y creando  un usuario y contraseña y exportando la bd a otra
    public String url="jdbc:mysql://192.168.20.26/"+ db;
    public String user="usuarioreserva";
    public String pass="usuarioreserva16";

    public Conexion() {         
    }
    // metodo para la crear la conexion
    // importar la libreria de Connection
    public Connection conectar(){ 
        Connection link = null;
        
        try {
            // ubicacion del driver
            Class.forName("com.mysql.jdbc.Driver");
            //enlaza los datos de la cadena
            link=DriverManager.getConnection(this.url,this.user,this.pass);
           
          // captura el error 
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
       return link;
    }
    
 
    
}
