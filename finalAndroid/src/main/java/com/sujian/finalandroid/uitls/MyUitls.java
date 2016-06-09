package com.sujian.finalandroid.uitls;

import com.sujian.finalandroid.activity.R;
import com.sujian.finalandroid.base.BaseApplication;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

import org.xutils.x;

/**
 * 我的工具类
 *
 * @author 12111
 */
public class MyUitls {

    /**
     * 获取版本号
     */
    public static String getVersionName(Context context) {
        // 获取packagemanager的实例
        PackageManager packageManager = context.getPackageManager();
        // getPackageName()是你当前类的包名，0代表是获取版本信息
        PackageInfo packInfo = null;
        try {
            packInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        String version = packInfo.versionName;
        return version;
    }

    /**
     * 判断用户的登陆状态
     */
    public static boolean isUserExistence() {
        long uid = ((BaseApplication) x.app()).getUid();
        if (uid == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 设置用户的id
     */
    public static void setUid(long l) {
        ((BaseApplication) x.app()).setUid(l);
    }

    /**
     * 设置用户的id
     */
    public static long getUid() {
        return ((BaseApplication) x.app()).getUid();
    }
}
