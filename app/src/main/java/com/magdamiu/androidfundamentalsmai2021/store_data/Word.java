package com.magdamiu.androidfundamentalsmai2021.store_data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

   @PrimaryKey
   @ColumnInfo(name = "word")
   @NonNull
   private String word;

   public Word(String word) {this.word = word;}

   public String getWord(){return this.word;}
}