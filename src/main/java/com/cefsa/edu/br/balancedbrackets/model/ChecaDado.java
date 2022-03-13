/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cefsa.edu.br.balancedbrackets.model;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author jvito
 */
public class ChecaDado {
    public static boolean checaArquivo(String dado)
    {
        Deque<Character> fila = new ArrayDeque<Character>();
 
        if(dado.length()%2 != 0)
        {
            return false;
        }
        
        for (int i = 0; i < dado.length(); i++)
        {
            char x = dado.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                fila.push(x);
                continue;
            }
            if (fila.isEmpty())
                return false;
            char caracter;
            
            switch (x) {
            case ')':
                caracter = fila.pop();
                if (caracter == '{' || caracter == '[')
                    return false;
                break;
 
            case '}':
                caracter = fila.pop();
                if (caracter == '(' || caracter == '[')
                    return false;
                break;
 
            case ']':
                caracter = fila.pop();
                if (caracter == '(' || caracter == '{')
                    return false;
                break;
            }
        }
        return (fila.isEmpty());
    }
}
