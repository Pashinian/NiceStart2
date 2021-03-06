package com.example.mynicestart;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BottomAppBar bottomAppBar = findViewById(R.id.bottom_app_bar_menu);


        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "FAB Clicked.", Toast.LENGTH_SHORT).show();
            }
        });


        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "Delete!", Toast.LENGTH_SHORT).show();
//                sheetBehavior = BottomSheetBehavior.from(sheet);
            }


        });


        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.bottom_app_bar_menu_like:
                        Toast.makeText(MainActivity2.this, "Like clicked.", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.bottom_app_bar_menu_search:
                        Toast.makeText(MainActivity2.this, "Search clicked.", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.bottom_app_bar_menu_share:
                        Toast.makeText(MainActivity2.this, "Share clicked.", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.bottom_app_bar_menu_bookmark:
                        Toast.makeText(MainActivity2.this, "Bookmark clicked.", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });


    }

}