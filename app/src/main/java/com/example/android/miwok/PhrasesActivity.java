/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //inicializa o root(a atividade que essa classe vai poder manipular)
        setContentView(R.layout.word_list);

        // Cria a lista de palavras
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "minto wuksus", MediaPlayer.create(this, R.raw.phrase_where_are_you_going)));
        words.add(new Word("What is your name?", "tinnә oyaase'nә", MediaPlayer.create(this, R.raw.phrase_what_is_your_name)));
        words.add(new Word("My name is...", "oyaaset...", MediaPlayer.create(this, R.raw.phrase_my_name_is)));
        words.add(new Word("How are you feeling?", "michәksәs?", MediaPlayer.create(this, R.raw.phrase_how_are_you_feeling)));
        words.add(new Word("I’m feeling good.", "kuchi achit", MediaPlayer.create(this, R.raw.phrase_im_feeling_good)));
        words.add(new Word("Are you coming?", "әәnәs'aa?", MediaPlayer.create(this, R.raw.phrase_are_you_coming)));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", MediaPlayer.create(this, R.raw.phrase_yes_im_coming)));
        words.add(new Word("I’m coming.", "әәnәm", MediaPlayer.create(this, R.raw.phrase_im_coming)));
        words.add(new Word("Let’s go.", "yoowutis", MediaPlayer.create(this, R.raw.phrase_lets_go)));
        words.add(new Word("Come here.", "әnni'nem", MediaPlayer.create(this, R.raw.phrase_come_here)));




        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        //Encontra pelo id "rootView" o LinearLayout do root dessa classe
        //o root é o arquivo word_list

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        assert listView != null;//essa linha android studio obrigou
        listView.setAdapter(adapter);
    }
}
