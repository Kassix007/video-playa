.class public final La0/p;
.super La0/w;
.source "SourceFile"


# instance fields
.field public c:LT/c;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(JLT/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, La0/w;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La0/p;->c:LT/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La0/w;)V
    .locals 2

    .line 1
    sget-object v0, La0/r;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>"

    .line 5
    .line 6
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    move-object v1, p1

    .line 10
    check-cast v1, La0/p;

    .line 11
    .line 12
    iget-object v1, v1, La0/p;->c:LT/c;

    .line 13
    .line 14
    iput-object v1, p0, La0/p;->c:LT/c;

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    check-cast v1, La0/p;

    .line 18
    .line 19
    iget v1, v1, La0/p;->d:I

    .line 20
    .line 21
    iput v1, p0, La0/p;->d:I

    .line 22
    .line 23
    check-cast p1, La0/p;

    .line 24
    .line 25
    iget p1, p1, La0/p;->e:I

    .line 26
    .line 27
    iput p1, p0, La0/p;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    monitor-exit v0

    .line 33
    throw p1
.end method

.method public final b(J)La0/w;
    .locals 2

    .line 1
    new-instance v0, La0/p;

    .line 2
    .line 3
    iget-object v1, p0, La0/p;->c:LT/c;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, v1}, La0/p;-><init>(JLT/c;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
