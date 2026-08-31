package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Comparable, Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new p(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Calendar f11534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f11535r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11536s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f11537t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f11538u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f11539v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f11540w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = y.a(calendar);
        this.f11534q = calendarA;
        this.f11535r = calendarA.get(2);
        this.f11536s = calendarA.get(1);
        this.f11537t = calendarA.getMaximum(7);
        this.f11538u = calendarA.getActualMaximum(5);
        this.f11539v = calendarA.getTimeInMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static q a(int i, int i7) {
        Calendar calendarC = y.c(null);
        calendarC.set(1, i);
        calendarC.set(2, i7);
        return new q(calendarC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static q b(long j) {
        Calendar calendarC = y.c(null);
        calendarC.setTimeInMillis(j);
        return new q(calendarC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String c() {
        if (this.f11540w == null) {
            long timeInMillis = this.f11534q.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = y.f11555a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f11540w = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f11540w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11534q.compareTo(((q) obj).f11534q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(q qVar) {
        if (!(this.f11534q instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (qVar.f11535r - this.f11535r) + ((qVar.f11536s - this.f11536s) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f11535r == qVar.f11535r && this.f11536s == qVar.f11536s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11535r), Integer.valueOf(this.f11536s)});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11536s);
        parcel.writeInt(this.f11535r);
    }
}
