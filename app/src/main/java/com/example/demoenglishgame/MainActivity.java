package com.example.demoenglishgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demoenglishgame.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    ListGameAdapter listGameAdapter;
    //ArrayList<ListGame> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //gameAdapter = new GameAdapter(this,R.layout.activity_main);

        Anhxa();
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                Intent intent = new Intent(MainActivity.this,MainActivityGame.class);
//                intent.putExtra("dataGame",0);
//                startActivity(intent);
//
//            }
//        });

    }



    private void Anhxa() {

        listView = findViewById(R.id.listgame);
        listGameAdapter = new ListGameAdapter(this,R.layout.act_customlistgame);
        fakedata();
        listView.setAdapter(listGameAdapter);
    }

    private void fakedata() {
        listGameAdapter.add(new ListGame(R.drawable.a,"Game Alphabet"));
        listGameAdapter.add(new ListGame(R.drawable.grandfather,"Game Family"));
        listGameAdapter.add(new ListGame(R.drawable.dongvat,"Game Animal"));
        listGameAdapter.add(new ListGame(R.drawable.blue,"Game Color"));
        listGameAdapter.add(new ListGame(R.drawable.one,"Game Number"));
        listGameAdapter.add(new ListGame(R.drawable.australia,"Game Country"));
        listGameAdapter.add(new ListGame(R.drawable.motorbike,"Game Vehicle"));
        listGameAdapter.add(new ListGame(R.drawable.oval,"Game Geometry"));
        listGameAdapter.add(new ListGame(R.drawable.chair,"Game Item"));
    }


}
