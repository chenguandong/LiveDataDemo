package guandong.com.livedatademo.repository

import android.arch.lifecycle.MutableLiveData

import java.util.ArrayList

/**
 * @author guandongchen
 * @date 26/03/2018
 */

class MyRepositoryImpl : MyRepository {
    override val liveData: MutableLiveData<List<String>>
        get() {
            val listAllMutableLiveData = MutableLiveData<List<String>>()
            val tempList = ArrayList<String>()
            tempList.add("1")
            tempList.add("2")
            listAllMutableLiveData.value = tempList
            return listAllMutableLiveData
        }
    override val allData: List<String>?
        get() = liveData.value

}
