import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class Pos {
  String s2=null;
     String s3=null;
     String s1=null;
     String s4=null;
     FileReader fr = null;
       char ch1,ch2,ch3,ch4,ch5;
       int length,i;
    public Pos(String s) {
        String[] s5=s.split(" ");
        for(i=0;i<s5.length;i++)
        {
              try {
            //String s2=null;
            //s2=s;
              fr = new FileReader("obboy.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kk.class.getName()).log(Level.SEVERE, null, ex);
        }
         BufferedReader br=new BufferedReader(fr); 
        }
    }

    String methodPos() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}
