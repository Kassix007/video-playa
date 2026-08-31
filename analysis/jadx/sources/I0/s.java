package I0;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B5.e f2328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2329c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(String str, B5.e eVar) {
        this.f2327a = str;
        this.f2328b = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(i iVar, Object obj) {
        iVar.j(this, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AccessibilityKey: " + this.f2327a;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r2v0 java.lang.String), (wrap:I0.o:0x0000: SGET  A[WRAPPED] (LINE:4) I0.o.F I0.o) A[MD:(java.lang.String, B5.e):void (m)] (LINE:5) call: I0.s.<init>(java.lang.String, B5.e):void type: THIS */
    public /* synthetic */ s(String str) {
        this(str, o.f2280F);
    }

    public s(String str, boolean z5, B5.e eVar) {
        this(str, eVar);
        this.f2329c = z5;
    }
}
