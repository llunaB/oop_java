package ArrTest;

public class CharArrayTest {
    public static void main(String[] args) {

        char[] alphas = new char[26];
        char ch = 'A';

        for(int i=0; i<alphas.length; i++) {
            alphas[i] = ch++;
        }

        for(char alpha : alphas) {
            System.out.println(alpha + "," + (int)alpha);
        }
    }
}
