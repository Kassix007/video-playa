package H1;

import C0.S;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DataInputStream f2075q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2076r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ByteOrder f2077s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte[] f2078t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f2079u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
        this.f2079u = bArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) throws IOException {
        int i7 = 0;
        while (i7 < i) {
            int i8 = i - i7;
            DataInputStream dataInputStream = this.f2075q;
            int iSkip = (int) dataInputStream.skip(i8);
            if (iSkip <= 0) {
                if (this.f2078t == null) {
                    this.f2078t = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f2078t, 0, Math.min(8192, i8));
                if (iSkip == -1) {
                    throw new EOFException(S.m("Reached EOF while skipping ", " bytes.", i));
                }
            }
            i7 += iSkip;
        }
        this.f2076r += i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int available() {
        return this.f2075q.available();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read() {
        this.f2076r++;
        return this.f2075q.read();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f2076r++;
        return this.f2075q.readBoolean();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f2076r++;
        int i = this.f2075q.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final char readChar() {
        this.f2076r += 2;
        return this.f2075q.readChar();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i7) throws IOException {
        this.f2076r += i7;
        this.f2075q.readFully(bArr, i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f2076r += 4;
        DataInputStream dataInputStream = this.f2075q;
        int i = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        if ((i | i7 | i8 | i9) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2077s;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i9 << 24) + (i8 << 16) + (i7 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 24) + (i7 << 16) + (i8 << 8) + i9;
        }
        throw new IOException("Invalid byte order: " + this.f2077s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j;
        long j7;
        this.f2076r += 8;
        DataInputStream dataInputStream = this.f2075q;
        int i = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        if ((i | i7 | i8 | i9 | i10 | i11 | i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2077s;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (((long) i13) << 56) + (((long) i12) << 48) + (((long) i11) << 40) + (((long) i10) << 32) + (((long) i9) << 24) + (((long) i8) << 16) + (((long) i7) << 8);
            j7 = i;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f2077s);
            }
            j = (((long) i) << 56) + (((long) i7) << 48) + (((long) i8) << 40) + (((long) i9) << 32) + (((long) i10) << 24) + (((long) i11) << 16) + (((long) i12) << 8);
            j7 = i13;
        }
        return j + j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f2076r += 2;
        DataInputStream dataInputStream = this.f2075q;
        int i = dataInputStream.read();
        int i7 = dataInputStream.read();
        if ((i | i7) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2077s;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i7 << 8) + i);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i << 8) + i7);
        }
        throw new IOException("Invalid byte order: " + this.f2077s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final String readUTF() {
        this.f2076r += 2;
        return this.f2075q.readUTF();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f2076r++;
        return this.f2075q.readUnsignedByte();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f2076r += 2;
        DataInputStream dataInputStream = this.f2075q;
        int i = dataInputStream.read();
        int i7 = dataInputStream.read();
        if ((i | i7) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2077s;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i7 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 8) + i7;
        }
        throw new IOException("Invalid byte order: " + this.f2077s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i7) throws IOException {
        int i8 = this.f2075q.read(bArr, i, i7);
        this.f2076r += i8;
        return i8;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f2076r += bArr.length;
        this.f2075q.readFully(bArr);
    }

    public b(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f2075q = dataInputStream;
        dataInputStream.mark(0);
        this.f2076r = 0;
        this.f2077s = byteOrder;
        this.f2079u = inputStream instanceof b ? ((b) inputStream).f2079u : -1;
    }
}
