package C0;

import M5.InterfaceC0261w;
import P.C0376q0;
import P.C0385v0;
import android.view.View;
import com.wnapp.smspariaz.R;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1045q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0385v0 f1046r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f1047s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(C0385v0 c0385v0, View view, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1046r = c0385v0;
        this.f1047s = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new i1(this.f1046r, this.f1047s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i1) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f1045q;
        C1386y c1386y = C1386y.f15098a;
        C0385v0 c0385v0 = this.f1046r;
        View view = this.f1047s;
        try {
            if (i == 0) {
                AbstractC1362a.e(obj);
                this.f1045q = 1;
                Object objI = P5.H.i(c0385v0.f5570t, new C0376q0(2, null), this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objI != enumC1580a) {
                    objI = c1386y;
                }
                if (objI == enumC1580a) {
                    return enumC1580a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
            }
            if (s1.b(view) == c0385v0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return c1386y;
        } finally {
            if (s1.b(view) == c0385v0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
