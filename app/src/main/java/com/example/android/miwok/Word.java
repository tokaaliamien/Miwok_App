package com.example.android.miwok;

/**
 * Created by Demo on 2017-06-30.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mDefaultTranslation;
    private String mMiwakTranslation;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public Word(String mDefaultTranslation, String mMiwakTranslation, int mImageResourceId, int mAudioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwakTranslation = mMiwakTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceId = mAudioResourceId;
    }


    public Word(String mDefaultTranslation, String mMiwakTranslation, int mAudioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwakTranslation = mMiwakTranslation;
        this.mAudioResourceId = mAudioResourceId;

    }


    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getmMiwakTranslation() {
        return mMiwakTranslation;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
