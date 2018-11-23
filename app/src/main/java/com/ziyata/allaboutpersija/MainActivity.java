package com.ziyata.allaboutpersija;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnSejarah)
    Button btnSejarah;
    @BindView(R.id.btnNama)
    Button btnNama;
    @BindView(R.id.btnBaju)
    Button btnBaju;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnSejarah, R.id.btnNama, R.id.btnBaju})
    public void onViewClicked(View view) {
        Intent pindah;
        switch (view.getId()) {
            case R.id.btnSejarah:
                pindah = new Intent(this, SejarahActivity.class);
                startActivity(pindah);
                break;
            case R.id.btnNama:
                pindah = new Intent(this, RecycleActivity.class);
                startActivity(pindah);
                break;
            case R.id.btnBaju:
                pindah = new Intent(this, BajuActivity.class);
                startActivity(pindah);
                break;

        }
    }
}
