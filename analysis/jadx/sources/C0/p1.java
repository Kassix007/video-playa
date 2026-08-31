package C0;

import M5.AbstractC0263y;
import M5.C0247h;
import M5.EnumC0262x;
import M5.InterfaceC0245f;
import P.C0385v0;
import android.view.View;
import androidx.lifecycle.EnumC0652o;
import androidx.lifecycle.InterfaceC0658v;
import androidx.lifecycle.InterfaceC0660x;
import java.util.ArrayList;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class p1 implements InterfaceC0658v {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ R5.d f1088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0080h0 f1089r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0385v0 f1090s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f1091t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ View f1092u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p1(R5.d dVar, C0080h0 c0080h0, C0385v0 c0385v0, kotlin.jvm.internal.y yVar, View view) {
        this.f1088q = dVar;
        this.f1089r = c0080h0;
        this.f1090s = c0385v0;
        this.f1091t = yVar;
        this.f1092u = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0658v
    public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
        boolean z5;
        int i = l1.f1060a[enumC0652o.ordinal()];
        InterfaceC0245f interfaceC0245fU = null;
        if (i == 1) {
            AbstractC0263y.t(this.f1088q, null, EnumC0262x.f3898t, new o1(this.f1091t, this.f1090s, interfaceC0660x, this, this.f1092u, null), 1);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                this.f1090s.t();
                return;
            } else {
                C0385v0 c0385v0 = this.f1090s;
                synchronized (c0385v0.f5555b) {
                    c0385v0.f5569s = true;
                }
                return;
            }
        }
        C0080h0 c0080h0 = this.f1089r;
        if (c0080h0 != null) {
            K2.a aVar = (K2.a) c0080h0.f1043s;
            synchronized (aVar.f2860c) {
                try {
                    synchronized (aVar.f2860c) {
                        z5 = aVar.f2859b;
                    }
                    if (!z5) {
                        ArrayList arrayList = (ArrayList) aVar.f2861d;
                        aVar.f2861d = (ArrayList) aVar.f2862e;
                        aVar.f2862e = arrayList;
                        aVar.f2859b = true;
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((InterfaceC1524c) arrayList.get(i7)).resumeWith(C1386y.f15098a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0385v0 c0385v02 = this.f1090s;
        synchronized (c0385v02.f5555b) {
            if (c0385v02.f5569s) {
                c0385v02.f5569s = false;
                interfaceC0245fU = c0385v02.u();
            }
        }
        if (interfaceC0245fU != null) {
            ((C0247h) interfaceC0245fU).resumeWith(C1386y.f15098a);
        }
    }
}
