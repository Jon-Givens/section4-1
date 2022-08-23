public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        
        //Name your friends
        double alexShare =  calc.findShare(15.0);
        double forgetShare =  calc.findShare(30.0);
        double fullShare = alexShare + forgetShare;

        double price1 =  calc.findTotal(10.0, "Bobby", fullShare);
        double price2 =  calc.findTotal(12.0, "Jonesy", fullShare);
        double price3 =  calc.findTotal(9.0,  "Jess", fullShare);
        double price4 =  calc.findTotal(8.0,  "Carter", fullShare);
        double price5 =  calc.findTotal(7.0,  "Katie", fullShare);
        double price6 =  calc.findTotal(0.0, "Alex", fullShare);
        double price7 =  calc.findTotal(11.0, "Olivia", fullShare);
        double price8 =  calc.findTotal(0.0, "Forgetful", fullShare);

        //Find and print the entire table's total, including tax and tip
       double tableTotal = (double) price1 + price2 + price3 + price4 + price5 + (price6 * 0) + price7 + (price8 * 0);
        System.out.println(tableTotal);
    } 
}
