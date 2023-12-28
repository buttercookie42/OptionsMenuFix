/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */

package de.buttercookie.optionsmenufix;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import static de.robv.android.xposed.XposedHelpers.setBooleanField;

import androidx.annotation.Keep;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class OptionsMenuFix implements IXposedHookLoadPackage {
    private static final String LOGTAG = "OptionsMenuFix";

    @Keep
    public OptionsMenuFix() {}

    @Keep
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        findAndHookMethod("com.android.internal.policy.PhoneWindow", lpparam.classLoader,
                "closePanel",
                "com.android.internal.policy.PhoneWindow$PanelFeatureState", boolean.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        Object /* PanelFeatureState */ st = param.args[0];
                        setBooleanField(st, "refreshDecorView", true);
                    }
                });
    }
}
