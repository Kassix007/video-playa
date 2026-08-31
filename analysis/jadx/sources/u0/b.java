package U0;

import A0.d;
import P.C;
import P.C0345b;
import P.C0354f0;
import S0.j;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import i0.C1133e;
import j0.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f7523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f7524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0354f0 f7525s = C0345b.q(new C1133e(9205357640488583168L));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C f7526t = C0345b.m(new d(15, this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(l lVar, float f) {
        this.f7523q = lVar;
        this.f7524r = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.a(textPaint, this.f7524r);
        textPaint.setShader((Shader) this.f7526t.getValue());
    }
}
