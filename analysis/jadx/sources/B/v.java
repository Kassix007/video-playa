package b;

import java.util.ListIterator;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9912q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0683A f9913r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(C0683A c0683a, int i) {
        super(1);
        this.f9912q = i;
        this.f9913r = c0683a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f9912q) {
            case 0:
                C0684a backEvent = (C0684a) obj;
                kotlin.jvm.internal.m.e(backEvent, "backEvent");
                C0683A c0683a = this.f9913r;
                n5.j jVar = c0683a.f9847b;
                ListIterator listIterator = jVar.listIterator(jVar.d());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((u) objPrevious).f9909a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                u uVar = (u) objPrevious;
                if (c0683a.f9848c != null) {
                    c0683a.b();
                }
                c0683a.f9848c = uVar;
                if (uVar != null) {
                    uVar.d(backEvent);
                }
                break;
            default:
                C0684a backEvent2 = (C0684a) obj;
                kotlin.jvm.internal.m.e(backEvent2, "backEvent");
                C0683A c0683a2 = this.f9913r;
                u uVar2 = c0683a2.f9848c;
                if (uVar2 == null) {
                    n5.j jVar2 = c0683a2.f9847b;
                    ListIterator listIterator2 = jVar2.listIterator(jVar2.d());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((u) objPrevious2).f9909a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                    uVar2 = (u) objPrevious2;
                }
                if (uVar2 != null) {
                    uVar2.c(backEvent2);
                }
                break;
        }
        return C1386y.f15098a;
    }
}
