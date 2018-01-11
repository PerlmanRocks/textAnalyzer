import java.util.ArrayList;

public class Sentence {
    private ArrayList<Word> words = new ArrayList<Word>();

    public Sentence(ArrayList<Word> words) {
        this.words = words;
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }

}
