package com.example.amitwalke.motogirilayouts;

import java.util.ArrayList;

/**
 * Created by amitwalke on 9/10/17.
 */

public class BaseModel {

public int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public ArrayList<ChildItem> getChildItems() {
        return childItems;
    }

    public void setChildItems(ArrayList<ChildItem> childItems) {
        this.childItems = childItems;
    }

    private ArrayList<ChildItem> childItems = new ArrayList<>();




}
