
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public final class FormCliente extends javax.swing.JFrame {

    List<Cliente> clientes = new ArrayList();
    public int codCliente = 1000;

    /**
     * Creates new form FormCliente
     */
    public FormCliente() {
        initComponents();
        cadastrarCliente(this.getCod(), 639999999, 2015, "11111111101", "Alexandre Freitas");
        cadastrarCliente(this.getCod(), 639888888, 2011, "22222222202", "Maria Fernanda");
        cadastrarCliente(this.getCod(), 639777777, 2019, "33333333303", "Carlos Eduardo");
        cadastrarCliente(this.getCod(), 639455555, 2001, "55555555505", "João Marinho");
        cadastrarCliente(this.getCod(), 639666666, 2002, "444444444404", "Maria Júlia");
    }

   
    public Cliente existeCliente(String CPF) {
        for (Cliente c : clientes) {
            if (c.getCPF().equals(CPF)) {
                return c;
            }
        }
        return null;
    }

    public int getCod() {
        this.codCliente += 1;
        return codCliente;
    }

    public void cadastrarCliente(int codigo, int celular, int anoCompra, String CPF, String nome) {
        clientes.add(new Cliente(codigo, celular, anoCompra, CPF, nome));
    }

    public void Cadastrar() {
        if (existeCliente(tfCPF.getText()) == null) {
            cadastrarCliente(getCod(), Integer.parseInt(tfCelular.getText()), Integer.parseInt(tfAnoCompra.getText()), tfCPF.getText(), tfNome.getText());
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            Limpar();
        } else {
            JOptionPane.showMessageDialog(null, "CPF já cadastrado!!");
        }
    }

    public void Limpar() {
        tfCPF.setText(null);
        tfCelular.setText(null);
        tfCodigo.setText(null);
        tfNome.setText(null);
        tfAnoCompra.setText(null);
        taSaida.setText(null);
    }
    

    public void Excluir() {
        if (tfCPF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o CPF");
        } else {
            Cliente c = existeCliente(tfCPF.getText());

            if (c != null) {
                clientes.remove(c);
                JOptionPane.showMessageDialog(null, "Vendedor Excluído");
                Limpar();
                btnExcluir.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "CPF não encontrado!");
            }
        }
    }
    public void consultarCPF() {
        if (tfCPF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o CPF!");
        } else {
            Cliente c = existeCliente(tfCPF.getText());

            if (c != null) {
                tfNome.setText(c.getNome());
                tfCelular.setText(c.getCelular() + "");
                tfCodigo.setText(c.getCodigo() + "");
                tfAnoCompra.setText(c.getanoCompra() + "");
                btnExcluir.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "CPF não encontrado!");
            }
        }
        Limpar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCPF = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfCelular = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        btnLimpar = new javax.swing.JButton();
        rbTodos = new javax.swing.JRadioButton();
        rbTempo = new javax.swing.JRadioButton();
        btnImprimir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfAnoCompra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CPF: ");

        jLabel2.setText("Nome: ");

        jLabel3.setText("Celular: ");

        jLabel4.setText("Código: ");

        tfCodigo.setEditable(false);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTodos);
        rbTodos.setSelected(true);
        rbTodos.setText("Todos");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTempo);
        rbTempo.setText("Tempo de Todos");

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jLabel5.setText("Ano da Compra: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCadastrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnConsultar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExcluir)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(5, 5, 5)
                                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbTempo)
                                    .addComponent(rbTodos)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAnoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnImprimir)
                                .addGap(18, 18, 18)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 125, Short.MAX_VALUE)
                        .addComponent(btnImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbTodos)
                            .addComponent(jLabel4)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTempo)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfAnoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrar)
                            .addComponent(btnConsultar)
                            .addComponent(btnExcluir)
                            .addComponent(btnLimpar))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
      consultarCPF();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Cadastrar();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTodosActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        if (rbTodos.isSelected()) {
            taSaida.setText("\t Dados Clientes: \n");
            for (Cliente c : clientes) {
                taSaida.append("CPF: " + c.getCPF() + " Código: " + c.getCodigo() + " Nome: " + c.getNome() + " Celular: " + c.getCelular() + " Ano da Compra: " + c.getanoCompra() + "\n");

            }
        } else {
            for (Cliente c : clientes) {
                taSaida.append("Nome: " + c.getNome() + " Tempo de cliente: " + c.getTempo() + " ano(s) \n");
            }

        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbTempo;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfAnoCompra;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

}
