package com.example.android.miwok;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.x;
import static android.os.Build.VERSION_CODES.M;

/**
 * Created by Goku on 20/09/2016....
 *
 * {@link WordAdapter} É uma versão modificada do ArrayAdapter (padrão do Android Studio) que exibe
 * duas Strings e uma imagem ou apenas duas Strings.
 *
 * Obs: Android Studio me obrigou a tirar o "public" das classes, construtores e métodos
 */

class WordAdapter extends ArrayAdapter<Word> {

    /** Resource HEXADECIMAL for the background color for this list of words */
    private int mColorResourceId;


    //private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    WordAdapter(Activity context, ArrayList<Word> wordAdapters, int categoryColor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0,wordAdapters);
        mColorResourceId = categoryColor;
    }




    @NonNull //Android Studio me obrigou
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        assert currentWord != null;
        englishTextView.setText(currentWord.getEnglishTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            // Set the ImageView to the resource specified in the current Word
            imageView.setImageResource(currentWord.getImage());

            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            //Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        LinearLayout categoryColorLinearLayout = (LinearLayout) listItemView.findViewById(R.id.text_container);
        categoryColorLinearLayout.setBackgroundResource(mColorResourceId);



        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
