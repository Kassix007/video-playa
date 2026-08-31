package M5;

/* JADX INFO: renamed from: M5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0254o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0244e f3873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B5.f f3874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f3876e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0254o(Object obj, C0244e c0244e, B5.f fVar, Object obj2, Throwable th) {
        this.f3872a = obj;
        this.f3873b = c0244e;
        this.f3874c = fVar;
        this.f3875d = obj2;
        this.f3876e = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0254o a(C0254o c0254o, C0244e c0244e, Throwable th, int i) {
        Object obj = c0254o.f3872a;
        if ((i & 2) != 0) {
            c0244e = c0254o.f3873b;
        }
        C0244e c0244e2 = c0244e;
        B5.f fVar = c0254o.f3874c;
        Object obj2 = c0254o.f3875d;
        if ((i & 16) != 0) {
            th = c0254o.f3876e;
        }
        c0254o.getClass();
        return new C0254o(obj, c0244e2, fVar, obj2, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0254o)) {
            return false;
        }
        C0254o c0254o = (C0254o) obj;
        return kotlin.jvm.internal.m.a(this.f3872a, c0254o.f3872a) && kotlin.jvm.internal.m.a(this.f3873b, c0254o.f3873b) && kotlin.jvm.internal.m.a(this.f3874c, c0254o.f3874c) && kotlin.jvm.internal.m.a(this.f3875d, c0254o.f3875d) && kotlin.jvm.internal.m.a(this.f3876e, c0254o.f3876e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f3872a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0244e c0244e = this.f3873b;
        int iHashCode2 = (iHashCode + (c0244e == null ? 0 : c0244e.hashCode())) * 31;
        B5.f fVar = this.f3874c;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Object obj2 = this.f3875d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3876e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CompletedContinuation(result=" + this.f3872a + ", cancelHandler=" + this.f3873b + ", onCancellation=" + this.f3874c + ", idempotentResume=" + this.f3875d + ", cancelCause=" + this.f3876e + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r9v0 java.lang.Object)
  (wrap:M5.e:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null M5.e) : (r10v0 M5.e))
  (wrap:B5.f:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null B5.f) : (r11v0 B5.f))
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r12v0 java.lang.Throwable))
 A[MD:(java.lang.Object, M5.e, B5.f, java.lang.Object, java.lang.Throwable):void (m)] (LINE:7) call: M5.o.<init>(java.lang.Object, M5.e, B5.f, java.lang.Object, java.lang.Throwable):void type: THIS */
    public /* synthetic */ C0254o(Object obj, C0244e c0244e, B5.f fVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : c0244e, (i & 4) != 0 ? null : fVar, (Object) null, (i & 16) != 0 ? null : th);
    }
}
