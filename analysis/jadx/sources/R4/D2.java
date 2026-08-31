package R4;

import M5.InterfaceC0261w;
import com.web2native.MainActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class D2 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ MainActivity f6748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f6749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ byte[] f6750s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D2(MainActivity mainActivity, String str, byte[] bArr, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6748q = mainActivity;
        this.f6749r = str;
        this.f6750s = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new D2(this.f6748q, this.f6749r, this.f6750s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((D2) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        try {
            File file = new File(this.f6748q.getCacheDir(), this.f6749r);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(this.f6750s);
            fileOutputStream.close();
            return file;
        } catch (IOException e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
