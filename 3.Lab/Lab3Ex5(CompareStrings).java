import java.util.* ; 
public class Main
{
    
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);  
    System.out.print("Type the first word : ");
    String word1 = reader.nextLine();
    System.out.print("Type the second word : ");
    String word2 = reader.nextLine();
    int check = word1.indexOf(word2);  
    if(check>=0) System.out.println("The word '"+word2+"' is found in the word "+word1+"'");
    else System.out.println("The word '"+word2+"' is not found in the word '"+word1+"'");
   }
}
