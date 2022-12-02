package ss18_String_reget.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validate_ten_lop {
    private static Pattern pattern;
    private static final String CLASS_REGEX="^[ACP]+[0-9]{4}+[GHIKLM]$";
    public validate_ten_lop(){
        pattern=Pattern.compile(CLASS_REGEX);
    }
    public boolean validate(String regex){
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }
    private static final String[] classname={"C0318G","M0318G", "P0323A","C09*0G","A0987M"};

    public static void main(String[] args) {
        validate_ten_lop validate_ten_lop= new validate_ten_lop();
        for (String i:classname){
            boolean is = validate_ten_lop.validate(i);
                System.out.println("Class name is "+i+"is vali "+is);
        }
    }
}
