package q6;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: renamed from: q6.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1540i extends G, ReadableByteChannel {
    long B(byte b7, long j, long j7);

    String E(long j);

    void Q(long j);

    long T(InterfaceC1539h interfaceC1539h);

    long X();

    InputStream Y();

    C1541j k(long j);

    boolean o(long j);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    boolean t(long j, C1541j c1541j);

    String u();

    C1538g w();
}
