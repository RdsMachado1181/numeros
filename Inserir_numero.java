/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project._num;

import java.util.Scanner;

/**
 *
 * @author rdsmachado
 */
public class Inserir_numero {
 
  Respostas_Numero num01 = new Respostas_Numero();
Resposta_erros erro03 = new Resposta_erros();


    Scanner inserir = new Scanner( System.in);
    
    private int numero =0;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    public void Inserir_numero(  ) {
     
        numero=  inserir.nextInt();
        
     if(numero > 0 & numero < 10){
       
       num01.resposta(this);
       
     } else if( numero > 11 & numero < 20){
         
       num01.resposta(this);
       
     }else{
       erro03.erros_resp(this);
     }
     
    }
    
    
}
