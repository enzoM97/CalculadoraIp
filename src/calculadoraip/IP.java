/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraip;

import java.util.*;

/**
 *
 * @author Enzo
 */
public class IP {
    
    private int octeto1;
    private int octeto2;
    private int octeto3;
    private int octeto4;
    
    public IP(int octeto1, int octeto2, int octeto3, int octeto4){
        this.octeto1=octeto1;
        this.octeto2=octeto2;
        this.octeto3=octeto3;
        this.octeto4=octeto4;
    }
        
    public IP calcularBroadcast(IP ip, Mascara mascara){
         //octetos para guardar los valores de la direccion ip
        int octetoA,octetoB,octetoC,octetoD;
        //octetos para guardar los valores de la mascara
        int octetoE,octetoF,octetoG,octetoH;
        //octetos para guardar los valores del broadcast
        int broadcast1,broadcast2,broadcast3,broadcast4;
        IP n_ip = new IP(0,0,0,0);
        
        //copiar los valores de direccion ip
        octetoA = ip.getOcteto1();
        octetoB = ip.getOcteto2();
        octetoC = ip.getOcteto3();
        octetoD = ip.getOcteto4();
        //copiar los valores de la mascara
        octetoE = mascara.getOcteto1();
        octetoF = mascara.getOcteto2();
        octetoG = mascara.getOcteto3();
        octetoH = mascara.getOcteto4();
        
        //realizar el calculo del broadcast
        /*broadcast1 = (byte)(octetoA | (~octetoE))&0xFF;
        broadcast2 = (byte)(octetoB | (~octetoF))&0xFF;
        broadcast3 = (byte)(octetoC | (~octetoG))&0xFF;
        broadcast4 = (byte)(octetoD | (~octetoH))&0xFF;*/
        broadcast1 = (byte)(ip.getOcteto1() | (~mascara.getOcteto1()))&0xFF;
        broadcast2 = (byte)(ip.getOcteto2() | (~mascara.getOcteto2()))&0xFF;
        broadcast3 = (byte)(ip.getOcteto3() | (~mascara.getOcteto3()))&0xFF;
        broadcast4 = (byte)(ip.getOcteto4() | (~mascara.getOcteto4()))&0xFF;
        
        /*
        int a = 200;
        int b = 224;
        int c = (byte)(a|(~b))&0xFF;
        */
        
        n_ip.setOcteto1(broadcast1);
        n_ip.setOcteto2(broadcast2);
        n_ip.setOcteto3(broadcast3);
        n_ip.setOcteto4(broadcast4);
        
        return n_ip;
    }
    
    public IP calcularNetwork(IP ip, Mascara mascara){
        IP n_ip = new IP(0,0,0,0);
        
        n_ip.setOcteto1(ip.getOcteto1() & mascara.getOcteto1());
        n_ip.setOcteto2(ip.getOcteto2() & mascara.getOcteto2());
        n_ip.setOcteto3(ip.getOcteto3() & mascara.getOcteto3());
        n_ip.setOcteto4(ip.getOcteto4() & mascara.getOcteto4());
        
        return n_ip;
    }
    
    public int getOcteto1() {
        return octeto1;
    }

    public void setOcteto1(int octeto1) {
        this.octeto1 = octeto1;
    }

    public int getOcteto2() {
        return octeto2;
    }

    public void setOcteto2(int octeto2) {
        this.octeto2 = octeto2;
    }

    public int getOcteto3() {
        return octeto3;
    }

    public void setOcteto3(int octeto3) {
        this.octeto3 = octeto3;
    }

    public int getOcteto4() {
        return octeto4;
    }

    public void setOcteto4(int octeto4) {
        this.octeto4 = octeto4;
    }

    @Override
    public String toString() {
        return octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4;
    }
    
}

