package C;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m5.C1386y;
import z0.AbstractC1932I;

/* JADX INFO: loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f651s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(ArrayList arrayList, List list, boolean z5, int i) {
        super(1);
        this.f649q = i;
        this.f650r = arrayList;
        this.f651s = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f649q) {
            case 0:
                AbstractC1932I abstractC1932I = (AbstractC1932I) obj;
                ArrayList arrayList = this.f650r;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((t) arrayList.get(i)).a(abstractC1932I);
                }
                ?? r02 = this.f651s;
                int size2 = ((Collection) r02).size();
                for (int i7 = 0; i7 < size2; i7++) {
                    ((t) r02.get(i7)).a(abstractC1932I);
                }
                break;
            default:
                AbstractC1932I abstractC1932I2 = (AbstractC1932I) obj;
                ArrayList arrayList2 = this.f650r;
                int size3 = arrayList2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    ((D.p) arrayList2.get(i8)).a(abstractC1932I2);
                }
                ?? r03 = this.f651s;
                int size4 = ((Collection) r03).size();
                for (int i9 = 0; i9 < size4; i9++) {
                    ((D.p) r03.get(i9)).a(abstractC1932I2);
                }
                break;
        }
        return C1386y.f15098a;
    }
}
