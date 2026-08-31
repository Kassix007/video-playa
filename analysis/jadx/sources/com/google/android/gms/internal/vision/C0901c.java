package com.google.android.gms.internal.vision;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0901c extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11261a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0901c(Exception exc) {
        super(exc, null);
        this.f11261a = System.identityHashCode(exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C0901c.class) {
            if (this == obj) {
                return true;
            }
            C0901c c0901c = (C0901c) obj;
            if (this.f11261a == c0901c.f11261a && get() == c0901c.get()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11261a;
    }
}
