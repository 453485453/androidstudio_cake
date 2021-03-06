package com.sujian.finalandroid.fragment;

import com.sujian.finalandroid.activity.R;
import com.sujian.finalandroid.base.BaseFragment;
import com.sujian.finalandroid.ui.LoadingPage;

import android.view.View;

/**
 * 待评论
 *
 * @author 12111
 */
public class CommentedFragment extends BaseFragment {


    @Override
    protected View createSuccessView() {
        View view = View.inflate(getActivity(), R.layout.commented_fragment, null);
        return view;
    }

    @Override
    protected LoadingPage.LoadResult load() {
        return LoadingPage.LoadResult.success;
    }

}
