package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import d2.C0994t;

/* JADX INFO: loaded from: classes.dex */
public final class w extends C0994t {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11554q = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR (r2v0 android.content.Context) A[MD:(android.content.Context):void (m)] call: d2.t.<init>(android.content.Context):void type: SUPER */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ w(Context context) {
        super(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.C0994t
    public int b(View view, int i) {
        switch (this.f11554q) {
            case 1:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.C0994t
    public int c(View view, int i) {
        switch (this.f11554q) {
            case 1:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.C0994t
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f11554q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.C0994t
    public PointF f(int i) {
        switch (this.f11554q) {
            case 1:
                return null;
            default:
                return super.f(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public w(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
