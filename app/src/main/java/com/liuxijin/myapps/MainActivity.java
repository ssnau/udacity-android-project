package com.liuxijin.myapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button movieBtn;
    private Button stockBtn;
    private Button biggerBtn;
    private Button materialBtn;
    private Button ubiBtn;
    private Button capBtn;

    class OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Button btn = (Button) view;
            String name = btn.getText().toString();
            String text = "This button will launch my " + name + " app!";
            Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieBtn = (Button) findViewById(R.id.btn_movies);
        stockBtn = (Button) findViewById(R.id.btn_stock);
        biggerBtn = (Button) findViewById(R.id.btn_bigger);
        materialBtn = (Button) findViewById(R.id.btn_material);
        ubiBtn = (Button) findViewById(R.id.btn_ubiquitous);
        capBtn = (Button) findViewById(R.id.btn_capstone);

        OnClickListener ocl = new OnClickListener();

        Button[] btns = {movieBtn, stockBtn, biggerBtn, materialBtn, ubiBtn, capBtn};

        for (int i = 0; i < btns.length; i++ ) {
            btns[i].setOnClickListener(ocl);
        }
    }

}
