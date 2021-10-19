package com.bignerdranch.android.photogallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    public static Intent newInstance(Context context) {
        return new Intent(context, PhotoGalleryActivity.class);
    }

    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}