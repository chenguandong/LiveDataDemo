package guandong.com.livedatademo.repository;

import android.arch.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guandongchen
 * @date 26/03/2018
 */

public class MyRepositoryImpl implements MyRepository{
    @Override
    public MutableLiveData<List<String>> getLiveData(){
        MutableLiveData<List<String>> listAllMutableLiveData = new MutableLiveData<>();
        List<String> tempList =new ArrayList<>();
        tempList.add("1");
        tempList.add("2");
        listAllMutableLiveData.setValue(tempList);
        return listAllMutableLiveData;
    }
    @Override
    public List<String> getAllData() {
        return getLiveData().getValue();
    }

}
