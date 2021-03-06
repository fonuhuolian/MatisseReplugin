package com.zhihu.matisse.internal.utils;

import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.content.ContextCompat;

public class PermissionCheckUtil {

    private Context mContext;

    public PermissionCheckUtil(Context mContext) {
        this.mContext = mContext;
    }


    // 判断权限集合,是否需要申请权限
    public boolean isNeedRequestPermissions(String... permissions) {

        for (String permission : permissions) {

            if (islackPermission(permission))
                return true;
        }
        return false;
    }


    /**
     * 判断权限是否被拒绝
     *
     * @param permission 检查的权限
     * @return PERMISSION_GRANTED=0 权限许可 PERMISSION_DENIED=-1 全选被拒绝
     */
    private boolean islackPermission(String permission) {
        return ContextCompat.checkSelfPermission(mContext, permission) ==
                PackageManager.PERMISSION_DENIED;
    }

}
