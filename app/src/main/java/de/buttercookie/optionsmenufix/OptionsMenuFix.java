package de.buttercookie.optionsmenufix;

import androidx.annotation.Keep;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class OptionsMenuFix implements IXposedHookLoadPackage {
    @Keep
    public OptionsMenuFix() {}

    @Keep
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {

    }
}
