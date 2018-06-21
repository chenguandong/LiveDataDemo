package guandong.com.livedatademo.repository

import android.arch.lifecycle.MutableLiveData

/**
 * @author guandongchen
 * @date 2018/3/22
 */
interface MyRepository {

    val liveData: MutableLiveData<List<String>>

    val allData: List<String>

}
