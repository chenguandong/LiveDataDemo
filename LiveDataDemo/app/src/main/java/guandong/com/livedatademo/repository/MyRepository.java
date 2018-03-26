package guandong.com.livedatademo.repository;

import android.arch.lifecycle.MutableLiveData;

import java.util.List;

/**
 * @author guandongchen
 * @date 2018/3/22
 */
public interface MyRepository {

     MutableLiveData<List<String>> getLiveData();

     List<String> getAllData() ;

}
