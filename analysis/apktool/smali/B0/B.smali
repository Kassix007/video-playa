.class public final LB0/B;
.super LB0/n0;
.source "SourceFile"


# static fields
.field public static final c0:LW1/d;


# instance fields
.field public a0:LB0/z;

.field public b0:LB0/A;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lj0/B;->f()LW1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-wide v1, Lj0/o;->e:J

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, LW1/d;->e(J)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, LW1/d;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/graphics/Paint;

    .line 13
    .line 14
    const/high16 v2, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, LW1/d;->j(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LB0/B;->c0:LW1/d;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(LB0/L;LB0/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LB0/n0;-><init>(LB0/L;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LB0/B;->a0:LB0/z;

    .line 5
    .line 6
    iget-object p1, p1, LB0/L;->x:LB0/L;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance p1, LB0/A;

    .line 11
    .line 12
    invoke-direct {p1, p0}, LB0/A;-><init>(LB0/B;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    iput-object p1, p0, LB0/B;->b0:LB0/A;

    .line 18
    .line 19
    check-cast p2, Lc0/l;

    .line 20
    .line 21
    iget-object p1, p2, Lc0/l;->q:Lc0/l;

    .line 22
    .line 23
    iget p1, p1, Lc0/l;->s:I

    .line 24
    .line 25
    and-int/lit16 p1, p1, 0x200

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p1
.end method


# virtual methods
.method public final B0()Lc0/l;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/B;->a0:LB0/z;

    .line 2
    .line 3
    check-cast v0, Lc0/l;

    .line 4
    .line 5
    iget-object v0, v0, Lc0/l;->q:Lc0/l;

    .line 6
    .line 7
    return-object v0
.end method

.method public final Q0(Lj0/m;Lm0/c;)V
    .locals 9

    .line 1
    iget-object v0, p0, LB0/n0;->C:LB0/n0;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, LB0/n0;->t0(Lj0/m;Lm0/c;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, LB0/n0;->B:LB0/L;

    .line 10
    .line 11
    invoke-static {p2}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, LC0/A;

    .line 16
    .line 17
    invoke-virtual {p2}, LC0/A;->getShowLayoutBounds()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    iget-wide v0, p0, Lz0/J;->s:J

    .line 24
    .line 25
    const/16 p2, 0x20

    .line 26
    .line 27
    shr-long v2, v0, p2

    .line 28
    .line 29
    long-to-int p2, v2

    .line 30
    int-to-float p2, p2

    .line 31
    const/high16 v2, 0x3f000000    # 0.5f

    .line 32
    .line 33
    sub-float v6, p2, v2

    .line 34
    .line 35
    const-wide v3, 0xffffffffL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v0, v3

    .line 41
    long-to-int p2, v0

    .line 42
    int-to-float p2, p2

    .line 43
    sub-float v7, p2, v2

    .line 44
    .line 45
    const/high16 v4, 0x3f000000    # 0.5f

    .line 46
    .line 47
    const/high16 v5, 0x3f000000    # 0.5f

    .line 48
    .line 49
    sget-object v8, LB0/B;->c0:LW1/d;

    .line 50
    .line 51
    move-object v3, p1

    .line 52
    invoke-interface/range {v3 .. v8}, Lj0/m;->j(FFFFLW1/d;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
.end method

.method public final U(JFLB5/c;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, LB0/n0;->R0(JFLB5/c;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, LB0/T;->w:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, LB0/n0;->O0()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, LB0/n0;->j0()Lz0/D;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Lz0/D;->d()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, LB0/n0;->C:LB0/n0;

    .line 20
    .line 21
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    return-void
.end method

.method public final X0(LB0/z;)V
    .locals 1

    .line 1
    iget-object v0, p0, LB0/B;->a0:LB0/z;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Lc0/l;

    .line 11
    .line 12
    iget-object v0, v0, Lc0/l;->q:Lc0/l;

    .line 13
    .line 14
    iget v0, v0, Lc0/l;->s:I

    .line 15
    .line 16
    and-int/lit16 v0, v0, 0x200

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    :goto_0
    iput-object p1, p0, LB0/B;->a0:LB0/z;

    .line 28
    .line 29
    return-void
.end method

.method public final Y(Lz0/l;)I
    .locals 1

    .line 1
    iget-object v0, p0, LB0/B;->b0:LB0/A;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, v0, LB0/U;->G:Lr/B;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lr/B;->d(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lr/B;->c:[I

    .line 14
    .line 15
    aget p1, v0, p1

    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    const/high16 p1, -0x80000000

    .line 19
    .line 20
    return p1

    .line 21
    :cond_1
    invoke-static {p0, p1}, LB0/g;->c(LB0/T;Lz0/l;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
.end method

.method public final a(J)Lz0/J;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lz0/J;->X(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LB0/B;->a0:LB0/z;

    .line 5
    .line 6
    iget-object v1, p0, LB0/n0;->C:LB0/n0;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0, v1, p1, p2}, LB0/z;->c(LB0/T;Lz0/B;J)Lz0/D;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, LB0/n0;->T0(Lz0/D;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LB0/n0;->N0()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public final v0()V
    .locals 1

    .line 1
    iget-object v0, p0, LB0/B;->b0:LB0/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LB0/A;

    .line 6
    .line 7
    invoke-direct {v0, p0}, LB0/A;-><init>(LB0/B;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LB0/B;->b0:LB0/A;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final z0()LB0/U;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/B;->b0:LB0/A;

    .line 2
    .line 3
    return-object v0
.end method
