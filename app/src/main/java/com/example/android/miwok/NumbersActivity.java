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

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //inicializa o root(a atividade que essa classe vai poder manipular)
        setContentView(R.layout.word_list);

        // Cria a lista de palavras
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("one", "lutti", (R.drawable.number_one), MediaPlayer.create(this, R.raw.color_red)));
        words.add(new Word("two", "otiiko", (R.drawable.number_two), MediaPlayer.create(this, R.raw.color_red)));
        words.add(new Word("three", "tolookosu", (R.drawable.number_three), MediaPlayer.create(this, R.raw.color_red)));
        words.add(new Word("four", "oyyisa", (R.drawable.number_four), MediaPlayer.create(this, R.raw.color_red)));
        words.add(new Word("five", "massokka", (R.drawable.number_five), MediaPlayer.create(this, R.raw.color_red)));
        words.add(new Word("six", "temmokka", (R.drawable.number_six), MediaPlayer.create(this, R.raw.color_red)));
        words.add(new Word("seven", "kenekaku", (R.drawable.number_seven), MediaPlayer.create(this, R.raw.color_red)));
        words.add(new Word("eight", "kawinta", (R.drawable.number_eight), MediaPlayer.create(this, R.raw.color_red)));
        words.add(new Word("nine", "wo’e", (R.drawable.number_nine), MediaPlayer.create(this, R.raw.color_red)));
        words.add(new Word("ten", "na’aacha", (R.drawable.number_ten), MediaPlayer.create(this, R.raw.color_red)));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_numbers);

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
