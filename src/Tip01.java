public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */

        double Person1 = 10;
        double Person2 = 12;
        double Person3 = 9;
        double Person4 = 8;
        double Person5 = 7;
        double Person6 = 15;
        double Person7 = 11;
        double Person8 = 30;

        System.out.println((Person1 * (1.2) ) + "\n" + (Person2 * 1.2 ) +
                 "\n" + (Person3 * 1.2 ) + "\n" + (Person4 * 1.2 )
                + "\n" + (Person5 * 1.2 ) + "\n" + (Person6 * 1.2 )
                + "\n" + (Person7 * 1.2 ) + "\n" + (Person8 * 1.2 ));
        
    }    
}
