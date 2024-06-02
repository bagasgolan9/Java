package com.golan.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection.
        switch (item.getItemId()) {
            case R.id.item1:
                startActivity(new Intent(getApplicationContext(), allPosts.class));
                return true;
            case R.id.item2:
                startActivity(new Intent(getApplicationContext(), addNew.class));
                return true;
            case R.id.item3:
                startActivity(new Intent(getApplicationContext(), preview.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}