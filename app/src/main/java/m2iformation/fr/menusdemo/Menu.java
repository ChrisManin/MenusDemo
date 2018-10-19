package m2iformation.fr.menusdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class Menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Le code suivant peut être supprimer si on ne veut pas d'ActionBar

    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
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
        if (id == R.id.action_activites) {
            return true;
        }

        if (id == R.id.action_connexion) {
            if (item.isChecked()){
                item.setChecked(false);
            }else{
                item.setChecked(true);
            }
            return true;
        }

        if (id == R.id.activite1) {
            Intent i = new Intent(this, Activite1.class);
            startActivity(i);
            return true;
        }

        if (id == R.id.activite2) {
            Intent i = new Intent(this, Activite2.class);
            startActivity(i);
            return true;
        }

        if (id == R.id.activite3) {
            Intent i = new Intent(this, Activite3.class);
            startActivity(i);
            return true;
        }


        return super.onOptionsItemSelected(item);

    }
}
