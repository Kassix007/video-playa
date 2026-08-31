package a1;

import C0.c1;
import W0.l;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.X;
import b.m;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.P1;
import com.wnapp.smspariaz.R;
import java.util.UUID;
import n5.AbstractC1397A;

/* JADX INFO: renamed from: a1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC0617j extends m {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public B5.a f8744t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0616i f8745u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f8746v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0615h f8747w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogC0617j(B5.a aVar, C0616i c0616i, View view, l lVar, W0.c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), c0616i.f8743e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f8744t = aVar;
        this.f8745u = c0616i;
        this.f8746v = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC1397A.A(window, this.f8745u.f8743e);
        window.setGravity(17);
        C0615h c0615h = new C0615h(getContext(), window);
        c0615h.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c0615h.setClipChildren(false);
        c0615h.setElevation(cVar.u(f));
        c0615h.setOutlineProvider(new c1(2));
        this.f8747w = c0615h;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(c0615h);
        X.h(c0615h, X.d(view));
        X.i(c0615h, X.e(view));
        AbstractC0836n2.M(c0615h, AbstractC0836n2.p(view));
        f(this.f8744t, this.f8745u, lVar);
        P1.c(this.f9903s, this, new C0608a(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C0615h) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(B5.a aVar, C0616i c0616i, l lVar) {
        int i;
        this.f8744t = aVar;
        this.f8745u = c0616i;
        EnumC0618k enumC0618k = c0616i.f8741c;
        int i7 = AbstractC0612e.f8730a;
        ViewGroup.LayoutParams layoutParams = this.f8746v.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z5 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = enumC0618k.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z5 = true;
            } else {
                if (iOrdinal != 2) {
                    throw new C2.e();
                }
                z5 = false;
            }
        }
        Window window = getWindow();
        kotlin.jvm.internal.m.b(window);
        window.setFlags(z5 ? 8192 : -8193, 8192);
        int iOrdinal2 = lVar.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new C2.e();
            }
            i = 1;
        }
        C0615h c0615h = this.f8747w;
        c0615h.setLayoutDirection(i);
        boolean z6 = c0616i.f8743e;
        boolean z7 = c0616i.f8742d;
        Window window2 = c0615h.f8737y;
        boolean z8 = (c0615h.f8735C && z7 == c0615h.f8733A && z6 == c0615h.f8734B) ? false : true;
        c0615h.f8733A = z7;
        c0615h.f8734B = z6;
        if (z8) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i8 = z7 ? -2 : -1;
            if (i8 != attributes.width || !c0615h.f8735C) {
                window2.setLayout(i8, -2);
                c0615h.f8735C = true;
            }
        }
        setCanceledOnTouchOutside(c0616i.f8740b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z6 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f8745u.f8739a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f8744t.invoke();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r7 <= r1) goto L24;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.onTouchEvent(r7)
            a1.i r1 = r6.f8745u
            boolean r1 = r1.f8740b
            if (r1 == 0) goto L73
            a1.h r1 = r6.f8747w
            r1.getClass()
            float r2 = r7.getX()
            boolean r3 = java.lang.Float.isInfinite(r2)
            if (r3 != 0) goto L6c
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L6c
            float r2 = r7.getY()
            boolean r3 = java.lang.Float.isInfinite(r2)
            if (r3 != 0) goto L6c
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L6c
            r2 = 0
            android.view.View r2 = r1.getChildAt(r2)
            if (r2 != 0) goto L37
            goto L6c
        L37:
            int r3 = r1.getLeft()
            int r4 = r2.getLeft()
            int r4 = r4 + r3
            int r3 = r2.getWidth()
            int r3 = r3 + r4
            int r1 = r1.getTop()
            int r5 = r2.getTop()
            int r5 = r5 + r1
            int r1 = r2.getHeight()
            int r1 = r1 + r5
            float r2 = r7.getX()
            int r2 = D5.a.G(r2)
            if (r4 > r2) goto L6c
            if (r2 > r3) goto L6c
            float r7 = r7.getY()
            int r7 = D5.a.G(r7)
            if (r5 > r7) goto L6c
            if (r7 > r1) goto L6c
            goto L73
        L6c:
            B5.a r7 = r6.f8744t
            r7.invoke()
            r7 = 1
            return r7
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.DialogC0617j.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
