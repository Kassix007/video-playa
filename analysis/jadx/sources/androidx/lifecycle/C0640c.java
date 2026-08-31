package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0640c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f9530b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0640c(int i, Method method) {
        this.f9529a = i;
        this.f9530b = method;
        method.setAccessible(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0640c)) {
            return false;
        }
        C0640c c0640c = (C0640c) obj;
        return this.f9529a == c0640c.f9529a && this.f9530b.getName().equals(c0640c.f9530b.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9530b.getName().hashCode() + (this.f9529a * 31);
    }
}
