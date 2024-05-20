/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author laura
 */
public class Servico {
   
    private int id;
    private String descricao;
    private static float valor;

    public Servico(int id, String descricao, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
//pesquisar sobre os float,int,string!!
// somente a classe serviço podera alterar estes campos.
// construtor criado'!
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getDescricao() {
    return descricao;
}
public void setDescricao(String descricao) {
    this.descricao = descricao;
}
public static float getValor() {
    return valor;
}
public void setValor(float valor) {
    this.valor = valor;
}
//getters e setters, que vao retornar e mudar o valor dos objetos.

@Override
    public String toString(){
        return getDescricao();
    }
    
}
