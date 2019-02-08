package ZmeevHome;

public class ShiftDecode {
    String string;

    public ShiftDecode(String string){
        this.string = string;
    }

    public String decode(int key){
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char[] ch1 = alpha.toCharArray();

        char[] ch = string.toCharArray();
        for(int j = 0; j < ch.length; j++){
            for(int i = 0; i < ch1.length; i++){
                if(ch[j] == ch1[i]){
                    char[] result = new char[ch1.length];
                    for(int k = 0; k < key; k++){
                        result[k] = ch1[ch1.length - key + k];
                    }
                    for(int k = 0; k < ch1.length - key; k++) {
                        result[key + k] = ch1[k];
                    }
                    ch[j] = result[i];
                    break;
                }
            }
        }
        return String.valueOf(ch);
    }
}
