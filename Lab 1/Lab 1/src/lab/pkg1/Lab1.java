package lab.pkg1;

/**
 *
 * @author ahmed_ishraq
 */
import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Lab1 {

    static LinkedList<Object> keywords = new LinkedList<Object>();
    static LinkedList<Object> identifiers = new LinkedList<Object>();
    static LinkedList<Object> math_operators = new LinkedList<Object>();
    static LinkedList<Object> logical_operators = new LinkedList<Object>();
    static LinkedList<Object> numerical_values = new LinkedList<Object>();
    static LinkedList<Object> others = new LinkedList<Object>();

    // Identifier searching method 
    public static void searchIdentifiers() {
        try{
            File input_file = new File("input.txt");
            Scanner sc = new Scanner(input_file);
            while(sc.hasNextLine()){
                String s = sc.next();
                if(s.equals("int") || s.equals("float") || s.equals("double") || s.equals("boolean") || s.equals("string") || s.equals("char")){
                    String tmp = sc.nextLine();
                    if(tmp.contains("=")){
                        int i = tmp.indexOf("=");
                        identifiers.add(tmp.substring(0,i));
                    }
                    else{
                        int i = tmp.indexOf(";");
                        identifiers.add(tmp.substring(0,i));
                    }
                }
            }
        }
        catch (Exception e){
            
        }
    }

    public static void main(String[] args) {

    }

}
