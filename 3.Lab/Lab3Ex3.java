import java.util.* ; 
public class Main
{
    
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);  
    System.out.println("Type your name: ");
    String name = reader.nextLine(); 
    for(int i = 0 ; i < name.length() ; i++ ){
        System.out.println(i+1+ "." +" character: "+name.charAt(i));
        
        
        }

	}
}
