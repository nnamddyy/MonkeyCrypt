/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabentexte;

/**
 *
 * @author simon
 */
public class AffineAufgaben extends Aufgaben{
    
    public AffineAufgaben()
    {
        super(3);
        
        anweisungstext[0] = "Hallo";
        schlüssel[0] = "bc";
        aufgabentyp[0] = 2;
        
        anweisungstext[1] = "Affine, das ist doch wunderbar";
        schlüssel[1] = "lz";
        aufgabentyp[1] = 3;
        
        anweisungstext[2] = "Vorerst letze Aufgabe";
        schlüssel[2] = "bh";
        aufgabentyp[2] = 1;
        
        for(int i = 0; i < anweisungstext.length; i++)
        {
            verschlüsselungstyp[i] = 1;
        }
                
    }
    
}
