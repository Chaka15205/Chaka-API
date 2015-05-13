package com.chaka15205.api;

import com.chaka15205.api.food.Hunger;
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

    /**
     * Sets Chakas food
     * @param hunger
     * @return
     */
    public Hunger setHunger(Hunger hunger);

    /**
     * Gets Chakas current food amount.
     * @return
     */
    public int getHunger();

    /**
     * Feeds Chaka A value of food.
     * @param foodValue
     * @return
     */
    public Hunger feed(int foodValue);
}
