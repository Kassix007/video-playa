package t4;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class a extends I1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SideSheetBehavior f16741d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        super(24);
        this.f16740c = i;
        this.f16741d = sideSheetBehavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final boolean C0(View view, float f) {
        switch (this.f16740c) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f16741d;
                float fAbs = Math.abs((f * sideSheetBehavior.f11582k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f16741d;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.f11582k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final void H0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i7) {
        switch (this.f16740c) {
            case 0:
                if (i <= this.f16741d.f11584m) {
                    marginLayoutParams.leftMargin = i7;
                }
                break;
            default:
                int i8 = this.f16741d.f11584m;
                if (i <= i8) {
                    marginLayoutParams.rightMargin = i8 - i;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final int K(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f16740c) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final float L(int i) {
        switch (this.f16740c) {
            case 0:
                float fF0 = f0();
                return (i - fF0) / (e0() - fF0);
            default:
                float f = this.f16741d.f11584m;
                return (f - i) / (f - e0());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final int e0() {
        switch (this.f16740c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f16741d;
                return Math.max(0, sideSheetBehavior.f11585n + sideSheetBehavior.f11586o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f16741d;
                return Math.max(0, (sideSheetBehavior2.f11584m - sideSheetBehavior2.f11583l) - sideSheetBehavior2.f11586o);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final int f0() {
        switch (this.f16740c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f16741d;
                return (-sideSheetBehavior.f11583l) - sideSheetBehavior.f11586o;
            default:
                return this.f16741d.f11584m;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final int g0() {
        switch (this.f16740c) {
            case 0:
                return this.f16741d.f11586o;
            default:
                return this.f16741d.f11584m;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final int h0() {
        switch (this.f16740c) {
            case 0:
                return -this.f16741d.f11583l;
            default:
                return e0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final int i0(View view) {
        switch (this.f16740c) {
            case 0:
                return view.getRight() + this.f16741d.f11586o;
            default:
                return view.getLeft() - this.f16741d.f11586o;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final int j0(CoordinatorLayout coordinatorLayout) {
        switch (this.f16740c) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final int m0() {
        switch (this.f16740c) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final boolean r0(float f) {
        switch (this.f16740c) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final boolean t0(View view) {
        switch (this.f16740c) {
            case 0:
                if (view.getRight() < (e0() - f0()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (e0() + this.f16741d.f11584m) / 2) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final boolean u0(float f, float f7) {
        switch (this.f16740c) {
            case 0:
                if (Math.abs(f) <= Math.abs(f7) || Math.abs(f) <= 500) {
                }
                break;
            default:
                if (Math.abs(f) <= Math.abs(f7) || Math.abs(f) <= 500) {
                }
                break;
        }
        return false;
    }
}
