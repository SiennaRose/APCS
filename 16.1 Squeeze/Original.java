import chn.util.*; 
/**
 * Write a description of class Original here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Original
{
   public static void main(String[] args)
   {
        String fileName = "before1.txt"; 
        FileOutput outFile = new FileOutput(fileName);
   
        outFile.print(" // A short example file\n\n" + "private double singleTax ()\n"  
                    + "{\n" + "    if (income <= 27050.0)\n" + "        return (income * 0.15);\n" 
                    + "    else if (income <= 65550.0)\n"
                    + "        return (4057.5 + (0.275 * (income - 27050.0)));\n"
                    + "    else if (income <= 136750.0)\n"
                    + "        return (14645.0 + (0.305 * (income - 65550.0)));\n"
                    + "    else if (income <= 297350.0)\n"
                    + "        return (36361.0 + (0.355 * (income - 136750.0)));\n"
                    + "    else\n" + "        return (93374.0 + (0.391 * (income - 297350.0)));\n"
                    + "}"); 
        outFile.close(); 
   }
}
