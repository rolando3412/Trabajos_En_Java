/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elevador1;


import javax.swing.JOptionPane;


public class Elevador1 {

    public static void main(String[] args) {
             int pisoActual=1;
       int continuar;
        do{
            JOptionPane.showMessageDialog(null," El elevador esta en el piso    "+pisoActual);
            Object[] pisos={ "Piso 1","Piso 2","Piso3"};
            pisoActual =Integer.parseInt(JOptionPane.showInputDialog("ingrese el piso donde se encuentra ")  );
            switch (pisoActual) {
               
                
                
                
               case 1:
                 
        
                    Object[] op1 = { "piso 2", "piso 3 ", "piso 4 ", " piso 5 " };
                    int sele1= JOptionPane.showOptionDialog( null,"Seleccione el piso al que desea ir  ", "Pisos",
                       
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,   null,op1,op1[1]);
               
              
                    if(sele1==0){
                    pisoActual=2;}
                    else{
                        if(sele1==1){
                        pisoActual=3; }

                        else{ 
                            if(sele1==2){
                            pisoActual=4;  }
                            else{
                            pisoActual=5; }
                         }
                    }
                    JOptionPane.showMessageDialog(null," Abriendo Puertas \n A llegado al piso seleccionado....   ");
                
                    break;
                case 2:
                    
                    
                      JOptionPane.showMessageDialog(null," Subiendo....   ");
                    Object[] op2= { "piso 1", "piso 3 ", "piso 4 ", " piso 5 " };
                    int sele2 = JOptionPane.showOptionDialog( null,"Seleccione el piso al que desea ir ", "Pisos",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,   null,op2,op2[1]);
            
                    if(sele2==0){
                        JOptionPane.showMessageDialog(null," BAJANDO....   ");
                        pisoActual=1;
                    }
                    else{
                        JOptionPane.showMessageDialog(null," SUBIENDO ....   ");
                        if(sele2==1){
                        pisoActual=3;
                        }
                        else{
                            if(sele2==2){
                            pisoActual=4;
                            }
                            else{
                               pisoActual=5;
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null," Abriendo Puertas \n A llegado al piso seleccionado....   ");
                    break;
                
                case 3:
                    Object[] op3= { "piso 1", "piso 2 ", "piso 4 ", " piso 5 " };
                    int sele3 = JOptionPane.showOptionDialog( null,"Seleccione el piso al que desea ir ", "Pisos",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,   null,op3,op3[0]);
                    if(sele3==0){
                    JOptionPane.showMessageDialog(null," BAJANDO....   ");
                    
                    pisoActual=1;
                    }
                    else{
                        
                       JOptionPane.showMessageDialog(null," SUBIENDO ....   ");
                       if(sele3==1){
                           pisoActual=2;}
                       else{
                           if(sele3==2){
                                pisoActual=4; }
                           else{
                                pisoActual=5;
                            }
                        }
                    } 
                    JOptionPane.showMessageDialog(null," Abriendo Puertas \n A llegado al piso seleccionado....   ");
                    break;       
                case 4:
                    Object[] op4= { "piso 1", "piso 2 ", "piso 3 ", " piso 5 " };
                    int sele4= JOptionPane.showOptionDialog( null,"Seleccione el piso al que desea ir", "Pisos",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,   null,op4,op4[1]);
                    if(sele4<=2){
                        JOptionPane.showMessageDialog(null," BAJANDO....   ");
                    }
                    else
                        JOptionPane.showMessageDialog(null," SUBIENDO....   ");
                    if(sele4==0){
                    pisoActual=1;}
                    else{
                        if(sele4==1){
                        pisoActual=2; }

                        else{ 
                            if(sele4==2){
                            pisoActual=3;  }
                            else{
                            pisoActual=5; }
                         }
                    }
                    
                    
                    JOptionPane.showMessageDialog(null," Abriendo Puertas \n A llegado al piso seleccionado....   ");
                    break;  
      
                case 5:
                    Object[] op5= { "piso 1", "piso 2 ", "piso 3 ", " piso 4 " };
                    int sele5 = JOptionPane.showOptionDialog( null,"Seleccione el piso al que desea ir", "Pisos",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,   null,op5,op5[1]);
                
                    //JOptionPane.showMessageDialog(null,"    BAJANDO....   ");
                    if(sele5==0){
                        pisoActual=1;
                    }
               
                    else{
                        if(sele5==1){
                            pisoActual=2;
                        }
                        else{
                            if(sele5==2){
                               pisoActual=3;  }
                            else{
                               pisoActual=4;    }
                   
                        }
                    }
                    JOptionPane.showMessageDialog(null," Abriendo Puertas \n A llegado al piso seleccionado....   ");
                    break; 
     
              
            }    //fin de do
       
          continuar = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea volver a ir a otro piso",
                    "Continuar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
      
       }while(continuar == JOptionPane.YES_OPTION);
        
        
        
        
     
    }
}
