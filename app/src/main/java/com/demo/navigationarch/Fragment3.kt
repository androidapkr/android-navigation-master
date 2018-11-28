package com.demo.navigationarch

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class Fragment3 : BaseFragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.navigate_frag3_to_frag2).setOnClickListener {
            findNavController().navigate(R.id.action_from_fragment_3_to_fragment_2, Fragment2Args.Builder().setFrom3("Passing argument from Fragment 3").build().toBundle())
        }
    }
}