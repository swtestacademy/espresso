package com.codepath.android.booksearch.Pages;

import android.support.test.rule.ActivityTestRule;

import com.codepath.android.booksearch.R;
import com.codepath.android.booksearch.activities.BookListActivity;

import org.junit.Rule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Canberk on 9/7/2016.
 */
public class MainpagePOJO {

    @Rule
    public ActivityTestRule<BookListActivity> activiyObj = new ActivityTestRule<BookListActivity>(BookListActivity.class);

    public MainpagePOJO(){

    }

    public SearchListPOJO SearchBook(String bookName){

        onView(withId(R.id.action_search)).perform(click());
        onView(withId(R.id.search_src_text)).perform(typeText(bookName),closeSoftKeyboard());
        onView(withId(R.id.search_src_text)).perform(typeText("\n"),closeSoftKeyboard());
        return new SearchListPOJO();
    }

}
