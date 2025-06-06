class Leet_557_Reverse_Words_String {
    public String reverse(String str){
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while(start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            result.append(reverse(words[i]));
            if(i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}

