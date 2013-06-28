package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by panda on 6/28/13.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }
}
