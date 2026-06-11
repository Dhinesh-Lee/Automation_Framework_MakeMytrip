package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Browser;
import Page.BookingStay;
import utility.ExtentListener;
@Listeners(ExtentListener.class)
public class Booking extends Browser {

    @Test(enabled= false)
    public void bookingStay() {

        BookingStay stay = new BookingStay();

        stay.stay();
        stay.SearchCity();
        stay.EnterCity();
        stay.location();

        stay.checkIn();
        stay.checkOut();
        stay.Apply();
        stay.Submit();

        stay.Breakfast();
        stay.scroll();
        stay.PriceSelection();

        stay.totalProperties();
    }
}