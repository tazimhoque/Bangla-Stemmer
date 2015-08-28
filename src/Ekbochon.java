
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
class Ekbochon {
  String s2=null;
     String s3=null;
     String s1=null;
     String s4=null;
     FileReader fr = null;
       char ch1,ch2,ch3,ch4,ch5;
       int length;
    public Ekbochon(String s) {
           try {
            //String s2=null;
            //s2=s;
              fr = new FileReader("match.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kk.class.getName()).log(Level.SEVERE, null, ex);
        }
         BufferedReader br=new BufferedReader(fr); 
          int k=0;
        try {
            while((s1=br.readLine())!=null){
                 int index=0,index2=0;
                k++;
               index=s.lastIndexOf(s1); 
               if(s.endsWith(s1)){
       //s3="sdfsdffd";
                     s4=s.substring(0,index);
                     s3=s4;
                         break;
            }
               if(k==47){
                       s3=s;
                    }
                  
}       } catch (IOException ex) {
            Logger.getLogger(Kk.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     
    }
    String methodekbochon() {
        return s3;
    }
    
}
