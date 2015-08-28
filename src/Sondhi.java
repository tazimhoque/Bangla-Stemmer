/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class Sondhi {
 String s = null;
                String s1=null;
                String s3=null;
                String s4=null;
                String s5=null;
                String s6=null;
                 char ch1,ch2,ch3,ch4;
                    int length=0,k=0,index=0;
    public Sondhi(String s) {
         s1="+";
        index=s.lastIndexOf(s1);
        if(s.charAt(index+1)=='আ'&&s.charAt(index-1)!='া'&&s.charAt(index-1)!='ি'&& s.charAt(index-1)!='ু'){
            s4=s.substring(0,index);
            s5=s.substring((index+2),(s.length()));
            s3=s4+'া'+s5;
            s6="অ+আ";
        }
        else if(s.charAt(index+1)=='আ'&&s.charAt(index-1)=='া'){
       s4=s.substring(0,index); 
            s5=s.substring((index+2),(s.length()));
            s3=s4+s5;
            s6="আ+আ";
        }
        else if(s.charAt(index+1)=='অ'&&s.charAt(index-1)!='া'&&s.charAt(index-1)!='ি'&& s.charAt(index-1)!='ু'&&s.charAt(index-1)!='ে'){
          s4=s.substring(0,index);
            s5=s.substring((index+2),(s.length()));
            s3=s4+'া'+s5;
            s6="অ+অ";
        }
        else if(s.charAt(index+1)=='অ'&&s.charAt(index-1)=='া'){
          s4=s.substring(0,index);
            s5=s.substring((index+2),(s.length()));
            s3=s4+s5;
            s6="আ+অ";
        }
  
         else if(s.charAt(index+1)=='ই'&&s.charAt(index-1)!='া'&&s.charAt(index-1)=='ি'&& s.charAt(index-1)!='ু'&&s.charAt(index-1)!='ে'){
          s4=s.substring(0,(index-1));
            s5=s.substring((index+2),(s.length()));
            s3=s4+'ী'+s5;
            s6="ই+ই ";
        }
         else if(s.charAt(index+1)=='ঈ'&&s.charAt(index-1)!='া'&& s.charAt(index-1)!='ু'&&s.charAt(index-1)!='ে'&&s.charAt(index-1)=='ি'){
          s4=s.substring(0,(index-1));
            s5=s.substring((index+2),(s.length()));
            s3=s4+'ী'+s5;
            s6="ই+ঈ";
        } 
         else if(s.charAt(index+1)=='ই'&&s.charAt(index-1)!='া'&&s.charAt(index-1)=='ী'&& s.charAt(index-1)!='ু'&&s.charAt(index-1)!='ে'){
          s4=s.substring(0,index);
            s5=s.substring((index+2),(s.length()));
            s3=s4+s5;
            s6="ঈ+ই";
        }
    }

    String method1Sondhi() {
        return s3;
    }
    String method2Sondhi(){
        return s6;
    }
}
