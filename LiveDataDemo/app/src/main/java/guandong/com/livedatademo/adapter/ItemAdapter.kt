package guandong.com.livedatademo.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

import guandong.com.livedatademo.R

/**
 * @author guandongchen
 * @date 2018/3/22
 */

class ItemAdapter : BaseQuickAdapter<String, BaseViewHolder> {
    constructor(layoutResId: Int, data: List<String>?) : super(layoutResId, data) {}

    constructor(data: List<String>?) : super(data) {}

    constructor(layoutResId: Int) : super(layoutResId) {}

    override fun convert(helper: BaseViewHolder, item: String) {
        helper.setText(R.id.textView, item)
    }
}
