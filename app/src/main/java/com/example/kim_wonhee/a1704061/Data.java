package com.example.kim_wonhee.a1704061;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kim_wonhee on 2017. 4. 6..
 */

public class Data implements Parcelable {

    private String name = "";
    private String food = "";
    private String phone = "";
    private String menu1 = "";
    private String menu2 = "";
    private String menu3 = "";
    private String page = "";
    private String now = "";


    public Data(String name, String food, String phone, String menu1, String menu2, String menu3, String page, String now) {
        this.name = name;
        this.food = food;
        this.phone = phone;
        this.menu1 = menu1;
        this.menu2 = menu2;
        this.menu3 = menu3;
        this.page = page;
        this.now = now;
    }

    protected Data(Parcel in) {
        name = in.readString();
        food = in.readString();
        phone = in.readString();
        menu1 = in.readString();
        menu2 = in.readString();
        menu3 = in.readString();
        page = in.readString();
        now = in.readString();
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    public void setData(String name, String food, String phone, String menu1, String menu2, String menu3, String page, String now) {
        this.name = name;
        this.food = food;
        this.phone = phone;
        this.menu1 = menu1;
        this.menu2 = menu2;
        this.menu3 = menu3;
        this.page = page;
        this.now = now;
    }

    public String getName() {
        return this.name;
    }

    public String getFood() {
        return this.food;
    }

    public String getPhone() {return this.phone;}

    public String getMenu1() {
        return this.menu1;
    }

    public String getMenu2() {
        return this.menu2;
    }

    public String getMenu3() {
        return this.menu3;
    }

    public String getPage() {
        return this.page;
    }

    public String getNow() {
        return this.now;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(food);
        dest.writeString(phone);
        dest.writeString(menu1);
        dest.writeString(menu2);
        dest.writeString(menu3);
        dest.writeString(page);
        dest.writeString(now);
    }
}