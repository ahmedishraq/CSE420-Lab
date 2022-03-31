package lab2;

/**
 *
 * @author ahmed_ishraq
 */
public class Lab2 {

    public static boolean number_check(char ch){
        int ascii = (int) ch;
        if(ascii >= 48 && ascii <= 57){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
    }
    
}
