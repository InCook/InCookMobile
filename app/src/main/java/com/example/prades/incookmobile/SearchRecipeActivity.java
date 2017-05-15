package com.example.prades.incookmobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by prades on 2017-05-15.
 */

public class SearchRecipeActivity extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_recipe);
        getSupportActionBar().hide();

        t = (TextView)findViewById(R.id.selecting);
        String textforselecting = "SELECT THE <b>INGREDIENTS</b>";
        t.setText(Html.fromHtml(textforselecting));
    }
}
