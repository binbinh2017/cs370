package edu.qc.seclass.fim;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import edu.qc.seclass.fim.Model.Employee;
import edu.qc.seclass.fim.Model.Product;
import edu.qc.seclass.fim.Model.User;

import java.util.ArrayList;


public class Database extends SQLiteOpenHelper {


    public Database(Context context) {
        super(context, "floorstores.db" , null, 102);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table users " + "(id integer primary key, username text,password text)"
        );
        db.execSQL(
                "create table employee " + "(id integer primary key, employeename text,password text)"
        );

        db.execSQL(
                "create table products " + "(id integer primary key, name text,category text,color text,size text,brand text,type text,price text,species text,storename text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS users");
        db.execSQL("DROP TABLE IF EXISTS employee");
        db.execSQL("DROP TABLE IF EXISTS products");
        onCreate(db);
    }

    public boolean employeeInsert (String username, String password) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("employeename", username);
        contentValues.put("password", password);
        db.insert("employee", null, contentValues);

        return true;
    }
    public boolean userInsert (String username, String password) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", username);
        contentValues.put("password", password);
        db.insert("users", null, contentValues);

        return true;
    }



    public boolean productInsert (String name,String category, String color,String size,String brand,String type, String price,String species,String storename) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("category", category);
        contentValues.put("color", color);
        contentValues.put("size", size);
        contentValues.put("brand", brand);
        contentValues.put("type", type);
        contentValues.put("price", price);
        contentValues.put("species", species);
        contentValues.put("storename", storename);
        db.insert("products", null, contentValues);
        return true;
    }


    public boolean productUpdate (int id,String name,String category, String color,String size,String brand,String type, String price,String species,String storename) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("category", category);
        contentValues.put("color", color);
        contentValues.put("size", size);
        contentValues.put("brand", brand);
        contentValues.put("type", type);
        contentValues.put("price", price);
        contentValues.put("species", species);
        contentValues.put("storename", storename);
        db.update("products", contentValues, "id = ? ", new String[] { Integer.toString(id) } );
        return true;
    }

    public Integer productDelete (Integer id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("products",
                "id = ? ",
                new String[] { Integer.toString(id) });
    }



    @SuppressLint("Range")
    public ArrayList<Product> getProductsAll() {
        ArrayList<Product> array_list = new ArrayList<Product>();

        //hp = new HashMap();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from products", null );

        res.moveToFirst();

        while(res.isAfterLast() == false){
            int id = res.getInt(res.getColumnIndex("id"));
            String name = res.getString(res.getColumnIndex("name"));
            String category = res.getString(res.getColumnIndex("category"));
            String color = res.getString(res.getColumnIndex("color"));
            String size = res.getString(res.getColumnIndex("size"));
            String brand = res.getString(res.getColumnIndex("brand"));
            String type = res.getString(res.getColumnIndex("type"));
            String price = res.getString(res.getColumnIndex("price"));
            String species = res.getString(res.getColumnIndex("species"));
            String storename = res.getString(res.getColumnIndex("storename"));

            array_list.add(new Product(id,name,category,color,size,brand,type,price,species,storename));
            res.moveToNext();
        }
        return array_list;
    }
    @SuppressLint("Range")
    public ArrayList<Employee> getEmployeeAll() {
        ArrayList<Employee> array_list = new ArrayList<Employee>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from employee", null );

        res.moveToFirst();

        while(res.isAfterLast() == false){
            int id = res.getInt(res.getColumnIndex("id"));
            String employeename = res.getString(res.getColumnIndex("employeename"));
            String password= res.getString(res.getColumnIndex("password"));
            array_list.add(new Employee(id,employeename,password));
            res.moveToNext();
        }
        return array_list;
    }
    @SuppressLint("Range")
    public ArrayList<User> getUsersAll() {
        ArrayList<User> array_list = new ArrayList<User>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from users", null );

        res.moveToFirst();

        while(res.isAfterLast() == false){
            int id = res.getInt(res.getColumnIndex("id"));
            String username = res.getString(res.getColumnIndex("username"));
            String password= res.getString(res.getColumnIndex("password"));
            array_list.add(new User(id,username,password));
            res.moveToNext();
        }
        return array_list;
    }


}

