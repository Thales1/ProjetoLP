/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author thale
 */
public class Pedido {

    private int idPedido;
    private String nome_cliente, cpfFuncionario;
    private ArrayList<ProdutoPedido> produtoPedido;

    public Pedido() {
        idPedido = 0;
        nome_cliente = new String();
        cpfFuncionario = "";
        produtoPedido = new ArrayList<>();
    }

    public Pedido(int idPedido, ArrayList<ProdutoPedido> produtoPedido, String nome_cliente, String cpfFuncionario) {
        this.idPedido = idPedido;
        this.nome_cliente = nome_cliente;
        this.cpfFuncionario = cpfFuncionario;
        this.produtoPedido = produtoPedido;
    }

    public ArrayList<ProdutoPedido> getProdutoPedido() {
        return produtoPedido;
    }

    public void setProdutoPedido(ArrayList<ProdutoPedido> produtoPedido) {
        this.produtoPedido = produtoPedido;
    }

    public void adicionarPedidoProduto(ProdutoPedido produtoPed) {
        produtoPedido.add(produtoPed);
    }

    public void removerPedidoProduto(ProdutoPedido produtoPed) {
        produtoPedido.remove(produtoPed);
    }
    
    public void removerPedidoProduto(int produtoPed) {
        produtoPedido.remove(produtoPed);
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

}
