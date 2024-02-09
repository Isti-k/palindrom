/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrom;

/**
 *
 * @author Tanulo
 */
public class Palindrom {

  
  public boolean isPalindrom (String szoveg){
        boolean pali = false;
        
        
        szoveg = szoveg.toLowerCase();
        szoveg = szoveg.replaceAll("\\s[$&+,:;=?@|'<>.+^*()%!-]","");
        //"[^a-z0-9öüóőúéáűí]"
        //System.out.println("szoveg: "+szoveg);
        int i = 0;
        int j = szoveg.length()-1;
        while ( i < (szoveg.length()/2) && szoveg.charAt(i)==szoveg.charAt(j)){
            i++;
            j++;
        } 
        pali = (i==szoveg.length()/2);
        return pali;
    }

  public Palindrom() {
  }
    
  
}
