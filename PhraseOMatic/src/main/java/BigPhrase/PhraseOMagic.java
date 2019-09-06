package BigPhrase;

public class PhraseOMagic {
    public static void main(String[] args) {
        String [] wordListOne = {"Drake", "Juice Wrld", "Young Thug", "Lil Wayne", "Future", "YoungBoy Never Broke Again"
        };
        String [] wordListTwo = {"HER", "Rhianna", "Summer Walker", "Kehlani", "SZA", "Alessia Cara"
        };
        String [] wordListThree = {"Stevie Wonder", "Micheal Jackson", "Anita Baker", "Luther Vandross", "Jeffery Osborne", "Whitney Houston"
        };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);

    }
}
