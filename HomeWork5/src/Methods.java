public class Methods {



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






    
    public String squeeze(String word1,String word2){

        String newWord;
        for(int j=0;j<word2.length();j++){
        
            for(int i=0;i<word1.length();i++){ 
    
              if(word1.charAt(i) == word2.charAt(j)){  // her bu döngüde ilk kelimeden ikinci kelimedeki -
                newWord = word1.replace(word1.charAt(i),' ');    // - tanımnanan sıradaki harfin yerine boşluk bırakıyor
                word1=new String(newWord);
               // System.out.println(word1.replace(" ", ""));  yukarıdaki açıklamaları burdaki Sysout u kullanarak teyit edebilirsiniz
            } 
                  }
                }
    
         
        return  word1.replace(" ", ""); // boşluklar temizlenince yeni String hazır



    }
    
}
