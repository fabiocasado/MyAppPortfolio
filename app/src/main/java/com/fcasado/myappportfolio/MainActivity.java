package com.fcasado.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onPopularMoviesPressed(View v) {
        Toast.makeText(this, R.string.popular_movies_toast, Toast.LENGTH_SHORT).show();
    }

    public void onScoresAppPressed(View v) {
        Toast.makeText(this, R.string.scores_app_toast, Toast.LENGTH_SHORT).show();
    }

    public void onLibraryAppPressed(View v) {
        Toast.makeText(this, R.string.library_app_toast, Toast.LENGTH_SHORT).show();
    }

    public void onBuildItBiggerPressed(View v) {
        Toast.makeText(this, R.string.build_it_bigger_toast, Toast.LENGTH_SHORT).show();
    }

    public void onReaderPressed(View v) {
        Toast.makeText(this, R.string.xyz_reader_toast, Toast.LENGTH_SHORT).show();
    }

    public void onCapstonePressed(View v) {
        Toast.makeText(this, R.string.capstone_my_own_app_toast, Toast.LENGTH_SHORT).show();
    }
}
