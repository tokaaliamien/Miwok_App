package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by Demo on 2017-06-30.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mcolor;

    public WordAdapter(Activity context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        mcolor = color;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        final Word currentWord = getItem(position);

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english);
        englishTextView.setText(currentWord.getmDefaultTranslation());

        TextView miwakTextView = (TextView) listItemView.findViewById(R.id.miwak);
        miwakTextView.setText(currentWord.getmMiwakTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else
            imageView.setVisibility(View.GONE);

        View textLayout = listItemView.findViewById(R.id.text_Layout);
        int color = ContextCompat.getColor(getContext(), mcolor);
        textLayout.setBackgroundColor(color);


        return listItemView;
    }

}
