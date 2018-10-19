package m2iformation.fr.menusdemo;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends m2iformation.fr.menusdemo.Menu {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Le code suivant peut être supprimer si on ne veut pas d'ActionBar

    }

}
