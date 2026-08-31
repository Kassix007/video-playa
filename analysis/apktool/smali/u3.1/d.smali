.class public abstract Lu3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:LZ/m;

.field public final d:Lu3/a;

.field public final e:Lv3/a;

.field public final f:Landroid/os/Looper;

.field public final g:I

.field public final h:Lv3/r;

.field public final i:Lr6/f;

.field public final j:Lv3/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;LZ/m;Lx3/n;Lu3/c;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Null context is not permitted."

    .line 5
    .line 6
    invoke-static {p1, v0}, Lx3/A;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "Api must not be null."

    .line 10
    .line 11
    invoke-static {p2, v0}, Lx3/A;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 15
    .line 16
    invoke-static {p4, v0}, Lx3/A;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "The provided context did not have an application context."

    .line 24
    .line 25
    invoke-static {v0, v1}, Lx3/A;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lu3/d;->a:Landroid/content/Context;

    .line 29
    .line 30
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v2, 0x1e

    .line 33
    .line 34
    if-lt v1, v2, :cond_0

    .line 35
    .line 36
    invoke-static {p1}, LC0/D0;->l(Landroid/content/Context;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    :goto_0
    iput-object p1, p0, Lu3/d;->b:Ljava/lang/String;

    .line 43
    .line 44
    iput-object p2, p0, Lu3/d;->c:LZ/m;

    .line 45
    .line 46
    iput-object p3, p0, Lu3/d;->d:Lu3/a;

    .line 47
    .line 48
    iget-object v1, p4, Lu3/c;->b:Landroid/os/Looper;

    .line 49
    .line 50
    iput-object v1, p0, Lu3/d;->f:Landroid/os/Looper;

    .line 51
    .line 52
    new-instance v1, Lv3/a;

    .line 53
    .line 54
    invoke-direct {v1, p2, p3, p1}, Lv3/a;-><init>(LZ/m;Lu3/a;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, Lu3/d;->e:Lv3/a;

    .line 58
    .line 59
    new-instance p1, Lv3/r;

    .line 60
    .line 61
    invoke-direct {p1, p0}, Lv3/r;-><init>(Lu3/d;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lu3/d;->h:Lv3/r;

    .line 65
    .line 66
    invoke-static {v0}, Lv3/e;->e(Landroid/content/Context;)Lv3/e;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lu3/d;->j:Lv3/e;

    .line 71
    .line 72
    iget-object p2, p1, Lv3/e;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    iput p2, p0, Lu3/d;->g:I

    .line 79
    .line 80
    iget-object p2, p4, Lu3/c;->a:Lr6/f;

    .line 81
    .line 82
    iput-object p2, p0, Lu3/d;->i:Lr6/f;

    .line 83
    .line 84
    iget-object p1, p1, Lv3/e;->m:LI3/e;

    .line 85
    .line 86
    const/4 p2, 0x7

    .line 87
    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 92
    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public final a()Lt2/e;
    .locals 4

    .line 1
    new-instance v0, Lt2/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 7
    .line 8
    iget-object v2, v0, Lt2/e;->q:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lr/f;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lr/f;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, v3}, Lr/f;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v2, v0, Lt2/e;->q:Ljava/lang/Object;

    .line 21
    .line 22
    :cond_0
    iget-object v2, v0, Lt2/e;->q:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Lr/f;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Lr/f;->addAll(Ljava/util/Collection;)Z

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lu3/d;->a:Landroid/content/Context;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iput-object v2, v0, Lt2/e;->s:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, v0, Lt2/e;->r:Ljava/lang/Object;

    .line 46
    .line 47
    return-object v0
.end method
