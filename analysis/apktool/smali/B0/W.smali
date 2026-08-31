.class public final LB0/W;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:LB0/Y;

.field public final synthetic r:J


# direct methods
.method public constructor <init>(LB0/Y;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LB0/W;->q:LB0/Y;

    .line 2
    .line 3
    iput-wide p2, p0, LB0/W;->r:J

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LB0/W;->q:LB0/Y;

    .line 2
    .line 3
    iget-object v0, v0, LB0/Y;->v:LB0/P;

    .line 4
    .line 5
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LB0/n0;->z0()LB0/U;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-wide v1, p0, LB0/W;->r:J

    .line 17
    .line 18
    invoke-interface {v0, v1, v2}, Lz0/B;->a(J)Lz0/J;

    .line 19
    .line 20
    .line 21
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 22
    .line 23
    return-object v0
.end method
