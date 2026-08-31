package S0;

import B0.G0;
import O0.p;
import O0.r;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import android.view.ViewStructure;
import j2.InterfaceC1160f;
import k2.C1184h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n implements B5.g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7279q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7280r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj) {
        super(4);
        this.f7279q = i;
        this.f7280r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f7279q) {
            case 0:
                int i = ((O0.h) obj3).f4278a;
                int i7 = ((O0.i) obj4).f4279a;
                d dVar = (d) this.f7280r;
                r rVarB = ((O0.e) dVar.f7285e).b((p) obj, (O0.j) obj2, i, i7);
                if (rVarB instanceof r) {
                    Object obj5 = rVarB.f4294q;
                    m.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                G0 g02 = new G0(rVarB, dVar.j);
                dVar.j = g02;
                Object obj6 = g02.f234r;
                m.c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj6;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                ((ViewStructure) this.f7280r).setDimens(iIntValue, iIntValue2, 0, 0, ((Number) obj3).intValue() - iIntValue, ((Number) obj4).intValue() - iIntValue2);
                return C1386y.f15098a;
            default:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                InterfaceC1160f interfaceC1160f = (InterfaceC1160f) this.f7280r;
                m.b(sQLiteQuery);
                interfaceC1160f.f(new C1184h(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
