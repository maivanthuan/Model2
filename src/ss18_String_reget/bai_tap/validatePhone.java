package ss18_String_reget.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validatePhone {
    private static Pattern pattern;
    private static final String PHONE_REGEX="^[(]+[0-9]{2}+[)]+-+[(]+0+[0-9]{9}+[)]$";
    public validatePhone(){
        pattern=Pattern.compile(PHONE_REGEX);
    }
    public boolean validate(String regex){
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        validatePhone validatePhone=new validatePhone();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số điện thoại: ");
        String str=scanner.nextLine();
        boolean is=validatePhone.validate(str);
        if (is){
            System.out.println(str +" là số điện thoại hợp lệ");
        }else {
            System.out.println(str+ " là số điện thoại không hợp lệ");
        }
    }
}
