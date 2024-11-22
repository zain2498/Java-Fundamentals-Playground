public class IsHexaDecimal {

    public String str;

    public IsHexaDecimal(String str) {
        this.str = str;
    }

    public boolean isHexadecimalChar(char ch) {
        return (
                (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F')
                );
    }

    public boolean isHexadecimal() {

        if(str == null || str.equals("")){
            return false;
        }

        for (Character ch : str.toCharArray()){
            if(!isHexadecimalChar(ch) && !Character.isDigit(ch)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "abcdef1234567890";
        IsHexaDecimal obj = new IsHexaDecimal(str);
        System.out.println(obj.isHexadecimal());
    }

}