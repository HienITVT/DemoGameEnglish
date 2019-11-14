package com.example.demoenglishgame;

import android.content.Context;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;


public class ListGameAdapter extends ArrayAdapter<ListGame> {


    //@Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder viewHolder;
//        if (convertView == null){
//            viewHolder = new ViewHolder();
//            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.act_customlistgame,parent,false);
//            viewHolder.imglistgame = convertView.findViewById(R.id.imglistgame);
//            viewHolder.txtvlistgame = convertView.findViewById(R.id.txtvlistgame);
//
//            convertView.setTag(viewHolder);
//        }else {
//           viewHolder = (ViewHolder) convertView.getTag();
//        }
//        ListGame listGame = arrayListGame.get(position);
//        viewHolder.txtvlistgame.setText(listGame.getTengame());
//        viewHolder.imglistgame.setImageResource(listGame.getImglist());
//        return convertView;
//
//    }
//    public class ViewHolder{
//        private ImageView imglistgame;
//        private TextView txtvlistgame;
//    }
    Context context;
    int resource;



    public ListGameAdapter(Context context, int resource) {

        super(context, resource);
        this.context = context;
        this.resource = resource;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
         view = LayoutInflater.from(context).inflate(R.layout.act_customlistgame, null);
        ImageView imglist = view.findViewById(R.id.imglistgame);
        TextView tengame = view.findViewById(R.id.txtvlistgame);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getApplicationContext(),MainActivityGame.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.getApplicationContext().startActivity(intent);

            }
        });


        ListGame listGame = (ListGame)getItem(position);
        imglist.setImageResource(listGame.getImglist());
        tengame.setText(listGame.getTengame());






        return view;
    }


//    private abstract class ViewHolder  {
//            ImageView imageView ;
//            TextView textView;
//
//
//    }

}
