/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfire;

import java.awt.Color;

/**
 *
 * @author NitroPC
 */
public class FlamePalette {
    Color[] colors;
    
    public FlamePalette(){
        this.colors = createColors();
        }
    
    public Color[] createColors(){//Método per crear es colors que després aniran
//        Color[] colors = new Color[255,0,0];//wtf passa aquí
//        Sumar i restar a R segons distància inicial? Hauria de començar a '255,255,0', ja que una flama té s'origen més groc que vermell, i anar restant a nes segon
//        fins acabar fent gris, que seria 155,155,155 i anar restant fins arribar a blanc?
//        Veure com se pot fer un color transparent amb canvas
    return colors;
    }
}
