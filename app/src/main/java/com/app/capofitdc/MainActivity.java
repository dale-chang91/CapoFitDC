package com.app.capofitdc;

import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Locale;

/**
 * Activity == Screen
 * This is the first/default screen that the user will see for CapoFitDC
 * This activity should show today's date and two lists
 * The lists depends on the day, so we need to find the day in the onStart method
 *
 */
public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private String weekday;

    /**
     * Logic that should only be performed once
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // recover last saved state
        // if (savedInstanceState != null)

        ImageView iv = (ImageView) findViewById(R.id.main_image);
        iv.setImageResource(R.drawable.capoeira);

        toolbar = (Toolbar) findViewById(R.id.toolbar_bottom);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onStart() {
        super.onStart();

        Calendar calendar = Calendar.getInstance();
        weekday = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG
        , Locale.getDefault());

        //TODO: Print day at the top of the screen
        //TODO: Create two lists for two classes
        //TODO: Add ability to add students to list
        //TODO: Students can be created from new or use existing students
        //TODO: Store students on phone database
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) return true;

        return super.onOptionsItemSelected(item);
    }
    /*
    private void initToolBars() {
        Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_top);
        setSupportActionBar(toolbarTop);

        Toolbar toolbarBottom = (Toolbar) findViewById(R.id.toolbar_bottom);
        toolbarBottom.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.:
                        break;
                }
                return true;
            }
        });
        toolbarBottom.inflateMenu(R.menu.menu_main);
    }
    */
}
