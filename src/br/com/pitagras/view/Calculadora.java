package br.com.pitagras.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.Objects;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class Calculadora {
    private JTextField jLabelResultado;
    private JLabel jLabelValorA;
    private JLabel jLabelValorB;

    private JTextField jTextFieldValorA;
    private JTextField jTextFieldValorB;

    private JButton jButtonAdd;
    private JButton jButtonSub;
    private JButton jButtonMul;
    private JButton jButtonDiv;
    private JButton jButtonClear;
    
    private JButton jButtonMemStore;
    private JButton jButtonMemRestore;
    private JButton jButtonMemAdd;
    private JButton jButtonMemSub;
    private JButton jButtonMemClear;
    
    private JButton jButtonCopy;
    
    BigDecimal memoria;
    BigDecimal resultado;
    
    public Calculadora() {
        JFrame jFrameTelaPrincipal = new JFrame("Calculadora Simples");
        jFrameTelaPrincipal.setLayout(null);
        jFrameTelaPrincipal.setSize(450, 400);

        // Instãncia dos componentes
        jLabelResultado = new JTextField("Resultado");
        jLabelResultado.setEditable(false);
        jLabelValorA = new JLabel("Valor A:");
        jLabelValorB = new JLabel("Valor B:");

        jTextFieldValorA = new JTextField();
        jTextFieldValorB = new JTextField();

        jButtonAdd = new JButton("+");
        jButtonSub = new JButton("-");
        jButtonMul = new JButton("*");
        jButtonDiv = new JButton("/");
        jButtonClear = new JButton("Limpar");
        jButtonCopy = new JButton("Copia");
        
        jButtonMemStore = new JButton("MS");
        jButtonMemRestore = new JButton("MR");
        jButtonMemAdd = new JButton("M+");
        jButtonMemSub = new JButton("M-");
        jButtonMemClear = new JButton("MC");

        jLabelResultado.setBounds(10, 10, 280, 20);
        jLabelResultado.setBackground(new Color(255, 0, 0));

        jLabelValorA.setBounds(10, 30, 50, 20);
        jTextFieldValorA.setBounds(65, 30, 240, 20);

        jLabelValorB.setBounds(10, 55, 50, 20);
        jTextFieldValorB.setBounds(65, 55, 240, 20);

        jButtonAdd.setBounds(60, 80, 60, 50);
        jButtonSub.setBounds(120, 80, 60, 50);
        jButtonMul.setBounds(180, 80, 60, 50);
        jButtonDiv.setBounds(240, 80, 60, 50);
        jButtonCopy.setBounds(320, 80, 80, 50);
        jButtonCopy.setToolTipText("Copia valor de resultado");
        
        jButtonMemStore.setBounds(60, 140, 60, 50);
        jButtonMemStore.setToolTipText("Salva o valor de 'Resultado' na memoria");
        jButtonMemRestore.setBounds(120, 140, 60, 50);
        jButtonMemRestore.setToolTipText("Retorna o valor salva na memoria para 'Valor A'");
        jButtonMemAdd.setBounds(180, 140, 60, 50);
        jButtonMemAdd.setToolTipText("Soma o valor de 'Resultado' a memoria");
        jButtonMemSub.setBounds(240, 140, 60, 50);
        jButtonMemSub.setToolTipText("Subtrai o valor de 'Resultado' a memoria");
        jButtonMemClear.setBounds(320, 140, 60, 50);
        jButtonMemClear.setToolTipText("Retorna o valor salva na memoria para 0");
        
        jButtonClear.setBounds(60, 215, 240, 50);
        
        

        jButtonClear.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        acaoBotaoLimpar();
                    }
                }
        );
        
        jButtonCopy.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                    	acaoBotaoCopia();
                    }
                }
        );

        jButtonAdd.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        executarOperacao(actionEvent.getActionCommand());
                    }
                }
        );

        jButtonSub.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
