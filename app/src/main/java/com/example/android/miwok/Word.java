package com.example.android.miwok;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;

/**
 * Created by Goku on 20/09/2016.
 * {@link Word} representa uma (1) palavra do vocabulário que o usuário precisa para aprender.
 * Contém uma tradução no inglês e uma tradução em miwok dessa palavra, além de uma imagem representativa
 *
 * Obs: Android Studio me obrigou a tirar o "public" das classes, construtores e métodos
 */

class Word {
    /** Translations for the words */
    private String mMiwokTranslation, mEnglishTranslation;

    /** Image Resource ID for the word */
    private int mImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Image Resource ID for the play button */
    private int mPlayButtonImage;

    /** Image Resource ID for the word */
    private int mSoundId;

    /**Construtor: Cria um objeto Word dentro da própria classe Word com dois parâmetros
     *  @param englishTranslation é a palavra em inglês
     *
     * @param miwokTranslation é a palavra em miwok */
    Word(String englishTranslation, String miwokTranslation, int playButtonImage, int soundId){
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = miwokTranslation;
        mPlayButtonImage = playButtonImage;
        mSoundId = soundId;
    }

    /**Construtor 2: Cria um objeto Word dentro da própria classe Word com três parâmetros
     *  @param englishTranslation é a palavra em inglês
     *
     * @param miwokTranslation é a palavra em miwok
     *
     * @param mmImage é o ID da imagem*/
    Word(String englishTranslation, String miwokTranslation, int mmImage, int playButtonImage, int soundId){
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageId = mmImage;
        mPlayButtonImage = playButtonImage;
        mSoundId = soundId;
    }

    //Pega a tradução em inglês da palavra
    String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    //Pega a tradução em miwok da palavra
    String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //Retorna o ID da imagem da palavra
    int getImage() {
        return mImageId;
    }

    /**
     *Returns whether or not there is an image for this word.
     */
    boolean hasImage(){

        /** Se as variáveis forem diferentes haverá uma imagem válida e o método retornará true */
        return mImageId != NO_IMAGE_PROVIDED;
    }


    int getImage2() {
        return mPlayButtonImage;
    }


    int getAudioResourceId() {
        return mSoundId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mEnglishTranslation='" + mEnglishTranslation + '\'' +
                ", mImageId=" + mImageId +
                ", mPlayButtonImage=" + mPlayButtonImage +
                ", mSoundId=" + mSoundId +
                '}';
    }
}
