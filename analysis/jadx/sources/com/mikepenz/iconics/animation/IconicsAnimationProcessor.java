package com.mikepenz.iconics.animation;

import K4.a;
import K4.b;
import L4.c;
import L4.d;
import L4.e;
import L4.f;
import L4.g;
import L4.h;
import L4.i;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.mikepenz.iconics.typeface.IconicsInitializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.m;
import m2.InterfaceC1359b;
import m5.AbstractC1362a;
import m5.C1386y;
import m5.InterfaceC1369h;

/* JADX INFO: loaded from: classes.dex */
public abstract class IconicsAnimationProcessor implements InterfaceC1359b {
    public static final f Companion = new f();
    public static final LinearInterpolator DEFAULT_INTERPOLATOR = new LinearInterpolator();
    public static final int INFINITE = -1;
    private final ValueAnimator animator;
    private c drawable;
    private long duration;
    private TimeInterpolator interpolator;
    private boolean isStartImmediately;
    private boolean isStartRequested;
    private List<d> listeners;
    private List<e> pauseListeners;
    private final h proxyListener;
    private final InterfaceC1369h proxyPauseListener$delegate;
    private int repeatCount;
    private g repeatMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public IconicsAnimationProcessor(TimeInterpolator interpolator, long j, int i, g repeatMode, boolean z5) {
        m.e(interpolator, "interpolator");
        m.e(repeatMode, "repeatMode");
        this.interpolator = interpolator;
        this.duration = j;
        this.repeatCount = i;
        this.repeatMode = repeatMode;
        this.isStartImmediately = z5;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        m.d(valueAnimatorOfFloat, "ofFloat(0f, 100f)");
        this.animator = valueAnimatorOfFloat;
        this.proxyListener = new h(this);
        this.proxyPauseListener$delegate = AbstractC1362a.d(new A0.d(7, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IconicsAnimationProcessor addListener(d listener) {
        m.e(listener, "listener");
        if (this.listeners == null) {
            this.listeners = new ArrayList();
            this.animator.addListener(this.proxyListener);
        }
        List<d> list = this.listeners;
        if (list != null) {
            list.add(listener);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IconicsAnimationProcessor addPauseListener(e listener) {
        m.e(listener, "listener");
        if (this.pauseListeners == null) {
            this.pauseListeners = new ArrayList();
            this.animator.addPauseListener((i) this.proxyPauseListener$delegate.getValue());
        }
        List<e> list = this.pauseListeners;
        if (list != null) {
            list.add(listener);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void cancel() {
        this.animator.cancel();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m2.InterfaceC1359b
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m19create(context);
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m2.InterfaceC1359b
    public List<Class<? extends InterfaceC1359b>> dependencies() {
        return AbstractC0836n2.z(IconicsInitializer.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void end() {
        this.animator.end();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float getAnimatedPercent() {
        Object animatedValue = this.animator.getAnimatedValue();
        m.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) animatedValue).floatValue();
    }

    public abstract String getAnimationTag();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Rect getDrawableBounds() {
        c cVar = this.drawable;
        if (cVar != null) {
            return cVar.getBounds();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int[] getDrawableState() {
        c cVar = this.drawable;
        if (cVar != null) {
            return cVar.getState();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TimeInterpolator getInterpolator() {
        return this.interpolator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getRepeatCount() {
        return this.repeatCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g getRepeatMode() {
        return this.repeatMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isPaused() {
        return this.animator.isPaused();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isRunning() {
        return this.animator.isRunning();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isStartImmediately() {
        return this.isStartImmediately;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isStarted() {
        return this.animator.isStarted();
    }

    public final void onDrawableAttached() {
    }

    public void onDrawableDetached() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void pause() {
        this.animator.pause();
    }

    public void processPostDraw(Canvas canvas) {
        m.e(canvas, "canvas");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void processPreDraw(Canvas canvas, b iconBrush, b iconContourBrush, b backgroundBrush, b backgroundContourBrush) {
        m.e(iconBrush, "iconBrush");
        m.e(iconContourBrush, "iconContourBrush");
        m.e(backgroundBrush, "backgroundBrush");
        m.e(backgroundContourBrush, "backgroundContourBrush");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeAllListeners() {
        List<d> list = this.listeners;
        if (list != null) {
            list.clear();
            this.listeners = null;
            this.animator.removeListener(this.proxyListener);
        }
        List<e> list2 = this.pauseListeners;
        if (list2 != null) {
            list2.clear();
            this.pauseListeners = null;
            this.animator.removePauseListener((i) this.proxyPauseListener$delegate.getValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removeListener(d listener) {
        m.e(listener, "listener");
        List<d> list = this.listeners;
        if (list != null) {
            list.remove(listener);
        }
        List<d> list2 = this.listeners;
        if (list2 == null || list2.size() != 0) {
            return;
        }
        this.listeners = null;
        this.animator.removeListener(this.proxyListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void removePauseListener(e listener) {
        m.e(listener, "listener");
        List<e> list = this.pauseListeners;
        if (list != null) {
            list.remove(listener);
        }
        List<e> list2 = this.pauseListeners;
        if (list2 == null || list2.size() != 0) {
            return;
        }
        this.pauseListeners = null;
        this.animator.removePauseListener((i) this.proxyPauseListener$delegate.getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void resume() {
        this.animator.resume();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void reverse() {
        this.animator.reverse();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDrawable$iconics_core(c cVar) {
        if (this.drawable != null) {
            this.drawable = null;
            onDrawableDetached();
        }
        this.drawable = cVar;
        if (cVar == null) {
            this.animator.cancel();
            return;
        }
        onDrawableAttached();
        if (isStartImmediately() || this.isStartRequested) {
            start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IconicsAnimationProcessor start() {
        this.animator.setInterpolator(getInterpolator());
        this.animator.setDuration(getDuration());
        this.animator.setRepeatCount(getRepeatCount());
        this.animator.setRepeatMode(getRepeatMode().f3267q);
        if (this.drawable == null) {
            this.isStartRequested = true;
            return this;
        }
        this.isStartRequested = false;
        this.animator.start();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Possible override for method m2.b.create(Landroid/content/Context;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public void m19create(Context context) {
        m.e(context, "context");
        HashMap map = a.f2902a;
        a.f2902a.put(getAnimationTag(), getClass());
    }

    public IconicsAnimationProcessor() {
        this(DEFAULT_INTERPOLATOR, 300L, -1, g.RESTART, true);
    }
}
