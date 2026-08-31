package C0;

import P.C0345b;
import P.C0368m0;
import P.C0371o;
import P.C0372o0;
import P.C0389z;
import m5.AbstractC1362a;

/* JADX INFO: renamed from: C0.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0103t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P.T0 f1110a = new P.T0(X.f970y);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P.T0 f1111b = new P.T0(X.f971z);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P.T0 f1112c = new P.T0(X.f944B);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P.T0 f1113d = new P.T0(X.f943A);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final P.T0 f1114e = new P.T0(X.f946D);
    public static final P.T0 f = new P.T0(X.f945C);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final P.T0 f1115g = new P.T0(X.f952J);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final P.T0 f1116h = new P.T0(X.f948F);
    public static final P.T0 i = new P.T0(X.f949G);
    public static final P.T0 j = new P.T0(X.f951I);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final P.T0 f1117k = new P.T0(X.f950H);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final P.T0 f1118l = new P.T0(X.f953K);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final P.T0 f1119m = new P.T0(X.f954L);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final P.T0 f1120n = new P.T0(X.f955M);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final P.T0 f1121o = new P.T0(X.f959Q);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final P.T0 f1122p = new P.T0(X.f958P);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final P.T0 f1123q = new P.T0(X.f960R);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final P.T0 f1124r = new P.T0(X.f961S);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final P.T0 f1125s = new P.T0(X.f962T);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final P.T0 f1126t = new P.T0(F0.f820s);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final P.T0 f1127u = new P.T0(X.f956N);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0389z f1128v = new C0389z(X.f957O);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC1362a.d(X.f947E);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(B0.t0 t0Var, C0082i0 c0082i0, B5.e eVar, C0371o c0371o, int i7) {
        c0371o.U(874662829);
        int i8 = i7 | (c0371o.g(t0Var) ? 4 : 2) | (c0371o.g(c0082i0) ? 32 : 16) | (c0371o.i(eVar) ? 256 : 128);
        if (c0371o.K(i8 & 1, (i8 & 147) != 146)) {
            A a7 = (A) t0Var;
            C0368m0 c0368m0A = f1110a.a(a7.getAccessibilityManager());
            C0368m0 c0368m0A2 = f1111b.a(a7.getAutofill());
            C0368m0 c0368m0A3 = f1113d.a(a7.getAutofillManager());
            C0368m0 c0368m0A4 = f1112c.a(a7.getAutofillTree());
            C0368m0 c0368m0A5 = f1114e.a(a7.m3getClipboardManager());
            C0368m0 c0368m0A6 = f.a(a7.m2getClipboard());
            C0368m0 c0368m0A7 = f1116h.a(a7.getDensity());
            C0368m0 c0368m0A8 = i.a(a7.getFocusOwner());
            C0368m0 c0368m0A9 = j.a(a7.getFontLoader());
            c0368m0A9.f = false;
            C0368m0 c0368m0A10 = f1117k.a(a7.getFontFamilyResolver());
            c0368m0A10.f = false;
            C0345b.b(new C0368m0[]{c0368m0A, c0368m0A2, c0368m0A3, c0368m0A4, c0368m0A5, c0368m0A6, c0368m0A7, c0368m0A8, c0368m0A9, c0368m0A10, f1118l.a(a7.getHapticFeedBack()), f1119m.a(a7.getInputModeManager()), f1120n.a(a7.getLayoutDirection()), f1121o.a(a7.getTextInputService()), f1122p.a(a7.getSoftwareKeyboardController()), f1123q.a(a7.getTextToolbar()), f1124r.a(c0082i0), f1125s.a(a7.getViewConfiguration()), f1126t.a(a7.getWindowInfo()), f1127u.a(a7.getPointerIconService()), f1115g.a(a7.getGraphicsContext())}, eVar, c0371o, ((i8 >> 3) & 112) | 8);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new Z(t0Var, c0082i0, eVar, i7, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
