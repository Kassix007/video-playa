package q6;

import C0.S;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: renamed from: q6.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1541j implements Serializable, Comparable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1541j f16064t = new C1541j(new byte[0]);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte[] f16065q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public transient int f16066r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient String f16067s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1541j(byte[] data) {
        kotlin.jvm.internal.m.e(data, "data");
        this.f16065q = data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int f(C1541j c1541j, C1541j other) {
        c1541j.getClass();
        kotlin.jvm.internal.m.e(other, "other");
        return c1541j.e(0, other.g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int j(C1541j c1541j, C1541j other) {
        c1541j.getClass();
        kotlin.jvm.internal.m.e(other, "other");
        return c1541j.i(other.g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ C1541j n(C1541j c1541j, int i, int i7, int i8) {
        if ((i8 & 1) != 0) {
            i = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = -1234567890;
        }
        return c1541j.m(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1541j other) {
        kotlin.jvm.internal.m.e(other, "other");
        int iC = c();
        int iC2 = other.c();
        int iMin = Math.min(iC, iC2);
        for (int i = 0; i < iMin; i++) {
            int iH = h(i) & 255;
            int iH2 = other.h(i) & 255;
            if (iH != iH2) {
                return iH < iH2 ? -1 : 1;
            }
        }
        if (iC == iC2) {
            return 0;
        }
        return iC < iC2 ? -1 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1541j b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f16065q, 0, c());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.m.b(bArrDigest);
        return new C1541j(bArrDigest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int c() {
        return this.f16065q.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String d() {
        byte[] bArr = this.f16065q;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b7 : bArr) {
            int i7 = i + 1;
            char[] cArr2 = r6.b.f16368a;
            cArr[i] = cArr2[(b7 >> 4) & 15];
            i += 2;
            cArr[i7] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int e(int i, byte[] other) {
        kotlin.jvm.internal.m.e(other, "other");
        byte[] bArr = this.f16065q;
        int length = bArr.length - other.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!Q2.g.l(iMax, 0, other.length, bArr, other)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1541j) {
            C1541j c1541j = (C1541j) obj;
            int iC = c1541j.c();
            byte[] bArr = this.f16065q;
            if (iC == bArr.length && c1541j.l(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] g() {
        return this.f16065q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte h(int i) {
        return this.f16065q[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int i = this.f16066r;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f16065q);
        this.f16066r = iHashCode;
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int i(byte[] other) {
        kotlin.jvm.internal.m.e(other, "other");
        int iC = c();
        byte[] bArr = this.f16065q;
        for (int iMin = Math.min(iC, bArr.length - other.length); -1 < iMin; iMin--) {
            if (Q2.g.l(iMin, 0, other.length, bArr, other)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean k(int i, C1541j other, int i7) {
        kotlin.jvm.internal.m.e(other, "other");
        return other.l(0, this.f16065q, i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean l(int i, byte[] other, int i7, int i8) {
        kotlin.jvm.internal.m.e(other, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr = this.f16065q;
        return i <= bArr.length - i8 && i7 >= 0 && i7 <= other.length - i8 && Q2.g.l(i, i7, i8, bArr, other);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1541j m(int i, int i7) {
        if (i7 == -1234567890) {
            i7 = c();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f16065q;
        if (i7 > bArr.length) {
            throw new IllegalArgumentException(S.o(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i7 - i >= 0) {
            return (i == 0 && i7 == bArr.length) ? this : new C1541j(n5.k.H0(bArr, i, i7));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1541j o() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f16065q;
            if (i >= bArr.length) {
                return this;
            }
            byte b7 = bArr[i];
            if (b7 >= 65 && b7 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b7 + 32);
                for (int i7 = i + 1; i7 < bArrCopyOf.length; i7++) {
                    byte b8 = bArrCopyOf[i7];
                    if (b8 >= 65 && b8 <= 90) {
                        bArrCopyOf[i7] = (byte) (b8 + 32);
                    }
                }
                return new C1541j(bArrCopyOf);
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String p() {
        String str = this.f16067s;
        if (str != null) {
            return str;
        }
        byte[] bArrG = g();
        kotlin.jvm.internal.m.e(bArrG, "<this>");
        String str2 = new String(bArrG, J5.a.f2809a);
        this.f16067s = str2;
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void q(C1538g c1538g, int i) {
        c1538g.b0(i, this.f16065q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        byte b7;
        int i;
        byte[] bArr = this.f16065q;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        loop0: while (true) {
            if (i7 >= length) {
                break;
            }
            byte b8 = bArr[i7];
            if (b8 >= 0) {
                int i10 = i9 + 1;
                if (i9 == 64) {
                    break;
                }
                if ((b8 != 10 && b8 != 13 && ((b8 >= 0 && b8 < 32) || (127 <= b8 && b8 < 160))) || b8 == 65533) {
                    break;
                }
                i8 += b8 < 65536 ? 1 : 2;
                i7++;
                while (true) {
                    i9 = i10;
                    if (i7 < length && (b7 = bArr[i7]) >= 0) {
                        i7++;
                        i10 = i9 + 1;
                        if (i9 == 64) {
                            break loop0;
                        }
                        if ((b7 != 10 && b7 != 13 && ((b7 >= 0 && b7 < 32) || (127 <= b7 && b7 < 160))) || b7 == 65533) {
                            break loop0;
                        }
                        i8 += b7 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b8 >> 5) == -2) {
                int i11 = i7 + 1;
                if (length > i11) {
                    byte b9 = bArr[i11];
                    if ((b9 & 192) == 128) {
                        int i12 = (b9 ^ 3968) ^ (b8 << 6);
                        if (i12 >= 128) {
                            i = i9 + 1;
                            if (i9 == 64) {
                                break;
                            }
                            if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                break;
                            }
                            i8 += i12 < 65536 ? 1 : 2;
                            i7 += 2;
                            i9 = i;
                        } else if (i9 != 64) {
                            break;
                        }
                    } else if (i9 != 64) {
                        break;
                    }
                } else if (i9 != 64) {
                    break;
                }
            } else if ((b8 >> 4) == -2) {
                int i13 = i7 + 2;
                if (length > i13) {
                    byte b10 = bArr[i7 + 1];
                    if ((b10 & 192) == 128) {
                        byte b11 = bArr[i13];
                        if ((b11 & 192) == 128) {
                            int i14 = ((b11 ^ (-123008)) ^ (b10 << 6)) ^ (b8 << 12);
                            if (i14 < 2048) {
                                if (i9 != 64) {
                                    break;
                                }
                            } else if (55296 > i14 || i14 >= 57344) {
                                i = i9 + 1;
                                if (i9 == 64) {
                                    break;
                                }
                                if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                    break;
                                }
                                i8 += i14 < 65536 ? 1 : 2;
                                i7 += 3;
                                i9 = i;
                            } else if (i9 != 64) {
                                break;
                            }
                        } else if (i9 != 64) {
                            break;
                        }
                    } else if (i9 != 64) {
                        break;
                    }
                } else if (i9 != 64) {
                    break;
                }
            } else if ((b8 >> 3) == -2) {
                int i15 = i7 + 3;
                if (length > i15) {
                    byte b12 = bArr[i7 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i7 + 2];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i15];
                            if ((b14 & 192) == 128) {
                                int i16 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b8 << 18);
                                if (i16 > 1114111) {
                                    if (i9 != 64) {
                                        break;
                                    }
                                } else if (55296 > i16 || i16 >= 57344) {
                                    if (i16 >= 65536) {
                                        i = i9 + 1;
                                        if (i9 == 64) {
                                            break;
                                        }
                                        if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                            break;
                                        }
                                        i8 += i16 < 65536 ? 1 : 2;
                                        i7 += 4;
                                        i9 = i;
                                    } else if (i9 != 64) {
                                        break;
                                    }
                                } else if (i9 != 64) {
                                    break;
                                }
                            } else if (i9 != 64) {
                                break;
                            }
                        } else if (i9 != 64) {
                            break;
                        }
                    } else if (i9 != 64) {
                        break;
                    }
                } else if (i9 != 64) {
                    break;
                }
            } else if (i9 != 64) {
                break;
            }
        }
        i8 = -1;
        if (i8 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + d() + ']';
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(bArr.length);
            sb.append(" hex=");
            if (64 > bArr.length) {
                throw new IllegalArgumentException(S.o(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
            }
            sb.append((64 == bArr.length ? this : new C1541j(n5.k.H0(bArr, 0, 64))).d());
            sb.append("…]");
            return sb.toString();
        }
        String strP = p();
        String strSubstring = strP.substring(0, i8);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        String strE0 = J5.t.E0(J5.t.E0(J5.t.E0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i8 >= strP.length()) {
            return "[text=" + strE0 + ']';
        }
        return "[size=" + bArr.length + " text=" + strE0 + "…]";
    }
}
