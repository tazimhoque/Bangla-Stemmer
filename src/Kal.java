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
class Kal {
  String s2=null;
     String s3=null;
     String s1=null;
     String s4=null;
     FileReader fr = null;
       char ch1,ch2,ch3,ch4,ch5;
       int length;
    public Kal(String s) {
          try {
            //String s2=null;
            //s2=s;
              fr = new FileReader("kal.txt");
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
                     //s4=s.substring(0,index);
                     //s3=s4;
                   if(k>0&&k<4)
                   {
                       s3="পুরাঘটিত বর্তমান কাল";
                   }
                   else if(k>3&&k<10)
                   {
                       s3="ঘটমান বর্তমান কাল";
                   }
                   else if(k>9&&k<14)
                   {
                       s3="ভবিষ্যত কাল";
                   }
                   else if(k>13&&k<17)
                           {
                       s3="পুরাঘটিত অতীত কাল";
                           }
                   else if(k>16&&k<21) 
                   {
                       s3="ঘটমান অতীত কাল";
                   }
                   else if(k>20&&k<26)
                       s3="সাধারন অতীত কাল";
                         break;
            }
               if(k==26){
                       s3="সাধারন বর্তমান কাল";
                    }
                  
}       } catch (IOException ex) {
            Logger.getLogger(Kk.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     
    }

    String methodKal() {
        return s3;
    }
    
}
