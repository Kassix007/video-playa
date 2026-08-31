package W1;

import P.C0348c0;
import Z4.K;
import androidx.lifecycle.EnumC0652o;
import androidx.lifecycle.InterfaceC0658v;
import androidx.lifecycle.InterfaceC0660x;
import i2.C1135a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0658v {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8053r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ f(int i, Object obj) {
        this.f8052q = i;
        this.f8053r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0658v
    public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
        switch (this.f8052q) {
            case 0:
                j jVar = (j) this.f8053r;
                jVar.f8079q = enumC0652o.a();
                if (jVar.f8068c != null) {
                    ArrayList arrayListC0 = n5.l.C0(jVar.f);
                    int size = arrayListC0.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListC0.get(i);
                        i++;
                        T1.d dVar = (T1.d) obj;
                        dVar.getClass();
                        c cVar = dVar.f7360x;
                        cVar.getClass();
                        cVar.f8033a.f7356t = enumC0652o.a();
                        cVar.f8036d = enumC0652o.a();
                        cVar.b();
                    }
                }
                break;
            case 1:
                C0348c0 c0348c0 = (C0348c0) this.f8053r;
                if (K.f8474a[enumC0652o.ordinal()] == 1) {
                    c0348c0.f(c0348c0.e() + 1);
                }
                break;
            default:
                C1135a c1135a = (C1135a) this.f8053r;
                if (enumC0652o == EnumC0652o.ON_START) {
                    c1135a.f13560h = true;
                } else if (enumC0652o == EnumC0652o.ON_STOP) {
                    c1135a.f13560h = false;
                }
                break;
        }
    }
}
