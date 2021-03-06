/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import data.GastoData;
import extras.TratarFormularios;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import model.Gasto;

/**
 *
 * @author thale
 */
public class JIFGasto extends javax.swing.JInternalFrame {

    private Gasto gasto;
    private GastoData gastoData;
    private ArrayList<Gasto> listaDeGastos;
    private int acao;
    private ArrayList<Funcionario> listaFuncionario;

    /**
     * Creates new form JIFGasto
     */
    public JIFGasto() {
        try {
            gasto = new Gasto();
            gastoData = new GastoData();
            acao = 0;
            initComponents();

            listaFuncionario = gastoData.buscaFuncionarios();
            DefaultComboBoxModel cbModel = (DefaultComboBoxModel) cbFuncionario.getModel();

            for (Funcionario func : listaFuncionario) {
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
        lblValorID = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        lblDia = new javax.swing.JLabel();
        ftfDia = new javax.swing.JFormattedTextField();
        lblValor = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();
        cbFuncionario = new javax.swing.JComboBox<>();
        lblFuncionario = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Gastos");

        lblID.setText("ID");
        lblID.setEnabled(false);

        lblValorID.setText("0");
        lblValorID.setEnabled(false);

        lblDescricao.setText("Descri????o");
        lblDescricao.setEnabled(false);

        taDescricao.setColumns(20);
        taDescricao.setRows(5);
        taDescricao.setEnabled(false);
        jScrollPane1.setViewportView(taDescricao);

        lblDia.setText("Dia");
        lblDia.setEnabled(false);

        ftfDia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        ftfDia.setToolTipText("");
        ftfDia.setEnabled(false);

        lblValor.setText("Valor");
        lblValor.setEnabled(false);

        tfValor.setEnabled(false);
        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
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

        lblPesquisar.setText("Pesquisar");

        tfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarActionPerformed(evt);
            }
        });
        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyReleased(evt);
            }
        });

        tbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Dia", "Descri????o", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPesquisaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbPesquisa);

        cbFuncionario.setEnabled(false);

        lblFuncionario.setText("Funcion??rio");
        lblFuncionario.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblID))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPesquisar)
                                .addGap(18, 18, 18)
                                .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblValor)
                                    .addComponent(lblDia)
                                    .addComponent(lblDescricao)
                                    .addComponent(lblFuncionario))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftfDia, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValorID)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnEditar)
                                .addGap(33, 33, 33)
                                .addComponent(btnExcluir))
                            .addComponent(btnNovo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(lblValorID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDia)
                    .addComponent(ftfDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncionario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisar)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorActionPerformed

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        try {

            habilitarCampos(true);
            tfValor.setText("");
            ftfDia.setText("");
            taDescricao.setText("");
            lblValorID.setText("0");
            cbFuncionario.setSelectedIndex(-1);

            btnCancelar.setEnabled(true);
            btnSalvar.setEnabled(true);
            btnEditar.setEnabled(false);
            btnNovo.setEnabled(false);
            btnExcluir.setEnabled(false);
            tbPesquisa.setEnabled(false);
            tfPesquisar.setEnabled(false);
            lblPesquisar.setEnabled(false);

            acao = 1;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            if (validarCampos()) {
                if (preencherObjeto()) {
                    if (acao == 1) {
                        if (gastoData.cadastrarGasto(gasto)) {
                            JOptionPane.showMessageDialog(this, "Salvo com sucesso!", "Meu sistemas", JOptionPane.INFORMATION_MESSAGE);
                            btnCancelarActionPerformed(evt);
                        } else {
                            JOptionPane.showMessageDialog(this, "N??o salvou!!");
                        }
                    }
                    if (acao == 2) {
                        if (gastoData.editar(gasto)) {
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            habilitarCampos(false);
            btnNovo.setEnabled(true);
            btnCancelar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnSalvar.setEnabled(false);

            tfPesquisar.setEnabled(true);
            lblPesquisar.setEnabled(true);
            tbPesquisa.setEnabled(true);

            tfValor.setText("");
            ftfDia.setText("");
            taDescricao.setText("");
            lblValorID.setText("0");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyReleased
        try {
            DefaultTableModel mp = (DefaultTableModel) tbPesquisa.getModel();
            mp.setNumRows(0);
            if (tfPesquisar.getText().length() > 1) {
                listaDeGastos = gastoData.pesquisar(tfPesquisar.getText());
                for (Gasto p : listaDeGastos) {
                    mp.addRow(new String[]{"" + p.getId_gasto(), p.getDia_gasto(), p.getDescricao_gasto(), "" + p.getValor_gasto()});
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Erro ao pesquisar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tfPesquisarKeyReleased

    private void tbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPesquisaMouseClicked
        try {
            int linhaSelecionada = tbPesquisa.getSelectedRow();
            if (linhaSelecionada > -1) {
                tfValor.setText("" + listaDeGastos.get(linhaSelecionada).getValor_gasto());
                taDescricao.setText(listaDeGastos.get(linhaSelecionada).getDescricao_gasto());
                ftfDia.setText(listaDeGastos.get(linhaSelecionada).getDia_gasto());
                cbFuncionario.setSelectedItem(listaDeGastos.get(linhaSelecionada).getCpf_funcionario());
                lblValorID.setText("" + listaDeGastos.get(linhaSelecionada).getId_gasto());

                btnEditar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Erro ao pesquisar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tbPesquisaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            habilitarCampos(true);
            tbPesquisa.setEnabled(false);
            btnCancelar.setEnabled(true);
            btnNovo.setEnabled(false);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnSalvar.setEnabled(true);

            acao = 2;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            if (gastoData.excluir(Integer.parseInt(lblValorID.getText()))) {
                JOptionPane.showMessageDialog(this, "Exclu??do com sucesso!");
                TratarFormularios.limparCampos(this);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Erro ao pesquisar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbFuncionario;
    private javax.swing.JFormattedTextField ftfDia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValorID;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTable tbPesquisa;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables

    public void habilitarCampos(boolean valor) {
        lblDescricao.setEnabled(valor);
        lblDia.setEnabled(valor);
        lblID.setEnabled(valor);
        lblValor.setEnabled(valor);
        lblFuncionario.setEnabled(valor);

        tfValor.setEnabled(valor);
        ftfDia.setEnabled(valor);
        taDescricao.setEnabled(valor);
        lblValorID.setEnabled(valor);
        cbFuncionario.setEnabled(valor);
    }

    private boolean validarCampos() {
        String msg = "";
        if (taDescricao.getText().length() < 3) {
            msg += "\nA descri????o deve ter pelo menos 3 caracteres";
        }
        if (ftfDia.getText().length() == 0) {
            msg += "\nA data ?? inv??lida";
        }
        if (tfValor.getText().equals("")) {
            msg += "\nO valor deve ser preenchido!";
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
        gasto.setId_gasto(Integer.parseInt(lblValorID.getText()));
        gasto.setValor_gasto(Double.parseDouble(tfValor.getText()));
        gasto.setDescricao_gasto(taDescricao.getText());
        gasto.setDia_gasto(ftfDia.getText());
        gasto.setCpf_funcionario(cbFuncionario.getSelectedItem().toString());
        return true;
    }

}
