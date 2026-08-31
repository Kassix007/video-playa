package A;

import c0.C0715c;

/* JADX INFO: renamed from: A.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0025w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0715c f152a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0025w(C0715c c0715c) {
        this.f152a = c0715c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(int i, W0.l lVar) {
        return this.f152a.a(0, i, lVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0025w) && kotlin.jvm.internal.m.a(this.f152a, ((C0025w) obj).f152a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f152a.f10086a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f152a + ')';
    }
}
