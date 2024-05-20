/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import static Model.DAO.Banco.agendamento;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laura
 */
public class AgendaHelper {
    
    private final Agenda View;
    private Object Cliente;
    private Object Servico;

    public AgendaHelper(Agenda View) {
        this.View = View;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        
      DefaultTableModel tableModel = (DefaultTableModel) View.getjTable1().getModel();
        tableModel.setNumRows(0);
        //percorrer a lista preenchendo o table model
        for (Agendamento agendamento : agendamento){
            tableModel.addRow(new Object[]{
                
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getData(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
                
            });
        }
        
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) View.getCOMBOBOXCliente().getModel();
     
      for (Cliente cliente : clientes) {
          comboBoxModel.addElement(Cliente);
      }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) View.getCOMBOBOXServico().getModel();
    
    for (Servico servico : servicos){
        comboBoxModel.addElement(Servico);
    }
    
    }
    
    
    
}
