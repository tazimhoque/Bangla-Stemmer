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
class Dic {
 String s2=null;
     String s3=null;
     String s1=null;
     String s4=null;
     FileReader fr = null;
       char ch1,ch2,ch3,ch4,ch5;
       int length;
       String[] s6=null;
    public Dic(String s) {
          try {
            //String s2=null;
            //s2=s;
              fr = new FileReader("dic.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kk.class.getName()).log(Level.SEVERE, null, ex);
        }
         BufferedReader br=new BufferedReader(fr); 
          int k=0;
        try {
            while((s1=br.readLine())!=null){
                
               
               //  int index=0,index2=0;
               // k++;
             //  index=s.lastIndexOf(s1); 
            s6=s1.split(" ") ;  
              if(s6[0].equals(s)){
       //s3="sdfsdffd";
                  //  String g=null;
                   
                     s3=s6[1];
                        // break;
          }
               
                  
}       } catch (IOException ex) {
            Logger.getLogger(Kk.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    String methodDic() {
        return s3;
    }
    
}
