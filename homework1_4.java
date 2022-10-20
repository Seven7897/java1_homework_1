public class homework1_4 {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        s = s.toLowerCase();
        if (s.length() == 0){
            return true;
        }
        for (int i = 0; i < s.length() / 2;i++){
            if (s.charAt(i) == s.charAt(s.length() -i - 1)) {
                continue;
            }
            else { 
                return false;
            }
        }
        return true;
    }
}

