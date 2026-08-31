package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class m4 implements l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T1 f10906a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c4.c cVar = new c4.c(S1.a(), true, true);
        f10906a = cVar.e("measurement.client.sessions.enable_fix_background_engagement", false);
        cVar.e("measurement.client.sessions.enable_pause_engagement_in_background", true);
        cVar.d("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }
}
