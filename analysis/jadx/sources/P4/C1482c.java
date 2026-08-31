package p4;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.gms.internal.measurement.K1;

/* JADX INFO: renamed from: p4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1482c extends K1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f15884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextPaint f15885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K1 f15886e;
    public final /* synthetic */ C1483d f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1482c(C1483d c1483d, Context context, TextPaint textPaint, K1 k12) {
        this.f = c1483d;
        this.f15884c = context;
        this.f15885d = textPaint;
        this.f15886e = k12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final void A(int i) {
        this.f15886e.A(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final void B(Typeface typeface, boolean z5) {
        this.f.g(this.f15884c, this.f15885d, typeface);
        this.f15886e.B(typeface, z5);
    }
}
