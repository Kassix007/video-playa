package e3;

import M5.InterfaceC0261w;
import a3.C0632k;
import android.content.Context;
import android.graphics.Typeface;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class r extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0632k f12613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f12614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f12615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f12616t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0632k c0632k, Context context, String str, String str2, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f12613q = c0632k;
        this.f12614r = context;
        this.f12615s = str;
        this.f12616t = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new r(this.f12613q, this.f12614r, this.f12615s, this.f12616t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        r rVar = (r) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        rVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        for (g3.c cVar : this.f12613q.f.values()) {
            Context context = this.f12614r;
            kotlin.jvm.internal.m.b(cVar);
            String str = cVar.f13051a;
            String str2 = cVar.f13053c;
            try {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), this.f12615s + str + this.f12616t);
                try {
                    kotlin.jvm.internal.m.b(typefaceCreateFromAsset);
                    kotlin.jvm.internal.m.d(str2, "getStyle(...)");
                    boolean zK0 = J5.m.K0(str2, "Italic");
                    boolean zK02 = J5.m.K0(str2, "Bold");
                    int i = (zK0 && zK02) ? 3 : zK0 ? 2 : zK02 ? 1 : 0;
                    if (typefaceCreateFromAsset.getStyle() != i) {
                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i);
                    }
                    cVar.f13054d = typefaceCreateFromAsset;
                } catch (Exception unused) {
                    n3.c.f15153a.getClass();
                }
            } catch (Exception unused2) {
                n3.c.f15153a.getClass();
            }
        }
        return C1386y.f15098a;
    }
}
