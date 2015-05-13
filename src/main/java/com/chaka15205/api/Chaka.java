package com.chaka15205.api;

import com.chaka15205.api.moods.Mood;
import com.chaka15205.api.moods.MoodType;

public interface Chaka {

    public Mood getMood(MoodType type);
}
