package `in`.devco.fragmentlauncher

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class FragmentLauncher(
    private val fragmentManager: FragmentManager,
    private val fragmentLayout: Int
) {
    fun <T> startFragment(fragment: Class<T>, data: Bundle) {
        val f = fragmentManager.findFragmentByTag(fragment.name)

        if (f == null) {
            val frag = fragment.newInstance() as Fragment
            frag.arguments = data

            fragmentManager
                .beginTransaction()
                .add(fragmentLayout, frag, fragment.name)
                .commit()
        } else {
            f.arguments = data
            fragmentManager
                .beginTransaction()
                .replace(fragmentLayout, f, fragment.name)
                .commit()
        }
    }

    fun <T> startFragment(fragment: Class<T>) {
        val f = fragmentManager.findFragmentByTag(fragment.name)

        if (f == null) {
            fragmentManager
                .beginTransaction()
                .add(fragmentLayout, fragment.newInstance() as Fragment, fragment.name)
                .commit()
        } else {
            fragmentManager
                .beginTransaction()
                .replace(fragmentLayout, f, fragment.name)
                .commit()

        }
    }
}