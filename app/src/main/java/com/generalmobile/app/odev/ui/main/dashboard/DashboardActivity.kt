package com.generalmobile.app.odev.ui.main.dashboard

import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.generalmobile.app.odev.R
import com.generalmobile.app.odev.core.BaseActivity
import com.generalmobile.app.odev.databinding.ActivityDashboardActivityBinding

class DashboardActivity : BaseActivity<DashboardActivityViewModel, ActivityDashboardActivityBinding>(DashboardActivityViewModel::class.java) {
    override fun getLayoutRes() = R.layout.activity_dashboard_activity

    override fun initViewModel(viewModel: DashboardActivityViewModel) {

        binding.viewModel = viewModel

        setupNavigation()


    }


    private fun setupNavigation() {
        val navController = findNavController(R.id.dashboardFragment)

        setupActionBarWithNavController(navController)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val navController = findNavController(R.id.dashboardFragment)
        if (navController.currentDestination?.id != item?.itemId)
            NavigationUI.onNavDestinationSelected(item!!, navController)

        return super.onOptionsItemSelected(item)
    }


    override fun onSupportNavigateUp(): Boolean = findNavController(R.id.dashboardFragment).navigateUp()


}
