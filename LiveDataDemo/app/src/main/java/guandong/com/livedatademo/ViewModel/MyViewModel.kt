package guandong.com.livedatademo.ViewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

import guandong.com.livedatademo.repository.MyRepository
import guandong.com.livedatademo.repository.MyRepositoryImpl

/**
 * @author guandongchen
 * @date 2018/3/22
 */

class MyViewModel : ViewModel() {

    var listAllMutableLiveData: MutableLiveData<List<String>>? = null
        private set
    private val myRepository: MyRepository

    val allData: List<String>
        get() = myRepository.allData

    init {
        myRepository = MyRepositoryImpl()
    }

    fun init(uName: String) {

        listAllMutableLiveData = myRepository.liveData
    }
}
