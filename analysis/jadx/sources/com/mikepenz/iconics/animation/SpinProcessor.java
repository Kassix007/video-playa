package com.mikepenz.iconics.animation;

import K4.b;
import L4.g;
import L4.j;
import L4.k;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public class SpinProcessor extends IconicsAnimationProcessor {
    public static final j Companion = new j();
    public static long DEFAULT_DURATION = 2000;
    private final String animationTag;
    private k direction;
    private long duration;
    private TimeInterpolator interpolator;
    private boolean isDrawableShadowCleared;
    private boolean isStartImmediately;
    private int repeatCount;
    private g repeatMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SpinProcessor() {
        this(null, null, 0L, 0, null, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public String getAnimationTag() {
        return this.animationTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public long getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public TimeInterpolator getInterpolator() {
        return this.interpolator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public int getRepeatCount() {
        return this.repeatCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public g getRepeatMode() {
        return this.repeatMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public boolean isStartImmediately() {
        return this.isStartImmediately;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public void onDrawableDetached() {
        this.isDrawableShadowCleared = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public void processPostDraw(Canvas canvas) {
        m.e(canvas, "canvas");
        canvas.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public void processPreDraw(Canvas canvas, b iconBrush, b iconContourBrush, b backgroundBrush, b backgroundContourBrush) {
        m.e(canvas, "canvas");
        m.e(iconBrush, "iconBrush");
        m.e(iconContourBrush, "iconContourBrush");
        m.e(backgroundBrush, "backgroundBrush");
        m.e(backgroundContourBrush, "backgroundContourBrush");
        if (!this.isDrawableShadowCleared) {
            ((TextPaint) iconBrush.f2905a).clearShadowLayer();
            this.isDrawableShadowCleared = true;
        }
        canvas.save();
        Rect drawableBounds = getDrawableBounds();
        float animatedPercent = getAnimatedPercent() * 3.6f * getDirection().f3272q;
        if (drawableBounds != null) {
            canvas.rotate(animatedPercent, drawableBounds.width() / 2, drawableBounds.height() / 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setDirection(k kVar) {
        m.e(kVar, "<set-?>");
        this.direction = kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setDuration(long j) {
        this.duration = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        m.e(timeInterpolator, "<set-?>");
        this.interpolator = timeInterpolator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRepeatCount(int i) {
        this.repeatCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRepeatMode(g gVar) {
        m.e(gVar, "<set-?>");
        this.repeatMode = gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartImmediately(boolean z5) {
        this.isStartImmediately = z5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:L4.k:?: TERNARY null = ((wrap:int:0x0000: ARITH (r8v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:L4.k:0x0004: SGET  A[WRAPPED] (LINE:2) L4.k.r L4.k) : (r1v0 L4.k))
  (wrap:android.animation.TimeInterpolator:?: TERNARY null = ((wrap:int:0x0006: ARITH (r8v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:android.animation.TimeInterpolator:0x000a: SGET  A[WRAPPED] (LINE:3) com.mikepenz.iconics.animation.IconicsAnimationProcessor.DEFAULT_INTERPOLATOR android.view.animation.LinearInterpolator) : (r2v0 android.animation.TimeInterpolator))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r8v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0010: SGET  A[WRAPPED] (LINE:4) com.mikepenz.iconics.animation.SpinProcessor.DEFAULT_DURATION long) : (r3v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r8v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r5v0 int))
  (wrap:L4.g:?: TERNARY null = ((wrap:int:0x0017: ARITH (r8v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:L4.g:0x001b: SGET  A[WRAPPED] (LINE:5) L4.g.r L4.g) : (r6v0 L4.g))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r8v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r7v0 boolean))
 A[MD:(L4.k, android.animation.TimeInterpolator, long, int, L4.g, boolean):void (m)] (LINE:6) call: com.mikepenz.iconics.animation.SpinProcessor.<init>(L4.k, android.animation.TimeInterpolator, long, int, L4.g, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ SpinProcessor(k kVar, TimeInterpolator timeInterpolator, long j, int i, g gVar, boolean z5, int i7, kotlin.jvm.internal.g gVar2) {
        this((i7 & 1) != 0 ? k.CLOCKWISE : kVar, (i7 & 2) != 0 ? IconicsAnimationProcessor.DEFAULT_INTERPOLATOR : timeInterpolator, (i7 & 4) != 0 ? DEFAULT_DURATION : j, (i7 & 8) != 0 ? -1 : i, (i7 & 16) != 0 ? g.RESTART : gVar, (i7 & 32) != 0 ? true : z5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpinProcessor(k direction, TimeInterpolator interpolator, long j, int i, g repeatMode, boolean z5) {
        super(interpolator, j, i, repeatMode, z5);
        m.e(direction, "direction");
        m.e(interpolator, "interpolator");
        m.e(repeatMode, "repeatMode");
        this.direction = direction;
        this.interpolator = interpolator;
        this.duration = j;
        this.repeatCount = i;
        this.repeatMode = repeatMode;
        this.isStartImmediately = z5;
        this.animationTag = "spin";
    }
}
