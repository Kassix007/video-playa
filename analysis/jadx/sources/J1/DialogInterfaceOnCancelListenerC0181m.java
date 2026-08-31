package J1;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.X;
import com.google.android.gms.internal.measurement.AbstractC0836n2;

/* JADX INFO: renamed from: J1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0181m extends AbstractComponentCallbacksC0185q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0177i f2658k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0178j f2659l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f2660m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f2661n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f2662o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f2663p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f2664q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f2665r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final C0179k f2666s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Dialog f2667t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f2668u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f2669v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f2670w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f2671x0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogInterfaceOnCancelListenerC0181m() {
        new A1.b(4, this);
        this.f2658k0 = new DialogInterfaceOnCancelListenerC0177i(this);
        this.f2659l0 = new DialogInterfaceOnDismissListenerC0178j(this);
        this.f2660m0 = 0;
        this.f2661n0 = 0;
        this.f2662o0 = true;
        this.f2663p0 = true;
        this.f2664q0 = -1;
        this.f2666s0 = new C0179k(this);
        this.f2671x0 = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f2701S = true;
        if (this.f2667t0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2667t0.onRestoreInstanceState(bundle2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f2703U != null || this.f2667t0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2667t0.onRestoreInstanceState(bundle2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Dialog G() {
        if (H.F(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new b.m(C(), this.f2661n0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final C3.a c() {
        return new C0180l(this, new C0183o(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2668u0) {
            return;
        }
        if (H.F(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f2669v0) {
            return;
        }
        this.f2669v0 = true;
        this.f2670w0 = false;
        Dialog dialog = this.f2667t0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2667t0.dismiss();
        }
        this.f2668u0 = true;
        if (this.f2664q0 >= 0) {
            H hK = k();
            int i = this.f2664q0;
            if (i < 0) {
                throw new IllegalArgumentException(k1.i.i(i, "Bad id: "));
            }
            hK.w(new G(hK, i), true);
            this.f2664q0 = -1;
            return;
        }
        C0169a c0169a = new C0169a(k());
        c0169a.f2616o = true;
        H h4 = this.f2690H;
        if (h4 == null || h4 == c0169a.f2617p) {
            c0169a.b(new O(3, this));
            c0169a.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final void p() {
        this.f2701S = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final void r(Context context) {
        super.r(context);
        this.f2713e0.f(this.f2666s0);
        if (this.f2670w0) {
            return;
        }
        this.f2669v0 = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f2663p0 = this.f2695M == 0;
        if (bundle != null) {
            this.f2660m0 = bundle.getInt("android:style", 0);
            this.f2661n0 = bundle.getInt("android:theme", 0);
            this.f2662o0 = bundle.getBoolean("android:cancelable", true);
            this.f2663p0 = bundle.getBoolean("android:showsDialog", this.f2663p0);
            this.f2664q0 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final void u() {
        this.f2701S = true;
        Dialog dialog = this.f2667t0;
        if (dialog != null) {
            this.f2668u0 = true;
            dialog.setOnDismissListener(null);
            this.f2667t0.dismiss();
            if (!this.f2669v0) {
                onDismiss(this.f2667t0);
            }
            this.f2667t0 = null;
            this.f2671x0 = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final void v() {
        this.f2701S = true;
        if (!this.f2670w0 && !this.f2669v0) {
            this.f2669v0 = true;
        }
        this.f2713e0.j(this.f2666s0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0044, B:29:0x004e, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0066), top: B:49:0x001a }] */
    @Override // J1.AbstractComponentCallbacksC0185q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater w(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.w(r8)
            boolean r0 = r7.f2663p0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L98
            boolean r3 = r7.f2665r0
            if (r3 == 0) goto L11
            goto L98
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.f2671x0
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.f2665r0 = r3     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.G()     // Catch: java.lang.Throwable -> L4c
            r7.f2667t0 = r4     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.f2663p0     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L66
            int r5 = r7.f2660m0     // Catch: java.lang.Throwable -> L4c
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4c
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4c
        L3e:
            android.content.Context r4 = r7.i()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4e
            android.app.Dialog r5 = r7.f2667t0     // Catch: java.lang.Throwable -> L4c
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4c
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r8 = move-exception
            goto L6c
        L4e:
            android.app.Dialog r4 = r7.f2667t0     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.f2662o0     // Catch: java.lang.Throwable -> L4c
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.f2667t0     // Catch: java.lang.Throwable -> L4c
            J1.i r5 = r7.f2658k0     // Catch: java.lang.Throwable -> L4c
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.f2667t0     // Catch: java.lang.Throwable -> L4c
            J1.j r5 = r7.f2659l0     // Catch: java.lang.Throwable -> L4c
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4c
            r7.f2671x0 = r3     // Catch: java.lang.Throwable -> L4c
            goto L69
        L66:
            r3 = 0
            r7.f2667t0 = r3     // Catch: java.lang.Throwable -> L4c
        L69:
            r7.f2665r0 = r0
            goto L6f
        L6c:
            r7.f2665r0 = r0
            throw r8
        L6f:
            boolean r0 = J1.H.F(r2)
            if (r0 == 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8b:
            android.app.Dialog r0 = r7.f2667t0
            if (r0 == 0) goto Ld3
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
            return r8
        L98:
            boolean r0 = J1.H.F(r2)
            if (r0 == 0) goto Ld3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f2663p0
            if (r2 != 0) goto Lc2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
            return r8
        Lc2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Ld3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.DialogInterfaceOnCancelListenerC0181m.w(android.os.Bundle):android.view.LayoutInflater");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public void x(Bundle bundle) {
        Dialog dialog = this.f2667t0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f2660m0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i7 = this.f2661n0;
        if (i7 != 0) {
            bundle.putInt("android:theme", i7);
        }
        boolean z5 = this.f2662o0;
        if (!z5) {
            bundle.putBoolean("android:cancelable", z5);
        }
        boolean z6 = this.f2663p0;
        if (!z6) {
            bundle.putBoolean("android:showsDialog", z6);
        }
        int i8 = this.f2664q0;
        if (i8 != -1) {
            bundle.putInt("android:backStackId", i8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public void y() {
        this.f2701S = true;
        Dialog dialog = this.f2667t0;
        if (dialog != null) {
            this.f2668u0 = false;
            dialog.show();
            View decorView = this.f2667t0.getWindow().getDecorView();
            X.h(decorView, this);
            X.i(decorView, this);
            AbstractC0836n2.M(decorView, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public void z() {
        this.f2701S = true;
        Dialog dialog = this.f2667t0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
