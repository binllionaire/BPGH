package com.example.bpgh;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ScheduleMain extends Activity implements View.OnClickListener {

    private ArrayList<item> data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* xml과 연결 */
        setContentView(R.layout.schedulemain);

        ListView listView = (ListView) findViewById(R.id.listview);

        /* 서버와 연동했닫면 값을 받아서 띄울 수 있지만,
         * 연동이 되어있지 않으므로
         * 하드코딩으로 값을 집어넣는다.
         * FriendsItem에 정의 한 구조대로 값을 넣을 수 있다.
         */
        data = new ArrayList<>();
        // 1번 아이템
        item friends1 = new item(R.drawable.profile1,"1학년 1반");
        item friends2 = new item(R.drawable.profile2,"1학년 2반");
        item friends3 = new item(R.drawable.profile3,"1학년 3반");
        item friends4 = new item(R.drawable.profile4,"1학년 4반");
        item friends5 = new item(R.drawable.profile5,"1학년 5반");
        item friends6 = new item(R.drawable.profile6,"1학년 6반");
        item friends7 = new item(R.drawable.profile7,"1학년 7반");
        item friends8 = new item(R.drawable.profile8,"2학년 1반");
        item friends9 = new item(R.drawable.profile9,"2학년 2반");
        item friends10 = new item(R.drawable.profile10,"2학년 3반");
        item friends11 = new item(R.drawable.profile11,"2학년 4반");
        item friends12 = new item(R.drawable.profile12,"2학년 5반");
        item friends13 = new item(R.drawable.profile13,"2학년 6반");
        item friends14 = new item(R.drawable.profile14,"2학년 7반");
        item friends15 = new item(R.drawable.profile15,"3학년 1반");
        item friends16 = new item(R.drawable.profile16,"3학년 2반");
        item friends17 = new item(R.drawable.profile17,"3학년 3반");
        item friends18 = new item(R.drawable.profile18,"3학년 4반");
        item friends19 = new item(R.drawable.profile19,"3학년 5반");
        item friends20 = new item(R.drawable.profile20,"3학년 6반");
        item friends21 = new item(R.drawable.profile21,"3학년 7반");


        //리스트에 추가
        data.add(friends1);
        data.add(friends2);
        data.add(friends3);
        data.add(friends4);
        data.add(friends5);
        data.add(friends6);
        data.add(friends7);
        data.add(friends8);
        data.add(friends9);
        data.add(friends10);
        data.add(friends11);
        data.add(friends12);
        data.add(friends13);
        data.add(friends14);
        data.add(friends15);
        data.add(friends16);
        data.add(friends17);
        data.add(friends18);
        data.add(friends19);
        data.add(friends20);
        data.add(friends21);


        /* 리스트 속의 아이템 연결 */
        ListviewAdapter adapter = new ListviewAdapter(this, R.layout.item, data);
        listView.setAdapter(adapter);

        /* 아이템 클릭시 작동 */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), clicked.class);
                /* putExtra의 첫 값은 식별 태그, 뒤에는 다음 화면에 넘길 값 */
                intent.putExtra("info", data.get(position).getInfo());
                intent.putExtra("profile", Integer.toString(data.get(position).getProfile()));
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v) {
    }
}