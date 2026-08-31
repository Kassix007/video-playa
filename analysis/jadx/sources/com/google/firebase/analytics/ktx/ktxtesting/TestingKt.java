package com.google.firebase.analytics.ktx.ktxtesting;

import B5.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class TestingKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void withAnalyticsForTest(FirebaseAnalytics analytics, a block) {
        m.e(analytics, "analytics");
        m.e(block, "block");
        synchronized (AnalyticsKt.getLOCK()) {
            FirebaseAnalytics analytics2 = AnalyticsKt.getANALYTICS();
            AnalyticsKt.setANALYTICS(analytics);
            try {
                block.invoke();
            } finally {
                AnalyticsKt.setANALYTICS(analytics2);
            }
        }
    }
}
