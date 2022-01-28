import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /*Không chứa các ký tự đặc biệt
          Phải dài hơn 6 ký tự
          Không chứa các ký tự viết hoa
          Cho phép dấu gạch dưới (_)
        */
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public static void main(String[] args) {
        showValidate("fese");
        showValidate("fefdgt-34");
        showValidate("123456");
        showValidate("fsegdfh");

    }

    private static void showValidate(String account) {
        System.out.println(account + " " + validate(account));
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
