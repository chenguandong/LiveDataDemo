package guandong.com.livedatademo;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import guandong.com.livedatademo.ViewModel.MyViewModel;
import guandong.com.livedatademo.adapter.ItemAdapter;
public class MainActivity extends AppCompatActivity {

    private MyViewModel myViewModel;

    private TextView textView;

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        recyclerView = findViewById(R.id.recycleView);

        myViewModel =  ViewModelProviders.of(this).get(MyViewModel.class);

        myViewModel.init("");

        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.

        myViewModel.getListAllMutableLiveData().observe(this,listData ->{

            StringBuilder stringBuilder = new StringBuilder();
            for (String str:
                 listData) {
                stringBuilder.append(str);

            }
            textView.setText(stringBuilder);
            itemAdapter.notifyDataSetChanged();


        });

        ///////
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemAdapter = new ItemAdapter(R.layout.layout_item,myViewModel.getAllData());
        recyclerView.setAdapter(itemAdapter);



    }
}
