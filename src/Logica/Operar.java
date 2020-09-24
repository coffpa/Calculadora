/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author seba_
 */
public class Operar {
    String retorno;
    StringBuilder concatenador=new StringBuilder();
    private int[] cadena=new int[60];
    private int cant=0;
    public int totalgeneral=0;
    
    
    
    public String Concatenar(char palingresada,String contenidopanel)
    {   String retorno;
        StringBuilder concatenador=new StringBuilder();
        retorno=concatenador.append(contenidopanel).append(palingresada).toString();
    return retorno;
    }
    
    //--------------------------------------------------------
    public void sumar(int numero)
    {
        
       
    }
    public String DevolverTotal(int resultadofinal)
    {return String.valueOf(resultadofinal);
    }
}

