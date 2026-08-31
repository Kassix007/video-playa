package com.mikepenz.iconics.animation;

import K4.b;
import L4.a;
import L4.g;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public class BlinkAlphaProcessor extends IconicsAnimationProcessor {
    public static final a Companion = new a();
    public static long DEFAULT_DURATION = 500;
    private final String animationTag;
    private long duration;
    private TimeInterpolator interpolator;
    private boolean isStartImmediately;
    private int maximumAlpha;
    private int minimumAlpha;
    private int repeatCount;
    private g repeatMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BlinkAlphaProcessor() {
        this(0, 0, null, 0L, 0, null, false, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public String getAnimationTag() {
        return this.animationTag;
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
    public int getMaximumAlpha() {
        return this.maximumAlpha;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMinimumAlpha() {
        return this.minimumAlpha;
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
    public void processPreDraw(Canvas canvas, b iconBrush, b iconContourBrush, b backgroundBrush, b backgroundContourBrush) {
        m.e(canvas, "canvas");
        m.e(iconBrush, "iconBrush");
        m.e(iconContourBrush, "iconContourBrush");
        m.e(backgroundBrush, "backgroundBrush");
        m.e(backgroundContourBrush, "backgroundContourBrush");
        int animatedPercent = (int) (getAnimatedPercent() * ((getMaximumAlpha() - getMinimumAlpha()) / 100));
        iconBrush.c(animatedPercent);
        iconContourBrush.c(animatedPercent);
        backgroundBrush.c(animatedPercent);
        backgroundContourBrush.c(animatedPercent);
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
    public void setMaximumAlpha(int i) {
        this.maximumAlpha = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMinimumAlpha(int i) {
        this.minimumAlpha = i;
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (255 int) : (r2v0 int))
  (wrap:android.animation.TimeInterpolator:?: TERNARY null = ((wrap:int:0x000b: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:android.animation.TimeInterpolator:0x000f: SGET  A[WRAPPED] (LINE:2) com.mikepenz.iconics.animation.IconicsAnimationProcessor.DEFAULT_INTERPOLATOR android.view.animation.LinearInterpolator) : (r3v0 android.animation.TimeInterpolator))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0015: SGET  A[WRAPPED] (LINE:3) com.mikepenz.iconics.animation.BlinkAlphaProcessor.DEFAULT_DURATION long) : (r4v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r6v0 int))
  (wrap:L4.g:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:L4.g:0x0020: SGET  A[WRAPPED] (LINE:4) L4.g.s L4.g) : (r7v0 L4.g))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r9v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r8v0 boolean))
 A[MD:(int, int, android.animation.TimeInterpolator, long, int, L4.g, boolean):void (m)] (LINE:5) call: com.mikepenz.iconics.animation.BlinkAlphaProcessor.<init>(int, int, android.animation.TimeInterpolator, long, int, L4.g, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ BlinkAlphaProcessor(int i, int i7, TimeInterpolator timeInterpolator, long j, int i8, g gVar, boolean z5, int i9, kotlin.jvm.internal.g gVar2) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 255 : i7, (i9 & 4) != 0 ? IconicsAnimationProcessor.DEFAULT_INTERPOLATOR : timeInterpolator, (i9 & 8) != 0 ? DEFAULT_DURATION : j, (i9 & 16) != 0 ? -1 : i8, (i9 & 32) != 0 ? g.REVERSE : gVar, (i9 & 64) != 0 ? true : z5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlinkAlphaProcessor(int i, int i7, TimeInterpolator interpolator, long j, int i8, g repeatMode, boolean z5) {
        super(interpolator, j, i8, repeatMode, z5);
        m.e(interpolator, "interpolator");
        m.e(repeatMode, "repeatMode");
        this.minimumAlpha = i;
        this.maximumAlpha = i7;
        this.interpolator = interpolator;
        this.duration = j;
        this.repeatCount = i8;
        this.repeatMode = repeatMode;
        this.isStartImmediately = z5;
        this.animationTag = "blink_alpha";
    }
}
