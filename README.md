# Options Menu Fix
In Android 14 and newer releases of Android 13 (somewhere between r31 and r38, i.e. around
March/April 2023), a bug was introduced into Android which can cause menus implemented as [`Activity`
options menus](https://developer.android.com/develop/ui/views/components/menus#options-menu)
to open only once and to ignore subsequent attempts to open the menu again until the affected
activity has been re-started.

For apps that are unlikely to be updated any time soon, this Xposed module implements a simple
workaround to make affected menus work normally again on buggy Android versions.

See also https://issuetracker.google.com/issues/315761686

## Compatibility and usage
Requires at least Android 13. Enable the module for any app requiring this workaround.
