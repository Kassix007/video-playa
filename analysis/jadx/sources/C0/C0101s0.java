package C0;

import P.C0345b;
import P.C0354f0;
import P.C0371o;
import com.web2native.MainActivity;

/* JADX INFO: renamed from: C0.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0101s0 extends AbstractC0065a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0354f0 f1106y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1107z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0101s0(MainActivity mainActivity) {
        super(mainActivity);
        this.f1106y = C0345b.q(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0065a
    public final void a(int i, C0371o c0371o) {
        c0371o.S(420213850);
        B5.e eVar = (B5.e) this.f1106y.getValue();
        if (eVar == null) {
            c0371o.S(358356153);
        } else {
            c0371o.S(150107208);
            eVar.invoke(c0371o, 0);
        }
        c0371o.p(false);
        c0371o.p(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C0101s0.class.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0065a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f1107z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setContent(B5.e eVar) {
        this.f1107z = true;
        this.f1106y.setValue(eVar);
        if (isAttachedToWindow()) {
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
