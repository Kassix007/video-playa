package j2;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* JADX INFO: renamed from: j2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1155a extends Closeable {
    boolean D();

    void I(Object[] objArr);

    void J();

    void L();

    Cursor P(InterfaceC1160f interfaceC1160f);

    int S(ContentValues contentValues, Object[] objArr);

    Cursor V(String str);

    void g();

    void h();

    boolean isOpen();

    void l(String str);

    InterfaceC1161g r(String str);

    Cursor x(InterfaceC1160f interfaceC1160f, CancellationSignal cancellationSignal);

    boolean y();
}
