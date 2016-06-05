package criminalintent.android.bignerdranch.com.criminalintent;

import java.util.UUID;

/**
 * Created by didzis.stivrins on 05.06.2016..
 */
public class Crime {

    public UUID getId() {
        return mId;
    }
    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }

    private UUID mId;
    private String mTitle;
    public Crime() {
// Generate unique identifier
        mId = UUID.randomUUID();
    }
}