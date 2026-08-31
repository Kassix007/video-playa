package q6;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: q6.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1539h extends E, WritableByteChannel {
    InterfaceC1539h R(String str);

    @Override // q6.E, java.io.Flushable
    void flush();

    InterfaceC1539h i(C1541j c1541j);

    InterfaceC1539h j(long j);

    InterfaceC1539h write(byte[] bArr);

    InterfaceC1539h writeByte(int i);

    InterfaceC1539h writeInt(int i);

    InterfaceC1539h writeShort(int i);
}
