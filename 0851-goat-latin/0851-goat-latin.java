class Solution {
    public String toGoatLatin(String str) {
       String[] splited = str.split("\\s+");
        //System.out.print(Arrays.toString(splited));

        for (String c : splited) {
            //if (c != " ") {
            //System.out.println(c);
            //chnew[k]=c;
            //k++;
            //newSize++;
            //}
        }
        int counter = 0;
        for (String st : splited) {
            //System.out.println("String before modifications is " + st);
            char first_char = st.charAt(0);
            int ascii = (int) st.charAt(0);
            counter++;
            if (ascii == 97 || ascii == 65 || ascii == 101 || ascii == 69 || ascii == 105 || ascii == 73 || ascii == 111 || ascii == 79 || ascii == 117 || ascii == 85) {
                //System.out.println("Found a vowel, it is " + first_char);
                String str_new = st + "ma";
                String str_a = "";
                for (int i = 0; i < counter; i++) {
                    str_a = str_a + "a";
                }
                str_new = str_new + str_a;
                //System.out.println("String after modifications is " + str_new);
                //System.out.println("Counter is " + counter);
                splited[counter - 1] = str_new;
            } 
            else {
                //if (ascii != 97 && ascii != 65 && ascii != 101 && ascii != 69 && ascii != 105 && ascii != 73 && ascii != 111 && ascii != 79 && ascii != 117 && ascii != 85) {
                ///////////// remove first char and put it at the end ///////////////////////
                char removed_char = st.charAt(0);
                st = st.substring(1) + removed_char;

                String str_new = st + "ma";
                String str_a = "";
                for (int i = 0; i < counter; i++) {
                    str_a = str_a + "a";
                }
                str_new = str_new + str_a;
                //System.out.println("String after modifications is " + str_new);
                //System.out.println("Counter is " + counter);
                splited[counter - 1] = str_new;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < splited.length; i++) {
            if (i< splited.length-1)
            sb.append(splited[i]+ " ");
            else
               sb.append(splited[i]); 
        }
        String str_final = sb.toString();
        return str_final;
}
}