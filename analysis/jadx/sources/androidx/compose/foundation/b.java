package androidx.compose.foundation;

import B5.f;
import P.C0363k;
import P.C0371o;
import c0.InterfaceC0725m;
import kotlin.jvm.internal.n;
import v.P;
import y.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P f9251q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f9252r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I0.f f9253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B5.a f9254t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(P p7, boolean z5, I0.f fVar, B5.a aVar) {
        super(3);
        this.f9251q = p7;
        this.f9252r = z5;
        this.f9253s = fVar;
        this.f9254t = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0371o c0371o = (C0371o) obj2;
        ((Number) obj3).intValue();
        c0371o.S(-1525724089);
        Object objH = c0371o.H();
        if (objH == C0363k.f5418a) {
            objH = new i();
            c0371o.d0(objH);
        }
        i iVar = (i) objH;
        InterfaceC0725m interfaceC0725mD = c.a(iVar, this.f9251q).d(new ClickableElement(iVar, null, this.f9252r, this.f9253s, this.f9254t));
        c0371o.p(false);
        return interfaceC0725mD;
    }
}
