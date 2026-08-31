package C0;

import P5.InterfaceC0398i;
import Q5.C0421a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements InterfaceC0398i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1064r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m1(int i, Object obj) {
        this.f1063q = i;
        this.f1064r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.InterfaceC0398i
    public final Object emit(Object obj, InterfaceC1524c interfaceC1524c) {
        switch (this.f1063q) {
            case 0:
                ((K0) this.f1064r).f886q.f(((Number) obj).floatValue());
                return C1386y.f15098a;
            default:
                ((kotlin.jvm.internal.y) this.f1064r).f14268q = obj;
                throw new C0421a(this);
        }
    }
}
