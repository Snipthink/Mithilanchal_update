package com.snipthink.abhishek.mithilanchal_update;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import layout.Agriculture;

public class  MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Dialog Feedback;








    GridView gridViewAA;





/*


    String iconnamelistAA[] = {"Chhatiyar", "Mundan", "Uplayan", "Vivah", "Duiragman", "Madushramni", "Kojegra","Chhatiyar", "Mundan", "Uplayan", "Vivah", "Duiragman", "Madushramni", "Kojegra","Chhatiyar", "Mundan", "Uplayan", "Vivah", "Duiragman", "Madushramni", "Kojegra"};
    int iconsSankarAA[] = {
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,

            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,

            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,







    };


*/














    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


/*


        gridViewAA = (GridView) findViewById(R.id.puja_event_grid_id);
        Event_Pooja adapter =new Event_Pooja(MainActivity.this , iconsSankarAA, iconnamelistAA);
        gridViewAA.setAdapter(adapter);


        gridViewAA.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Clicked letter:"+iconnamelistAA[position],Toast.LENGTH_LONG).show();
            }
        });

*/




















        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        setTitle( Html.fromHtml("<font color='#FFFFFF'>Mithilaanchal</font>"));
        //ActionBar actionBar = null;
        //actionBar.setTitle(Html.fromHtml("<font color='#ff0000'>ActionBartitle </font>"));




        setFragment(new Mtabfragment());

    }









    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.feedback) {

            android.app.FragmentManager manager = getFragmentManager();
            Feedback fD = new Feedback();
            fD.show(manager,"Exit");


            return true;
        }

        else if (id == R.id.about_us) {


            return true;
        }



        else  if (id == R.id.contact_us) {
            android.app.FragmentManager manager = getFragmentManager();
            ContactUs fD = new ContactUs();
            fD.show(manager,"ContactUs");

            return true;
        }



        else if (id == R.id.exit_apps) {

            android.app.FragmentManager manager = getFragmentManager();
            ExitDialog fD = new ExitDialog();
            fD.show(manager,"Exit");


            return true;
        }










        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

switch (id){
    case R.id.nav_area:
        setTitle("Area");
        Intent i=new Intent(getApplicationContext(),Chatiyar.class);
        startActivity(i);
        break;

    case R.id.Invention:
        setTitle("Invention");
        Intent q=new Intent(getApplicationContext(),Chatiyar.class);
        startActivity(q);

        break;
    case R.id.Agriculture:

        setTitle("Agriculture");
        Intent c=new Intent(getApplicationContext(),Chatiyar.class);
        startActivity(c);


        break;
    case R.id.Education:

        setTitle("Education");
        Intent a=new Intent(getApplicationContext(),Chatiyar.class);
        startActivity(a);
        break;

    case R.id.Sports:

        setTitle("Sports");
        Intent b=new Intent(getApplicationContext(),Chatiyar.class);
        startActivity(b);
        break;


    case R.id.nav_suggest_mithila:
        setTitle("Invention");
        Intent t=new Intent(getApplicationContext(),Chatiyar.class);
        startActivity(t);

        break;

        default:
        break;
}












        return true;
    }


     public void setFragment(Fragment fragment)
      {

        if(fragment!=null)
        {

            FragmentTransaction ft =getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_main,fragment);
            ft.commit();

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

      }
 }
