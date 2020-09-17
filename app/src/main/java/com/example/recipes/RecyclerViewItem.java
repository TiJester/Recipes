package com.example.recipes;

public class RecyclerViewItem { // создаем поля для каждого эелемента RecyclerView
    private int imageResource;
    private String textName;
    private String textDescription;
    private String textInstruction;

    // создаем конструктор
    public RecyclerViewItem (int imageResource, String textName, String textDescription, String textInstruction){
        // инициализируем поля данного класса
        this.imageResource = imageResource;
        this.textName = textName;
        this.textDescription = textDescription;
        this.textInstruction = textInstruction;
    }

    // Поля закрыты, создаем публичные методы
    public int getImageResource(){
        return imageResource;
    }
    public String getTextName(){
        return textName;
    }
    public String getTextDescription(){
        return textDescription;
    }
    public String getTextInstruction(){
        return textInstruction;
    }
}
