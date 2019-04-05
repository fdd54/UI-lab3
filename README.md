# UI-lab3
####一、利用SimpleAdapter实现微信聊天界面<br>
代码：<br>
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
![images]https://github.com/fdd54/UI-lab3/blob/master/images/actionnode.png<br>
####二、创建自定义布局的AlterDialog<br>
代码：<br>
界面：<br>
![images]https://github.com/fdd54/UI-lab3/blob/master/images/alter_dialog.png<br>
####一、使用XML定义菜单<br>
代码：<br>
界面：<br>
![images]https://github.com/fdd54/UI-lab3/blob/master/images/menutest_1.png<br>
![images]https://github.com/fdd54/UI-lab3/blob/master/images/munutest_2.png<br>
![images]https://github.com/fdd54/UI-lab3/blob/master/images/munutest_3.png<br>
![images]https://github.com/fdd54/UI-lab3/blob/master/images/munutest_4.png<br>
####一、创建ActionMode的上下文菜单<br>
代码：<br>
界面：<br>
![images]https://github.com/fdd54/UI-lab3/blob/master/images/simpleadapter.png<br>
