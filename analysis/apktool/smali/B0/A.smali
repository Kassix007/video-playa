.class public final LB0/A;
.super LB0/U;
.source "SourceFile"


# instance fields
.field public final synthetic H:LB0/B;


# direct methods
.method public constructor <init>(LB0/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB0/A;->H:LB0/B;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LB0/U;-><init>(LB0/n0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final Y(Lz0/l;)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, LB0/g;->c(LB0/T;Lz0/l;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LB0/U;->G:Lr/B;

    .line 6
    .line 7
    invoke-virtual {v1, v0, p1}, Lr/B;->g(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return v0
.end method

.method public final a(J)Lz0/J;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lz0/J;->X(J)V

    .line 2
    .line 3
    .line 4
    new-instance v0, LW0/a;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, LW0/a;-><init>(J)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LB0/A;->H:LB0/B;

    .line 10
    .line 11
    iget-object v1, v0, LB0/B;->a0:LB0/z;

    .line 12
    .line 13
    iget-object v0, v0, LB0/n0;->C:LB0/n0;

    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, LB0/n0;->z0()LB0/U;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v1, p0, v0, p1, p2}, LB0/z;->c(LB0/T;Lz0/B;J)Lz0/D;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p0, p1}, LB0/U;->p0(LB0/U;Lz0/D;)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method
