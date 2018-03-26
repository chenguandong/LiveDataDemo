package guandong.com.livedatademo.ViewModel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import guandong.com.livedatademo.repository.MyRepository;
import guandong.com.livedatademo.repository.MyRepositoryImpl;

/**
 * @author guandongchen
 * @date 2018/3/22
 */

public class MyViewModel extends ViewModel{

    private MutableLiveData<List<String>> listAllMutableLiveData;
    private MyRepository myRepository;

    public MyViewModel() {
        myRepository = new MyRepositoryImpl();
    }

    public void init(String uName){

        listAllMutableLiveData =  myRepository.getLiveData();
    }

    public List<String> getAllData() {
        return myRepository.getAllData();
    }


    public MutableLiveData<List<String>> getListAllMutableLiveData() {
        return listAllMutableLiveData;
    }
}
