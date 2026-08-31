.class public final LA/f0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:LA/g0;

.field public final synthetic r:I

.field public final synthetic s:Lz0/J;

.field public final synthetic t:I

.field public final synthetic u:LB0/T;


# direct methods
.method public constructor <init>(LA/g0;ILz0/J;ILB0/T;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA/f0;->q:LA/g0;

    .line 2
    .line 3
    iput p2, p0, LA/f0;->r:I

    .line 4
    .line 5
    iput-object p3, p0, LA/f0;->s:Lz0/J;

    .line 6
    .line 7
    iput p4, p0, LA/f0;->t:I

    .line 8
    .line 9
    iput-object p5, p0, LA/f0;->u:LB0/T;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Lz0/I;

    .line 2
    .line 3
    iget-object v0, p0, LA/f0;->q:LA/g0;

    .line 4
    .line 5
    iget-object v0, v0, LA/g0;->F:Lkotlin/jvm/internal/n;

    .line 6
    .line 7
    iget-object v1, p0, LA/f0;->s:Lz0/J;

    .line 8
    .line 9
    iget v2, v1, Lz0/J;->q:I

    .line 10
    .line 11
    iget v3, p0, LA/f0;->r:I

    .line 12
    .line 13
    sub-int/2addr v3, v2

    .line 14
    iget v2, p0, LA/f0;->t:I

    .line 15
    .line 16
    iget v4, v1, Lz0/J;->r:I

    .line 17
    .line 18
    sub-int/2addr v2, v4

    .line 19
    int-to-long v3, v3

    .line 20
    const/16 v5, 0x20

    .line 21
    .line 22
    shl-long/2addr v3, v5

    .line 23
    int-to-long v5, v2

    .line 24
    const-wide v7, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v5, v7

    .line 30
    or-long v2, v3, v5

    .line 31
    .line 32
    new-instance v4, LW0/k;

    .line 33
    .line 34
    invoke-direct {v4, v2, v3}, LW0/k;-><init>(J)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, LA/f0;->u:LB0/T;

    .line 38
    .line 39
    invoke-interface {v2}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v0, v4, v2}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, LW0/i;

    .line 48
    .line 49
    iget-wide v2, v0, LW0/i;->a:J

    .line 50
    .line 51
    invoke-static {p1, v1, v2, v3}, Lz0/I;->e(Lz0/I;Lz0/J;J)V

    .line 52
    .line 53
    .line 54
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 55
    .line 56
    return-object p1
.end method
