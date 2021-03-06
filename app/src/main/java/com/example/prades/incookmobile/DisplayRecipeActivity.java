package com.example.prades.incookmobile;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class DisplayRecipeActivity extends AppCompatActivity {

    ImageView sidebar_back;
    ImageView sidebar_search;
    ImageView sidebar_menu;
    ImageView sidebar_camera;
    ImageView sidebar_cart;

    Button add_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_recipe);
        getSupportActionBar().hide();

        sidebar_back = (ImageView)findViewById(R.id.sidebar_back);
        sidebar_search = (ImageView)findViewById(R.id.sidebar_search);
        sidebar_menu = (ImageView)findViewById(R.id.sidebar_menu);
        sidebar_camera = (ImageView)findViewById(R.id.sidebar_camera);
        sidebar_cart = (ImageView)findViewById(R.id.sidebar_cart);
        add_button = (Button)findViewById(R.id.add_button);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==add_button) {
                    Intent intent = new Intent(DisplayRecipeActivity.this, AddRecipeActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_left);
                    finish();
                }
            }
        });

        sidebar_search.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(v == sidebar_search) {
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        sidebar_search.setBackgroundColor(Color.rgb(80, 95, 100));
                        Intent intent = new Intent(DisplayRecipeActivity.this, SearchRecipeActivity.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
                        finish();
                    } else if (event.getAction() == MotionEvent.ACTION_UP) {
                        sidebar_search.setBackgroundColor(Color.rgb(115, 135, 145));
                    }
                }
                return true;
            }
        });
        sidebar_menu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(v == sidebar_menu) {
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        sidebar_menu.setBackgroundColor(Color.rgb(80, 95, 100));
                    } else if (event.getAction() == MotionEvent.ACTION_UP) {
                        sidebar_menu.setBackgroundColor(Color.rgb(115, 135, 145));
                    }
                }
                return true;
            }
        });
        sidebar_camera.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(v==sidebar_camera) {
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        sidebar_camera.setBackgroundColor(Color.rgb(80, 95, 100));
                    } else if (event.getAction() == MotionEvent.ACTION_UP) {
                        sidebar_camera.setBackgroundColor(Color.rgb(115, 135, 145));
                    }
                }
                return true;
            }
        });
        sidebar_cart.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(v==sidebar_cart) {
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        sidebar_cart.setBackgroundColor(Color.rgb(80, 95, 100));
                    } else if (event.getAction() == MotionEvent.ACTION_UP) {
                        sidebar_cart.setBackgroundColor(Color.rgb(115, 135, 145));
                    }
                }
                return true;
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent(DisplayRecipeActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("Exit me", true);
            startActivity(intent);
            finish();
        }

        return super.onKeyDown(keyCode, event);
    }


}
