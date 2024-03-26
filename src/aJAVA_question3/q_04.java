package aJAVA_question3;

public class q_04 {

    // char[] letters = str2.toCharArray();
    public static void main(String[] args) {
        String s = "Programming is fun! right?";
        int[] result = count(s);

        System.out.printf("%s\n => 자음 %d개, 모음 %d개", s, result[0], result[1]);
    }

    public static int[] count(String str) {
        int conso = 0; // 자음
        int vowel = 0; // 모음

        char[] letters = str.toCharArray();
        char[] charact = str.toUpperCase().toCharArray();

        // 모음
        for (int i = 0; i < charact.length; i++) {
            switch (charact[i]) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowel ++;
                    break;

                // 공백 밑 특수문자
                case ' ':
                case '\t':
                case '\n':
                case ',':
                case '.':
                case '!':
                case '?':
                    break;

                default:
                    conso++;
                    break;
            }
        }
        return new int[] { conso, vowel };  // 여기 new 쓰는 거 이해 안 감
    }
}


