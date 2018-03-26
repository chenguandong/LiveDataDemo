package guandong.com.livedatademo.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import guandong.com.livedatademo.R;

/**
 * @author guandongchen
 * @date 2018/3/22
 */

public class ItemAdapter extends BaseQuickAdapter<String,BaseViewHolder>{
    public ItemAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    public ItemAdapter(@Nullable List<String> data) {
        super(data);
    }

    public ItemAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.textView,item);
    }
}
