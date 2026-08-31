package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class U3 implements T3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T1 f10720a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c4.c cVar = new c4.c(S1.a(), true, true);
        cVar.e("measurement.sdk.collection.enable_extend_user_property_size", true);
        f10720a = cVar.e("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        cVar.d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }
}
