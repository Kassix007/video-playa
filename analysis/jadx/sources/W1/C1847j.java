package w1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: w1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1847j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f18219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f18220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f18221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f18223e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1847j(ViewGroup viewGroup) {
        this.f18221c = viewGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(float f, float f7, boolean z5) {
        ViewParent viewParentE;
        if (this.f18222d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f18221c, f, f7, z5);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e7);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(float f, float f7) {
        ViewParent viewParentE;
        if (this.f18222d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f18221c, f, f7);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e7);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(int i, int i7, int i8, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i9;
        int i10;
        int[] iArr3;
        if (!this.f18222d || (viewParentE = e(i8)) == null) {
            return false;
        }
        if (i == 0 && i7 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f18221c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i9 = iArr2[0];
            i10 = iArr2[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr == null) {
            if (this.f18223e == null) {
                this.f18223e = new int[2];
            }
            iArr3 = this.f18223e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof InterfaceC1848k) {
            ((InterfaceC1848k) viewParentE).d(viewGroup, i, i7, iArr3, i8);
        } else if (i8 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i, i7, iArr3);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e7);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i9;
            iArr2[1] = iArr2[1] - i10;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(int i, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        ViewParent viewParentE;
        int i11;
        int i12;
        int[] iArr3;
        if (this.f18222d && (viewParentE = e(i10)) != null) {
            if (i != 0 || i7 != 0 || i8 != 0 || i9 != 0) {
                ViewGroup viewGroup = this.f18221c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i11 = iArr[0];
                    i12 = iArr[1];
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                if (iArr2 == null) {
                    if (this.f18223e == null) {
                        this.f18223e = new int[2];
                    }
                    int[] iArr4 = this.f18223e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof InterfaceC1849l) {
                    ((InterfaceC1849l) viewParentE).h(viewGroup, i, i7, i8, i9, i10, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i8;
                    iArr3[1] = iArr3[1] + i9;
                    if (viewParentE instanceof InterfaceC1848k) {
                        ((InterfaceC1848k) viewParentE).i(viewGroup, i, i7, i8, i9, i10);
                    } else if (i10 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i, i7, i8, i9);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e7);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i11;
                    iArr[1] = iArr[1] - i12;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f18219a;
        }
        if (i != 1) {
            return null;
        }
        return this.f18220b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f(int i) {
        return e(i) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g(int i, int i7) {
        boolean zOnStartNestedScroll;
        if (!f(i7)) {
            if (this.f18222d) {
                View view = this.f18221c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z5 = parent instanceof InterfaceC1848k;
                    if (z5) {
                        zOnStartNestedScroll = ((InterfaceC1848k) parent).j(view2, view, i, i7);
                    } else if (i7 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e7);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i7 == 0) {
                            this.f18219a = parent;
                        } else if (i7 == 1) {
                            this.f18220b = parent;
                        }
                        if (z5) {
                            ((InterfaceC1848k) parent).a(view2, view, i, i7);
                        } else if (i7 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e8) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e8);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(int i) {
        ViewParent viewParentE = e(i);
        if (viewParentE != null) {
            boolean z5 = viewParentE instanceof InterfaceC1848k;
            ViewGroup viewGroup = this.f18221c;
            if (z5) {
                ((InterfaceC1848k) viewParentE).b(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e7);
                }
            }
            if (i == 0) {
                this.f18219a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f18220b = null;
            }
        }
    }
}
