package tabbedactivitytest.mobilesw.kau.timetravel

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView

/**
 * Created by AHYEON on 2017-12-12.
 */
class SetQnaFragment : Fragment() {
    lateinit var expandableListView: ExpandableListView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView = inflater.inflate(R.layout.activity_set_qna,container,false)

        expandableListView = rootView.findViewById(R.id.expandableListView)

        val modelList = ArrayList<String>()
        modelList.add("Q. 이 어플은 어떤 용도인가요?")
        modelList.add("Q. 개발자는 누구인가요?")

        expandableListView.setAdapter(ExpandableListViewAdapter(activity, modelList))

        return rootView
    }


}