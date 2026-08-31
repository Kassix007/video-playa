.class public final Lcom/google/android/gms/internal/clearcut/v0;
.super Lcom/google/android/gms/common/api/internal/BasePendingResult;


# instance fields
.field public final h:Lt3/c;


# direct methods
.method public constructor <init>(Lt3/c;Lv3/r;)V
    .locals 1

    .line 1
    const-string v0, "GoogleApiClient must not be null"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lx3/A;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(Lu3/g;)V

    .line 7
    .line 8
    .line 9
    const-string p2, "Api must not be null"

    .line 10
    .line 11
    sget-object v0, Lt3/a;->j:LZ/m;

    .line 12
    .line 13
    invoke-static {v0, p2}, Lx3/A;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/google/android/gms/internal/clearcut/v0;->h:Lt3/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final B0(Lu3/b;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/clearcut/v0;->h:Lt3/c;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/gms/internal/clearcut/z0;

    .line 4
    .line 5
    new-instance v1, Lcom/google/android/gms/internal/clearcut/y0;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/clearcut/y0;-><init>(Lcom/google/android/gms/internal/clearcut/v0;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v3, v0, Lt3/c;->y:Lcom/google/android/gms/internal/clearcut/w0;

    .line 15
    .line 16
    invoke-virtual {v3}, Lcom/google/android/gms/internal/clearcut/n0;->c()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    new-array v5, v4, [B

    .line 21
    .line 22
    invoke-static {v3, v5, v4}, Lcom/google/android/gms/internal/clearcut/n0;->a(Lcom/google/android/gms/internal/clearcut/n0;[BI)V

    .line 23
    .line 24
    .line 25
    iput-object v5, v0, Lt3/c;->r:[B
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    invoke-virtual {p1}, Lx3/e;->t()Landroid/os/IInterface;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lcom/google/android/gms/internal/clearcut/A0;

    .line 32
    .line 33
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-string v4, "com.google.android.gms.clearcut.internal.IClearcutLoggerService"

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sget v4, Lcom/google/android/gms/internal/clearcut/r;->a:I

    .line 43
    .line 44
    invoke-virtual {v3, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-virtual {v3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 49
    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-virtual {v0, v3, v4}, Lt3/c;->writeToParcel(Landroid/os/Parcel;I)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    iget-object p1, p1, Lcom/google/android/gms/internal/clearcut/A0;->c:Landroid/os/IBinder;

    .line 56
    .line 57
    invoke-interface {p1, v1, v3, v2, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :catch_0
    move-exception p1

    .line 70
    const-string v0, "ClearcutLoggerApiImpl"

    .line 71
    .line 72
    const-string v1, "derived ClearcutLogger.MessageProducer "

    .line 73
    .line 74
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 75
    .line 76
    .line 77
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 78
    .line 79
    const/16 v0, 0xa

    .line 80
    .line 81
    const-string v1, "MessageProducer"

    .line 82
    .line 83
    invoke-direct {p1, v0, v1, v2, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/b;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/clearcut/v0;->C0(Lcom/google/android/gms/common/api/Status;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final C0(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 1
    iget v0, p1, Lcom/google/android/gms/common/api/Status;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-gtz v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    xor-int/2addr v0, v1

    .line 10
    const-string v1, "Failed result must not be success"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lx3/A;->b(ZLjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->A0(Lu3/h;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final synthetic x0(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    .line 1
    return-object p1
.end method
