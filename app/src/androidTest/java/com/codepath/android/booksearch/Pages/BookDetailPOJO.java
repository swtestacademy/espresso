package com.codepath.android.booksearch.Pages;

import com.codepath.android.booksearch.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Canberk on 9/7/2016.
 */
public class BookDetailPOJO {

    public BookDetailPOJO(){

    }

    public void checkBookDetail(String bookName){
        onView(withId(R.id.tvTitle)).check(matches(withText(bookName)));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
