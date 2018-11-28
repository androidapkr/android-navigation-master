package com.demo.navigationarch

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

class Fragment2 : BaseFragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args1 = arguments!!.getString("frag1_args1")
        val args2 = arguments!!.getString("frag3_args1")
        val args4 = Fragment2Args.fromBundle(arguments)

        Log.d("_TAG_", "onCreateView: $args1")
        Log.d("_TAG_", "onCreateView: $args2")
        Log.d("_TAG_", "onCreateView: $args4")



        for (a in listOf(arguments)) {
            Log.d("_TAG_", "onCreateView:  " + listOf(a))
        }

        val options = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }

        view.findViewById<Button>(R.id.navigate_frag2_to_frag3)?.setOnClickListener {
            findNavController().navigate(R.id.action_from_fragment_2_to_fragment_3, arguments, options)
        }
    }
}