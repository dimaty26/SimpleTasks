package ZmeevHome;

public class ShiftEncode {
    String string;

    public ShiftEncode(String str){
        this.string = str;
    }

    public String encode(int key) {
        String string1 = "abcdefghijklmnopqrstuvwxyz";
        char[] ch1 = string1.toCharArray();

        char[] ch = string.toCharArray();
        for(int j = 0; j < ch.length; j++){
            for(int i = 0; i < ch1.length; i++){
                if(ch[j] == ch1[i]){
                    char[] result = new char[ch1.length];
                    for(int k = 0; k < ch1.length - key; k++){
                        result[k] = ch1[key + k];
                    }
                    for(int k = 0; k < key; k++) {
                        result[ch1.length - key + k] = ch1[k];
                    }
                    ch[j] = result[i];
                    break;
                }
            }
        }
        return String.valueOf(ch);
    }

}
