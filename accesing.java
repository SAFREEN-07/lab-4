/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagename;

import packagename.subpackage.subpackage;

/**
 *
 * @author 91936
 */
public class accesing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        classone a=new classone();
        a.display();
        classtwo b=new classtwo();
        b.showsq(5);
        subpackage c=new subpackage();
        c.showcb(5);
        
        // TODO code application logic here
    }
    
}
