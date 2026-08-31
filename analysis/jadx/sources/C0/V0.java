package C0;

import java.util.List;
import r.AbstractC1560k;

/* JADX INFO: loaded from: classes.dex */
public final class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I0.i f937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.w f938b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public V0(I0.m mVar, AbstractC1560k abstractC1560k) {
        this.f937a = mVar.f2268d;
        this.f938b = new r.w(I0.m.h(4, mVar).size());
        List listH = I0.m.h(4, mVar);
        int size = listH.size();
        for (int i = 0; i < size; i++) {
            I0.m mVar2 = (I0.m) listH.get(i);
            if (abstractC1560k.a(mVar2.f2270g)) {
                this.f938b.a(mVar2.f2270g);
            }
        }
    }
}
