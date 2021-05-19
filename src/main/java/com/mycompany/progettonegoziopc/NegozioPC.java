/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettonegoziopc;

/**
 *
 * @author almab
 */
  
public class NegozioPC  
{
    private Pc[] elencoComputer;
    private final int N_MAX_PC=100;
     private int nPCPresenti=0;
   
    
     public NegozioPC ()
      {
          elencoComputer=new Pc[N_MAX_PC];
      }
     
     
     public int aggiungiPc(Pc computer)
    {
        if (nPCPresenti>N_MAX_PC)
            return -1;      
        elencoComputer[nPCPresenti] = new Pc(computer.getNome(),computer.getCodice(),computer.getQuantita());
        nPCPresenti++;
        return 0;
    }
      
      
      
       public int rimuoviPc(int posizione)
    {
        
        try
        {
            if(elencoComputer[posizione]==null)
               return -2;           
            elencoComputer[posizione]=null;
            return posizione;
        }
        catch(ArrayIndexOutOfBoundsException posizioneNonValida)
        {
            return -1;
        }
        
           
    }
       
       
       
        public int AggiungiUnaCertaQuantitaDiPc(String nome,int quantita)
    {
        for(int i=0;i<nPCPresenti;i++)
        {
            if(elencoComputer[i].getNome().compareToIgnoreCase(nome)==0)
                
            {
                quantita=quantita+elencoComputer[i].getQuantita();
                elencoComputer[i].setQuantita(quantita);
            }
            
            
         }
        
        
           return 0;
    }
        
        
           public int DecrementaUnaCertaQuantitaDiPc(String nome,int quantita)
    {
        for(int i=0;i<nPCPresenti;i++)
        {
            if(elencoComputer[i].getNome().compareToIgnoreCase(nome)==0)
                
            {
                quantita=quantita-elencoComputer[i].getQuantita();
                elencoComputer[i].setQuantita(quantita);
            }
            
            
         }
        
        
           return 0;
    }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
      
       
       public String toString()
    {
        Pc t;
        String s="";
        for(int i=0;i<N_MAX_PC;i++)
        {
            if(elencoComputer[i]!=null)
            {
                t=elencoComputer[i];
                s=s+"Posizione:  "+i+t.toString()+"\n";
            }   
        }
        return s;
    }
      
  
     
}




  
 
