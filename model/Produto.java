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
public class Produto {

    private int idProduto;
    private String nome_produto;
    private double valor_produto;

    public Produto() {
        idProduto = 0;
        nome_produto = new String();
        valor_produto = 0;
    }

    public Produto(int idProduto, String nome_produto, double valor_produto) {
        this.idProduto = idProduto;
        this.nome_produto = nome_produto;
        this.valor_produto = valor_produto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(double valor_produto) {
        this.valor_produto = valor_produto;
    }

}
