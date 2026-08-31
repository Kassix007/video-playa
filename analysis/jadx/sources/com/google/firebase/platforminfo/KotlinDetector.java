package com.google.firebase.platforminfo;

import m5.C1368g;

/* JADX INFO: loaded from: classes.dex */
public final class KotlinDetector {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private KotlinDetector() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String detectVersion() {
        try {
            C1368g.f15075r.getClass();
            return "2.2.0";
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
