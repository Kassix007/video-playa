package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class L {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static K a(Object obj, Object obj2) {
        K k7 = (K) obj;
        K k8 = (K) obj2;
        if (!k8.isEmpty()) {
            if (!k7.f10424q) {
                if (k7.isEmpty()) {
                    k7 = new K();
                } else {
                    K k9 = new K(k7);
                    k9.f10424q = true;
                    k7 = k9;
                }
            }
            k7.a();
            if (!k8.isEmpty()) {
                k7.putAll(k8);
            }
        }
        return k7;
    }
}
