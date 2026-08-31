package androidx.compose.foundation.layout;

import A.T;
import B0.AbstractC0036d0;
import W0.f;
import c0.AbstractC0724l;
import k1.i;

/* JADX INFO: loaded from: classes.dex */
final class SizeElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f9268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f9269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f9270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f9271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f9272u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SizeElement(float f, float f7, float f8, float f9) {
        this.f9268q = f;
        this.f9269r = f7;
        this.f9270s = f8;
        this.f9271t = f9;
        this.f9272u = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return f.a(this.f9268q, sizeElement.f9268q) && f.a(this.f9269r, sizeElement.f9269r) && f.a(this.f9270s, sizeElement.f9270s) && f.a(this.f9271t, sizeElement.f9271t) && this.f9272u == sizeElement.f9272u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        T t6 = new T();
        t6.f45E = this.f9268q;
        t6.f46F = this.f9269r;
        t6.f47G = this.f9270s;
        t6.f48H = this.f9271t;
        t6.f49I = this.f9272u;
        return t6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        T t6 = (T) abstractC0724l;
        t6.f45E = this.f9268q;
        t6.f46F = this.f9269r;
        t6.f47G = this.f9270s;
        t6.f48H = this.f9271t;
        t6.f49I = this.f9272u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f9272u) + i.b(this.f9271t, i.b(this.f9270s, i.b(this.f9269r, Float.hashCode(this.f9268q) * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (Float.NaN float) : (r3v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0007: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (Float.NaN float) : (r4v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000c: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (Float.NaN float) : (r5v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0011: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (Float.NaN float) : (r6v0 float))
 A[MD:(float, float, float, float):void (m)] (LINE:7) call: androidx.compose.foundation.layout.SizeElement.<init>(float, float, float, float):void type: THIS */
    public /* synthetic */ SizeElement(float f, float f7, float f8, float f9, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f7, (i & 4) != 0 ? Float.NaN : f8, (i & 8) != 0 ? Float.NaN : f9);
    }
}
