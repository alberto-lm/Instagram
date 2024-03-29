package com.example.instagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import java.util.Date;


@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_USER = "user";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_DATE = "Born";
    public static final String KEY_LIKES = "Likes";


    public Post(){}

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user) {
        put(KEY_USER, user);
    }

    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile image){
        put(KEY_IMAGE, image);
    }

    public String getDescription() {
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String description) {
        put(KEY_DESCRIPTION, description);
    }

    public Date getTimestamp(){
        return getDate(KEY_DATE);
    }
    public void setTime(Date birth){
        put(KEY_DATE, birth);
    }

    public int getLikes(){
        return getInt(KEY_LIKES);
    }

    public void setLikes(int numberOfLikes){
        put(KEY_LIKES, numberOfLikes);
    }

}