import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        wordsWithChar("h");
        sentencesOneWord();
        numberCheck();
        dateFind();
        siteFind();

    }
    public static void wordsWithChar(String textString) {
        String s = "Across Europe, historic cities are buckling."+
                "Mass tourism, encouraged by cash-hungry councils after the 2008 crash and fuelled by the explosion of cheap flights and online room rentals, has become a monster."+
                "The backlash, however, has begun.";

        Pattern pattern = Pattern.compile("\\b"+textString + "\\w+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }
    }

    public static void sentencesOneWord() {
        String s = "Across Europe, historic cities are buckling."+
                "Mass tourism, encouraged by cash-hungry councils after the 2008 crash and fuelled by the explosion of cheap flights and online room rentals, has become a monster."+
                "The backlash, however, has begun.";

        Pattern pattern = Pattern.compile("[A-Z]\\w+(\\.|;|:)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }
    }

    public static void numberCheck() {
        String s = "+375291233214"+
                "375331233212"+
                "+375(25)4321232";

         boolean result = s.matches("\\+?375\\(?(29|33|25)\\)?.+");
        if(result == true){
            System.out.println("It's a correct phone number");
        }
        else{
            System.out.println("It's incorrect phone number");
        }
            }



    public static void dateFind() {
        String s = "Across Europe, historic cities are buckling."+
        "Mass tourism, encouraged by cash-hungry councils after the 2008 crash and fuelled by the explosion of cheap flights and online room rentals, has become a monster."+
        "In 1992 my uncle visited some countries.";

        Pattern pattern = Pattern.compile("\\d{4}\\.\\d{2}\\.\\d{2} \\d{2}:\\d{2}");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }
    }

    public static void siteFind() {
        String s = "Across Europe, historic cities are buckling."+
                "Mass tourism, encouraged by cash-hungry councils after the 2008 crash and fuelled by the explosion of cheap flights and online room rentals, has become a monster."+
                "Www.onliner.by is tne best site.";

        Pattern pattern = Pattern.compile("(www)?\\.?\\w+?\\.(by|ru|com)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }
    }
}
















