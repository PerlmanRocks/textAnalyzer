import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        //Scanner reader = new Scanner(new File("GettysburgAddress"))
        //while{
            int syllables = 0;
            ArrayList<String> vowels = new ArrayList<String>();
            vowels.addAll(Arrays.asList("a", "e", "i", "o", "u", "y"));
            String test = "water";
            for (int i = 0; i<test.length(); i++){
                for (int j = 0; j<vowels.size(); j++){
                    if (vowels.get(j).charAt(0)==(test.charAt(i))){
                        syllables++;
                        if (i+1 < test.length()) {
                            for (int k = 0; k<vowels.size(); k++) {
                                if (vowels.get(k).charAt(0) == (test.charAt(i + 1))) {
                                    syllables--;
                                }
                            }
                        }
                    }
                }
            }
            if((test.charAt(test.length()-1)) == 'e'){
                if(test.charAt(test.length()-2)== 'l'){

                }else {
                    System.out.println("count");
                    syllables--;
                }
            }
            System.out.println(syllables);
        //}(ra.e)

    }
}
