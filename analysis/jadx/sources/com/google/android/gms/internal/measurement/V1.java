package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import r.C1553d;
import r.C1554e;

/* JADX INFO: loaded from: classes.dex */
public abstract class V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1554e f10727a = new C1554e(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized void a() {
        C1554e c1554e = f10727a;
        Iterator it = ((C1553d) c1554e.values()).iterator();
        if (it.hasNext()) {
            ((V1) it.next()).getClass();
            throw null;
        }
        c1554e.clear();
    }
}
