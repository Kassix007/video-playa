.class public final Lz3/b;
.super Lu3/d;
.source "SourceFile"


# static fields
.field public static final k:LZ/m;


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
    const/4 v2, 0x3

    .line 9
    invoke-direct {v1, v2}, LQ3/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v2, LZ/m;

    .line 13
    .line 14
    const-string v3, "ClientTelemetry.API"

    .line 15
    .line 16
    invoke-direct {v2, v3, v1, v0}, LZ/m;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/K1;Lr6/f;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lz3/b;->k:LZ/m;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final b(Lx3/m;)LS3/k;
    .locals 5

    .line 1
    new-instance v0, Li1/a;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li1/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, LI3/c;->a:Lcom/google/android/gms/common/d;

    .line 9
    .line 10
    filled-new-array {v1}, [Lcom/google/android/gms/common/d;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Li3/a;

    .line 15
    .line 16
    const/16 v3, 0x15

    .line 17
    .line 18
    invoke-direct {v2, v3, p1}, Li3/a;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object v2, v0, Li1/a;->r:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance p1, Lcom/google/android/gms/internal/measurement/O1;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {p1, v0, v1, v2}, Lcom/google/android/gms/internal/measurement/O1;-><init>(Li1/a;[Lcom/google/android/gms/common/d;Z)V

    .line 27
    .line 28
    .line 29
    new-instance v0, LS3/e;

    .line 30
    .line 31
    invoke-direct {v0}, LS3/e;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lu3/d;->j:Lv3/e;

    .line 35
    .line 36
    iget-object v2, v1, Lv3/e;->m:LI3/e;

    .line 37
    .line 38
    new-instance v3, Lv3/z;

    .line 39
    .line 40
    iget-object v4, p0, Lu3/d;->i:Lr6/f;

    .line 41
    .line 42
    invoke-direct {v3, p1, v0, v4}, Lv3/z;-><init>(Lcom/google/android/gms/internal/measurement/O1;LS3/e;Lr6/f;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, v1, Lv3/e;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 46
    .line 47
    new-instance v1, Lv3/w;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-direct {v1, v3, p1, p0}, Lv3/w;-><init>(Lv3/B;ILu3/d;)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x4

    .line 57
    invoke-virtual {v2, p1, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 62
    .line 63
    .line 64
    iget-object p1, v0, LS3/e;->a:LS3/k;

    .line 65
    .line 66
    return-object p1
.end method
