package h;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import g.AbstractC1066a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C1291Y0;
import m.InterfaceC1296b;
import m.InterfaceC1311i0;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import w1.AbstractC1862z;
import w1.O;

/* JADX INFO: loaded from: classes.dex */
public final class I extends C3.a implements InterfaceC1296b {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final AccelerateInterpolator f13219R = new AccelerateInterpolator();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final DecelerateInterpolator f13220S = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f13221A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public H f13222B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public H f13223C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Z.m f13224D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f13225E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ArrayList f13226F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f13227G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f13228H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f13229I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f13230J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f13231K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public k.j f13232L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f13233M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f13234N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final G f13235O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final G f13236P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final k3.d f13237Q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f13238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Context f13239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ActionBarOverlayLayout f13240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ActionBarContainer f13241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InterfaceC1311i0 f13242x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ActionBarContextView f13243y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final View f13244z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I(Activity activity, boolean z5) {
        new ArrayList();
        this.f13226F = new ArrayList();
        this.f13227G = 0;
        this.f13228H = true;
        this.f13231K = true;
        this.f13235O = new G(this, 0);
        this.f13236P = new G(this, 1);
        this.f13237Q = new k3.d(28, this);
        View decorView = activity.getWindow().getDecorView();
        X(decorView);
        if (z5) {
            return;
        }
        this.f13244z = decorView.findViewById(R.id.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(boolean z5) {
        O oI;
        O oI2;
        if (z5) {
            if (!this.f13230J) {
                this.f13230J = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13240v;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                a0(false);
            }
        } else if (this.f13230J) {
            this.f13230J = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13240v;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            a0(false);
        }
        if (!this.f13241w.isLaidOut()) {
            if (z5) {
                ((C1291Y0) this.f13242x).f14730a.setVisibility(4);
                this.f13243y.setVisibility(0);
                return;
            } else {
                ((C1291Y0) this.f13242x).f14730a.setVisibility(0);
                this.f13243y.setVisibility(8);
                return;
            }
        }
        if (z5) {
            C1291Y0 c1291y0 = (C1291Y0) this.f13242x;
            oI = AbstractC1835K.a(c1291y0.f14730a);
            oI.a(0.0f);
            oI.c(100L);
            oI.d(new k.i(c1291y0, 4));
            oI2 = this.f13243y.i(0, 200L);
        } else {
            C1291Y0 c1291y02 = (C1291Y0) this.f13242x;
            O oA = AbstractC1835K.a(c1291y02.f14730a);
            oA.a(1.0f);
            oA.c(200L);
            oA.d(new k.i(c1291y02, 0));
            oI = this.f13243y.i(8, 100L);
            oI2 = oA;
        }
        k.j jVar = new k.j();
        ArrayList arrayList = jVar.f13967a;
        arrayList.add(oI);
        View view = (View) oI.f18157a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) oI2.f18157a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(oI2);
        jVar.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Context W() {
        if (this.f13239u == null) {
            TypedValue typedValue = new TypedValue();
            this.f13238t.getTheme().resolveAttribute(com.wnapp.smspariaz.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f13239u = new ContextThemeWrapper(this.f13238t, i);
            } else {
                this.f13239u = this.f13238t;
            }
        }
        return this.f13239u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X(View view) {
        InterfaceC1311i0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.wnapp.smspariaz.R.id.decor_content_parent);
        this.f13240v = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.wnapp.smspariaz.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC1311i0) {
            wrapper = (InterfaceC1311i0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f13242x = wrapper;
        this.f13243y = (ActionBarContextView) view.findViewById(com.wnapp.smspariaz.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.wnapp.smspariaz.R.id.action_bar_container);
        this.f13241w = actionBarContainer;
        InterfaceC1311i0 interfaceC1311i0 = this.f13242x;
        if (interfaceC1311i0 == null || this.f13243y == null || actionBarContainer == null) {
            throw new IllegalStateException(I.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C1291Y0) interfaceC1311i0).f14730a.getContext();
        this.f13238t = context;
        if ((((C1291Y0) this.f13242x).f14731b & 4) != 0) {
            this.f13221A = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f13242x.getClass();
        Z(context.getResources().getBoolean(com.wnapp.smspariaz.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f13238t.obtainStyledAttributes(null, AbstractC1066a.f12786a, com.wnapp.smspariaz.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13240v;
            if (!actionBarOverlayLayout2.f9142w) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f13234N = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f13241w;
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            AbstractC1826B.k(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Y(boolean z5) {
        if (this.f13221A) {
            return;
        }
        int i = z5 ? 4 : 0;
        C1291Y0 c1291y0 = (C1291Y0) this.f13242x;
        int i7 = c1291y0.f14731b;
        this.f13221A = true;
        c1291y0.a((i & 4) | (i7 & (-5)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Z(boolean z5) {
        if (z5) {
            this.f13241w.setTabContainer(null);
            ((C1291Y0) this.f13242x).getClass();
        } else {
            ((C1291Y0) this.f13242x).getClass();
            this.f13241w.setTabContainer(null);
        }
        this.f13242x.getClass();
        ((C1291Y0) this.f13242x).f14730a.setCollapsible(false);
        this.f13240v.setHasNonEmbeddedTabs(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a0(boolean z5) {
        boolean z6 = this.f13229I;
        boolean z7 = this.f13230J;
        k3.d dVar = this.f13237Q;
        View view = this.f13244z;
        if (!z7 && z6) {
            if (this.f13231K) {
                this.f13231K = false;
                k.j jVar = this.f13232L;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f13227G;
                G g7 = this.f13235O;
                if (i != 0 || (!this.f13233M && !z5)) {
                    g7.a();
                    return;
                }
                this.f13241w.setAlpha(1.0f);
                this.f13241w.setTransitioning(true);
                k.j jVar2 = new k.j();
                float f = -this.f13241w.getHeight();
                if (z5) {
                    this.f13241w.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                O oA = AbstractC1835K.a(this.f13241w);
                oA.e(f);
                View view2 = (View) oA.f18157a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(dVar != null ? new a3.w(dVar, view2) : null);
                }
                boolean z8 = jVar2.f13971e;
                ArrayList arrayList = jVar2.f13967a;
                if (!z8) {
                    arrayList.add(oA);
                }
                if (this.f13228H && view != null) {
                    O oA2 = AbstractC1835K.a(view);
                    oA2.e(f);
                    if (!jVar2.f13971e) {
                        arrayList.add(oA2);
                    }
                }
                boolean z9 = jVar2.f13971e;
                if (!z9) {
                    jVar2.f13969c = f13219R;
                }
                if (!z9) {
                    jVar2.f13968b = 250L;
                }
                if (!z9) {
                    jVar2.f13970d = g7;
                }
                this.f13232L = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f13231K) {
            return;
        }
        this.f13231K = true;
        k.j jVar3 = this.f13232L;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f13241w.setVisibility(0);
        int i7 = this.f13227G;
        G g8 = this.f13236P;
        if (i7 == 0 && (this.f13233M || z5)) {
            this.f13241w.setTranslationY(0.0f);
            float f7 = -this.f13241w.getHeight();
            if (z5) {
                this.f13241w.getLocationInWindow(new int[]{0, 0});
                f7 -= r12[1];
            }
            this.f13241w.setTranslationY(f7);
            k.j jVar4 = new k.j();
            O oA3 = AbstractC1835K.a(this.f13241w);
            oA3.e(0.0f);
            View view3 = (View) oA3.f18157a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(dVar != null ? new a3.w(dVar, view3) : null);
            }
            boolean z10 = jVar4.f13971e;
            ArrayList arrayList2 = jVar4.f13967a;
            if (!z10) {
                arrayList2.add(oA3);
            }
            if (this.f13228H && view != null) {
                view.setTranslationY(f7);
                O oA4 = AbstractC1835K.a(view);
                oA4.e(0.0f);
                if (!jVar4.f13971e) {
                    arrayList2.add(oA4);
                }
            }
            boolean z11 = jVar4.f13971e;
            if (!z11) {
                jVar4.f13969c = f13220S;
            }
            if (!z11) {
                jVar4.f13968b = 250L;
            }
            if (!z11) {
                jVar4.f13970d = g8;
            }
            this.f13232L = jVar4;
            jVar4.b();
        } else {
            this.f13241w.setAlpha(1.0f);
            this.f13241w.setTranslationY(0.0f);
            if (this.f13228H && view != null) {
                view.setTranslationY(0.0f);
            }
            g8.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13240v;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            AbstractC1862z.c(actionBarOverlayLayout);
        }
    }

    public I(Dialog dialog) {
        new ArrayList();
        this.f13226F = new ArrayList();
        this.f13227G = 0;
        this.f13228H = true;
        this.f13231K = true;
        this.f13235O = new G(this, 0);
        this.f13236P = new G(this, 1);
        this.f13237Q = new k3.d(28, this);
        X(dialog.getWindow().getDecorView());
    }
}
