package U0;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.m;
import l0.AbstractC1220c;
import l0.C1223f;
import l0.C1224g;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC1220c f7522q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(AbstractC1220c abstractC1220c) {
        this.f7522q = abstractC1220c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C1223f c1223f = C1223f.f14430b;
            AbstractC1220c abstractC1220c = this.f7522q;
            if (m.a(abstractC1220c, c1223f)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC1220c instanceof C1224g) {
                textPaint.setStyle(Paint.Style.STROKE);
                C1224g c1224g = (C1224g) abstractC1220c;
                textPaint.setStrokeWidth(c1224g.f14431b);
                textPaint.setStrokeMiter(c1224g.f14432c);
                int i = c1224g.f14434e;
                textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i7 = c1224g.f14433d;
                textPaint.setStrokeCap(i7 == 0 ? Paint.Cap.BUTT : i7 == 1 ? Paint.Cap.ROUND : i7 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                c1224g.getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
