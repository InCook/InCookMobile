package com.example.prades.incookmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by prades on 2017-05-13.
 */

public class AddRecipeActivity extends AppCompatActivity {
    Button save;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_recipe);
        getSupportActionBar().hide();

        save = (Button)findViewById(R.id.save_recipe);
        cancel = (Button)findViewById(R.id.cancel_recipe);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==cancel) {
                    Intent intent = new Intent(AddRecipeActivity.this, DisplayRecipeActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
                    finish();
                }
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent(AddRecipeActivity.this, DisplayRecipeActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
            finish();
        }

        return super.onKeyDown(keyCode, event);
    }
}
