/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author laura
 */
public class Cliente extends Pessoa {

    private String endereço;
    private String cep;

    

    public Cliente(int id, String nome, String endereço, String cep) {
        super(id, nome);
        this.endereço = endereço;
        this.cep = cep;
    }

    public Cliente(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg,
            String endereço, String cep) {
        super(id, nome);
        this.endereço = endereço;
        this.cep = cep;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
    
    
}