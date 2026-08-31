.class public final Lj0/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW0/c;


# instance fields
.field public A:Z

.field public B:J

.field public C:LW0/c;

.field public D:LW0/l;

.field public E:Lj0/B;

.field public q:I

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:J

.field public w:J

.field public x:F

.field public y:J

.field public z:Lj0/E;


# virtual methods
.method public final a(F)V
    .locals 1

    .line 1
    iget v0, p0, Lj0/C;->t:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lj0/C;->q:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    iput v0, p0, Lj0/C;->q:I

    .line 13
    .line 14
    iput p1, p0, Lj0/C;->t:F

    .line 15
    .line 16
    return-void
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Lj0/C;->C:LW0/c;

    .line 2
    .line 3
    invoke-interface {v0}, LW0/c;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c(F)V
    .locals 1

    .line 1
    iget v0, p0, Lj0/C;->r:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lj0/C;->q:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Lj0/C;->q:I

    .line 13
    .line 14
    iput p1, p0, Lj0/C;->r:F

    .line 15
    .line 16
    return-void
.end method

.method public final e(F)V
    .locals 1

    .line 1
    iget v0, p0, Lj0/C;->s:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lj0/C;->q:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    iput v0, p0, Lj0/C;->q:I

    .line 13
    .line 14
    iput p1, p0, Lj0/C;->s:F

    .line 15
    .line 16
    return-void
.end method

.method public final g(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lj0/C;->y:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lj0/H;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lj0/C;->q:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x1000

    .line 12
    .line 13
    iput v0, p0, Lj0/C;->q:I

    .line 14
    .line 15
    iput-wide p1, p0, Lj0/C;->y:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final l()F
    .locals 1

    .line 1
    iget-object v0, p0, Lj0/C;->C:LW0/c;

    .line 2
    .line 3
    invoke-interface {v0}, LW0/c;->l()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
