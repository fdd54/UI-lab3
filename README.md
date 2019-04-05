# UI-lab3
####一、利用SimpleAdapter实现微信聊天界面<br>
代码：<br>
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

        <!-- 定义一个ListView -->
        <ListView android:id="@+id/list_test"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"/>
        <Button
            android:id="@+id/click"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Elephant"
            android:layout_gravity="center_horizontal"/>
</LinearLayout>

```
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <!--用于显示头像-->
    <ImageView
        android:id="@+id/header"
        android:layout_width="54dp"
        android:layout_height="54dp"
        android:baselineAlignBottom="true"
        android:layout_gravity="right"
        android:paddingLeft="4dp"/>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <TextView
            android:id="@+id/name"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:paddingLeft="4dp"
            android:textSize="18dp"
            android:textColor="@color/black"/>
        <TextView
            android:id="@+id/desc"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:paddingLeft="4dp"
            android:textSize="8dp"
            android:textColor="@color/black"/>
    </LinearLayout>
</LinearLayout>

```
```
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
```
界面：<br>
![images]https://github.com/fdd54/UI-lab3/blob/master/images/simpleadapter.png<br>
####二、创建自定义布局的AlterDialog<br>
代码：<br>
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/header_logo"/>
    <EditText
        android:id="@+id/et_name"
        android:layout_gravity="center"
        android:hint="Username"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
    <EditText
        android:id="@+id/et_password"
        android:layout_gravity="center"
        android:hint="Password"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
    <Button
        android:id="@+id/cancle"
        android:text="Cancel"
        android:layout_gravity="center"
        android:layout_width="150dp"
        android:layout_height="wrap_content" />
    <Button
        android:id="@+id/sign_in"
        android:text="Sign in"
        android:layout_gravity="center"
        android:layout_width="150dp"
        android:layout_height="wrap_content" />
    </LinearLayout>
</LinearLayout>
```
```
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
 ```
界面：<br>
![images]https://github.com/fdd54/UI-lab3/blob/master/images/alter_dialog.png<br>
####三、使用XML定义菜单<br>
代码：<br>
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/font"
        android:orderInCategory="2"
        android:title="字体大小">
        <menu>
            <item
                android:title="小"
                android:id="@+id/small_size">
            </item>
            <item
                android:title="中"
                android:id="@+id/middle_size">
            </item>
            <item
                android:title="大"
                android:id="@+id/big_size">
            </item>
        </menu>
    </item>
    <item
        android:id="@+id/commom_menu"
        android:title="普通菜单项"
        android:orderInCategory="2">
    </item>
    <item
        android:id="@+id/color"
        android:title="字体颜色"
        android:orderInCategory="1">
        <menu>
            <item
                android:id="@+id/red"
                android:title="红色">
            </item>
            <item
                android:id="@+id/black"
                android:title="黑色">
            </item>
        </menu>
    </item>
</menu>
```
界面：<br>
![images]https://github.com/fdd54/UI-lab3/blob/master/images/menutest_1.png<br>
![images]https://github.com/fdd54/UI-lab3/blob/master/images/munutest_2.png<br>
![images]https://github.com/fdd54/UI-lab3/blob/master/images/munutest_3.png<br>
![images]https://github.com/fdd54/UI-lab3/blob/master/images/munutest_4.png<br>
####四、创建ActionMode的上下文菜单<br>
代码：<br>
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:id="@+id/choose"
        android:title="select"
        android:icon="@drawable/ic_launcher_foreground">
    </item>
</menu>
```
界面：<br>
![images]https://github.com/fdd54/UI-lab3/blob/master/images/actionnode.png<br>
