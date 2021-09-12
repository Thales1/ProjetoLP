/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thale
 */
public class ProdutoPedido {

    private int id_produto, id_pedido, qtd;

    public ProdutoPedido() {
        this.id_produto = 0;
        this.id_pedido = 0;
        this.qtd = 0;
    }

    public ProdutoPedido(int id_produto, int id_pedido, int qtd) {
        this.id_produto = id_produto;
        this.id_pedido = id_pedido;
        this.qtd = qtd;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

}
