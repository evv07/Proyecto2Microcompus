package example.emmanuel.proyecto2microcompus;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class coffeactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffeactivity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.cofftoolbar);
        setSupportActionBar(toolbar);
    }
}
