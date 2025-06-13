package com.triquetratech.myapplication.data.model;

public class ListItem {
    private String Title;
    private String SubTitle;

    public ListItem(String title, String subTitle) {
        Title = title;
        SubTitle = subTitle;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSubTitle() {
        return SubTitle;
    }

    public void setSubTitle(String subTitle) {
        SubTitle = subTitle;
    }
}
