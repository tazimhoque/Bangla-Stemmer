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
class Onusorgo {
String s2=null;
     String s3=null;
     String s1=null;
     String s4=null;
     FileReader fr = null;
     String[] s5=null;
       char ch1,ch2,ch3,ch4,ch5;
       int length,i;
       BufferedReader br=null;
    public Onusorgo(String s) {
          try {
        
              fr = new FileReader("onusorgo.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kk.class.getName()).log(Level.SEVERE, null, ex);
        }
        br=new BufferedReader(fr); 
          int k=0;
         // s5=s.split(" ");

       //   int k=0;
        try {
            while((s1=br.readLine())!=null){
                 int index=0,index2=0;
                k++;
               index=s.lastIndexOf(s1); 
               if(s.equals(s1)){
    
                     s3=s1;
                         break;
            }
              if(k==50){
                      s3=" ";
                    }
                  
}       } catch (IOException ex) {
            Logger.getLogger(Kk.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
     }
    

    String methodOnusorgo() {

        return s3;
    }
    
}
