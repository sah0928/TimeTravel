package tabbedactivitytest.mobilesw.kau.timetravel

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.ExpandableListView

/**
 * Created by AHYEON on 2017-12-11.
 */
class SetQnaActivity: AppCompatActivity()  {
    lateinit var expandableListView: ExpandableListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_qna)

        expandableListView = findViewById(R.id.expandableListView)

        val modelList = ArrayList<String>()
        modelList.add("Q. 이 어플은 어떤 용도인가요?")
        modelList.add("Q. 개발자는 누구인가요?")

        expandableListView.setAdapter(ExpandableListViewAdapter(this@SetQnaActivity, modelList))

    }
}