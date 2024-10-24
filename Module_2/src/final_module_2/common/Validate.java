package final_module_2.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String REGEX_PHONENUMBER = "^[0-9]{10}$";

    private static final String REGEX_EMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    public static boolean isValidPhoneNumber(String input) {
        Pattern pattern = Pattern.compile(REGEX_PHONENUMBER);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static boolean isValidEmail(String input) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
