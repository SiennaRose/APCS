
/**
 * class Piglatinator - a class used to translate normal phrases into pig's latin
 * 
 * @author Sienna Sacramento
 * @version 1
 */

public class Piglatinator
{
    //declaring instance variables
    /**input holds user's original data*/
    private String input;
    
    //constructor
    /**
     * constructor Piglatinator - initializes inout and calls the punctuationUpdate method
     */
    
    Piglatinator(String phrase)
    {
        input = phrase; 
        punctuationUpdated(); 
    }
    
    //methods 
    /**
     * <b>summary</b>: goes through inputed string and removes punctuation and white spaces
     * saves result into variable clean 
     */
    
    void punctuationUpdated()
    {
        char value;  
        String clean = ""; 
        boolean cap = false; 
          
        //stripping inputed string clean of puncuations
        for(int x = 0; x < input.length(); x++)
        {
            value = input.charAt(x); 
            if((value >= 'a') && (value <= 'z'))
                clean += value;
            else
                if((value >= 'A') && (value <= 'Z'))
                {
                    clean += value; 
                    cap = true; 
                }
            else
            {
               clean = clean.toLowerCase(); 
               igpay(clean, x, cap);
               clean = ""; 
               cap = false; 
            }     
        }
        
        igpay(clean, 0, cap); 
    }
    
    /**
     * <b>summary</b>: determines and displays the new piglatin word
     */
     
    void igpay(String clean, int x, boolean cap)
    {
        String word = "", holding = "", begin = "";
        char first, punctuation = input.charAt(x); 
        int v1, v2, v3, v4, v5, early = 100;  
        
        if(clean == "")
            first = ' '; 
        else
            first = clean.charAt(0); 
        
        v1 = clean.indexOf('a'); 
        v2 = clean.indexOf('e');
        v3 = clean.indexOf('i');
        v4 = clean.indexOf('o');
        v5 = clean.indexOf('u');
        
         if((first == 'a') || (first == 'e') || (first == 'i') || (first == 'o') || (first == 'u'))
             word = vowel(clean); 
        else
            if((v1 == -1) && (v2 == -1) && (v3 == -1) && (v4 == -1) && (v5 == -1) && (first != ' '))
                word = clean + "ay";   
            else
                if(first != ' ')
                {
                    if((v1 != -1) && (v1 < early))
                        early = v1; 
                    if((v2 != - 1) && (v2 < early))
                        early = v2; 
                    if((v3 != -1) && (v3 < early))
                        early = v3; 
                    if((v4 != -1) && (v4 < early))
                        early = v4; 
                    if((v5 != -1) && (v5 < early))
                        early = v5; 
            
                    word = move(early, clean);  
                    
                }
        
        if((punctuation == ',') || (punctuation == '.') || (punctuation == '!') || 
            (punctuation == ';') || (punctuation == ':') || (punctuation == '-') ||
             (punctuation == '"') || (punctuation == '(') || (punctuation == ')') ||
             (punctuation == ' '))
        {
            word += punctuation; 
        }
        
        if(cap)
        {
            word = word.toLowerCase(); 
            begin += word.charAt(0); 
            begin = begin.toUpperCase(); 
            holding = word; 
            word = "";
            word += begin; 
            word += holding.substring(1); 
            
        } 
                                                   
        System.out.print(word);                                 
    }
    
    /**
     * <b>summary</b>: reconstructs the word passed by the igpay method. Rearanges so that
     * the first vowel appears first, the initial letters are in the back, and "ay" is added
     */
    
    String move(int v, String clean)
    {
         return clean.substring(v) + clean.substring(0, v) + "ay";
    }
    
    /**
     * <b>summary</b>:  reconstructs the word passed by the igpay method. If the first letter
     * is a vowel then "yay" will just be added
     */
    
    String vowel(String clean)
    {
        return clean + "yay";
    }
}

