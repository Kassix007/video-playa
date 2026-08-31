package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.work.impl.Scheduler;
import com.wnapp.smspariaz.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public double f11694A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f11695B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f11696C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ValueAnimator f11697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f11699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f11700t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f11701u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Paint f11702v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f11703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f11704x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f11705y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11706z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f11697q = new ValueAnimator();
        this.f11699s = new ArrayList();
        Paint paint = new Paint();
        this.f11702v = paint;
        this.f11703w = new RectF();
        this.f11696C = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V3.a.f7980g, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        C3.a.M(context, R.attr.motionDurationLong2, Scheduler.MAX_GREEDY_SCHEDULER_LIMIT);
        C3.a.N(context, R.attr.motionEasingEmphasizedInterpolator, W3.a.f8109b);
        this.f11695B = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f11700t = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f11704x = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f11701u = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(int i) {
        return i == 2 ? Math.round(this.f11695B * 0.66f) : this.f11695B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(float f) {
        ValueAnimator valueAnimator = this.f11697q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = f % 360.0f;
        this.f11705y = f7;
        this.f11694A = Math.toRadians(f7 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f11696C);
        float fCos = (((float) Math.cos(this.f11694A)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f11694A))) + height;
        float f8 = this.f11700t;
        this.f11703w.set(fCos - f8, fSin - f8, fCos + f8, fSin + f8);
        ArrayList arrayList = this.f11699s;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((d) obj);
            if (Math.abs(clockFaceView.f11692W - f7) > 0.001f) {
                clockFaceView.f11692W = f7;
                clockFaceView.m();
            }
        }
        invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fA = a(this.f11696C);
        float fCos = (((float) Math.cos(this.f11694A)) * fA) + f;
        float f7 = height;
        float fSin = (fA * ((float) Math.sin(this.f11694A))) + f7;
        Paint paint = this.f11702v;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f11700t, paint);
        double dSin = Math.sin(this.f11694A);
        paint.setStrokeWidth(this.f11704x);
        canvas.drawLine(f, f7, width + ((int) (Math.cos(this.f11694A) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f7, this.f11701u, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        super.onLayout(z5, i, i7, i8, i9);
        if (this.f11697q.isRunning()) {
            return;
        }
        b(this.f11705y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        boolean z7 = false;
        if (actionMasked == 0) {
            this.f11706z = false;
            z5 = true;
            z6 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z6 = this.f11706z;
            if (this.f11698r) {
                this.f11696C = ((float) Math.hypot((double) (x6 - ((float) (getWidth() / 2))), (double) (y6 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z5 = false;
        } else {
            z6 = false;
            z5 = false;
        }
        boolean z8 = this.f11706z;
        int degrees = (int) Math.toDegrees(Math.atan2(y6 - (getHeight() / 2), x6 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z9 = this.f11705y != f;
        if (z5 && z9) {
            z7 = true;
        } else if (z9 || z6) {
            b(f);
            z7 = true;
        }
        this.f11706z = z8 | z7;
        return true;
    }
}
