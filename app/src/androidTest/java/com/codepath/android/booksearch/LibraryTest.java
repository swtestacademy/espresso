package com.codepath.android.booksearch;

import android.support.test.rule.ActivityTestRule;
import android.test.suitebuilder.annotation.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import com.codepath.android.booksearch.Pages.BookDetailPOJO;
import com.codepath.android.booksearch.Pages.MainpagePOJO;
import com.codepath.android.booksearch.Pages.SearchListPOJO;
import com.codepath.android.booksearch.activities.BookListActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Canberk on 9/7/2016.
 */
@RunWith(Parameterized.class)
@LargeTest
public class LibraryTest {

    @Rule
    public ActivityTestRule<BookListActivity> activiyObj = new ActivityTestRule<BookListActivity>(BookListActivity.class);

    MainpagePOJO m_page;
    SearchListPOJO sl_page;
    BookDetailPOJO bd_page;
    String input;
    String expected;
    int index;
    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Martin Eden","Martin Eden",0},
                {"Etranger","Etranger",0}});
    }

    public LibraryTest(String input,String expected,int index){
        this.input = input;
        this.expected = expected;
        this.index = index;
    }
    @Before
    public void BeforeTest(){
        m_page = new MainpagePOJO();
    }
    @Test
    public void test1(){
        sl_page = m_page.SearchBook(input);
        bd_page = sl_page.goToBookDetail(index);
       bd_page.checkBookDetail(expected);
    }
}
