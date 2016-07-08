package net.josecaguas.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Jose Luis Torres on 5/18/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
