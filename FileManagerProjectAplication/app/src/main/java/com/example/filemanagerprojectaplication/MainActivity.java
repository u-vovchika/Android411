package com.example.filemanagerprojectaplication;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.filemanagerprojectaplication.fragments.CardFragment;
import com.example.filemanagerprojectaplication.fragments.InternalFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /// Эти две строки должны быть обязательнгы, когда работаем с ToolBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /// /////////////////////////////////////////////////////////////////

        /// доступы ко всем элементам которые нам нужны
        NavigationView navigationView = findViewById(R.id.nav_view); // боковая палитра навигации
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout); // доступ к основному контейнеру drawer_layout
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string
                .open_drawer, R.string.close_drawer);

        drawerLayout.addDrawerListener(toggle);
        //toggle.syncState(); //чтобы иконка появилась.

        //replaceFragment(new InternalFragment());
        replaceFragment(new CardFragment());

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_internal) {
                    replaceFragment(new InternalFragment());
                } else if (item.getItemId() == R.id.nav_card) {
                    replaceFragment(new CardFragment());
                } else if (item.getItemId() == R.id.nav_about) {
                    Toast.makeText(MainActivity.this, "About", Toast.LENGTH_SHORT).show();
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return false;
            }
        });


    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }
}