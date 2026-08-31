package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m.c1 f10636a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        m.c1 c1Var;
        Uri uri = H1.f10640a;
        synchronized (I1.class) {
            try {
                if (I1.f10645b == null) {
                    m.c1 c1Var2 = new m.c1();
                    synchronized (I1.class) {
                        if (I1.f10645b != null) {
                            throw new IllegalStateException("init() already called");
                        }
                        I1.f10645b = c1Var2;
                    }
                }
                c1Var = I1.f10645b;
            } catch (Throwable th) {
                throw th;
            }
        }
        f10636a = c1Var;
    }
}
