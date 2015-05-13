package com.chaka15205.api;

import com.chaka15205.api.hunger.Hunger;
import com.chaka15205.api.moods.MoodType;

public interface Chaka {

    /**
     * Gets Chakas Current mood
     * @return
     */
    public MoodType getMood();

    /**
     * Sets Chakas Mood
     * @param type
     * @return
     */
    public MoodType setMood(MoodType type);

    public Hunger setHunger(Hunger hunger);

    public Hunger getHunger();

    public Hunger feed(int foodValue);
}
