/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

import javax.swing.JOptionPane;

/**
 *
 * @author Rogerio
 */
public class JogoEcologico {
    
    public static void main (String[] args){
        
        int Pontos = 0;
        String usuario;
        usuario = JOptionPane.showInputDialog("Digite seu nome :");
        JOptionPane.showMessageDialog(null,"Seja bem vindo(a)" + usuario);
        String fase1, fase2;
        fase1 = JOptionPane.showInputDialog("\n Usuario : " +usuario +" Pontos : " + Pontos+"\n"
                +"Indique uma vantagem da energia solar ? \n"
                +"A) Não polui. \n"
                +"B) Não é renovável. \n"
                +"C) É eficaz em qualquer clima. \n"
                +"D) É disponível a todo momento. \n");
       if(("A".equals(fase1))){
       JOptionPane.showMessageDialog(null,"Resposta correta!");
       Pontos = Pontos + 1;
       } 
       else{
        JOptionPane.showMessageDialog(null,"Resposta errada");
        JOptionPane.showMessageDialog(null,"Sua pontuação foi : "+ Pontos);
        System.exit(0);
       }
       
       fase1 = JOptionPane.showInputDialog(null,"\n Usuario : " +usuario+ "Pontos : " +Pontos+"\n"
                 +" Qual dos elementos abaixo não é utilizado como fonte de energia? \n"
                 +"A) Água corrente. \n"
                 +"B) Petróleo \n"
                 +"C) Barra de ferro \n"
                 +"D) Sol");
       
        if(("C".equals(fase1))){
       JOptionPane.showMessageDialog(null,"Resposta correta!");
       Pontos = Pontos + 1;
       } 
         else{
        JOptionPane.showMessageDialog(null,"Resposta errada");
        Pontos = Pontos/2;
        JOptionPane.showMessageDialog(null,"Sua pontuação foi : "+ Pontos);
        System.exit(0);
       }
       
        fase1 = JOptionPane.showInputDialog(null,"\n Usuario : " +usuario+ "Pontos : " +Pontos+"\n"
                 +" O que é Reciclagem?? \n"
                 +"A) Jogar fora” o lixo produzido. \n"
                 +"B) Coletar todo tipo de material existente em lixos recicláveis. \n"
                 +"C) Nome dado para todo o processo do lixo após seu descarte. \n"
                 +"D) Processo de transformação de materiais usados em novos produtos para consumo.");
        
        if(("D".equals(fase1))){
       JOptionPane.showMessageDialog(null,"Resposta correta!");
       Pontos = Pontos + 1;
        }
        else{
        JOptionPane.showMessageDialog(null,"Resposta errada");
        Pontos = Pontos/2;
        JOptionPane.showMessageDialog(null,"Sua pontuação foi : "+ Pontos);
        System.exit(0);
       }
        
    fase1 = JOptionPane.showInputDialog(null,"\n Usuario : " +usuario+ "Pontos : " +Pontos+"\n"
                 +" O que é coleta seletiva? \n"
                 +"A) Processo de separação e recolhimento dos resíduos para o reaproveitamento. \n"
                 +"B) Destinação de resíduos para lixões e aterros. \n"
                 +"C) Processo de envio de todo lixo produzido para cooperativas ou entrega para catadores de rua. \n"
                 +"D) A escolha aleatória do melhor lixo produzido.");   
        
        if(("D".equals(fase1))){
       JOptionPane.showMessageDialog(null,"Resposta correta!");
       Pontos = Pontos + 1;
        } 
        
        else{
        JOptionPane.showMessageDialog(null,"Resposta errada");
        Pontos = Pontos/2;
        JOptionPane.showMessageDialog(null,"Sua pontuação foi : "+ Pontos);
        System.exit(0);
       }
    
    JOptionPane.showMessageDialog(null,"PARABENS!! VOCÊ CHEGOU A SEGUNDA FASE ");
    fase2 = JOptionPane.showInputDialog("\n Usuario "+usuario+"Pontos :"+Pontos+"\n"
                 +" Como preservar árvores e florestas? \n"
                 +"A) Construindo uma casa na árvore. \n"
                 +"B) Reciclando papéis, jornais e revistas. \n"
                 +"C) Reutilizando metais e vidros. \n"
                 +"D) Indo em parques. \n");
        
       if(("D".equals(fase2))){
       JOptionPane.showMessageDialog(null,"Resposta correta!");
       Pontos = Pontos + 3;
        }    
        else{
        JOptionPane.showMessageDialog(null,"Resposta errada");
        Pontos = Pontos/2;
        JOptionPane.showMessageDialog(null,"Sua pontuação foi : "+ Pontos);
        System.exit(0);
       }
        
    
    fase2 = JOptionPane.showInputDialog("\n Usuario "+usuario+"Pontos :"+Pontos+"\n"
                 +" Qual dos gases abaixo não é conhecido como um dos gases do efeito estufa – GEE? \n"
                 +"A) N2O – óxido nitroso. \n"
                 +"B) O2 – oxigênio. \n"
                 +"C) CO2 – dióxido de carbono ou gás carbônico. \n"
                 +"D) CH4 – metano. \n");  
       
       
      if(("B".equals(fase2))){
       JOptionPane.showMessageDialog(null,"Resposta correta!");
       Pontos = Pontos + 3;
        }    
        else{
        JOptionPane.showMessageDialog(null,"Resposta errada");
        Pontos = Pontos/2;
        JOptionPane.showMessageDialog(null,"Sua pontuação foi : "+ Pontos);
        System.exit(0);
       } 
       
    
    fase2 = JOptionPane.showInputDialog("\n Usuario "+usuario+"Pontos :"+Pontos+"\n"
                 +" A Lei da Política Nacional do Meio Ambiente tem por objetivo:? \n"
                 +"A) Incentivar o estudo as questoes ambientais e o uso da tecnologia em prol delas. \n"
                 +"B) Nenhuma das opções. \n"
                 +"C) Controle pontencial da emissão de gases em industrias de grande porte. \n"
                 +"D) Fiscalizar a ultilização da coleta seletiva nos bairros. \n");  
       
       
      if(("A".equals(fase2))){
       JOptionPane.showMessageDialog(null,"Resposta correta!");
       Pontos = Pontos + 3;
        }    
        else{
        JOptionPane.showMessageDialog(null,"Resposta errada");
        Pontos = Pontos/2;
        JOptionPane.showMessageDialog(null,"Sua pontuação foi : "+ Pontos);
        System.exit(0);
       }    
       
        fase2 = JOptionPane.showInputDialog("\n Usuario "+usuario+"Pontos :"+Pontos+"\n"
                 +" Qual das opções abaixo é um exemplo de reciclagem? \n"
                 +"A) Incineração. \n"
                 +"B) Todas as opções são exemplo de reciclagem. \n"
                 +"C) Acúmulo de matéria-prima. \n"
                 +"D) Coleta Seletiva. \n");  
       
       
      if(("D".equals(fase2))){
       JOptionPane.showMessageDialog(null,"Resposta correta!");
       Pontos = Pontos + 3;
        }    
        else{
        JOptionPane.showMessageDialog(null,"Resposta errada");
        Pontos = Pontos/2;
        JOptionPane.showMessageDialog(null,"Sua pontuação foi : "+ Pontos);
        System.exit(0);
       } 
      
      JOptionPane.showMessageDialog(null,"PARABENS VOCE E ECOLOGICAMENTO CORRETO ");
       
         
        
    }   
}
