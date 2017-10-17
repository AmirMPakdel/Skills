package com.coins.black.skills;

import android.widget.ImageView;

import com.ramotion.foldingcell.FoldingCell;

/**
 * Created by Alvan on 10/17/2017.
 */



public class SkillItem {

    private String head;
    private int image;

    public SkillItem(String head, int image){

        this.head = head;
        this.image= image;

    }

    public String getHead(){ return head; }
    public int getImage() { return image; }


}
