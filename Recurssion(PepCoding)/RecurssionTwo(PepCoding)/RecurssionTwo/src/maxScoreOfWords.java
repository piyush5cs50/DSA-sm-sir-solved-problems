import java.util.Scanner;

public class maxScoreOfWords {
    public static int solution(String[] words, int[] farr, int[] score, int idx) {

        if(idx == words.length){
            System.out.println(score);
            return 0;
        }

        int sno = 0 + solution(words, farr, score,idx+1);

        int sw = 0;
        boolean flag = true;
        String word = words[idx];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);


            if(farr[ch - 'a'] == 0){
                flag = false;
            }
            farr[ch - 'a']--;
            int sc = score[ch - 'a'];
            sw += sc;
        }

        int syes = 0;
        if(flag){
            syes = sw + solution(words,farr,score,idx);
        }

        for (int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            farr[ch - 'a']++;
        }
        return Math.max(sno,syes);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("noOfWords");
        int nofWords = scn.nextInt();
        String[] words = new String[nofWords];
        for(int i = 0 ; i < words.length; i++) {
            System.out.println(i + " th word");
            words[i] = scn.next();
        }
        System.out.println("no of letters");
        int nofLetters = scn.nextInt();
        char[] letters = new char[nofLetters];
        for (int i = 0; i < letters.length; i++) {
            System.out.println(i + " th letter");
            letters[i] = scn.next().charAt(0);
        }
        int[] score = new int[26];
        for (int i = 0; i < score.length; i++) {
            System.out.println(i + " th score");
            score[i] = scn.nextInt();
        }
        if (words == null || words.length == 0 || letters == null || letters.length == 0 || score == null
                || score.length == 0) {
            System.out.println(0);
            return;
        }
        int[] farr = new int[score.length];
        for (char ch : letters) {
            farr[ch - 'a']++;
        }
        System.out.println(solution(words, farr, score, 0));

    }
}
