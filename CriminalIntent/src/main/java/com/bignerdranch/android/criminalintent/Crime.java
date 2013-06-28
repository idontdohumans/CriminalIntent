package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by panda on 6/28/13.
 */
public class Crime {

    public UUID getId() {
        return mId;
    }

    private UUID mId;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private String mTitle;

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }
}
