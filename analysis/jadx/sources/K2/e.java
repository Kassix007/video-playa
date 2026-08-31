package K2;

import M5.InterfaceC0261w;
import a.AbstractC0597a;
import java.io.IOException;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import q6.C1536e;

/* JADX INFO: loaded from: classes.dex */
public final class e extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f2873q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f2873q = fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new e(this.f2873q, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        f fVar = this.f2873q;
        synchronized (fVar.f2889x) {
            if (!fVar.f2877C || fVar.f2878D) {
                return C1386y.f15098a;
            }
            try {
                fVar.K();
            } catch (IOException unused) {
                fVar.f2879E = true;
            }
            try {
                if (fVar.f2891z >= 2000) {
                    fVar.W();
                }
            } catch (IOException unused2) {
                fVar.f2880F = true;
                fVar.f2875A = AbstractC0597a.i(new C1536e());
            }
            return C1386y.f15098a;
        }
    }
}
