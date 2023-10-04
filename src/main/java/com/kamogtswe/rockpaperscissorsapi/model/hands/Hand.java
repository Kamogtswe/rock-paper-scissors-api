package com.kamogtswe.rockpaperscissorsapi.model.hands;

public abstract class Hand implements Comparable<Hand> {
    protected  String name;
    protected  int num;

    public Hand(){
        this.name ="";
        this.num = 0;
    }


    public String getHandName(){
        return this.name;
    };

    public int getHandNumber(){
        return this.num;
    }

    @Override
    public int compareTo(Hand hand){
       
        if(getHandNumber() == hand.getHandNumber()){
            return 0;
        }

        switch (getHandName().toLowerCase()) {
            case "rock":
                return (hand.getHandName().equals("scissors")) ? 1 : -1;
            case "paper":
                return (hand.getHandName().equals("rock") ) ? 1 : -1;
            case "scissors":
                return (hand.getHandName().equalsIgnoreCase("paper")) ? 1 : -1;
        }    

        return 0;
    }


    public Hand versus(Hand otherHand){
        int s = compareTo(otherHand);
        return s > 0 ? this : otherHand;
    }
}
