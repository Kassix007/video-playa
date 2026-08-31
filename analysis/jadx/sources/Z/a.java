package Z;

import B0.G0;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f8280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f8281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f8282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f8283t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f8284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object[] f8285v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, l lVar, i iVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f8280q = bVar;
        this.f8281r = lVar;
        this.f8282s = iVar;
        this.f8283t = str;
        this.f8284u = obj;
        this.f8285v = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() throws Throwable {
        boolean z5;
        b bVar = this.f8280q;
        i iVar = bVar.f8287r;
        i iVar2 = this.f8282s;
        boolean z6 = true;
        if (iVar != iVar2) {
            bVar.f8287r = iVar2;
            z5 = true;
        } else {
            z5 = false;
        }
        String str = bVar.f8288s;
        String str2 = this.f8283t;
        if (kotlin.jvm.internal.m.a(str, str2)) {
            z6 = z5;
        } else {
            bVar.f8288s = str2;
        }
        bVar.f8286q = this.f8281r;
        bVar.f8289t = this.f8284u;
        bVar.f8290u = this.f8285v;
        h hVar = bVar.f8291v;
        if (hVar != null && z6) {
            ((G0) hVar).a0();
            bVar.f8291v = null;
            bVar.a();
        }
        return C1386y.f15098a;
    }
}
