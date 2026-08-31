.class public final Lcom/google/android/gms/internal/vision/C;
.super Lcom/google/android/gms/internal/vision/e0;
.source "SourceFile"


# static fields
.field private static final zzh:Lcom/google/android/gms/internal/vision/C;

.field private static volatile zzi:Lcom/google/android/gms/internal/vision/H0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/vision/H0;"
        }
    .end annotation
.end field


# instance fields
.field private zzc:I

.field private zzd:Lcom/google/android/gms/internal/vision/j;

.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/vision/t;

.field private zzg:Lcom/google/android/gms/internal/vision/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/vision/C;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/vision/e0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/vision/C;->zzh:Lcom/google/android/gms/internal/vision/C;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/vision/C;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/vision/e0;->g(Ljava/lang/Class;Lcom/google/android/gms/internal/vision/e0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final e(I)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/vision/F;->a:[I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sub-int/2addr p1, v1

    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 13
    .line 14
    .line 15
    throw p1

    .line 16
    :pswitch_0
    const/4 p1, 0x0

    .line 17
    return-object p1

    .line 18
    :pswitch_1
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/vision/C;->zzi:Lcom/google/android/gms/internal/vision/H0;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    const-class v0, Lcom/google/android/gms/internal/vision/C;

    .line 28
    .line 29
    monitor-enter v0

    .line 30
    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/vision/C;->zzi:Lcom/google/android/gms/internal/vision/H0;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Lcom/google/android/gms/internal/vision/b0;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    sput-object p1, Lcom/google/android/gms/internal/vision/C;->zzi:Lcom/google/android/gms/internal/vision/H0;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    monitor-exit v0

    .line 45
    return-object p1

    .line 46
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw p1

    .line 48
    :cond_1
    return-object p1

    .line 49
    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/vision/C;->zzh:Lcom/google/android/gms/internal/vision/C;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_4
    const-string p1, "zzc"

    .line 53
    .line 54
    const-string v0, "zzd"

    .line 55
    .line 56
    const-string v1, "zze"

    .line 57
    .line 58
    const-string v2, "zzf"

    .line 59
    .line 60
    const-string v3, "zzg"

    .line 61
    .line 62
    filled-new-array {p1, v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-string v0, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1004\u0001\u0010\u1009\u0002\u0011\u1009\u0003"

    .line 67
    .line 68
    sget-object v1, Lcom/google/android/gms/internal/vision/C;->zzh:Lcom/google/android/gms/internal/vision/C;

    .line 69
    .line 70
    new-instance v2, Lcom/google/android/gms/internal/vision/J0;

    .line 71
    .line 72
    invoke-direct {v2, v1, v0, p1}, Lcom/google/android/gms/internal/vision/J0;-><init>(Lcom/google/android/gms/internal/vision/K;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object v2

    .line 76
    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/vision/g;

    .line 77
    .line 78
    sget-object v0, Lcom/google/android/gms/internal/vision/C;->zzh:Lcom/google/android/gms/internal/vision/C;

    .line 79
    .line 80
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/vision/c0;-><init>(Lcom/google/android/gms/internal/vision/e0;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/vision/C;

    .line 85
    .line 86
    invoke-direct {p1}, Lcom/google/android/gms/internal/vision/e0;-><init>()V

    .line 87
    .line 88
    .line 89
    return-object p1

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