//                        acaoBotaoSub();
                        executarOperacao(actionEvent.getActionCommand());
                    }
                }
        );
        
        jButtonMul.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        executarOperacao(actionEvent.getActionCommand());
                    }
                }
        );
        
        jButtonDiv.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        executarOperacao(actionEvent.getActionCommand());
                    }
                }
        );
        
        
        
        jButtonMemStore.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                    	executarOperacaoMemoria(actionEvent.getActionCommand());
                    }
                }
        );
        
        jButtonMemRestore.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                    	executarOperacaoMemoria(actionEvent.getActionCommand());
                    }
                }
        );
        
        jButtonMemAdd.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                    	executarOperacaoMemoria(actionEvent.getActionCommand());
                    }
                }
        );
        
        jButtonMemSub.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                    	executarOperacaoMemoria(actionEvent.getActionCommand());
                    }
                }
        );
        
        jButtonMemClear.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                    	executarOperacaoMemoria(actionEvent.getActionCommand());
                    }
                }
        );
        
        


        jFrameTelaPrincipal.add(jLabelResultado);
        jFrameTelaPrincipal.add(jLabelValorA);
        jFrameTelaPrincipal.add(jTextFieldValorA);
        jFrameTelaPrincipal.add(jLabelValorB);
        jFrameTelaPrincipal.add(jTextFieldValorB);
        jFrameTelaPrincipal.add(jButtonAdd);
        jFrameTelaPrincipal.add(jButtonSub);
        jFrameTelaPrincipal.add(jButtonMul);
        jFrameTelaPrincipal.add(jButtonDiv);
        jFrameTelaPrincipal.add(jButtonCopy);
        jFrameTelaPrincipal.add(jButtonMemStore);
        jFrameTelaPrincipal.add(jButtonMemRestore);
        jFrameTelaPrincipal.add(jButtonMemAdd);
        jFrameTelaPrincipal.add(jButtonMemSub);
        jFrameTelaPrincipal.add(jButtonMemClear);
        jFrameTelaPrincipal.add(jButtonClear);
        jFrameTelaPrincipal.setResizable(false);
        jFrameTelaPrincipal.setVisible(true);
        jFrameTelaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void executarOperacao(String actionCommand) {
    	try {
    		BigDecimal valorA = new BigDecimal(jTextFieldValorA.getText());
	        BigDecimal valorB = new BigDecimal(jTextFieldValorB.getText());
	        switch (actionCommand) {
	            case "+":
	                resultado = valorA.add(valorB);
	                jLabelResultado.setText("" + resultado);
	                break;
	            case "-":
	                resultado = valorA.subtract(valorB);
	                jLabelResultado.setText("" + resultado);
	                break;
	            case "*":
	                resultado = valorA.multiply(valorB);
	                jLabelResultado.setText("" + resultado);
	                break;
	            case "/":
	                resultado = valorA.divide(valorB);
	                jLabelResultado.setText("" + resultado);
	                break;
	        }
    	}catch(java.lang.NumberFormatException e) {
    		jLabelResultado.setText("Erro:Valores devem ser numeros");
    	}catch(java.lang.ArithmeticException e) {
    		jLabelResultado.setText("Erro:Divisao por zero");
    	}
    }
    
    private void executarOperacaoMemoria(String actionCommand) {
    	try {
    		//BigDecimal valorA = new BigDecimal(jTextFieldValorA.getText());
	        //BigDecimal valorB = new BigDecimal(jTextFieldValorB.getText());
	        //BigDecimal resultado;
	        switch (actionCommand) {
	            case "MS":
	            	if(!Objects.isNull(resultado))
	            		memoria = resultado;
	            	else
	            		jLabelResultado.setText("Erro:Resultado Vazio");
	                break;
	            case "MR":
	            	if(Objects.isNull(memoria))
	            		memoria = BigDecimal.valueOf(0);
	            	jTextFieldValorA.setText(memoria.toString());
	                break;
	            case "M+":
	            	if(!Objects.isNull(memoria))
	            		memoria = memoria.add(resultado);
	            	else
	            		memoria = resultado;
	                break;
	            case "M-":
	            	if(!Objects.isNull(memoria))
	            		memoria = memoria.subtract(resultado);
	            	else
	            		memoria = BigDecimal.valueOf(0);
	            		memoria = memoria.subtract(resultado);
	                break;
	            case "MC":
	            	memoria = BigDecimal.valueOf(0);
	                break;
	        }
    	}catch(java.lang.NumberFormatException e) {
    		jLabelResultado.setText("Erro:Valores devem ser numeros");
    	}catch(java.lang.ArithmeticException e) {
    		jLabelResultado.setText("Erro:Divisao por zero");
    	}
    }

//    private void acaoBotaoAdd() {
//        BigDecimal valorA = new BigDecimal(jTextFieldValorA.getText());
//        BigDecimal valorB = new BigDecimal(jTextFieldValorB.getText());
//        BigDecimal resultado = valorA.add(valorB);
//        jLabelResultado.setText("" + resultado);
//    }
//
//    private void acaoBotaoSub() {
//        BigDecimal valorA = new BigDecimal(jTextFieldValorA.getText());
//        BigDecimal valorB = new BigDecimal(jTextFieldValorB.getText());
//        BigDecimal resultado = valorA.add(valorB);
//        jLabelResultado.setText("" + resultado);
//    }

    private void acaoBotaoLimpar() {
        jLabelResultado.setText("Informe os valores para realizar a operação");
        jTextFieldValorA.setText("");
        jTextFieldValorB.setText("");
    }
    
    private void acaoBotaoCopia() {
        if(!Objects.isNull(resultado)) {
        	StringSelection stringSelection = new StringSelection(resultado.toString());
        	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        	clipboard.setContents(stringSelection, null);
        }else
        	jLabelResultado.setText("Erro:Resultado Vazio");
    }
}
