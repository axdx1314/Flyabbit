package com.dhc.flyabbit.home.presenter.contract;

import com.dhc.flyabbit.home.modle.bean.GankItemBean;
import com.dhc.library.base.IBasePresenter;
import com.dhc.library.base.IBaseView;
import com.dhc.library.data.net.GankApiResponse;

import java.util.List;

import io.reactivex.Flowable;

/**
 * @author 邓浩宸
 * @date 2017/8/26 17:37
 * @description TODO
 */
public interface ITopGirlContract {

    interface IView extends IBaseView {

        void showContent(List<String> gankItemBeanList);


        void showError(String errorCode, String errorMsg);

    }

    interface IPresenter extends IBasePresenter<IView> {

        void getRandomGirl();

    }


     interface IModle {

        Flowable<GankApiResponse<List<GankItemBean>>> getRandomGirl();

    }
}
