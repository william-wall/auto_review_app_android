package ie.williamwall.autoreview;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import ie.williamwall.autoreview.firebaseLogin.accountActivity.LoginActivityFirebase;

// Designed and Developed @ William Wall
// Email @ william@williamwall.ie
// GitHub @ github.com/william-wall

public class AdministrationUserOld extends AppCompatActivity {
//
//    ListView lv;
//EditText nameTxt;
//    SearchView searchName;
//    Button addBtn, updateBtn, deleteBtn, clearBtn,saveBtn;
//    ArrayList<String> names = new ArrayList<String>();
//    ArrayAdapter<String> adapter;
//
//    ArrayList<User>users=new ArrayList<User>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_administration_user);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//
//
//            }
//        });
//
//
//
//        loadData();
//        lv = (ListView) findViewById(R.id.listViewMain);
//        searchName = (SearchView) findViewById(R.id.searchViewName);
//        nameTxt = (EditText) findViewById(R.id.editText);
//        addBtn = (Button) findViewById(R.id.add);
//        updateBtn = (Button) findViewById(R.id.update);
//        deleteBtn = (Button) findViewById(R.id.delete);
//        clearBtn = (Button) findViewById(R.id.clear);
//        saveBtn = (Button) findViewById(R.id.save);
//
//
//
////        final String gotName = getIntent().getStringExtra("message_key");
////        final String gotEmail = getIntent().getStringExtra("message_key2");
////        final String gotPhone = getIntent().getStringExtra("message_key3");
////        final String gotPassword = getIntent().getStringExtra("message_key4");
////        User userInstance = new User(gotName, gotEmail, gotPhone, gotPassword);
////        users.add(userInstance);
////        names.add(gotName);
//
//
//
//
//        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, names);
//        lv.setAdapter(adapter);
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> arg0, View v, int pos, long id) {
//                nameTxt.setText(names.get(pos));
//            }
//        });
//
//
//
//
//
//
//
//        searchName.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                adapter.getFilter().filter(newText);
//                return false;
//            }
//        });
//
//
//
//
//
//
//
//
//
//
//        addBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                add();
//            }
//
//        });
//        updateBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                update();
//            }
//
//        });
//        clearBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clear();
//            }
//
//        });
//        deleteBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                delete();
//            }
//
//        });
//        saveBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                saveData();
//            }
//        });
//
//        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> arg0, View v, int pos, long id) {
//                Toast.makeText(AdministrationUserOld.this, "Long Click!", Toast.LENGTH_SHORT).show();
//
//
////                String names = nameTxt.getText().toString();
//
//
//
//                //HERE 1
////                Intent move = new Intent(AdministrationUserOld.this, UserDetail.class);
////                move.putExtra("sendName_key", gotName);
////                move.putExtra("sendEmail_key", gotEmail);
////                move.putExtra("sendPhone_key", gotPhone);
////                move.putExtra("sendPassword_key", gotPassword);
//
//
////                move.putExtra("sendName_key", names);
//
//
//                //HERE 2
////                startActivity(move);
//                return false;
//            }
//        });
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            Toast.makeText(this, "Logged Off", Toast.LENGTH_SHORT).show();
//            Intent Intent = new Intent(AdministrationUserOld.this, LoginActivityFirebase.class);
//            startActivity(Intent);
//
////            return true;
//        }
//
//
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    private void add() {
//        String name = nameTxt.getText().toString();
//        if (!name.isEmpty() && name.length() > 0) {
//            adapter.add(name);
//            adapter.notifyDataSetChanged();
//            nameTxt.setText("");
//            saveData();
//            Toast.makeText(getApplicationContext(), "Added " + name, Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(getApplicationContext(), "Nothing to add", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    private void update() {
//        String name = nameTxt.getText().toString();
//        int pos = lv.getCheckedItemPosition();
//        if (!name.isEmpty() && name.length() > 0) {
//            adapter.remove(names.get(pos));
//            adapter.insert(name, pos);
//            adapter.notifyDataSetChanged();
//            Toast.makeText(getApplicationContext(), "Updated " + name, Toast.LENGTH_SHORT).show();
//
//        } else {
//            Toast.makeText(getApplicationContext(), "Nothing to update", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    private void delete() {
//        int pos = lv.getCheckedItemPosition();
//        if (pos > -1) {
//            adapter.remove(names.get(pos));
//            adapter.notifyDataSetChanged();
//            nameTxt.setText("");
//            Toast.makeText(getApplicationContext(), "Deleted", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(getApplicationContext(), "Nothing to delete", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    private void clear() {
//        adapter.clear();
//    }
//
//
//    private void saveData() {
//        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences2", MODE_PRIVATE);
//        SharedPreferences sharedPreferencesUser = getSharedPreferences("shared preferences3", MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        SharedPreferences.Editor editorUser = sharedPreferencesUser.edit();
//        Gson gson = new Gson();
//        Gson gsonUser = new Gson();
//        String json = gson.toJson(names);
//        String jsonUser = gsonUser.toJson(users);
//        editor.putString("task list2", json);
//        editor.putString("task list3", jsonUser);
//        editor.apply();
//        editorUser.apply();
//    }
//
//    private void loadData() {
//        names = new ArrayList<String>();
//        users = new ArrayList<User>();
//        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences2", MODE_PRIVATE);
//        SharedPreferences sharedPreferencesUser = getSharedPreferences("shared preferences3", MODE_PRIVATE);
//        Gson gson = new Gson();
//        Gson gsonUser = new Gson();
//        String json = sharedPreferences.getString("task list2", null);
//        String jsonUser = sharedPreferencesUser.getString("task list3", null);
//        Type type = new TypeToken<ArrayList<String>>() {
//        }.getType();
//        Type typeUser = new TypeToken<ArrayList<User>>() {
//        }.getType();
//        names = gson.fromJson(json, type);
//        users = gsonUser.fromJson(jsonUser, typeUser);
//        if (names == null) {
//            names = new ArrayList<>();
//        }
//        if(users==null){
//            users = new ArrayList<>();
//        }
//    }
//
////    public void searchViewTitle() {
//////        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);
//////        lv.setAdapter(adapter);
////        searchName.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
////            @Override
////            public boolean onQueryTextSubmit(String query) {
////                return false;
////            }
////
////            @Override
////            public boolean onQueryTextChange(String newText) {
////                adapter.getFilter().filter(newText);
////                return false;
////            }
////        });
//////        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//////            @Override
//////            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//////                Toast.makeText(AdministrationUserOld.this, adapter.getItem(i).getReviewTitle(), Toast.LENGTH_SHORT).show();
//////            }
//////        });
////    }
}
