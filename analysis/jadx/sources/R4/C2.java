package R4;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class C2 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f6740r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2(String str, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6740r = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C2(this.f6740r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f6739q;
        try {
            if (i == 0) {
                AbstractC1362a.e(obj);
                URL url = new URL(this.f6740r);
                T5.e eVar = M5.H.f3811a;
                T5.d dVar = T5.d.f7468q;
                B2 b22 = new B2(url, null);
                this.f6739q = 1;
                obj = AbstractC0263y.B(dVar, b22, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (obj == enumC1580a) {
                    return enumC1580a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
            }
            kotlin.jvm.internal.m.d(obj, "withContext(...)");
            InputStream inputStream = (InputStream) obj;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i7 = inputStream.read(bArr);
                if (i7 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    inputStream.close();
                    return byteArray;
                }
                System.out.print(bArr);
                byteArrayOutputStream.write(bArr, 0, i7);
            }
        } catch (IOException e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
