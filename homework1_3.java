public class homework1_3 {
    public static void main(String[] args) {
        String s = "the sky is blue"; 
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String mess = "";
        String mess1 = "";
        for (int i = 0; i < s.length(); i++){
            if (i==0) {
                while (true){
                    if (s.charAt(s.length() - i - 1) == ' '){
                        i++;
                    }
                    else {
                        break;
                    }
                }
            }
            mess1 = "";
            while (s.charAt(s.length() -i - 1) != ' '){
                mess1 = s.charAt(s.length() -i -1) + mess1 ;
                i++;
                if (i == s.length()){
                    break;
                }
            }
            if (i != s.length() && s.charAt(s.length() -i ) != ' ' ){
                mess1 += ' ';
            }
            mess += mess1;
        }
        if (mess.charAt(mess.length() - 1) == ' '){
            StringBuilder sb = new StringBuilder(mess);
            sb = sb.deleteCharAt(mess.length() - 1);
            sb.toString();
            mess = "";
            int j = 0;
            while (j < sb.length() ){
                mess += sb.charAt(j);
                j++;
            }
        }
        return mess;
    } 
}
