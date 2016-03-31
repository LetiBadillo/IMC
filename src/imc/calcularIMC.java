/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

/**
 *
 * @author ASUS
 */
public class calcularIMC extends JFrame implements ActionListener{
    
   
    
   JPanel panel;
 	JButton calcular;
 	JLabel estatura, peso;
 	JTextField tfpeso, tfestatura;

        public calcularIMC(){
 	
            
            panel = new JPanel ();
            GroupLayout layout = new GroupLayout(panel);
            panel.setLayout(layout);
            layout.setAutoCreateGaps(true);
            layout.setAutoCreateContainerGaps(true);
            
            calcular = new JButton("Calcular");
        
        peso = new JLabel("Peso (kg.):");
        tfpeso= new JTextField(5);
 	estatura = new JLabel("Estatura(m.):");
        tfestatura = new JTextField(13);
 	calcular.setToolTipText("Click para calcular.");
 	calcular.setBackground(Color.WHITE);
 	calcular.setForeground(Color.RED);
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addGroup(layout.createParallelGroup().addComponent(peso).addComponent(estatura));
        hGroup.addGroup(layout.createParallelGroup().addComponent(tfpeso).addComponent(tfestatura));
        hGroup.addGroup(layout.createParallelGroup().addComponent(calcular));
        layout.setHorizontalGroup(hGroup);
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(peso).addComponent(tfpeso));
        vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(estatura).addComponent(tfestatura).addComponent(calcular));
        layout.setVerticalGroup(vGroup);
        
        panel.add(calcular);
 	add(panel);

 	
 	calcular.addActionListener((ActionListener) this);

 	}
        

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==calcular){
                    
                        double IMC, peso, estatura;
                        estatura= Double.parseDouble(tfestatura.getText());
                        peso = Double.parseDouble(tfpeso.getText());
                        IMC= peso/(estatura*estatura);
                        String r;
                                if (IMC <= 18.4){
                                    r= "insuficiencia ponderal. Acuda a un nutriologo.";
                                    }else{
                                if (IMC >= 15.5 && IMC <= 24.9);
                                r="un peso normal.";
                                }
                                if (IMC >= 29.9&&IMC <= 25){
                                r="un pero normal.";}
                                if (IMC >= 30&&IMC <= 34.9){
                                r="Obesidad I. Acuda a un nutriologo.";}
                                if (IMC >= 35&&IMC <= 39.9){
                                r="Obesidad II. Acuda a un nutriologo.";}
                                if (IMC >= 40){
                                r="Obesidad III. Acuda a un nutriologo.";}        
                        JLabel imc = new JLabel("Su índice de masa corporal es: "+IMC+" \nUsted tiene "+r);
                        
                        JOptionPane.showMessageDialog(null,imc.getText(),"Calculadora IMC", JOptionPane.INFORMATION_MESSAGE);
		}

	}
        
        
    
}
