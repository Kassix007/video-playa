package J2;

import C0.U;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f2801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f2802b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w(e eVar, kotlin.jvm.internal.u uVar) {
        this.f2801a = eVar;
        this.f2802b = uVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        U2.n nVar = this.f2801a.f2761b;
        long jT = D5.a.t(width, height, nVar.f7687b, nVar.f7688c, (V2.h) I2.q.e(nVar, U2.h.f7675b));
        int i = (int) (jT >> 32);
        int i7 = (int) (jT & 4294967295L);
        if (width > 0 && height > 0 && (width != i || height != i7)) {
            double dU = D5.a.u(width, height, i, i7, this.f2801a.f2761b.f7688c);
            boolean z5 = dU < 1.0d;
            this.f2802b.f14264q = z5;
            if (z5 || this.f2801a.f2761b.f7689d == V2.d.f7959q) {
                imageDecoder.setTargetSize(D5.a.F(((double) width) * dU), D5.a.F(dU * ((double) height)));
            }
        }
        imageDecoder.setOnPartialImageListener(new t());
        U2.n nVar2 = this.f2801a.f2761b;
        imageDecoder.setAllocator(l6.d.v(U2.i.b(nVar2)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) I2.q.e(nVar2, U2.i.f)).booleanValue() ? 1 : 0);
        I2.l lVar = U2.i.f7679b;
        if (U.g(I2.q.e(nVar2, lVar)) != null) {
            imageDecoder.setTargetColorSpace(U.g(I2.q.e(nVar2, lVar)));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) I2.q.e(nVar2, U2.i.f7680c)).booleanValue());
    }
}
