package com.ziyata.allaboutpersija;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.myRecycleView)
    RecyclerView myRecycleView;

    String [] namaPilihan,isiPilihan;
    int [] imgPersija;

    Adapter adapterPersija;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        namaPilihan = getResources().getStringArray(R.array.namaPemain);
        imgPersija = new int[]{R.drawable.simic,R.drawable.bp,R.drawable.sofyan,R.drawable.andrithany,R.drawable.rezaldi,R.drawable.riko,
                R.drawable.ginanjar,R.drawable.ramadani,R.drawable.rohit,R.drawable.maman,R.drawable.ossas,R.drawable.jaimerson,R.drawable.gunawan,R.drawable.rudi,R.drawable.michael,
                R.drawable.fitra,R.drawable.asri,R.drawable.sandy,R.drawable.vava,R.drawable.daryono,R.drawable.rizky};

        adapterPersija = new Adapter(RecycleActivity.this,namaPilihan,isiPilihan,imgPersija);

        myRecycleView.setHasFixedSize(true);
        myRecycleView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecycleView.setAdapter(adapterPersija);
    }
}
