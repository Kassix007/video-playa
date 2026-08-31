package C;

import P.W;
import java.util.ArrayList;
import java.util.List;
import m5.C1386y;
import z0.AbstractC1932I;

/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W f653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f654s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f655t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f656u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(W w3, ArrayList arrayList, List list, boolean z5, int i) {
        super(1);
        this.f652q = i;
        this.f653r = w3;
        this.f654s = arrayList;
        this.f655t = list;
        this.f656u = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f652q) {
            case 0:
                AbstractC1932I abstractC1932I = (AbstractC1932I) obj;
                q qVar = new q(this.f654s, this.f655t, this.f656u, 0);
                abstractC1932I.f18663a = true;
                qVar.invoke(abstractC1932I);
                abstractC1932I.f18663a = false;
                this.f653r.getValue();
                break;
            default:
                AbstractC1932I abstractC1932I2 = (AbstractC1932I) obj;
                q qVar2 = new q(this.f654s, this.f655t, this.f656u, 1);
                abstractC1932I2.f18663a = true;
                qVar2.invoke(abstractC1932I2);
                abstractC1932I2.f18663a = false;
                this.f653r.getValue();
                break;
        }
        return C1386y.f15098a;
    }
}
