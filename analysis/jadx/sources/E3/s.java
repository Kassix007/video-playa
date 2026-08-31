package e3;

import M5.InterfaceC0261w;
import a3.C0620A;
import a3.C0632k;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class s extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0632k f12617q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f12618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f12619s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C0632k c0632k, Context context, String str, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f12617q = c0632k;
        this.f12618r = context;
        this.f12619s = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new s(this.f12617q, this.f12618r, this.f12619s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        s sVar = (s) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        sVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        String str;
        AbstractC1362a.e(obj);
        for (C0620A c0620a : ((HashMap) this.f12617q.c()).values()) {
            kotlin.jvm.internal.m.b(c0620a);
            String str2 = c0620a.f8757d;
            if (c0620a.f == null && J5.t.G0(str2, "data:", false) && J5.m.S0(str2, "base64,", 0, 6) > 0) {
                try {
                    String strSubstring = str2.substring(J5.m.R0(str2, ',', 0, 6) + 1);
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                    byte[] bArrDecode = Base64.decode(strSubstring, 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    c0620a.f = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                } catch (IllegalArgumentException e7) {
                    n3.c.c("data URL did not have correct base64 format.", e7);
                }
            }
            Context context = this.f12618r;
            if (c0620a.f == null && (str = this.f12619s) != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str + str2);
                    kotlin.jvm.internal.m.b(inputStreamOpen);
                    Bitmap bitmapDecodeStream = null;
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options2);
                    } catch (IllegalArgumentException e8) {
                        n3.c.c("Unable to decode image.", e8);
                    }
                    if (bitmapDecodeStream != null) {
                        c0620a.f = n3.i.d(bitmapDecodeStream, c0620a.f8754a, c0620a.f8755b);
                    }
                } catch (IOException e9) {
                    n3.c.c("Unable to open asset.", e9);
                }
            }
        }
        return C1386y.f15098a;
    }
}
