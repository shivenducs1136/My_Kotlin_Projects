package com.example.nuzzs

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.view.menu.MenuAdapter
import androidx.core.view.MenuItemCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import org.w3c.dom.Text
import android.view.Menu



class MainFragment : Fragment() {
    var mytoolbar:Toolbar? = null
    lateinit var navController: NavController
    lateinit var topAppBar: Menu
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)

    }



}
