/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternário;

/**
 *
 * @author pc
 */
public class OperadorTernário {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
          int n1, n2, r;
          n1 = 24;
          n2 = 8;
          r = (n1>n2)?1:0;
          System.out.println(r);
        */
        int x,y,z;
        x = 4;
        y = 7;
        z = 12;
        boolean  r;
        r = (x<y && y<z)?true:false;
        System.out.println(r);
               
        
    }
    
}
