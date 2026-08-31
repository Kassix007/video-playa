package E1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import x3.C1899k;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Spannable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1623q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Spannable f1624r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(Spannable spannable) {
        this.f1624r = spannable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        Spannable spannable = this.f1624r;
        if (!this.f1623q) {
            if ((Build.VERSION.SDK_INT < 28 ? new C1899k(4) : new C(4)).h(spannable)) {
                this.f1624r = new SpannableString(spannable);
            }
        }
        this.f1623q = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f1624r.charAt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1624r.chars();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1624r.codePoints();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1624r.getSpanEnd(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1624r.getSpanFlags(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1624r.getSpanStart(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i7, Class cls) {
        return this.f1624r.getSpans(i, i7, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1624r.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i7, Class cls) {
        return this.f1624r.nextSpanTransition(i, i7, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f1624r.removeSpan(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i7, int i8) {
        a();
        this.f1624r.setSpan(obj, i, i7, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i7) {
        return this.f1624r.subSequence(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1624r.toString();
    }
}
