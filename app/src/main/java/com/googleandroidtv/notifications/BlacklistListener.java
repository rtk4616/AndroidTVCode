package com.googleandroidtv.notifications;

public interface BlacklistListener {
    void onPackageBlacklisted(String str);

    void onPackageUnblacklisted(String str);
}
