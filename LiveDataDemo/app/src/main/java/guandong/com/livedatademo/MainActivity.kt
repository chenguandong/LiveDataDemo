package guandong.com.livedatademo

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.TextView

import guandong.com.livedatademo.ViewModel.MyViewModel
import guandong.com.livedatademo.adapter.ItemAdapter

class MainActivity : AppCompatActivity() {

    private var myViewModel: MyViewModel? = null

    private var textView: TextView? = null

    private var recyclerView: RecyclerView? = null
    private var itemAdapter: ItemAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

        recyclerView = findViewById(R.id.recycleView)

        myViewModel = ViewModelProviders.of(this).get(MyViewModel::class.java!!)

        myViewModel!!.init("")

        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.

        myViewModel!!.listAllMutableLiveData!!.observe(this, { listData ->

            val stringBuilder = StringBuilder()
            for (str in listData) {
                stringBuilder.append(str)

            }
            textView!!.text = stringBuilder
            itemAdapter!!.notifyDataSetChanged()


        })

        ///////
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        itemAdapter = ItemAdapter(R.layout.layout_item, myViewModel!!.allData)
        recyclerView!!.adapter = itemAdapter


    }
}
