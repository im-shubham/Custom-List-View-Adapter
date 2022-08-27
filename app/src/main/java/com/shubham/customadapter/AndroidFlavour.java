package com.shubham.customadapter;

public class AndroidFlavour {


    String mVersionName;
    String mVersionNumber;
    int mImageId;

    public AndroidFlavour(String mVersionName, String mVersionNumber , int mImageId){
        this.mVersionName = mVersionName;
        this.mVersionNumber = mVersionNumber;
        this.mImageId = mImageId;

    }

    public String getVersionName() {
        return mVersionName;
    }

    public String getVersionNumber() {
        return mVersionNumber;
    }

    public int getImageId() {
        return mImageId;
    }
}
