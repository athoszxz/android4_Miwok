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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.GridView;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Encontra a TextView que quero manipular e coloca dentro do objeto que denominei de "numbers"
        TextView numbers = (TextView) findViewById(R.id.numbers);

        if (numbers == null) throw new AssertionError();//AndroidStudio me obrigou a colocar

        //Coloca um clickListener (escutador de click) no objeto que encontrou a View
        numbers.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {
                //Cria uma nova intenção "Intent" para abrir o {@link NumbersActivity) quando clicado
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                //Inicia a nova atividade
                startActivity(numbersIntent);

            }
        });


        //Encontra a TextView que quero manipular e coloca dentro do objeto que denominei de "family"
        TextView family = (TextView) findViewById(R.id.family);




        assert family != null;//visualstudio me obrigou a colocar

        //Coloca um clickListener (escutador de click) no objeto que encontrou a View
        family.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {
                //Criando uma nova intenção "Intent" para abrir o {@link FamilyActivity) quanso clicado
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                //Inicia a nova atividade
                startActivity(familyIntent);

            }
        });

        //Encontra a TextView que quero manipular e coloca dentro do objeto que denominei de "colors"
        TextView colors = (TextView) findViewById(R.id.colors);


        assert colors != null;//visualstudio me obrigou a colocar

        //Coloca um clickListener (escutador de click) no objeto que encontrou a View
        colors.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {
                //Criando uma nova intenção "Intent" para abrir o {@link ColorsActivity) quanso clicado
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                //Inicia a nova atividade
                startActivity(colorsIntent);

            }
        });

        //Encontra a TextView que quero manipular e coloca dentro do objeto que denominei de "phrases"
        TextView phrases = (TextView) findViewById(R.id.phrases);


        assert phrases != null;//visualstudio me obrigou a colocar
        //Coloca um clickListener (escutador de click) no objeto que encontrou a View
        phrases.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {
                //Criando uma nova intenção "Intent" para abrir o {@link PhrasesActivity) quando clicado
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                //Inicia a nova atividade
                startActivity(phrasesIntent);

            }
        });
    }

}
