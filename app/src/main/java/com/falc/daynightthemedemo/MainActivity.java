package com.falc.daynightthemedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import com.falc.daynightthemedemo.picasso.CircleTransformation;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatImageView appCompatImageView = findViewById(R.id.ivPhoto);
        Picasso.get().load(R.drawable.golden_retriever).transform(new CircleTransformation()).into(appCompatImageView);

        appCompatImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        boolean checkStatus = App.getInstance().themeManager.getTheme();
        menu.findItem(R.id.night_mode).setChecked(checkStatus);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.night_mode:
                boolean itemStatus = item.isChecked();
                item.setChecked(!itemStatus);
                App.getInstance().themeManager.setTheme(!itemStatus);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}



