package com.example.fjnu.fdd.ui;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] names=new String[]{"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private String[] says=new String[]{"hello","hello","hello","hello","hello","hello"};
    private int[] imgIds=new int[]{R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};

    private String dialogNmae;
    private EditText et1;
    private EditText et2;
    private Button b1;
    private Button b2;

    private TextView tv1;
    private ListView lv1;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionmode);
        setTitle("ActionMode");
        lv1=(ListView)findViewById(R.id.action_list);
        ArrayList<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        lv1.setAdapter(adapter);
        this.registerForContextMenu(lv1);

        // tv1=(TextView)findViewById(R.id.test_text);
      /*  setTitle("Alter_dialog");
        b1=(Button) findViewById(R.id.cancle);
        b2 = (Button) findViewById(R.id.sign_in);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dismissDialog(R.layout.dialog);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });
      /*  setTitle("SimpleAdapter");
        List<Map<String, Object>> listitem = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> showitem = new HashMap<String, Object>();
            showitem.put("touxiang", imgIds[i]);
            showitem.put("name", names[i]);
            showitem.put("syas", says[i]);
            listitem.add(showitem);
        }
        SimpleAdapter myAdapter = new SimpleAdapter(getApplicationContext(), listitem, R.layout.list_item, new String[]{"touxiang", "name", "says"}, new int[]{R.id.header, R.id.name,R.id.desc});
        ListView listView = (ListView) findViewById(R.id.list_test);
        listView.setAdapter(myAdapter);

        // 为ListView的列表项的单击事件绑定事件监听器
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // 第position项被单击时激发该方法
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                System.out.println(names[position] + "被单击了");
            }
        });*/
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        //导入菜单布局
    //    getMenuInflater().inflate(R.menu.ui_menu, menu);
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
      /*  //创建菜单项的点击事件
        switch (item.getItemId()) {
            case R.id.small_size:
                tv1.setTextSize(10);
                break;
            case R.id.middle_size:
                tv1.setTextSize(16);
                break;
            case R.id.big_size:
                tv1.setTextSize(20);
                break;
            case R.id.commom_menu:
                Toast.makeText(this, "显示Toast", Toast.LENGTH_SHORT).show();
                break;
            case R.id.red:
                tv1.setTextColor(this.getResources().getColor(R.color.deepred));
                break;
            case R.id.black:
                tv1.setTextColor(this.getResources().getColor(R.color.black));
                break;
            default:
                break;
        }*/
        switch (item.getItemId()) {
            case R.id.choose:
                count++;
                setTitle(count+" Select");
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
