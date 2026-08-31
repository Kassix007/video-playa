package u2;

import P5.InterfaceC0398i;
import kotlin.jvm.internal.C1192a;
import m5.C1386y;
import m5.InterfaceC1366e;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: u2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1688i implements InterfaceC0398i, kotlin.jvm.internal.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1693n f17151q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1688i(C1693n c1693n) {
        this.f17151q = c1693n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.jvm.internal.h
    public final InterfaceC1366e a() {
        return new C1192a(2, 4, C1693n.class, this.f17151q, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.InterfaceC0398i
    public final Object emit(Object obj, InterfaceC1524c interfaceC1524c) {
        this.f17151q.k((AbstractC1686g) obj);
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0398i) && (obj instanceof kotlin.jvm.internal.h)) {
            return a().equals(((kotlin.jvm.internal.h) obj).a());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return a().hashCode();
    }
}
