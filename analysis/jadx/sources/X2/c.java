package x2;

import D2.n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.nio.ByteBuffer;
import q5.InterfaceC1524c;
import q6.C1538g;
import r2.o;
import v2.EnumC1757e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f18354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18355c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ c(Object obj, n nVar, int i) {
        this.f18353a = i;
        this.f18355c = obj;
        this.f18354b = nVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x2.g
    public final Object a(InterfaceC1524c interfaceC1524c) {
        int i = this.f18353a;
        EnumC1757e enumC1757e = EnumC1757e.f17525r;
        Object obj = this.f18355c;
        n nVar = this.f18354b;
        switch (i) {
            case 0:
                return new d(new BitmapDrawable(nVar.f1421a.getResources(), (Bitmap) obj), false, enumC1757e);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    C1538g c1538g = new C1538g();
                    c1538g.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = nVar.f1421a;
                    return new m(new v2.m(c1538g, null), null, enumC1757e);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = H2.f.f2137a;
                boolean z5 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof o);
                if (z5) {
                    bitmapDrawable = new BitmapDrawable(nVar.f1421a.getResources(), AbstractC0836n2.i(bitmapDrawable, nVar.f1422b, nVar.f1424d, nVar.f1425e, nVar.f));
                }
                return new d(bitmapDrawable, z5, enumC1757e);
        }
    }
}
