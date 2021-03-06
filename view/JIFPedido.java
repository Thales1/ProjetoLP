/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import data.GastoData;
import data.PedidoData;
import data.ProdutoData;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import model.Pedido;
import model.Produto;
import model.ProdutoPedido;

/**
 *
 * @author thale
 */
public class JIFPedido extends javax.swing.JInternalFrame {

    private Pedido pedido;
    private PedidoData pedidoData;
    private ArrayList<Pedido> listaDePedidos;
    private int acao, linhaPedidoAtual;
    private ArrayList<Produto> listaDeProdutos;
    private ArrayList<Funcionario> listaDeFuncionarios;

    /**
     * Creates new form JIFPedido
     */
    public JIFPedido() {
        try {
            pedido = new Pedido();
            pedidoData = new PedidoData();
            listaDePedidos = new ArrayList<>();
            acao = 0;
            linhaPedidoAtual = -1;
            listaDeProdutos = new ArrayList<>();

            initComponents();

            GastoData gastoData = new GastoData();
            listaDeFuncionarios = gastoData.buscaFuncionarios();
            DefaultComboBoxModel cbModel = (DefaultComboBoxModel) cbFuncionario.getModel();

            for (Funcionario func : listaDeFuncionarios) {
                cbModel.addElement(func.getNome_func());
            }
        } catch (Exception e) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID = new javax.swing.JLabel();
        tfNomeCliente = new javax.swing.JTextField();
        lblNomeCliente = new javax.swing.JLabel();
        lblValorID = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        lblSelecionar = new javax.swing.JLabel();
        tfSelecionar = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblProduto = new javax.swing.JLabel();
        tfProduto = new javax.swing.JTextField();
        lblQtd = new javax.swing.JLabel();
        spinQtd = new javax.swing.JSpinner();
        lblPesquisar = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPedido = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProdutoPedido = new javax.swing.JTable();
        lblProdutoPedido = new javax.swing.JLabel();
        lblAdicionarProduto = new javax.swing.JLabel();
        lblFuncionario = new javax.swing.JLabel();
        cbFuncionario = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Pedidos");

        lblID.setText("ID");
        lblID.setEnabled(false);

        tfNomeCliente.setEnabled(false);
        tfNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeClienteActionPerformed(evt);
            }
        });

        lblNomeCliente.setText("Nome cliente");
        lblNomeCliente.setEnabled(false);

        lblValorID.setText("0");
        lblValorID.setEnabled(false);

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutos.setEnabled(false);
        tbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbProdutos);

        lblSelecionar.setText("Selecionar Produtos");
        lblSelecionar.setEnabled(false);

        tfSelecionar.setEnabled(false);
        tfSelecionar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSelecionarKeyReleased(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblProduto.setText("Produto");
        lblProduto.setEnabled(false);

        tfProduto.setEnabled(false);

        lblQtd.setText("QTD");
        lblQtd.setEnabled(false);

        spinQtd.setModel(new javax.swing.SpinnerNumberModel());
        spinQtd.setEnabled(false);

        lblPesquisar.setText("Pesquisar");

        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyReleased(evt);
            }
        });

        tbPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPedido);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.setEnabled(false);
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.setEnabled(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        tbProdutoPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutoPedido.setEnabled(false);
        tbProdutoPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutoPedidoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbProdutoPedido);

        lblProdutoPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProdutoPedido.setText("Produtos inseridos no pedido");
        lblProdutoPedido.setEnabled(false);

        lblAdicionarProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAdicionarProduto.setText("Adicionar Produtos ao Pedido");
        lblAdicionarProduto.setEnabled(false);

        lblFuncionario.setText("Funcion??rio");
        lblFuncionario.setEnabled(false);

        cbFuncionario.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(btnNovo)
                                .addGap(41, 41, 41)
                                .addComponent(btnSalvar)
                                .addGap(36, 36, 36)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(lblPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(btnEditar)
                                .addGap(45, 45, 45)
                                .addComponent(btnExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(btnRemover))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNomeCliente)
                                            .addComponent(lblID))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblValorID)
                                            .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblFuncionario)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblProdutoPedido))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(btnAdicionar)))
                                .addGap(104, 104, 104))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblProduto)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblQtd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spinQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSelecionar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(138, 138, 138))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblAdicionarProduto)
                                .addGap(154, 154, 154))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(lblValorID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFuncionario)
                            .addComponent(cbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblProdutoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAdicionarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProduto)
                            .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQtd)
                            .addComponent(spinQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSelecionar)
                            .addComponent(tfSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRemover)))
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisar)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeClienteActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        try {
            habilitarCampos(true);
            tfNomeCliente.setText("");
            tfProduto.setText("");
            tfSelecionar.setText("");
            cbFuncionario.setSelectedIndex(-1);
            lblValorID.setText("0");
            spinQtd.setValue(0);

            btnCancelar.setEnabled(true);
            btnSalvar.setEnabled(true);
            btnEditar.setEnabled(false);
            btnNovo.setEnabled(false);
            btnExcluir.setEnabled(false);
            tbPedido.setEnabled(false);
            tbProdutoPedido.setEnabled(false);
            tfPesquisar.setEnabled(false);
            lblPesquisar.setEnabled(false);

            acao = 1;
            linhaPedidoAtual = -1;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tfSelecionarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSelecionarKeyReleased
        try {
            ProdutoData produtoData = new ProdutoData();
            DefaultTableModel mp = (DefaultTableModel) tbProdutos.getModel();
            mp.setNumRows(0);
            if (tfSelecionar.getText().length() > 1) {
                listaDeProdutos = produtoData.pesquisar(tfSelecionar.getText());
                for (Produto p : listaDeProdutos) {
                    mp.addRow(new String[]{"" + p.getIdProduto(), p.getNome_produto(), "" + p.getValor_produto()});
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Erro ao pesquisar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tfSelecionarKeyReleased

    private void tbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutosMouseClicked
        try {
            int linhaSelecionada = tbProdutos.getSelectedRow();
            if (linhaSelecionada > -1) {
                tfProduto.setText(listaDeProdutos.get(linhaSelecionada).getNome_produto());
                spinQtd.setEnabled(true);
                btnAdicionar.setEnabled(true);

                if (linhaPedidoAtual == -1) {
                    spinQtd.setValue(1);
                } else {
                    for (ProdutoPedido prodPed : listaDePedidos.get(linhaPedidoAtual).getProdutoPedido()) {
                        if (prodPed.getId_produto() == listaDeProdutos.get(linhaSelecionada).getIdProduto()) {
                            spinQtd.setValue(prodPed.getQtd());
                        }
                    };
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Erro ao pesquisar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tbProdutosMouseClicked

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {
            DefaultTableModel mp = (DefaultTableModel) tbProdutoPedido.getModel();
            int linhaSelecionada = tbProdutos.getSelectedRow();
            DefaultTableModel mpp = (DefaultTableModel) tbProdutos.getModel();

            if (tfSelecionar.getText().length() > 1) {
                mp.addRow(new String[]{"" + listaDeProdutos.get(linhaSelecionada).getIdProduto(), tfProduto.getText(), spinQtd.getValue().toString()});
            }
            ProdutoPedido produtoPedido = new ProdutoPedido(listaDeProdutos.get(linhaSelecionada).getIdProduto(), 0, Integer.parseInt(mpp.getValueAt(linhaSelecionada, 0) + ""));
            pedido.adicionarPedidoProduto(produtoPedido);
            btnAdicionar.setEnabled(false);
            spinQtd.setEnabled(false);
            tfProduto.setText("");
            spinQtd.setValue(0);
            tbProdutoPedido.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Erro ao pesquisar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        DefaultTableModel tmProdutosPedido = (DefaultTableModel) tbProdutoPedido.getModel();
        DefaultTableModel tmProdutos = (DefaultTableModel) tbProdutos.getModel();
        habilitarCampos(false);
        tfNomeCliente.setText("");
        tfProduto.setText("");
        tfSelecionar.setText("");
        cbFuncionario.setSelectedIndex(-1);
        lblValorID.setText("0");
        spinQtd.setValue(0);

        tmProdutosPedido.setNumRows(0);
        tmProdutos.setNumRows(0);
        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(false);
        tbPedido.setEnabled(false);

        tbProdutoPedido.setEnabled(false);
        tfPesquisar.setEnabled(true);
        lblPesquisar.setEnabled(true);
        tbPedido.setEnabled(true);

        linhaPedidoAtual = -1;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            if (validarCampos()) {
                if (preencherObjeto()) {
                    if (acao == 1) {
                        if (pedidoData.cadastrarPedido(pedido)) {
                            JOptionPane.showMessageDialog(this, "Salvo com sucesso!", "Meu sistemas", JOptionPane.INFORMATION_MESSAGE);
                            btnCancelarActionPerformed(evt);
                        } else {
                            JOptionPane.showMessageDialog(this, "N??o salvou!!");
                        }
                    }
                    if (acao == 2) {

                        if (pedidoData.editar(pedido)) {
                            JOptionPane.showMessageDialog(this, "Atualizado com sucesso!", "Meu sistemas", JOptionPane.INFORMATION_MESSAGE);
                            btnCancelarActionPerformed(evt);
                        } else {
                            JOptionPane.showMessageDialog(this, "N??o atualizou!!");
                        }

                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyReleased
        try {
            DefaultTableModel mp = (DefaultTableModel) tbPedido.getModel();
            mp.setNumRows(0);
            if (tfPesquisar.getText().length() > 1) {
                listaDePedidos = pedidoData.pesquisar(tfPesquisar.getText());
                for (Pedido p : listaDePedidos) {
                    mp.addRow(new String[]{"" + p.getIdPedido(), p.getNome_cliente()});
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Erro ao pesquisar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tfPesquisarKeyReleased

    private void tbPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPedidoMouseClicked
        try {
            DefaultTableModel mpp = (DefaultTableModel) tbProdutoPedido.getModel();
            mpp.setNumRows(0);
            GastoData gastoData = new GastoData();
            int linhaSelecionada = tbPedido.getSelectedRow();
            if (linhaSelecionada > -1) {
                linhaPedidoAtual = linhaSelecionada;
                Funcionario func = gastoData.buscaFuncionario(listaDePedidos.get(linhaSelecionada).getCpfFuncionario());
                pedido.setCpfFuncionario(func.getNome_func());
                pedido.setIdPedido(listaDePedidos.get(linhaSelecionada).getIdPedido());
                pedido.setNome_cliente(listaDePedidos.get(linhaSelecionada).getNome_cliente());
                pedido.setProdutoPedido(listaDePedidos.get(linhaSelecionada).getProdutoPedido());

                linhaPedidoAtual = linhaSelecionada;
                lblValorID.setText("" + listaDePedidos.get(linhaSelecionada).getIdPedido());
                tfNomeCliente.setText(listaDePedidos.get(linhaSelecionada).getNome_cliente());
                cbFuncionario.setSelectedItem(func.getNome_func());
                for (ProdutoPedido prodPed : listaDePedidos.get(linhaSelecionada).getProdutoPedido()) {
                    Produto prod = pedidoData.pesquisaProduto(prodPed.getId_produto());
                    mpp.addRow(new String[]{"" + prod.getIdProduto(), prod.getNome_produto(), "" + prodPed.getQtd()});
                }

                btnEditar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Erro ao pesquisar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tbPedidoMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        try {
            int linhaSelecionada = tbProdutoPedido.getSelectedRow();

            if (linhaSelecionada > -1) {
                DefaultTableModel mpp = (DefaultTableModel) tbProdutoPedido.getModel();
                pedido.removerPedidoProduto(linhaSelecionada);
                mpp.removeRow(linhaSelecionada);
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            habilitarCampos(true);
            tbPedido.setEnabled(false);
            tbProdutoPedido.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnNovo.setEnabled(false);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnSalvar.setEnabled(true);

            acao = 2;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tbProdutoPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoPedidoMouseClicked
        try {
            if (tbProdutoPedido.getSelectedRow() > -1) {
                btnRemover.setEnabled(true);

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tbProdutoPedidoMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            if (pedidoData.excluir(Integer.parseInt(lblValorID.getText()))) {
                JOptionPane.showMessageDialog(this, "Exclu??do com sucesso!");
                btnCancelarActionPerformed(evt);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Erro ao pesquisar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbFuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAdicionarProduto;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblProdutoPedido;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblSelecionar;
    private javax.swing.JLabel lblValorID;
    private javax.swing.JSpinner spinQtd;
    private javax.swing.JTable tbPedido;
    private javax.swing.JTable tbProdutoPedido;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextField tfProduto;
    private javax.swing.JTextField tfSelecionar;
    // End of variables declaration//GEN-END:variables

    public void habilitarCampos(boolean valor) {
        lblID.setEnabled(valor);
        lblNomeCliente.setEnabled(valor);
        lblProduto.setEnabled(valor);
        lblQtd.setEnabled(valor);
        lblSelecionar.setEnabled(valor);
        lblValorID.setEnabled(valor);
        lblFuncionario.setEnabled(valor);
        lblProdutoPedido.setEnabled(valor);
        lblAdicionarProduto.setEnabled(valor);

        cbFuncionario.setEnabled(valor);
        tfNomeCliente.setEnabled(valor);
        tfSelecionar.setEnabled(valor);

        tbProdutos.setEnabled(valor);
    }

    private boolean validarCampos() {
        String msg = "";
        if (tfNomeCliente.getText().length() < 3) {
            msg += "\nO nome deve ter pelo menos 3 caracteres";
        }
        if (tbProdutoPedido.getRowCount() < 1) {
            msg += "\nNenhum produto foi adicionado";
        }

        if (msg.length() == 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Corrija os seguintes campos:" + msg,
                    "Meu sistema", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean preencherObjeto() {
        pedido.setCpfFuncionario("" + cbFuncionario.getSelectedItem());
        pedido.setIdPedido(Integer.parseInt(lblValorID.getText()));
        pedido.setNome_cliente(tfNomeCliente.getText());
        pedido.setProdutoPedido(new ArrayList<>());

        for (int i = 0; i < tbProdutoPedido.getRowCount(); i++) {
            ProdutoPedido produtoPedido = new ProdutoPedido();
            produtoPedido.setId_produto(Integer.parseInt(tbProdutoPedido.getValueAt(i, 0).toString()));
            produtoPedido.setQtd(Integer.parseInt(tbProdutoPedido.getValueAt(i, 2).toString()));
            pedido.adicionarPedidoProduto(produtoPedido);
        }

        return true;
    }

}
