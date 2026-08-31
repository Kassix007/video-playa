package M;

import java.util.ArrayList;
import m5.C1386y;
import z0.AbstractC1932I;
import z0.AbstractC1933J;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f3661A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Integer f3662B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3663C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Integer f3664D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0231t f3669u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3670v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3671w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ A.W f3672x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z0.T f3673y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f3674z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C0231t c0231t, int i, int i7, A.W w3, z0.T t6, int i8, int i9, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f3665q = arrayList;
        this.f3666r = arrayList2;
        this.f3667s = arrayList3;
        this.f3668t = arrayList4;
        this.f3669u = c0231t;
        this.f3670v = i;
        this.f3671w = i7;
        this.f3672x = w3;
        this.f3673y = t6;
        this.f3674z = i8;
        this.f3661A = i9;
        this.f3662B = num;
        this.f3663C = arrayList5;
        this.f3664D = num2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        int i;
        AbstractC1932I abstractC1932I = (AbstractC1932I) obj;
        ArrayList arrayList = this.f3665q;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC1932I.d(abstractC1932I, (AbstractC1933J) arrayList.get(i7), 0, 0);
        }
        ArrayList arrayList2 = this.f3666r;
        int size2 = arrayList2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            AbstractC1932I.d(abstractC1932I, (AbstractC1933J) arrayList2.get(i8), 0, 0);
        }
        ArrayList arrayList3 = this.f3667s;
        int size3 = arrayList3.size();
        int i9 = 0;
        while (true) {
            i = this.f3674z;
            if (i9 >= size3) {
                break;
            }
            AbstractC1933J abstractC1933J = (AbstractC1933J) arrayList3.get(i9);
            int i10 = (this.f3670v - this.f3671w) / 2;
            z0.T t6 = this.f3673y;
            AbstractC1932I.d(abstractC1932I, abstractC1933J, this.f3672x.c(t6, t6.getLayoutDirection()) + i10, i - this.f3661A);
            i9++;
        }
        ArrayList arrayList4 = this.f3668t;
        int size4 = arrayList4.size();
        for (int i11 = 0; i11 < size4; i11++) {
            AbstractC1933J abstractC1933J2 = (AbstractC1933J) arrayList4.get(i11);
            Integer num = this.f3662B;
            AbstractC1932I.d(abstractC1932I, abstractC1933J2, 0, i - (num != null ? num.intValue() : 0));
        }
        C0231t c0231t = this.f3669u;
        if (c0231t != null) {
            ArrayList arrayList5 = this.f3663C;
            int size5 = arrayList5.size();
            for (int i12 = 0; i12 < size5; i12++) {
                AbstractC1933J abstractC1933J3 = (AbstractC1933J) arrayList5.get(i12);
                int i13 = c0231t.f3616a;
                Integer num2 = this.f3664D;
                kotlin.jvm.internal.m.b(num2);
                AbstractC1932I.d(abstractC1932I, abstractC1933J3, i13, i - num2.intValue());
            }
        }
        return C1386y.f15098a;
    }
}
