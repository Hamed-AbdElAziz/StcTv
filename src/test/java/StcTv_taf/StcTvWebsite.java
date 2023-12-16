package StcTv_taf;

import StcTv_taf.pages.CountryWrapper;
import StcTv_taf.pages.Home;

public class StcTvWebsite {

    public Home home;
    public CountryWrapper countryWrapper;

    public StcTvWebsite(){
        home = new Home();
        countryWrapper = new CountryWrapper();
    }

}
