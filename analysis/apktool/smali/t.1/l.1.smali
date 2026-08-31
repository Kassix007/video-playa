.class public final Lt/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/q0;


# instance fields
.field public final a:Lu/v0;

.field public b:Lc0/e;

.field public final c:LP/f0;

.field public final d:Lr/G;


# direct methods
.method public constructor <init>(Lu/v0;Lc0/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt/l;->a:Lu/v0;

    .line 5
    .line 6
    iput-object p2, p0, Lt/l;->b:Lc0/e;

    .line 7
    .line 8
    new-instance p1, LW0/k;

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    invoke-direct {p1, v0, v1}, LW0/k;-><init>(J)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lt/l;->c:LP/f0;

    .line 20
    .line 21
    sget-object p1, Lr/O;->a:[J

    .line 22
    .line 23
    new-instance p1, Lr/G;

    .line 24
    .line 25
    invoke-direct {p1}, Lr/G;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lt/l;->d:Lr/G;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt/l;->a:Lu/v0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu/v0;->f()Lu/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lu/q0;->a()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt/l;->a:Lu/v0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu/v0;->f()Lu/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lu/q0;->c()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
