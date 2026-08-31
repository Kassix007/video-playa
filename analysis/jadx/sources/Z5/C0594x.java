package Z5;

import java.util.Arrays;

/* JADX INFO: renamed from: Z5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0594x extends P {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f8637l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0594x(String str, C0595y c0595y) {
        super(str, c0595y, 1);
        this.f8637l = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, m5.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, m5.h] */
    @Override // Z5.P
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0594x) {
            X5.f fVar = (X5.f) obj;
            if (this.f8556a.equals(fVar.b())) {
                C0594x c0594x = (C0594x) obj;
                if (c0594x.f8637l && Arrays.equals((X5.f[]) this.j.getValue(), (X5.f[]) c0594x.j.getValue())) {
                    int iD = fVar.d();
                    int i = this.f8558c;
                    if (i == iD) {
                        for (int i7 = 0; i7 < i; i7++) {
                            if (kotlin.jvm.internal.m.a(i(i7).b(), fVar.i(i7).b()) && kotlin.jvm.internal.m.a(i(i7).c(), fVar.i(i7).c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.P
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.P, X5.f
    public final boolean isInline() {
        return this.f8637l;
    }
}
