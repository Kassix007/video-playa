.class public final LF/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx3/d;


# instance fields
.field public q:Z

.field public final r:Ljava/lang/Object;

.field public final s:Ljava/lang/Object;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public final v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IFLF/N;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p3, p0, LF/D;->r:Ljava/lang/Object;

    .line 4
    new-instance p3, LP/c0;

    invoke-direct {p3, p1}, LP/c0;-><init>(I)V

    .line 5
    iput-object p3, p0, LF/D;->s:Ljava/lang/Object;

    .line 6
    new-instance p3, LP/b0;

    invoke-direct {p3, p2}, LP/b0;-><init>(F)V

    .line 7
    iput-object p3, p0, LF/D;->t:Ljava/lang/Object;

    .line 8
    new-instance p2, LE/F;

    const/16 p3, 0x1e

    const/16 v0, 0x64

    invoke-direct {p2, p1, p3, v0}, LE/F;-><init>(III)V

    iput-object p2, p0, LF/D;->v:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv3/e;Lu3/b;Lv3/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/D;->v:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, LF/D;->t:Ljava/lang/Object;

    iput-object p1, p0, LF/D;->u:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, LF/D;->q:Z

    iput-object p2, p0, LF/D;->r:Ljava/lang/Object;

    iput-object p3, p0, LF/D;->s:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LF/D;->v:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv3/e;

    .line 4
    .line 5
    iget-object v0, v0, Lv3/e;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    iget-object v1, p0, LF/D;->s:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lv3/a;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lv3/o;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lv3/o;->m(Lcom/google/android/gms/common/b;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public c(Lcom/google/android/gms/common/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, LF/D;->v:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv3/e;

    .line 4
    .line 5
    iget-object v0, v0, Lv3/e;->m:LI3/e;

    .line 6
    .line 7
    new-instance v1, Lv3/q;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, p1, v2}, Lv3/q;-><init>(Ljava/lang/Object;Ly3/a;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method
