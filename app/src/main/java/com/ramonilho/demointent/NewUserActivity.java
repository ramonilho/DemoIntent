package com.ramonilho.demointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewUserActivity extends AppCompatActivity {

    @BindView(R.id.etUsername)
    EditText etUsername;

    @BindView(R.id.etNome)
    EditText etNome;

    @BindView(R.id.etPassword)
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btCreate)
    public void create() {
        Intent i = new Intent();
        i.putExtra("USERNAME", etUsername.getText().toString());
        setResult(RESULT_OK, i);
        finish();
    }
}
