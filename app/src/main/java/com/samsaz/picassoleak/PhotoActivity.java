package com.samsaz.picassoleak;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import static com.squareup.picasso.MemoryPolicy.NO_CACHE;
import static com.squareup.picasso.MemoryPolicy.NO_STORE;


public class PhotoActivity extends AppCompatActivity {

    public static final String URL = "http://www.stockvault.net/photo/download/127093";

    ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        photo = (ImageView) findViewById(R.id.photo);
        Picasso.with(this).load(URL).memoryPolicy(NO_CACHE, NO_STORE)
                .tag(PhotoActivity.class).into(photo, new Callback() {
            @Override
            public void onSuccess() {
                //DO SOMETHING!
            }

            @Override
            public void onError() {}
        });
        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Picasso.with(this).cancelTag(PhotoActivity.class);
    }
}
