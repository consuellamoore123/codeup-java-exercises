public class ServerNameGenerator {

    public static String getRandom(String[] array) {
        int num = (int)Math.floor(Math.random()*(array.length-1));
        return array[num];
    }
    public static void main(String[] args) {
        String[] adjectives;
        adjectives = new String[10];
        adjectives[0] = "Tall";
        adjectives[1] = "Dark";
        adjectives[2] = "Handsome";
        adjectives[3] = "Patient";
        adjectives[4] = "Funny";
        adjectives[5] = "Shiny";
        adjectives[6] = "Smart";
        adjectives[7] = "Strong";
        adjectives[8] = "Confident";
        adjectives[9] = "Goofy";


        String[] nouns;
        nouns = new String[10];
        nouns[0] = "mirror";
        nouns[1] = "tv";
        nouns[2] = "fan";
        nouns[3] = "computer";
        nouns[4] = "phone";
        nouns[5] = "girl";
        nouns[6] = "cup";
        nouns[7] = "shoes";
        nouns[8] = "light";
        nouns[9] = "box";

        System.out.println(getRandom(adjectives) + "-" + getRandom(nouns));
        System.out.println(getRandom(adjectives) + "-" + getRandom(nouns));
        System.out.println(getRandom(adjectives) + "-" + getRandom(nouns));
        System.out.println(getRandom(adjectives) + "-" + getRandom(nouns));

    }
}
