package com.example.noura.testregister;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Noura on 2/5/2016.
 */
public class UserLocalStore {
    public static final String SP_NAME= "userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context){
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);

    }

    public void storeUserData(User user){

        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putInt("id", user.id);
        spEditor.putString("name", user.name);
        spEditor.putString("password", user.password);
        spEditor.putString("email", user.email);
        spEditor.commit();

    }

}
