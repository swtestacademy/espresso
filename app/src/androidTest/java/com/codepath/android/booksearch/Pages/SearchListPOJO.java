package com.codepath.android.booksearch.Pages;

import com.codepath.android.booksearch.R;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.Matchers.startsWith;

/**
 * Created by Canberk on 9/7/2016.
 */
public class SearchListPOJO {

    public SearchListPOJO(){


    }

    public BookDetailPOJO goToBookDetail(int index){

        onData(anything())
                .inAdapterView(withId(R.id.lvBooks))
                .atPosition(index)
                .onChildView(withId(R.id.tvTitle))
                .perform(click());

        return new BookDetailPOJO();
    }
}


