package com.example.mvp.iu.iu;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.example.mvp.R;
import com.example.mvp.iu.contracts.UserView;
import com.example.mvp.iu.presenters.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements UserView {

    private MainActivityPresenter presenter;

    private TextView myTextView;
    private ImageView imageView;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        presenter = new MainActivityPresenter(this);

        myTextView = findViewById(R.id.myTextView);
        EditText userName = findViewById(R.id.username);
        EditText email = findViewById(R.id.email);
        imageView = findViewById(R.id.imageView);
        btn = findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
                                   public void onClick(View v) {
                                      presenter.updateUrl();
                                   }
                               });

    userName.addTextChangedListener(new TextWatcher() {

        @Override
        public void beforeTextChanged (CharSequence s,int start, int count, int after){
        }

        @Override
        public void onTextChanged (CharSequence s,int start, int before, int count){
            presenter.updateFullName(s.toString());
        }

        @Override
        public void afterTextChanged (Editable s){

        }

    });

    email.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged (CharSequence s,int start, int count, int after){
        }

        @Override
        public void onTextChanged (CharSequence s,int start, int before, int count){
            presenter.updateEmail(s.toString());
        }

        @Override
        public void afterTextChanged (Editable s){

        }
    });

    }


    @Override
    public void updateUserInfoTextView(String info) {
        myTextView.setText(info);

    }

    @Override
    public void showImage(String urlDeImagen) {
        Glide.with(this).load(urlDeImagen).into(imageView);

    }
}
