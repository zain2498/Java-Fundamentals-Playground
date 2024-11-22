package Inheritance.Occurance;

public class OccuranceRunner {

    public static void main(String[] args) {

        String str = "This is an awesome occasion " +
                "This has never happened before ";

        Occurance[] occurance = {new WordOccurance("Words",str),
        new CharOccurance("Characters", str)};

        for(Occurance occ : occurance){
            occ.displayTypeOfOccurance();

        }
    }
}
