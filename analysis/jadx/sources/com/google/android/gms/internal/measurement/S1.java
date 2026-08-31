package com.google.android.gms.internal.measurement;

import android.net.Uri;
import r.C1554e;

/* JADX INFO: loaded from: classes.dex */
public abstract class S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1554e f10702a = new C1554e(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized Uri a() {
        C1554e c1554e = f10702a;
        Uri uri = (Uri) c1554e.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c1554e.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
