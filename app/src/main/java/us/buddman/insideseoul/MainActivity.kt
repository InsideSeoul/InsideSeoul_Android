package us.buddman.insideseoul

import us.buddman.insideseoul.utils.BaseActivity

class MainActivity : BaseActivity() {
    override fun setDefault() {
    }

    override fun onCreateViewId(): Int {
        return R.layout.activity_main
    }

    override fun onCreateViewToolbarId(): Int {
        return 0
    }

}
