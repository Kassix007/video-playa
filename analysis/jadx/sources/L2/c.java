package L2;

import I2.q;
import J2.s;
import U2.n;
import Y2.j;
import a.AbstractC0597a;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import q5.InterfaceC1524c;
import q6.C1538g;
import r2.o;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f3253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3254c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ c(Object obj, n nVar, int i) {
        this.f3252a = i;
        this.f3254c = obj;
        this.f3253b = nVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // L2.g
    public final Object a(InterfaceC1524c interfaceC1524c) {
        int i = this.f3252a;
        J2.h hVar = J2.h.f2768r;
        Object obj = this.f3254c;
        n nVar = this.f3253b;
        switch (i) {
            case 0:
                return new h(q.c(new BitmapDrawable(nVar.f7686a.getResources(), (Bitmap) obj)), false, hVar);
            case 1:
                C1538g c1538g = new C1538g();
                c1538g.m21write((byte[]) obj);
                return new i(new s(c1538g, nVar.f, null), null, hVar);
            case 2:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new i(new s(AbstractC0597a.j(new d(byteBuffer)), nVar.f, new J2.f(byteBuffer)), null, hVar);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = j.f8215a;
                boolean z5 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof o);
                if (z5) {
                    bitmapDrawable = new BitmapDrawable(nVar.f7686a.getResources(), AbstractC1918b.l(bitmapDrawable, U2.i.b(nVar), nVar.f7687b, nVar.f7688c, nVar.f7689d == V2.d.f7960r));
                }
                return new h(q.c(bitmapDrawable), z5, hVar);
        }
    }
}
