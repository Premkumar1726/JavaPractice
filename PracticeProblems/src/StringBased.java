public class StringBased {
    static String LongestSubstring(String a){
        String sub = "";
        boolean isDuplicate = false;

        sub += a.charAt(0);
        for(int i = 1;i < a.length(); i++){
            for(int j = 0;j< sub.length();j++){
                if(a.charAt(i) == sub.charAt(j))
                    isDuplicate = true;
                else
                    isDuplicate = false;
            }
            if(! isDuplicate)
                sub += a.charAt(i);
        }
        return sub;
    }
}
