package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile U f11231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile U f11232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f11233c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        U u6 = new U();
        Map map = Collections.EMPTY_MAP;
        f11233c = u6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a() {
        if (f11231a == null) {
            synchronized (U.class) {
                try {
                    if (f11231a == null) {
                        f11231a = f11233c;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
