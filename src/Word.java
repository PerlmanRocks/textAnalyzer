import java.util.ArrayList;
import java.util.Arrays;

public class Word {
    private ArrayList<String> letters = new ArrayList<String>();
    public Word(String w){
        letters.add(String.valueOf(w.toCharArray()));
    }

    public ArrayList<String> getLetters() {
        return letters;
    }

    public void setLetters(ArrayList<String> letters) {
        this.letters = letters;
    }

    public int countSyllables(){
        int syllables = 0;
        ArrayList<String> vowels = new ArrayList<String>();
        vowels.addAll(Arrays.asList("a", "e", "i", "o", "u", "y"));
        for (int i = 0; i<letters.size(); i++){
            for (int j = 0; j<vowels.size(); j++){
                if (vowels.get(j).equals(letters.get(i))){
                    syllables++;
                    if ((i+1)<letters.size()) {
                        for (int k = 0; k < vowels.size(); k++) {
                            if (vowels.get(k).equals(letters.get(i + 1))) {
                                syllables--;
                            }
                        }
                    }
                }
            }
        }
        if (letters.get(letters.size()) == "e")
            if(letters.get(letters.size()-1) == "l"){

            }else{
                syllables--;
            }

        return syllables;
    }
    //able

}
