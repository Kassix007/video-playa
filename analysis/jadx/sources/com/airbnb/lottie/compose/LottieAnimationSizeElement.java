package com.airbnb.lottie.compose;

import B0.AbstractC0036d0;
import c0.AbstractC0724l;
import e3.C1049l;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class LottieAnimationSizeElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10284r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LottieAnimationSizeElement(int i, int i7) {
        this.f10283q = i;
        this.f10284r = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) obj;
        return this.f10283q == lottieAnimationSizeElement.f10283q && this.f10284r == lottieAnimationSizeElement.f10284r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        C1049l c1049l = new C1049l();
        c1049l.f12599E = this.f10283q;
        c1049l.f12600F = this.f10284r;
        return c1049l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        C1049l node = (C1049l) abstractC0724l;
        m.e(node, "node");
        node.f12599E = this.f10283q;
        node.f12600F = this.f10284r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f10284r) + (Integer.hashCode(this.f10283q) * 31);
    }

    public final String toString() {
        return "LottieAnimationSizeElement(width=" + this.f10283q + ", height=" + this.f10284r + ")";
    }
}
