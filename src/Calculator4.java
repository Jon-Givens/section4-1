public class Calculator4 {
    public double tax = .05;
    public double tip = .15;
    double totalShare;
    
    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public double findShare(double share){
        totalShare = share*(1+tax+tip);
        return totalShare;

    }
    public double findTotal(double price, String name, double fairShare){
        double total = price*(1+tax+tip) + (fairShare / 6) ;
        System.out.println(name +": $" +total);
        return total;

    }
}

//finding AlexShare
    // find alexs meals price after tip and tax
    // divide that number by 6
    // add alexShare to friends pay
    // in alexs total, multiply by 0

// finding Person8Share
    // same as Alex share but seperate variable
