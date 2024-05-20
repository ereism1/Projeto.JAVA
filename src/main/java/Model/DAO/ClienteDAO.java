/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

/**
 *
 * @author laura
 */

import Model.Cliente;
import java.util.ArrayList;

public class ClienteDAO {
    
    public void insert(Cliente cliente){
        Banco.cliente.add(cliente);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param cliente
     * @return 
     */
    public boolean update(Cliente cliente){
        
        for (int i = 0; i < Banco.cliente.size(); i++) {
            if(idSaoIguais(Banco.cliente.get(i),cliente)){
                Banco.cliente.set(i, cliente);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     * @param cliente
     * @return 
     */
    public boolean delete(Cliente cliente){
        for (Cliente clienteLista : Banco.cliente) {
            if(idSaoIguais(clienteLista,cliente)){
                Banco.cliente.remove(clienteLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os clientes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Cliente> selectAll(){
        return Banco.cliente;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param cliente
     * @param clienteAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Cliente cliente, Cliente clienteAComparar) {
        return cliente.getId() ==  clienteAComparar.getId();
    }
    
    
    
    
}
