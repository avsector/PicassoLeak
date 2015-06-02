package com.samsaz.picassoleak;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import butterknife.ButterKnife;
import butterknife.InjectView;

import static com.squareup.picasso.MemoryPolicy.NO_CACHE;
import static com.squareup.picasso.MemoryPolicy.NO_STORE;


public class PhotoActivity extends AppCompatActivity {

    public static final String URL = "http://89.165.4.189:9004/946243-844583-rtipcxtetyekbccgksk";

    @InjectView(R.id.photo) ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        ButterKnife.inject(this);

        setupUi();
    }

    private void setupUi(){
        Picasso.with(this).load(URL).memoryPolicy(NO_CACHE, NO_STORE)
                .tag(PhotoActivity.class).into(photo, new Callback() {
            @Override
            public void onSuccess() {
                //DO SOMETHING!
            }

            @Override
            public void onError() {}
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Picasso.with(this).cancelTag(PhotoActivity.class);
    }
}
