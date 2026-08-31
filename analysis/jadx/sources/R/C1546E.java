package r;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: r.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1546E extends s5.h implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public I5.h f16123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1547F f16124s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long[] f16125t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16126u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16127v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f16128w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1547F f16129x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ I5.h f16130y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546E(C1547F c1547f, I5.h hVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f16129x = c1547f;
        this.f16130y = hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1546E c1546e = new C1546E(this.f16129x, this.f16130y, interfaceC1524c);
        c1546e.f16128w = obj;
        return c1546e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1546E) create((I5.j) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        I5.j jVar;
        C1547F c1547f;
        long[] jArr;
        int i;
        I5.h hVar;
        int i7 = this.f16127v;
        if (i7 == 0) {
            AbstractC1362a.e(obj);
            jVar = (I5.j) this.f16128w;
            c1547f = this.f16129x;
            C1545D c1545d = c1547f.f16132r;
            jArr = c1545d.f16118c;
            i = c1545d.f16120e;
            hVar = this.f16130y;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f16126u;
            jArr = this.f16125t;
            c1547f = this.f16124s;
            hVar = this.f16123r;
            jVar = (I5.j) this.f16128w;
            AbstractC1362a.e(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return C1386y.f15098a;
        }
        int i8 = (int) ((jArr[i] >> 31) & 2147483647L);
        hVar.f2436s = i;
        Object obj2 = c1547f.f16132r.f16117b[i];
        this.f16128w = jVar;
        this.f16123r = hVar;
        this.f16124s = c1547f;
        this.f16125t = jArr;
        this.f16126u = i8;
        this.f16127v = 1;
        jVar.b(obj2, this);
        return EnumC1580a.f16356q;
    }
}
