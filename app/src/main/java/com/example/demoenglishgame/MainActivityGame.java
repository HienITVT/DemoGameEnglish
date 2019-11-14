package com.example.demoenglishgame;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivityGame extends AppCompatActivity {
    int i = 0;
    ImageView img1, img2, img3, img4, imgphai, imgtrai;
    Button btnsound;
    TextView txttu, txtdiem;
    TextToSpeech tts;
    ArrayList<ModelGame> modelGameArrayList = new ArrayList<>();



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_game);

        Anhxa();
        addData();
        setData();

        batSukienNextButton();
       batSukienPrevButton();
        batSukienAmThanh();
        batsukiendapan();
        //Bundle bundle = getIntent().getExtras();


    }

    private void batSukienPrevButton() {
        imgtrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivityGame.this,MainActivityGame.class);
                startActivity(intent);
            }
        });
    }

    private void batsukiendapan() {
        img1.setOnClickListener(new View.OnClickListener() {

            int txtdiem = 0;
            @Override
            public void onClick(View v) {
                if(img1.equals(R.drawable.a)){
                    txtdiem  +=5;
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivityGame.this);
                    builder.setTitle("Hello !!");
                    builder.setIcon(R.drawable.icon_games);
                    builder.setMessage("Bạn chọn đáp án sai rồi! Ahihi");
                    builder.setCancelable(true);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {

            int txtdiem = 0;
            @Override
            public void onClick(View v) {
                if(img2.equals(R.drawable.a)){
                    txtdiem   +=5;
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivityGame.this);
                    builder.setTitle("Hello !!");
                    builder.setIcon(R.drawable.icon_games);
                    builder.setMessage("Bạn chọn đáp án sai rồi! Ahihi");
                    builder.setCancelable(true);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }

            }

        });
        img3.setOnClickListener(new View.OnClickListener() {

            int txtdiem = 0;
            @Override
            public void onClick(View v) {
                if(img3.equals( R.drawable.a)){
                    txtdiem  +=5;
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivityGame.this);
                    builder.setTitle("Hello !!");
                    builder.setIcon(R.drawable.icon_games);
                    builder.setMessage("Bạn chọn đáp án sai rồi! Ahihi");
                    builder.setCancelable(true);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {

            int txtdiem = 0;
            @Override
            public void onClick(View v) {
                if(img4.equals(R.drawable.a)){
                    txtdiem  +=5;
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivityGame.this);
                    builder.setTitle("Hello !!");
                    builder.setIcon(R.drawable.icon_games);
                    builder.setMessage("Bạn chọn đáp án sai rồi! Ahihi");
                    builder.setCancelable(true);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
    }

    public void batSukienAmThanh() {
        btnsound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts = new TextToSpeech(MainActivityGame.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status == TextToSpeech.SUCCESS) {

                                int result = tts.setLanguage(Locale.US);
                                if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {

                                } else {
                                    tts.speak(txttu.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                                    //Toast.makeText(MainActivityGame.this, txttu.getText().toString(), Toast.LENGTH_SHORT).show();
                                }


                        }
                    }
                });
            }
        });
    }

    private void setData(){
        txttu.setText(modelGameArrayList.get(i).texttospeech.toString());
        img1.setImageResource(modelGameArrayList.get(i).getImg1());
        img2.setImageResource(modelGameArrayList.get(i).getImg2());
        img3.setImageResource(modelGameArrayList.get(i).getImg3());
        img4.setImageResource(modelGameArrayList.get(i).getImg4());
    }

    private void batSukienNextButton() {

        imgphai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txttu.setText(modelGameArrayList.get(i).texttospeech.toString());

                img1.setImageResource(modelGameArrayList.get(i).getImg1());
                img2.setImageResource(modelGameArrayList.get(i).getImg2());
                img3.setImageResource(modelGameArrayList.get(i).getImg3());
                img4.setImageResource(modelGameArrayList.get(i).getImg4());
                i++;
            }
        });
    }

    private void addData() {
        modelGameArrayList.add(new ModelGame("A", R.drawable.c, R.drawable.b, R.drawable.a, R.drawable.g));
        modelGameArrayList.add(new ModelGame("H", R.drawable.a, R.drawable.h, R.drawable.k, R.drawable.i));
        modelGameArrayList.add(new ModelGame("G", R.drawable.j, R.drawable.b, R.drawable.k, R.drawable.g));
        modelGameArrayList.add(new ModelGame("T", R.drawable.cambodia, R.drawable.fish, R.drawable.k, R.drawable.a));
        modelGameArrayList.add(new ModelGame("w", R.drawable.giangsinh, R.drawable.b, R.drawable.w, R.drawable.g));
        modelGameArrayList.add(new ModelGame("L", R.drawable.m, R.drawable.granddaughter,R.drawable.k, R.drawable.l));

    }

    private void Anhxa() {
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        btnsound = findViewById(R.id.btnsound);
        imgphai = findViewById(R.id.imgphai);
        imgtrai = findViewById(R.id.imgtrai);
        txttu= findViewById(R.id.txtchu);
        txtdiem = findViewById(R.id.txtdiem);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
