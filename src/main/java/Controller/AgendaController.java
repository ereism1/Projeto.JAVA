/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class AgendaController {
    
    private final Agenda View;
    private final AgendaHelper helper;

    public AgendaController(Agenda View) {
        this.View = View;
        this.helper = new AgendaHelper(View);
    }
    
    public void atualizaTabela(){
        //buscra lista de agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //exibir esta lista na view
        helper.preencherTabela(agendamentos);
        
        
    }
    
    public void atualizaCliente(){
        //Buscar clientes do Banco de dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //Exibir Clientes no combobox Cliente
        helper.preencherClientes(clientes);
    }
    
    public void atualizarServico(){
      ServicoDAO servicoDAO =  new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        helper.preencherServicos(servicos);
    }

    public void atualizarValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(Servico.getValor());
    }
   

   
    
}
