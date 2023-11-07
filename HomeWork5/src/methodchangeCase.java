public class methodchangeCase {

    



    public String changeCase(String word){

        
        char[] charArray = new char [word.length()];
       
        word.getChars(0, word.length(), charArray, 0);
        
        for(int i=0;i<charArray.length;i++){

            

                 if(Character.isUpperCase(charArray[i])){
                     
                    charArray[i]=Character.toLowerCase(charArray[i]);
                 }
                else if(Character.isLowerCase(charArray[i])){
                    
                    charArray[i]=Character.toUpperCase(charArray[i]);
               
                }
          
             }
             String str = new String(charArray);
             
             return str;

    }
}