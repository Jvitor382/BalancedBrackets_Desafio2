/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cefsa.edu.br.balancedbrackets;

import static com.cefsa.edu.br.balancedbrackets.model.ChecaDado.checaArquivo;
import com.cefsa.edu.br.balancedbrackets.model.CriaTxt;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jvito
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        
            Scanner entrada = new Scanner(new FileReader("input.txt"));
            
            while (entrada.hasNextLine()) 
            {
                String line = entrada.nextLine();
            
            if (checaArquivo(line))
            {
            CriaTxt.escreveTxt(line + "- Dado Valido\n");
            }
            else
            CriaTxt.escreveTxt(line + "- Dado Invalido\n");
            }
    }
}
