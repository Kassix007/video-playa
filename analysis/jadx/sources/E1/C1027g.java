package e1;

import java.util.ArrayList;

/* JADX INFO: renamed from: e1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1027g extends C1026f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12527m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1027g(AbstractC1035o abstractC1035o) {
        super(abstractC1035o);
        if (abstractC1035o instanceof C1031k) {
            this.f12522e = 2;
        } else {
            this.f12522e = 3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.C1026f
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f12523g = i;
        ArrayList arrayList = this.f12525k;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            InterfaceC1024d interfaceC1024d = (InterfaceC1024d) obj;
            interfaceC1024d.a(interfaceC1024d);
        }
    }
}
