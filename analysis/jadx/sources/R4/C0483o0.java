package R4;

import M5.InterfaceC0261w;
import android.media.MediaScannerConnection;
import android.os.Build;
import com.web2native.MainActivity;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: R4.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0483o0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0498s0 f7141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ byte[] f7142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f7143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f7144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String[] f7145u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0483o0(C0498s0 c0498s0, byte[] bArr, kotlin.jvm.internal.y yVar, String str, String[] strArr, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7141q = c0498s0;
        this.f7142r = bArr;
        this.f7143s = yVar;
        this.f7144t = str;
        this.f7145u = strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0483o0(this.f7141q, this.f7142r, this.f7143s, this.f7144t, this.f7145u, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0483o0 c0483o0 = (C0483o0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c0483o0.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        OutputStream fileOutputStream;
        String[] strArr = this.f7145u;
        AbstractC1362a.e(obj);
        try {
            int i = Build.VERSION.SDK_INT;
            C0498s0 c0498s0 = this.f7141q;
            kotlin.jvm.internal.y yVar = this.f7143s;
            if (i == 29) {
                MainActivity mainActivity = c0498s0.f7181b.f7071c;
                byte[] bArr = this.f7142r;
                String str = (String) yVar.f14268q;
                String str2 = this.f7144t;
                if (str2 == null) {
                    str2 = "*/*";
                }
                C0498s0.e(c0498s0, mainActivity, null, bArr, str, str2, 2);
            } else {
                if (i >= 26) {
                    fileOutputStream = Files.newOutputStream(c0498s0.b((String) yVar.f14268q).toPath(), new OpenOption[0]);
                    kotlin.jvm.internal.m.b(fileOutputStream);
                } else {
                    fileOutputStream = new FileOutputStream(c0498s0.b((String) yVar.f14268q));
                }
                fileOutputStream.write(this.f7142r);
                if (J5.m.K0(strArr[0], "png") || J5.m.K0(strArr[0], "jpg")) {
                    String path = c0498s0.b((String) yVar.f14268q).getPath();
                    kotlin.jvm.internal.m.d(path, "getPath(...)");
                    MediaScannerConnection.scanFile(c0498s0.f7180a, new String[]{path}, null, new C0471l0());
                }
                fileOutputStream.close();
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
        return C1386y.f15098a;
    }
}
