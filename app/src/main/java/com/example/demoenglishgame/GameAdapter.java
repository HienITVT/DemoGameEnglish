package com.example.demoenglishgame;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;


public class GameAdapter extends ArrayAdapter  {

    Context context;
    int resource;

    TextToSpeech  tts;
    public GameAdapter(Context context, int resource) {
        super(context,resource);
        this.context = context;
        this.resource = resource;

    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = LayoutInflater.from(context).inflate(R.layout.act_game, parent, false);

        final ImageView img1 = view.findViewById(R.id.img1);
        ImageView img2 = view.findViewById(R.id.img2);
        ImageView img3 = view.findViewById(R.id.img3);
        ImageView img4 = view.findViewById(R.id.img4);
        final TextView txttospeech = view.findViewById(R.id.btnsound);


        final ViewHolder viewHolder = new ViewHolder();
        viewHolder.txttospeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              tts = new TextToSpeech(context.getApplicationContext(),
                     new TextToSpeech.OnInitListener() {
                 @Override
                 public void onInit(int status) {
                     if (status == TextToSpeech.SUCCESS) {
                         if (viewHolder.check == 1){
                             int result = tts.setLanguage(Locale.US);
                             if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {

                             } else {
                                 tts.speak(viewHolder.txttospeech.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                             }
                         }

                     }
                 }
             });
            }
        });





        ModelGame modelGame = (ModelGame) getItem(position);
        img1.setImageResource(modelGame.getImg1());
        img2.setImageResource(modelGame.getImg2());
        img3.setImageResource(modelGame.getImg3());
        img4.setImageResource(modelGame.getImg4());
        txttospeech.setText(modelGame.texttospeech);




        return view ;
    }



    public class ViewHolder{
        ImageView imgv1, imgv2, imgv3, imgv4;
        TextView txttospeech;
        int check = 1;

    }
}
