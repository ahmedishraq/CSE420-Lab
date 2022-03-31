package lab2;

/**
 *
 * @author ahmed_ishraq
 */
import java.util.*;

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
    
    public static boolean char_check(char ch){
        int ascii = (int) ch;
        if(ascii >= 97 && ascii <= 122){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean domain_check(String str){
        boolean out = false;
        if(str.contains(".") == true){
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                if((char_check(c) == true) || c == '.'){
                    out = true;
                }
                else{
                    return false;
                }
            }
        }
        return out;
    }
    
    public static boolean email_check(String str){
        boolean out = false;
        boolean out1 = false;
        char start = str.charAt(0);
        if((str.contains("@")) == true && char_check(start) == true){
            String [] split = str.split("@");
            if(split.length>2){
                return false;
            }
            String first_part = split[0];
            for(int i=0;i<first_part.length();i++){
                char c = first_part.charAt(i);
                if((char_check(c) == true || (number_check(c) == true) || c == '.' || c == '-')){
                    out1 = true;
                }
                else{
                    return false;
                }
            }
            boolean out2 = domain_check(split[1]);
            if(out1 == true && out2 == true){
                out = true;
            }
        }
        return out;
    }
    
    public static void main(String[] args) {
        int email_count = 0;
        int web_count = 0;
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        String email = "Email";
        String web = "Web";
        String [] input = new String [a];
        sc.nextLine();
        for(int i=0;i<a;i++){
            input[i] = sc.nextLine();
        }
        for(int i=0;i<a;i++){
            if(email_check(input[i]) == true){
                email = email + ", "+(i+1);
                email_count++;
            }
            if(domain_check(input[i]) == true){
                web = web+", "+(i+1);
                web_count++;
            }
        }
        if(email_count == 0){
            System.out.println("Email, 0");
        }
        else{
            System.out.println(email);
        }
        if(web_count == 0){
            System.out.println("Web, 0");
        }
        else{
            System.out.println(web);    
        }
    }
    
}
