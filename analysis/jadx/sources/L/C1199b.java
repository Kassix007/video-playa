package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.AbstractViewOnTouchListenerC1331s0;
import m.C1302e;
import m.C1304f;
import m.C1308h;
import m.C1312j;

/* JADX INFO: renamed from: l.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1199b extends AbstractViewOnTouchListenerC1331s0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ View f14305A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f14306z = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f14305A = actionMenuItemView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractViewOnTouchListenerC1331s0
    public final InterfaceC1195B b() {
        C1302e c1302e;
        switch (this.f14306z) {
            case 0:
                AbstractC1200c abstractC1200c = ((ActionMenuItemView) this.f14305A).f9058C;
                if (abstractC1200c == null || (c1302e = ((C1304f) abstractC1200c).f14784a.f14805K) == null) {
                    return null;
                }
                return c1302e.a();
            default:
                C1302e c1302e2 = ((C1308h) this.f14305A).f14793t.f14804J;
                if (c1302e2 == null) {
                    return null;
                }
                return c1302e2.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractViewOnTouchListenerC1331s0
    public final boolean c() {
        InterfaceC1195B interfaceC1195BB;
        switch (this.f14306z) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f14305A;
                InterfaceC1208k interfaceC1208k = actionMenuItemView.f9056A;
                return interfaceC1208k != null && interfaceC1208k.c(actionMenuItemView.f9064x) && (interfaceC1195BB = b()) != null && interfaceC1195BB.a();
            default:
                ((C1308h) this.f14305A).f14793t.n();
                return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractViewOnTouchListenerC1331s0
    public boolean d() {
        switch (this.f14306z) {
            case 1:
                C1312j c1312j = ((C1308h) this.f14305A).f14793t;
                if (c1312j.f14806L != null) {
                    return false;
                }
                c1312j.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199b(C1308h c1308h, C1308h c1308h2) {
        super(c1308h2);
        this.f14305A = c1308h;
    }
}
