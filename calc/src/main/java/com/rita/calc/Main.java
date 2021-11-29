package com.rita.calc;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Main extends javax.swing.JFrame {
    private javax.swing.JButton ce;
    private javax.swing.JButton cinco;
    private javax.swing.JButton dividir;
    private javax.swing.JButton dois;
    private javax.swing.JTextField expressao;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton mais;
    private javax.swing.JButton menos;
    private javax.swing.JButton nove;
    private javax.swing.JButton oito;
    private javax.swing.JButton ponto;
    private javax.swing.JButton quatro;
    private javax.swing.JButton seis;
    private javax.swing.JButton sete;
    private javax.swing.JButton tres;
    private javax.swing.JButton um;
    private javax.swing.JButton vezes;
    private javax.swing.JButton zero;
    private Boolean executouExpressao = false;

    public Main() {
        initComponents();
        expressao.setHorizontalAlignment(SwingConstants.RIGHT);
    }

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        expressao = new javax.swing.JTextField();
        um = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        vezes = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        ponto = new javax.swing.JButton();
        mais = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        ce = new javax.swing.JButton();
        dois = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("calc"); // NOI18N

        expressao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                expressaoKeyPressed(evt);
            }
        });

        um.setText("1");
        um.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                umMouseClicked(evt);
            }
        });

        tres.setText("3");
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tresMouseClicked(evt);
            }
        });

        dividir.setText("/");
        dividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dividirMouseClicked(evt);
            }
        });

        quatro.setText("4");
        quatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quatroMouseClicked(evt);
            }
        });

        cinco.setText("5");
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cincoMouseClicked(evt);
            }
        });

        seis.setText("6");
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seisMouseClicked(evt);
            }
        });

        vezes.setText("*");
        vezes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vezesMouseClicked(evt);
            }
        });

        sete.setText("7");
        sete.setToolTipText("");
        sete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seteMouseClicked(evt);
            }
        });

        oito.setText("8");
        oito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oitoMouseClicked(evt);
            }
        });

        nove.setText("9");
        nove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noveMouseClicked(evt);
            }
        });

        menos.setText("-");
        menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menosMouseClicked(evt);
            }
        });

        zero.setText("0");
        zero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zeroMouseClicked(evt);
            }
        });

        ponto.setText(".");
        ponto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pontoMouseClicked(evt);
            }
        });

        mais.setText("+");
        mais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maisMouseClicked(evt);
            }
        });

        igual.setText("=");
        igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                igualMouseClicked(evt);
            }
        });

        ce.setText("CE");
        ce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ceMouseClicked(evt);
            }
        });

        dois.setLabel("2");
        dois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expressao)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(zero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(quatro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(um, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cinco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ponto, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(dois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vezes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(expressao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(um)
                    .addComponent(tres)
                    .addComponent(dividir)
                    .addComponent(dois))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quatro)
                    .addComponent(cinco)
                    .addComponent(seis)
                    .addComponent(vezes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sete)
                    .addComponent(oito)
                    .addComponent(nove)
                    .addComponent(menos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero)
                    .addComponent(ponto)
                    .addComponent(mais)
                    .addComponent(igual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ce)
                .addContainerGap())
        );

        pack();
    }

    private void umMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("1"));
    }

    private void tresMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("3"));
    }

    private void dividirMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("/"));
    }

    private void quatroMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("4"));
    }

    private void cincoMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("5"));
    }

    private void seisMouseClicked(java.awt.event.MouseEvent evt) {
        expressao.setText(expressao.getText().concat("6"));
    }

    private void vezesMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("*"));
    }

    private void seteMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("7"));
    }

    private void oitoMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("8"));
    }

    private void noveMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("9"));
    }

    private void menosMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("-"));
    }

    private void zeroMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("0"));
    }

    private void pontoMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("."));
    }

    private void igualMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            Expression resultado = new ExpressionBuilder(expressao.getText())
                .build();
            expressao.setText(String.valueOf(resultado.evaluate()));
            executouExpressao = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null,
                "Erro ao calcular expressão, por favor verifique se esta correto.",
                "Erro de expressão",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void maisMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("+"));
    }

    private void expressaoKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            igualMouseClicked(null);
        }
    }

    private void ceMouseClicked(java.awt.event.MouseEvent evt) {
        expressao.setText("");
        executouExpressao = false;
    }

    private void doisMouseClicked(java.awt.event.MouseEvent evt) {
        if (executouExpressao) {
            expressao.setText("");
            executouExpressao = false;
        }
        expressao.setText(expressao.getText().concat("2"));
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
