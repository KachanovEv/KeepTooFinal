package com.example.keeptoofinal

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dgreenhalgh.android.simpleitemdecoration.grid.GridBottomOffsetItemDecoration
import com.dgreenhalgh.android.simpleitemdecoration.grid.GridTopOffsetItemDecoration
import com.dgreenhalgh.android.simpleitemdecoration.linear.EndOffsetItemDecoration
import com.dgreenhalgh.android.simpleitemdecoration.linear.StartOffsetItemDecoration
import com.example.keeptoofinal.adapter.RecyclerViewAdapter
import com.example.keeptoofinal.model.Data
import kotlinx.android.synthetic.main.activity_scrolling.*
import org.jetbrains.anko.toast


class ScrollingActivity : AppCompatActivity() {

    private var viewAdapter: RecyclerViewAdapter = RecyclerViewAdapter()
    private var mockData: ArrayList<Data>? = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)

        initViews()
        addMockData()

        fab.setOnClickListener {
            toast("FAB clicked")
        }
    }

    private fun initViews() {
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(true)

        viewAdapter = RecyclerViewAdapter()
        initRecyclerView(rv_recent_media)
        rv_recent_media.adapter = viewAdapter

        bottom_app_bar.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_temp -> toast("Temp Menu Clicked")
                R.id.navigation_safe -> toast("Safe Menu Clicked")
                R.id.navigation_clean -> toast("Clean Menu Clicked")
                R.id.navigation_setting -> toast("Settings Menu Clicked")
            }
            true
        }

        tv_recent_media_main.setOnClickListener { toast("Recent Media BTN Clicked") }
    }

    private fun initRecyclerView(recyclerView: RecyclerView) {
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.addItemDecoration(GridTopOffsetItemDecoration(16, 2))
        recyclerView.addItemDecoration(GridBottomOffsetItemDecoration(16, 2))
        recyclerView.addItemDecoration(StartOffsetItemDecoration(16))
        recyclerView.addItemDecoration(EndOffsetItemDecoration(16))
    }

    private fun addMockData() {
        for (i in 0 until 20) {
            mockData!!.add(Data(R.drawable.mask))
        }
        viewAdapter.setData(mockData)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.filter_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.action_settings -> toast("Filters Clicked")
        }
        return super.onOptionsItemSelected(item)
    }
}
