
/**
 * class BacktoSchool - 
 * 
 * @author Sienna Sacramento 
 * @version 1
 */
public class BacktoSchool
{
    public static void main(String[] args) 
    {
        //declaring variables
        Person bob; 
        Student lynne; 
        Teacher mrJava; 
        CollegeStudent ima; 
        
        bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);
        
        lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);
        
        mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);
        
        ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}
