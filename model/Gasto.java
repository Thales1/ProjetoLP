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
public class Gasto {

    private int id_gasto;
    private double valor_gasto;
    private String descricao_gasto, dia_gasto, cpf_funcionario;

    public Gasto() {
        id_gasto = 0;
        cpf_funcionario = "";
        valor_gasto = 0;
        descricao_gasto = new String();
        dia_gasto = new String();
    }

    public Gasto(int id_gasto, double valor_gasto, String descricao_gasto, String dia_gasto, String cpf_funcionario) {
        this.id_gasto = id_gasto;
        this.valor_gasto = valor_gasto;
        this.descricao_gasto = descricao_gasto;
        this.dia_gasto = dia_gasto;
        this.cpf_funcionario = cpf_funcionario;
    }
    
    

    public int getId_gasto() {
        return id_gasto;
    }

    public void setId_gasto(int id_gasto) {
        this.id_gasto = id_gasto;
    }

    public String getCpf_funcionario() {
        return cpf_funcionario;
    }

    public void setCpf_funcionario(String cpf_funcionario) {
        this.cpf_funcionario = cpf_funcionario;
    }

    public double getValor_gasto() {
        return valor_gasto;
    }

    public void setValor_gasto(double valor_gasto) {
        this.valor_gasto = valor_gasto;
    }

    public String getDescricao_gasto() {
        return descricao_gasto;
    }

    public void setDescricao_gasto(String descricao_gasto) {
        this.descricao_gasto = descricao_gasto;
    }

    public String getDia_gasto() {
        return dia_gasto;
    }

    public void setDia_gasto(String dia_gasto) {
        this.dia_gasto = dia_gasto;
    }

}
