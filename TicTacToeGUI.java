/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalproject;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author samestrada
 */
public class TicTacToeGUI extends javax.swing.JFrame {
    private int i = 0;
    private String startGame = "X";
    private int b1 = 10;
    private int b2 = 10;
    private int b3 = 10;
    private int b4 = 10;
    private int b5 = 10;
    private int b6 = 10;
    private int b7 = 10;
    private int b8 = 10;
    private int b9 = 10;
    private int xCount = 0;
    private int oCount = 0;
    private int tieCount = 0;
    JFrame frame = new JFrame("Exit");
   
    /**
     * Creates new form TicTacToeGUI
     */
    public TicTacToeGUI() {
        initComponents();
    }
    
    private void choosePlayer() {
        if(startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        }
        else {
            startGame = "X";
        }
    }
    
    private void isGameOver() {
        
    }
    private void winningGame() {
        if ((b1 == 1 && b2 == 1 && b3 == 1) ||
            (b4 == 1 && b5 == 1 && b6 == 1) ||
            (b7 == 1 && b8 == 1 && b9 == 1)||
            (b1 == 1 && b4 == 1 && b7 == 1) ||
            (b2 == 1 && b5 == 1 && b8 == 1) ||
            (b3 == 1 && b6 == 1 && b9 == 1) ||
            (b1 == 1 && b5 == 1 && b9 == 1) ||
            (b3 == 1 && b5 == 1 & b7 == 1)) {
            JOptionPane.showInternalMessageDialog(null, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            xCountLabel.setText(String.valueOf(xCount));
        }
        else if (i == 9) {
            JOptionPane.showInternalMessageDialog(null, "It's a Tie", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
            tieCount++;
            tieCountLabel.setText(String.valueOf(tieCount));
        }
//        if (b1 == 1 && b2 == 1 && b3 == 1) {
//            JOptionPane.showInternalMessageDialog(null, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            xCount++;
//            xCountLabel.setText(String.valueOf(xCount));
//        }
//        
//        else if (b4 == 1 && b5 == 1 && b6 == 1) {
//            JOptionPane.showInternalMessageDialog(null, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            xCount++;
//            xCountLabel.setText(String.valueOf(xCount));
//        }  
//        
//        else if (b7 == 1 && b8 == 1 && b9 == 1) {
//            JOptionPane.showInternalMessageDialog(null, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            xCount++;
//            xCountLabel.setText(String.valueOf(xCount));
//        }  
//        
//        else if (b1 == 1 && b4 == 1 && b7 == 1) {
//            JOptionPane.showInternalMessageDialog(null, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            xCount++;
//            xCountLabel.setText(String.valueOf(xCount));
//        }  
//        
//        else if (b2 == 1 && b5 == 1 && b8 == 1) {
//            JOptionPane.showInternalMessageDialog(null, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            xCount++;
//            xCountLabel.setText(String.valueOf(xCount));
//        }  
//        
//        else if (b3 == 1 && b6 == 1 && b9 == 1) {
//            JOptionPane.showInternalMessageDialog(null, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            xCount++;
//            xCountLabel.setText(String.valueOf(xCount));
//        }  
//        
//        else if (b1 == 1 && b5 == 1 && b9 == 1) {
//            JOptionPane.showInternalMessageDialog(null, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            xCount++;
//            xCountLabel.setText(String.valueOf(xCount));
//        }  
//        
//        else if (b3 == 1 && b5 == 1 && b7 == 1) {
//            JOptionPane.showInternalMessageDialog(null, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            xCount++;
//            xCountLabel.setText(String.valueOf(xCount));
//        }
//        
//        
//        // o Count winning
//        else if (b1 == 0 && b2 == 0 && b3 == 0) {
//            JOptionPane.showInternalMessageDialog(null, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            oCount++;
//            oCountLabel.setText(String.valueOf(oCount));
//        }
//        
//        else if (b4 == 0 && b5 == 0 && b6 == 0) {
//            JOptionPane.showInternalMessageDialog(null, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            oCount++;
//            oCountLabel.setText(String.valueOf(oCount));
//        }  
//        
//        else if (b7 == 0 && b8 == 0 && b9 == 0) {
//            JOptionPane.showInternalMessageDialog(null, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            oCount++;
//            oCountLabel.setText(String.valueOf(oCount));
//        }  
//        
//        else if (b1 == 0 && b4 == 0 && b7 == 0) {
//            JOptionPane.showInternalMessageDialog(null, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            oCount++;
//            oCountLabel.setText(String.valueOf(oCount));
//        }  
//        
//        else if (b2 == 0 && b5 == 0 && b8 == 0) {
//            JOptionPane.showInternalMessageDialog(null, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            oCount++;
//            oCountLabel.setText(String.valueOf(oCount));
//        }  
//        
//        else if (b3 == 0 && b6 == 0 && b9 == 0) {
//            JOptionPane.showInternalMessageDialog(null, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            oCount++;
//            oCountLabel.setText(String.valueOf(oCount));
//        }  
//        
//        else if (b1 == 0 && b5 == 0 && b9 == 0) {
//            JOptionPane.showInternalMessageDialog(null, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            oCount++;
//            oCountLabel.setText(String.valueOf(oCount));
//        }  
//        
//        else if (b3 == 0 && b5 == 0 && b7 == 0) {
//            JOptionPane.showInternalMessageDialog(null, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            oCount++;
//            oCountLabel.setText(String.valueOf(oCount));
//        }
//        
//        else if (i == 9) {
//            JOptionPane.showInternalMessageDialog(null, "It's a Tie", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
//            tieCount++;
//            tieCountLabel.setText(String.valueOf(tieCount));
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        xCountLabel = new javax.swing.JLabel();
        oCountLabel = new javax.swing.JLabel();
        tieCountLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn5 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btn6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        btn8 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btn1.setFont(new java.awt.Font("Helvetica Neue", 0, 52)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btn2.setFont(new java.awt.Font("Helvetica Neue", 0, 52)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btn3.setFont(new java.awt.Font("Helvetica Neue", 0, 52)); // NOI18N
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                licked(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        xCountLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        xCountLabel.setText("0");

        oCountLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        oCountLabel.setText("0");

        tieCountLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        tieCountLabel.setText("0");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Player X Count:");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setText("Player O Count:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setText("Tie Count:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oCountLabel)
                    .addComponent(xCountLabel)
                    .addComponent(tieCountLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xCountLabel)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oCountLabel)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tieCountLabel)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btn4.setFont(new java.awt.Font("Helvetica Neue", 0, 52)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btn5.setFont(new java.awt.Font("Helvetica Neue", 0, 52)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btn6.setFont(new java.awt.Font("Helvetica Neue", 0, 52)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btn7.setFont(new java.awt.Font("Helvetica Neue", 0, 52)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btn8.setFont(new java.awt.Font("Helvetica Neue", 0, 52)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btn9.setFont(new java.awt.Font("Helvetica Neue", 0, 52)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnReset.setFont(new java.awt.Font("Helvetica Neue", 0, 26)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnExit.setFont(new java.awt.Font("Helvetica Neue", 0, 26)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>                        

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        //System.exit(0);
    }                                    

    private void licked(java.awt.event.MouseEvent evt) {                        
        // TODO add your handling code here:
        //btn3.setText("X");
    }                       

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
//        btn1.setText(" ");
//        btn2.setText(" ");
//        btn3.setText(" ");
//        btn4.setText(" ");
//        btn5.setText(" ");
//        btn6.setText(" ");
//        btn7.setText(" ");
//        btn8.setText(" ");
//        btn9.setText(" ");
//        b1 = 10;
//        b2 = 10;
//        b3 = 10;
//        b4 = 10;
//        b5 = 10;
//        b6 = 10;
//        b7 = 10;
//        b8 = 10;
//        b9 = 10;
    }                                     

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(frame, "Are you sure you want to quit?", "TicTacToe", JOptionPane.YES_NO_CANCEL_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }                                       

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            btn1.setForeground(Color.RED);
            b1 = 1;
            i++;
        } 
        else {
            btn1.setForeground(Color.BLUE);
            b1 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }                                    

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            btn2.setForeground(Color.RED);
            b2 = 1;
            i++;
        } 
        else {
            btn2.setForeground(Color.BLUE);
            b2 = 0;
            i++;
        }
        choosePlayer();
    }                                    

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            btn3.setForeground(Color.RED);
            b3 = 1;
            i++;
        } 
        else {
            btn3.setForeground(Color.BLUE);
            b3 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }                                    

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            btn4.setForeground(Color.RED);
            b4 = 1;
            i++;
        } 
        else {
            btn4.setForeground(Color.BLUE);
            b4 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }                                    

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            btn5.setForeground(Color.RED);
            b5 = 1;
            i++;
        } 
        else {
            btn5.setForeground(Color.BLUE);
            b5 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }                                    

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            btn6.setForeground(Color.RED);
            b6 = 1;
            i++;
        } 
        else {
            btn6.setForeground(Color.BLUE);
            b6 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }                                    

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            btn7.setForeground(Color.RED);
            b7 = 1;
            i++;
        } 
        else {
            btn7.setForeground(Color.BLUE);
            b7 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }                                    

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            btn8.setForeground(Color.RED);
            b8 = 1;
            i++;
        } 
        else {
            btn8.setForeground(Color.BLUE);
            b8 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }                                    

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")) {
            btn9.setForeground(Color.RED);
            b9 = 1;
            i++;
        } 
        else {
            btn9.setForeground(Color.BLUE);
            b9 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }                                    

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        btn1.setText(" ");
        btn2.setText(" ");
        btn3.setText(" ");
        btn4.setText(" ");
        btn5.setText(" ");
        btn6.setText(" ");
        btn7.setText(" ");
        btn8.setText(" ");
        btn9.setText(" ");
        b1 = 10;
        b2 = 10;
        b3 = 10;
        b4 = 10;
        b5 = 10;
        b6 = 10;
        b7 = 10;
        b8 = 10;
        b9 = 10;
        i = 0;
    }                                        

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGUI().setVisible(true);
            }
        });  
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel oCountLabel;
    private javax.swing.JLabel tieCountLabel;
    private javax.swing.JLabel xCountLabel;
    // End of variables declaration                   
}
