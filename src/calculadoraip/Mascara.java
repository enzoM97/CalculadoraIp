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
public class Mascara {
    
    private int octeto1;
    private int octeto2;
    private int octeto3;
    private int octeto4;
    
    public Mascara(int octeto1, int octeto2, int octeto3, int octeto4){
        this.octeto1=octeto1;
        this.octeto2=octeto2;
        this.octeto3=octeto3;
        this.octeto4=octeto4;
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
    public String toString(){
        return octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4;
    }
    
}

