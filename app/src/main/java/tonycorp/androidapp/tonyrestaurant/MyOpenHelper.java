package tonycorp.androidapp.tonyrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lenovo on 3/19/2016.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    public static final String database_name = "Restaurant.db";
    private static final int database_version = 1;

    //SQLite
    private static final String create_user_table = "create table userTABLE (" +
            "_id integer primary key, " +
            "User text, " +
            "Password text, " +
            "Name text);";

    private static final String create_food_table = "create table foodTABLE (" +
            "_id integer primary key, " +
            "Food text, " +
            "Price text, " +
            "Source text);";

    public MyOpenHelper(Context context){
        super(context, database_name, null, database_version); //name,security=null,version

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_user_table);
        sqLiteDatabase.execSQL(create_food_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
