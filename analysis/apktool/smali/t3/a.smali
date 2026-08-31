.class public final Lt3/a;
.super Ljava/lang/Object;


# static fields
.field public static final j:LZ/m;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Lcom/google/android/gms/internal/clearcut/p0;

.field public final g:Lcom/google/android/gms/internal/clearcut/U;

.field public final h:LB3/a;

.field public final i:Lcom/google/android/gms/internal/clearcut/B0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lr6/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LQ3/b;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-direct {v1, v2}, LQ3/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v2, LZ/m;

    .line 13
    .line 14
    const-string v3, "ClearcutLogger.API"

    .line 15
    .line 16
    invoke-direct {v2, v3, v1, v0}, LZ/m;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/K1;Lr6/f;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lt3/a;->j:LZ/m;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/clearcut/U;

    .line 2
    .line 3
    new-instance v1, Lr6/f;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    new-instance v3, Lu3/c;

    .line 13
    .line 14
    invoke-direct {v3, v1, v2}, Lu3/c;-><init>(Lr6/f;Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sget-object v1, Lt3/a;->j:LZ/m;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, p1, v1, v2, v3}, Lu3/d;-><init>(Landroid/content/Context;LZ/m;Lx3/n;Lu3/c;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lcom/google/android/gms/internal/clearcut/B0;

    .line 24
    .line 25
    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/clearcut/B0;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    const/4 v2, -0x1

    .line 32
    iput v2, p0, Lt3/a;->e:I

    .line 33
    .line 34
    sget-object v3, Lcom/google/android/gms/internal/clearcut/p0;->r:Lcom/google/android/gms/internal/clearcut/p0;

    .line 35
    .line 36
    iput-object v3, p0, Lt3/a;->f:Lcom/google/android/gms/internal/clearcut/p0;

    .line 37
    .line 38
    iput-object p1, p0, Lt3/a;->a:Landroid/content/Context;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    iput-object v4, p0, Lt3/a;->b:Ljava/lang/String;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v5, p1, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget v4, p1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    move-exception p1

    .line 63
    const-string v5, "ClearcutLogger"

    .line 64
    .line 65
    const-string v6, "This can\'t happen."

    .line 66
    .line 67
    invoke-static {v5, v6, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 68
    .line 69
    .line 70
    :goto_0
    iput v4, p0, Lt3/a;->c:I

    .line 71
    .line 72
    iput v2, p0, Lt3/a;->e:I

    .line 73
    .line 74
    const-string p1, "VISION"

    .line 75
    .line 76
    iput-object p1, p0, Lt3/a;->d:Ljava/lang/String;

    .line 77
    .line 78
    iput-object v0, p0, Lt3/a;->g:Lcom/google/android/gms/internal/clearcut/U;

    .line 79
    .line 80
    sget-object p1, LB3/a;->a:LB3/a;

    .line 81
    .line 82
    iput-object p1, p0, Lt3/a;->h:LB3/a;

    .line 83
    .line 84
    iput-object v3, p0, Lt3/a;->f:Lcom/google/android/gms/internal/clearcut/p0;

    .line 85
    .line 86
    iput-object v1, p0, Lt3/a;->i:Lcom/google/android/gms/internal/clearcut/B0;

    .line 87
    .line 88
    return-void
.end method
