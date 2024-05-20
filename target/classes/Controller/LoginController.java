/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laura
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipau;


public class LoginController{
 
    private final Login View; 
    private LoginHelper Helper;
   


    public LoginController(Login View){
        this.View = View;
        this.Helper = new LoginHelper(View);        
    }
    
    
    public void entrarNoSistema(){
        Usuario usuario = Helper.obterModelo();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
            MenuPrincipau menu =  new MenuPrincipau();
            menu.setVisible(true);
            this.View.dispose();
            //navegar para menu principal
        }else {
            View.exibeMensagem("usuario ou senha inválidos");
        }
        
        
        
    
    }

    public void fizTarefa(){
        System.out.println("Busquei algo do Banco de dados:");
        this.View.exibeMensagem("Login efetuado com sucesso!.");
    }

}
