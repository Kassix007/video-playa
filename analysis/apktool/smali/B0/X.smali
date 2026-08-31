.class public final LB0/X;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:LB0/Y;

.field public final synthetic r:LB0/t0;

.field public final synthetic s:J


# direct methods
.method public constructor <init>(LB0/Y;LB0/t0;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LB0/X;->q:LB0/Y;

    .line 2
    .line 3
    iput-object p2, p0, LB0/X;->r:LB0/t0;

    .line 4
    .line 5
    iput-wide p3, p0, LB0/X;->s:J

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, LB0/X;->q:LB0/Y;

    .line 2
    .line 3
    iget-object v0, v0, LB0/Y;->v:LB0/P;

    .line 4
    .line 5
    iget-object v1, v0, LB0/P;->a:LB0/L;

    .line 6
    .line 7
    invoke-static {v1}, LB0/g;->q(LB0/L;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iget-boolean v1, v0, LB0/P;->c:Z

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, LB0/n0;->D:LB0/n0;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, LB0/n0;->z0()LB0/U;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget-object v2, v1, LB0/T;->y:Lz0/z;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v1, v1, LB0/n0;->D:LB0/n0;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object v2, v1, LB0/T;->y:Lz0/z;

    .line 44
    .line 45
    :cond_1
    :goto_0
    if-nez v2, :cond_2

    .line 46
    .line 47
    iget-object v1, p0, LB0/X;->r:LB0/t0;

    .line 48
    .line 49
    check-cast v1, LC0/A;

    .line 50
    .line 51
    invoke-virtual {v1}, LC0/A;->getPlacementScope()Lz0/I;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :cond_2
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, LB0/n0;->z0()LB0/U;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-wide v3, p0, LB0/X;->s:J

    .line 67
    .line 68
    invoke-static {v2, v0, v3, v4}, Lz0/I;->e(Lz0/I;Lz0/J;J)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 72
    .line 73
    return-object v0
.end method
