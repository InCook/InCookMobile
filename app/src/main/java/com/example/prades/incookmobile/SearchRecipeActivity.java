package com.example.prades.incookmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by prades on 2017-05-15.
 */

public class SearchRecipeActivity extends AppCompatActivity {

    TextView t;
    ImageView sidebar_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_recipe);
        getSupportActionBar().hide();

        t = (TextView)findViewById(R.id.selecting);
        String textforselecting = "SELECT THE <b>INGREDIENTS</b>";
        t.setText(Html.fromHtml(textforselecting));
        sidebar_back = (ImageView)findViewById(R.id.sidebar_back);

        sidebar_back.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(v==sidebar_back) {
                    if(event.getAction() == MotionEvent.ACTION_DOWN) {
                        Intent intent = new Intent(SearchRecipeActivity.this, DisplayRecipeActivity.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_left);
                        finish();
                    }else if (event.getAction() == MotionEvent.ACTION_UP) {
                    }
                }
                return true;
            }
        });
    }
}
