package com.demo.navigationarch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

class Fragment1 : BaseFragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val options = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }

        view.findViewById<Button>(R.id.navigate_start)?.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("frag1_args1", "Passing argument from Fragment 1")
            bundle.putString("frag1_args2", "Passing argument from Fragment 1 arg 2")

            findNavController().navigate(R.id.action_from_fragment1_to_fragment_2, bundle, options)
        }
    }
}