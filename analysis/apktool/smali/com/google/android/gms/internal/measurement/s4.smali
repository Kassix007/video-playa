.class public final Lcom/google/android/gms/internal/measurement/s4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/r4;


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/T1;

.field public static final b:Lcom/google/android/gms/internal/measurement/T1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/S1;->a()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lc4/c;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v0, v2, v2}, Lc4/c;-><init>(Landroid/net/Uri;ZZ)V

    .line 9
    .line 10
    .line 11
    const-string v0, "measurement.tcf.consent_fix"

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v1, v0, v3}, Lc4/c;->e(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/T1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lcom/google/android/gms/internal/measurement/s4;->a:Lcom/google/android/gms/internal/measurement/T1;

    .line 19
    .line 20
    const-string v0, "measurement.tcf.client"

    .line 21
    .line 22
    invoke-virtual {v1, v0, v2}, Lc4/c;->e(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/T1;

    .line 23
    .line 24
    .line 25
    const-string v0, "measurement.tcf.empty_pref_fix"

    .line 26
    .line 27
    invoke-virtual {v1, v0, v2}, Lc4/c;->e(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/T1;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lcom/google/android/gms/internal/measurement/s4;->b:Lcom/google/android/gms/internal/measurement/T1;

    .line 32
    .line 33
    const-string v0, "measurement.id.tcf"

    .line 34
    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    invoke-virtual {v1, v0, v2, v3}, Lc4/c;->d(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/T1;

    .line 38
    .line 39
    .line 40
    return-void
.end method
