package palembang.gelumbang.zefta.uwalq.arraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Inisil
        ArrayList<String> kata = new ArrayList<String>();
//
        String[] arrayKata = {"a","b","c"};


        kata.add("satu");
        kata.add("dua");
        kata.add("tiga");
        kata.add("empat");
        kata.add("lima");
        kata.add("enam");
        kata.add("tujuh");
        kata.add("delapan");
        kata.add("sembilan");
        kata.add("sepuluh");
        kata.add("sebelas");
        kata.add("dua Belas");
        kata.add("Tiga Belas");
        kata.add("Empat Belas");
        kata.add("Lima Belas");
        kata.add("Enam Belas");
        kata.add("Tujuh Belas");
        kata.add("Delapan Belas");
        kata.add("Sembilan Belas");
        kata.add("Dua Puluh");


        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, kata);

        ListView listview =   (ListView) findViewById(R.id.lv_kata);
        listview.setAdapter(itemAdapter);
    }
}
