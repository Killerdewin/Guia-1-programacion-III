
package ejercicio;

public class Calcgrafica extends javax.swing.JFrame {
    String signo;
    
    calculadora objeto1 = new calculadora();

    public Calcgrafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Suma = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Multiplicacion = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Seno = new javax.swing.JButton();
        Coseno = new javax.swing.JButton();
        Tangente = new javax.swing.JButton();
        Raiz = new javax.swing.JButton();
        Exponente = new javax.swing.JButton();
        IVA = new javax.swing.JButton();
        UNO = new javax.swing.JButton();
        DOS = new javax.swing.JButton();
        TRES = new javax.swing.JButton();
        CUATRO = new javax.swing.JButton();
        CINCO = new javax.swing.JButton();
        SEIS = new javax.swing.JButton();
        SIETE = new javax.swing.JButton();
        OCHO = new javax.swing.JButton();
        NUEVE = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        CERO = new javax.swing.JButton();
        TextoPrin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Suma.setText("+");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });

        Resta.setText("-");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        Multiplicacion.setText("*");
        Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacionActionPerformed(evt);
            }
        });

        Division.setText("/");
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });

        Seno.setText("Seno");
        Seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenoActionPerformed(evt);
            }
        });

        Coseno.setText("Coseno");
        Coseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CosenoActionPerformed(evt);
            }
        });

        Tangente.setText("Tangente");
        Tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TangenteActionPerformed(evt);
            }
        });

        Raiz.setText("Raiz");
        Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaizActionPerformed(evt);
            }
        });

        Exponente.setText("x^2");
        Exponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExponenteActionPerformed(evt);
            }
        });

        IVA.setText("IVA");
        IVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVAActionPerformed(evt);
            }
        });

        UNO.setText("1");
        UNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNOActionPerformed(evt);
            }
        });

        DOS.setText("2");
        DOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOSActionPerformed(evt);
            }
        });

        TRES.setText("3");
        TRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRESActionPerformed(evt);
            }
        });

        CUATRO.setText("4");
        CUATRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUATROActionPerformed(evt);
            }
        });

        CINCO.setText("5");
        CINCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CINCOActionPerformed(evt);
            }
        });

        SEIS.setText("6");
        SEIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEISActionPerformed(evt);
            }
        });

        SIETE.setText("7");
        SIETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIETEActionPerformed(evt);
            }
        });

        OCHO.setText("8");
        OCHO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCHOActionPerformed(evt);
            }
        });

        NUEVE.setText("9");
        NUEVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVEActionPerformed(evt);
            }
        });

        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });

        Reset.setText("C");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        CERO.setText("0");
        CERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEROActionPerformed(evt);
            }
        });

        TextoPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoPrinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextoPrin)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SIETE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CUATRO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UNO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Coseno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(IVA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CINCO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Raiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Seno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OCHO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SEIS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(TRES, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NUEVE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Multiplicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Exponente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Tangente, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Suma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CERO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TextoPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tangente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Reset))
                    .addComponent(Seno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Coseno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Exponente)
                        .addComponent(Suma))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Resta)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UNO)
                        .addComponent(DOS)
                        .addComponent(TRES)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CUATRO)
                    .addComponent(CINCO)
                    .addComponent(SEIS)
                    .addComponent(Multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SIETE)
                    .addComponent(OCHO)
                    .addComponent(NUEVE)
                    .addComponent(Division))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CERO)
                    .addComponent(Igual))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        objeto1.a=Integer.valueOf(TextoPrin.getText());
        signo="+";
        TextoPrin.setText("");
    }//GEN-LAST:event_SumaActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        objeto1.a=Integer.valueOf(TextoPrin.getText());
        signo="-";
        TextoPrin.setText("");
    }//GEN-LAST:event_RestaActionPerformed

    private void MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacionActionPerformed
        objeto1.a=Integer.valueOf(TextoPrin.getText());
        signo="*";
        TextoPrin.setText("");
    }//GEN-LAST:event_MultiplicacionActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        objeto1.a=Integer.valueOf(TextoPrin.getText());
        signo="/";
        TextoPrin.setText("");
    }//GEN-LAST:event_DivisionActionPerformed

    private void SenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenoActionPerformed
        objeto1.a=Integer.valueOf(TextoPrin.getText());
        objeto1.seno();
        TextoPrin.setText(" = " + objeto1.c);      
    }//GEN-LAST:event_SenoActionPerformed

    private void CosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CosenoActionPerformed
        objeto1.a=Integer.valueOf(TextoPrin.getText());
        objeto1.coseno();
        TextoPrin.setText(" = " + objeto1.c);
    }//GEN-LAST:event_CosenoActionPerformed

    private void TangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TangenteActionPerformed
        objeto1.a=Integer.valueOf(TextoPrin.getText());
        objeto1.tangente();
        TextoPrin.setText(" = " + objeto1.c);
    }//GEN-LAST:event_TangenteActionPerformed

    private void RaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaizActionPerformed
        objeto1.a=Integer.valueOf(TextoPrin.getText());
        objeto1.raiz();
        TextoPrin.setText(" = " + objeto1.c);
    }//GEN-LAST:event_RaizActionPerformed

    private void ExponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExponenteActionPerformed
        objeto1.a=Integer.valueOf(TextoPrin.getText());
        objeto1.exponente();
        TextoPrin.setText(" = " + objeto1.c);
    }//GEN-LAST:event_ExponenteActionPerformed

    private void IVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVAActionPerformed
        objeto1.a=Integer.valueOf(TextoPrin.getText());
        objeto1.IVA();
        TextoPrin.setText("=" + objeto1.c);
    }//GEN-LAST:event_IVAActionPerformed

    private void UNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNOActionPerformed
        TextoPrin.setText(TextoPrin.getText()+ "1");
    }//GEN-LAST:event_UNOActionPerformed

    private void DOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOSActionPerformed
        TextoPrin.setText(TextoPrin.getText()+ "2");
    }//GEN-LAST:event_DOSActionPerformed

    private void TRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRESActionPerformed
        TextoPrin.setText(TextoPrin.getText()+ "3");
    }//GEN-LAST:event_TRESActionPerformed

    private void CUATROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUATROActionPerformed
        TextoPrin.setText(TextoPrin.getText()+ "4");
    }//GEN-LAST:event_CUATROActionPerformed

    private void CINCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CINCOActionPerformed
        TextoPrin.setText(TextoPrin.getText()+ "5");
    }//GEN-LAST:event_CINCOActionPerformed

    private void SEISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEISActionPerformed
        TextoPrin.setText(TextoPrin.getText()+ "6");
    }//GEN-LAST:event_SEISActionPerformed

    private void SIETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIETEActionPerformed
        TextoPrin.setText(TextoPrin.getText()+ "7");
    }//GEN-LAST:event_SIETEActionPerformed

    private void OCHOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OCHOActionPerformed
        TextoPrin.setText(TextoPrin.getText()+ "8");
    }//GEN-LAST:event_OCHOActionPerformed

    private void NUEVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVEActionPerformed
        TextoPrin.setText(TextoPrin.getText()+ "9");
    }//GEN-LAST:event_NUEVEActionPerformed

    private void CEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEROActionPerformed
        TextoPrin.setText(TextoPrin.getText()+ "0");
    }//GEN-LAST:event_CEROActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        objeto1.b=Integer.valueOf(TextoPrin.getText());
        
        switch(signo){
            case "+":
                objeto1.suma();
                TextoPrin.setText(" = " + objeto1.c);
            break;
            case "-":
                objeto1.resta();
                TextoPrin.setText(" = " + objeto1.c);
            break;
            case "*":
                objeto1.multiplicacion();
                TextoPrin.setText(" = " + objeto1.c);
            break;
            case "/":
                if(objeto1.b == 0){
                    TextoPrin.setText("ERROR");
                }else{
                    objeto1.division();
                TextoPrin.setText(" = " + objeto1.c);   
                }
            break;
        }
    }//GEN-LAST:event_IgualActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        TextoPrin.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void TextoPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoPrinActionPerformed

    }//GEN-LAST:event_TextoPrinActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calcgrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcgrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcgrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcgrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcgrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CERO;
    private javax.swing.JButton CINCO;
    private javax.swing.JButton CUATRO;
    private javax.swing.JButton Coseno;
    private javax.swing.JButton DOS;
    private javax.swing.JButton Division;
    private javax.swing.JButton Exponente;
    private javax.swing.JButton IVA;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Multiplicacion;
    private javax.swing.JButton NUEVE;
    private javax.swing.JButton OCHO;
    private javax.swing.JButton Raiz;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Resta;
    private javax.swing.JButton SEIS;
    private javax.swing.JButton SIETE;
    private javax.swing.JButton Seno;
    private javax.swing.JButton Suma;
    private javax.swing.JButton TRES;
    private javax.swing.JButton Tangente;
    private javax.swing.JTextField TextoPrin;
    private javax.swing.JButton UNO;
    // End of variables declaration//GEN-END:variables
}
