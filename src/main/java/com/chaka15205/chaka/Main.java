package com.chaka15205.chaka;

import com.chaka15205.api.Chaka;
import com.chaka15205.api.moods.MoodType;

public class Main {

    Chaka chaka = null;

    public Main(Chaka chaka) {
        this.chaka = chaka;
    }

    public void main(String[] args) {

        if (chaka.getMood() == MoodType.HUNGRY) {
            chaka.feed(20);
        }
    }
}
