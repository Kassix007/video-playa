package P5;

import Q5.AbstractC0423c;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: P5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0396g implements InterfaceC0397h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC0397h f6401q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0396g(InterfaceC0397h interfaceC0397h) {
        this.f6401q = interfaceC0397h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.InterfaceC0397h
    public final Object collect(InterfaceC0398i interfaceC0398i, InterfaceC1524c interfaceC1524c) {
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f14268q = AbstractC0423c.f6604b;
        Object objCollect = this.f6401q.collect(new C0395f(this, yVar, interfaceC0398i), interfaceC1524c);
        return objCollect == EnumC1580a.f16356q ? objCollect : C1386y.f15098a;
    }
}
