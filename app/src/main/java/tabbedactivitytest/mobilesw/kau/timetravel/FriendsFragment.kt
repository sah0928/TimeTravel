package tabbedactivitytest.mobilesw.kau.timetravel

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tabbedactivitytest.mobilesw.kau.timetravel.R

/**
 * Created by USER on 2017-11-26.
 */
class FriendsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.friends_tab2,container,false)
        return rootView
    }
}
