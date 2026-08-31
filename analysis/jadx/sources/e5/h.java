package e5;

import M5.InterfaceC0261w;
import P.W;
import a0.q;
import android.database.Cursor;
import java.util.Collections;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class h extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q f12665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W f12666r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, W w3, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f12665q = qVar;
        this.f12666r = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new h(this.f12665q, this.f12666r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        hVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        q qVar = this.f12665q;
        qVar.clear();
        while (true) {
            W w3 = this.f12666r;
            if (!((Cursor) w3.getValue()).moveToNext()) {
                Collections.reverse(qVar);
                return C1386y.f15098a;
            }
            String string = ((Cursor) w3.getValue()).getString(0);
            String string2 = ((Cursor) w3.getValue()).getString(1);
            String string3 = ((Cursor) w3.getValue()).getString(2);
            qVar.add(new C1057b(string, ((Cursor) w3.getValue()).getString(3), string2, string3, ((Cursor) w3.getValue()).getString(6), ((Cursor) w3.getValue()).getString(4), ((Cursor) w3.getValue()).getString(5)));
        }
    }
}
