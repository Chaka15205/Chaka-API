package com.chaka15205.chaka.handler;

import com.chaka15205.api.Chaka;
import com.chaka15205.api.moods.MoodType;

public class HungerHandler {

    public static void init(Chaka chaka) {

        if (chaka.getHunger() == 20) {
            chaka.setMood(MoodType.HAPPY);
        } else if (chaka.getHunger() == 15) {
            chaka.setMood(MoodType.HUNGRY);
        } else if (chaka.getHunger() == 10) {
            chaka.setMood(MoodType.HANGRY);
        } else if (chaka.getHunger() == 5) {
            chaka.setMood(MoodType.DYING);
        } else if (chaka.getHunger() == 0) {
            chaka.setMood(MoodType.DEAD);
        }
    }
}
