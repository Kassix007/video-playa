package w2;

import M5.InterfaceC0261w;
import a.AbstractC0597a;
import java.io.IOException;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import q6.C1536e;
import s5.i;

/* JADX INFO: renamed from: w2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1866d extends i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1867e f18260q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1866d(C1867e c1867e, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18260q = c1867e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1866d(this.f18260q, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1866d) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        C1867e c1867e = this.f18260q;
        synchronized (c1867e) {
            if (!c1867e.f18263B || c1867e.f18264C) {
                return C1386y.f15098a;
            }
            try {
                c1867e.K();
            } catch (IOException unused) {
                c1867e.f18265D = true;
            }
            try {
                if (c1867e.f18276y >= 2000) {
                    c1867e.W();
                }
            } catch (IOException unused2) {
                c1867e.f18266E = true;
                c1867e.f18277z = AbstractC0597a.i(new C1536e());
            }
            return C1386y.f15098a;
        }
    }
}
