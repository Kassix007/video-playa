package s4;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f16458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16459b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(float f, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f16458a;
            f += ((b) cVar).f16459b;
        }
        this.f16458a = cVar;
        this.f16459b = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f16458a.a(rectF) + this.f16459b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16458a.equals(bVar.f16458a) && this.f16459b == bVar.f16459b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16458a, Float.valueOf(this.f16459b)});
    }
}
