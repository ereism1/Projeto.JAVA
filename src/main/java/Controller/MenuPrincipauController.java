/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Agenda;
import View.MenuPrincipau;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laura
 */
public class MenuPrincipauController {

    public MenuPrincipauController(MenuPrincipau View) {
        this.View = View;
    }

        private final MenuPrincipau View;
    
  

    public void navegarParaAgenda() throws ParseException{
        Agenda agenda = new Agenda();
        agenda.setVisible(true);

}
}
