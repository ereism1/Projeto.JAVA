/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author laura
 */
public class LoginHelper {
    
    private final Login View;
    
    public LoginHelper(Login View){
        this.View = View;
        
    }
    public Usuario obterModelo(){
        String nome = View.getTextUsuario().getText();
        String senha =  View.getTextSenha().getText();
        
        Usuario modelo = new Usuario(0, nome, senha);
        return modelo;
    }
    public void SetarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        View.getTextUsuario().setText("");
        View.getTextSenha().setText("");
    }
}
