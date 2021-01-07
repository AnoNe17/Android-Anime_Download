package com.example.tubes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.io.File;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView btnnavView;
    FrameLayout frameLayout;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }

        btnnavView = findViewById(R.id.bottomNav);
        frameLayout = findViewById(R.id.fragment_container);

        btnnavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                        navigationView.setCheckedItem(R.id.nav_home);
                        return true;

                    case R.id.bottom_anime:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AnimeFragment()).commit();
                        navigationView.setCheckedItem(R.id.nav_anime);
                        return true;

                    case R.id.bottom_genre:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GenreFragment()).commit();
                        navigationView.setCheckedItem(R.id.nav_genre);
                        return true;

                    default:
                        return false;
                }
            }
        });

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            btnnavView.setSelectedItemId(R.id.bottom_home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                btnnavView.setSelectedItemId(R.id.bottom_home);
                break;
            case R.id.nav_anime:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AnimeFragment()).commit();
                btnnavView.setSelectedItemId(R.id.bottom_anime);
                break;
            case R.id.nav_genre:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GenreFragment()).commit();
                btnnavView.setSelectedItemId(R.id.bottom_genre);
                break;
            case R.id.nav_search:
                startActivity(new Intent(getApplicationContext(), SearchActivity.class));
                break;
            case R.id.nav_info:
                startActivity(new Intent(getApplicationContext(), InfoActivity.class));
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    // MEMBUAT MENU SEARCH DI SEBELAH KANAN ATAS
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.search) {
            startActivity(new Intent(getApplicationContext(), SearchActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    //SAMPAI SINI MEMBUAT MENU SEARCH
}