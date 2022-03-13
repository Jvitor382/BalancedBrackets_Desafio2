/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cefsa.edu.br.balancedbrackets.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author jvito
 */
public class CriaTxt {
    
    public static void escreveTxt(String dadoEscrever) throws IOException
    {
        try(FileWriter cria = new FileWriter("dados-validados.txt", true);
            BufferedWriter armazena = new BufferedWriter(cria);
            PrintWriter escritor = new PrintWriter(armazena);)
            
            {
                escritor.append(dadoEscrever);
            }
        catch(IOException e)
            {
                e.printStackTrace();
            }
            
    }
    
}
