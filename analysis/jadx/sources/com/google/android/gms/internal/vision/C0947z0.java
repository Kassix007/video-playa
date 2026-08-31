package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0947z0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0945y0 a(Object obj, Object obj2) {
        C0945y0 c0945y0 = (C0945y0) obj;
        C0945y0 c0945y02 = (C0945y0) obj2;
        if (!c0945y02.isEmpty()) {
            if (!c0945y0.f11330q) {
                if (c0945y0.isEmpty()) {
                    c0945y0 = new C0945y0();
                } else {
                    C0945y0 c0945y03 = new C0945y0(c0945y0);
                    c0945y03.f11330q = true;
                    c0945y0 = c0945y03;
                }
            }
            c0945y0.b();
            if (!c0945y02.isEmpty()) {
                c0945y0.putAll(c0945y02);
            }
        }
        return c0945y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(Object obj, Object obj2) {
        C0945y0 c0945y0 = (C0945y0) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (c0945y0.isEmpty()) {
            return;
        }
        Iterator it = c0945y0.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
    }
}
