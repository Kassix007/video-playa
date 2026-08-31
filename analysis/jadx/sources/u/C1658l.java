package u;

import P.C0345b;
import P.C0354f0;
import P.S0;

/* JADX INFO: renamed from: u.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1658l implements S0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Z.m f16961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0354f0 f16962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AbstractC1663q f16963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f16964t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f16965u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16966v;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r10v0 Z.m)
  (r11v0 java.lang.Object)
  (wrap:u.q:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null u.q) : (r12v0 u.q))
  (Long.MIN_VALUE long)
  (Long.MIN_VALUE long)
  false
 A[MD:(Z.m, java.lang.Object, u.q, long, long, boolean):void (m)] (LINE:1) call: u.l.<init>(Z.m, java.lang.Object, u.q, long, long, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1658l(Z.m mVar, Object obj, AbstractC1663q abstractC1663q, int i) {
        this(mVar, obj, (i & 4) != 0 ? null : abstractC1663q, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b() {
        return ((B5.c) this.f16961q.f8312r).invoke(this.f16963s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.S0
    public final Object getValue() {
        return this.f16962r.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationState(value=" + this.f16962r.getValue() + ", velocity=" + b() + ", isRunning=" + this.f16966v + ", lastFrameTimeNanos=" + this.f16964t + ", finishedTimeNanos=" + this.f16965u + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1658l(Z.m mVar, Object obj, AbstractC1663q abstractC1663q, long j, long j7, boolean z5) {
        AbstractC1663q abstractC1663qJ;
        this.f16961q = mVar;
        this.f16962r = C0345b.q(obj);
        if (abstractC1663q != null) {
            abstractC1663qJ = AbstractC1644d.j(abstractC1663q);
        } else {
            abstractC1663qJ = (AbstractC1663q) ((B5.c) mVar.f8313s).invoke(obj);
            abstractC1663qJ.d();
        }
        this.f16963s = abstractC1663qJ;
        this.f16964t = j;
        this.f16965u = j7;
        this.f16966v = z5;
    }
}
