
import java.io.*;
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
class Uposorgo {
 String s2=null;
     String s3=null;
     String s1=null;
     FileReader fr = null;
    Uposorgo(String s){
               try {
            //String s2=null;
            //s2=s;
              fr = new FileReader("uposorgo.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kk.class.getName()).log(Level.SEVERE, null, ex);
        }
         BufferedReader br=new BufferedReader(fr); 
          int k=0;
        try {
            while((s1=br.readLine())!=null){
                 int index=0,index2=0;
                k++;
               // index=s.lastIndexOf(s1); 
               if((s.lastIndexOf(s1))>0){
       //s3="sdfsdffd";
                   if(k<21){
                       s3="বাংলা উপসর্গ";
                   }
                   else if(k>20){
                       s3="সংস্ক্রিত উপসর্গ";
                   }
   }
            }
        } catch (IOException ex) {
            Logger.getLogger(Kk.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }

      String kkk()
  {
      return s3;
  }
      } 
        
    

