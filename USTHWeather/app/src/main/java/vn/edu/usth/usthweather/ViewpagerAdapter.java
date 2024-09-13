package vn.edu.usth.usthweather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class ViewpagerAdapter extends FragmentPagerAdapter {
    private String[] tabTitles = new String[]{"HaNoi", "Singapore", "Beijing"};

    public ViewpagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new WeatherAndForecastFragment();
            case 1: return new WeatherAndForecastFragment();
            case 2: return new WeatherAndForecastFragment();
            default: return new WeatherAndForecastFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}