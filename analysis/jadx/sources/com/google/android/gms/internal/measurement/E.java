package com.google.android.gms.internal.measurement;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f10625a;

    static {
        f10625a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
