package com.coins.black.skills;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ramotion.foldingcell.FoldingCell;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<SkillItem> skillItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        // get our folding cell
//        final FoldingCell fc = (FoldingCell) findViewById(R.id.folding_cell);
//        // attach click listener to folding cell
//        fc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fc.toggle(false);
//            }
//        });

        //recyclerViewOptions
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        skillItems = new ArrayList<>();

        List<Integer> PolicePic = new ArrayList<>();

        PolicePic.add(R.drawable.police_1);
        PolicePic.add(R.drawable.police_2);
        PolicePic.add(R.drawable.police_3);

        for(int i =1;i<=3; i++ ){

            SkillItem skillItem = new SkillItem(
                    "heading" + (i), PolicePic.get(i-1)

            );

            skillItems.add(skillItem);
        }

        adapter = new SkillAdapter(skillItems,this);

        recyclerView.setAdapter(adapter);
    }


}
