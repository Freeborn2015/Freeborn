package Chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String email = "b.obadoni@semicolon.africa";
        if(isValidEmailAddress(email)) System.out.println("email address is valid");
        else System.out.println("email is inValid");


        Pattern p = Pattern.compile("[a-z].[a-z]+@semicolon.africa");
        Matcher m =  p.matcher("[a-z].[a-z]+@semicolon.africa");
        System.out.println(m.find());

      var isValid   = Pattern.matches("[a-z].[a-z]+@semicolon.africa",
                "b.obadoni@semicolon.africa");
        System.out.println(isValid);
    }
    public static boolean isValidEmailAddress(String email){
       boolean isValid  = email.matches( "[a-z].[a-z]+@semicolon.africa");
      return  isValid;
    }

}
