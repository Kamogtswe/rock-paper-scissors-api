package com.kamogtswe.rockpaperscissorsapi.model.hands;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class HandTest {

     @Test
    void versusAlwaysReturnsWinningHand() {
        List<Hand> allHands = List.of(new Rock(), new Paper(), new Scissors());

        for (Hand hand : allHands) { // iterate through allHand
            for (Hand otherHand : allHands) { // select one hand
                Hand winningHand = hand.versus(otherHand); // get winner from versus()
                assertThat(winningHand, greaterThanOrEqualTo(hand)); // make sure winner is always greater than or equal
            }
        }

    }
}
