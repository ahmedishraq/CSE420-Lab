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
    static LinkedList<Object> math_Operators = new LinkedList<Object>();
    static LinkedList<Object> logical_Operators = new LinkedList<Object>();
    static LinkedList<Object> numerical_Values = new LinkedList<Object>();
    static LinkedList<Object> others = new LinkedList<Object>();

    // Identifier searching method 
    public static void searchIdentifiers() {
        try {
            File input_file = new File("input.txt");
            Scanner sc = new Scanner(input_file);
            while (sc.hasNextLine()) {
                String s = sc.next();
                if (s.equals("int") || s.equals("float") || s.equals("double") || s.equals("boolean") || s.equals("string") || s.equals("char")) {
                    String tmp = sc.nextLine();
                    if (tmp.contains("=")) {
                        int i = tmp.indexOf("=");
                        identifiers.add(tmp.substring(0, i));
                    } else {
                        int i = tmp.indexOf(";");
                        identifiers.add(tmp.substring(0, i));
                    }
                }
            }
        } catch (Exception e) {

        }
    }

    // keywords searching method 
      public static void searchKeyword() {
        try {
            File f = new File("lab01.txt");
            Scanner k = new Scanner(f);
            while (k.hasNextLine()) {
                String s = k.nextLine();
                if (s.startsWith("int") && s.contains("int")) {
                    keywords.add("int");
                }
                if (s.startsWith("float") && s.contains("float")) {
                    keywords.add("float");
                }
                if (s.startsWith("double") && s.contains("double")) {
                    keywords.add("double");
                }
                if (s.startsWith("String") && s.contains("String")) {
                    keywords.add("String");
                }
                if (s.startsWith("boolean") && s.contains("boolean")) {
                    keywords.add("boolean");
                }
                if (s.startsWith("char") && s.contains("char")) {
                    keywords.add("char");
                }
                if (s.startsWith("else") && s.contains("else")) {
                    keywords.add("else");
                }
                if (s.startsWith("if") && s.contains("if")) {
                    keywords.add("if");
                }
                if (s.startsWith("for") && s.contains("for")) {
                    keywords.add("for");
                }
                if (s.startsWith("while") && s.contains("while")) {
                    keywords.add("while");
                }
                if (s.startsWith("do") && s.contains("do")) {
                    keywords.add("do");
                }

            }
        } catch (Exception e) {

        }
    }
      
    // Math operator searching method 
         public static void searchMathOperators() {
        try {
            File f = new File("lab01.txt");
            Scanner k = new Scanner(f);
            while (k.hasNextLine()) {
                String s = k.nextLine();
                if (s.contains("+")) {
                    if (math_Operators.contains("+")) {

                    } else {
                        math_Operators.add("+");
                    }
                }
                if (s.contains("-")) {
                    if (math_Operators.contains("-")) {

                    } else {
                        math_Operators.add("-");
                    }
                }
                if (s.contains("=")) {
                    if (math_Operators.contains("=")) {

                    } else {
                        math_Operators.add("=");
                    }
                }
                
                if (s.contains("*")) {
                    if (math_Operators.contains("*")) {

                    } else {
                        math_Operators.add("*");
                    }
                }
                if (s.contains("/")) {
                    if (math_Operators.contains("/")) {

                    } else {
                        math_Operators.add("/");
                    }
                }
                if (s.contains("%")) {
                    if (math_Operators.contains("%")) {

                    } else {
                        math_Operators.add("%");
                    }
                }
            }
        } catch (Exception e) {

        }
    }
    
    // Logival operator searching method 
        public static void searchLogicalOperators() {
        try {
            File f = new File("lab01.txt");
            Scanner k = new Scanner(f);
            while (k.hasNextLine()) {
                String s = k.nextLine();
                if (s.contains("<")) {
                    if (logical_Operators.contains("<")) {

                    } else {
                        logical_Operators.add("<");
                    }
                }
                if (s.contains(">")) {
                    if (logical_Operators.contains(">")) {

                    } else {
                        logical_Operators.add(">");
                    }
                }
                if (s.contains("==")) {
                    if (logical_Operators.contains("==")) {

                    } else {
                        logical_Operators.add("==");
                    }
                }
                if (s.contains(">=")) {
                    if (logical_Operators.contains(">=")) {

                    } else {
                        logical_Operators.add(">=");
                    }
                }
                if (s.contains("<=")) {
                    if (logical_Operators.contains("<=")) {

                    } else {
                        logical_Operators.add("<=");
                    }
                }
                if (s.contains("!=")) {
                    if (logical_Operators.contains("!=")) {

                    } else {
                        logical_Operators.add("!=");
                    }
                }

            }
        } catch (Exception e) {

        }
    }
        
    // Numerical value searching method 
        public static void searchNumericalValues() {
        try {
            File f = new File("lab01.txt");
            Scanner k = new Scanner(f);
            while (k.hasNext()) {
                String s = k.next();
                s = s.replaceAll("[^0.0-9.0]", ""); //replaced with space.
                if (s != null && !s.isEmpty()) {
                    numerical_Values.add(s);
                }
            }
        } catch (Exception e) {

        }
    }
         
    public static void main(String[] args) {

    }

}
