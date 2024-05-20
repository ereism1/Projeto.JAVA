/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.View;

/**
 *
 * @author laura
 */
public class Main {
    
    
     public static void main(String[] args) {
         
       Login frm = null;
         try {
             frm = new Login();
         } catch (ParseException ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
         }
       frm.setVisible(true);
       frm.setSize(600,500);
       
       
       
    
    
    
    }

   
}
