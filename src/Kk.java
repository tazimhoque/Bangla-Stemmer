
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
class Kk {
     String s2=null;
     String s3=null;
     String s1=null;
     String s4=null;
     FileReader fr = null;
       char ch1,ch2,ch3,ch4,ch5;
       int length;
    Kk(String s) {
        try {
            //String s2=null;
            //s2=s;
              fr = new FileReader("stem.txt");
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
                     length=s1.length();
                       s4=s.substring(0,index);
                
                        index2=s4.length();
                         if(index2==2){ 
                              ch1=s4.charAt(0);
                            ch2=s4.charAt(1);
                            String s7=null;
                              s7="গ";
                               if(k==2|| k==3||k==4||k==5||k==6)
                               {
                              if((s4.lastIndexOf(s7))>=0){
                                  s3="যাওয়া"; 
                              }
                              else {
                                  s3=String.valueOf(ch1) +"াওয়া";
                              }
                                    
                          }
                           //  jTextArea1.setText(String.valueOf(ch1) +String.valueOf(ch2) +"া"); 
                               else
                           s3=String.valueOf(ch1)+String.valueOf(ch2);
                               } 
                         
                         else if(index2==3){
                            String s6="চ";
                             ch1=s3.charAt(0);
                            ch2=s3.charAt(1);
                            ch3=s3.charAt(2);
                          if((s3.lastIndexOf(s6))>0){
                             s3=String.valueOf(ch1) +String.valueOf(ch2)+"ওয়া";
                          }
                           else if(ch3=='ে'){
                              s3= String.valueOf(ch1) +String.valueOf(ch2);
                           }
                             else if(ch3=='া'){ 
                            s3=String.valueOf(ch1) +String.valueOf(ch2) +String.valueOf(ch3);
                        }
                           else {
                           s3=String.valueOf(ch1) +String.valueOf(ch2) +String.valueOf(ch3);
                          }
                         }
                else if(index2<4){
                            ch1=s3.charAt(0);
                            ch2=s3.charAt(1);
                      s3=String.valueOf(ch1) +String.valueOf(ch2);
                        }
                else if(index2>3&&index2<5){  
                            s3=s3;     
                        }
                  else if((index2>5)||(index2==5)){
                        
                          s3=s3;
                            
                        }
                 else if(s3.length()==2){
                            s3=s3;
                             
                          }
                           else if(s3.length()>2&&s3.length()<4){
                            s3=s3;
                            
                          }
                           else if(s3.length()>3&&s3.length()<4){
                              s3=s;
                             
                          }
               break;
            }
               else if(k==59){
                       s3=s;
                    }
      
              
}       } catch (IOException ex) {
            Logger.getLogger(Kk.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     
       
    }

 String kkk()
  {
      return s3;
  }
}
