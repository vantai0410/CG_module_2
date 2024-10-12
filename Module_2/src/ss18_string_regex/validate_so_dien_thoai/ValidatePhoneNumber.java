package ss18_string_regex.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String REGEX ="^\\([0-9]{2}\\)-\\([0-9]{10}\\)$";
    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    public static void main(String[] args) {
        ValidatePhoneNumber v = new ValidatePhoneNumber();
        System.out.println(v.validatePhoneNumber("(84)-(0978489648)"));
    }
}
