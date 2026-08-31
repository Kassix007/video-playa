.class public final LD/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE/B;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:I

.field public final d:LW0/l;

.field public final e:Ljava/util/List;

.field public final f:J

.field public final g:Ljava/lang/Object;

.field public final h:Landroidx/compose/foundation/lazy/layout/b;

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public m:I

.field public final n:J

.field public o:J

.field public p:I

.field public q:I

.field public r:Z


# direct methods
.method public constructor <init>(ILjava/lang/Object;IILW0/l;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/b;JII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LD/p;->a:I

    .line 5
    .line 6
    iput-object p2, p0, LD/p;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, LD/p;->c:I

    .line 9
    .line 10
    iput-object p5, p0, LD/p;->d:LW0/l;

    .line 11
    .line 12
    iput-object p8, p0, LD/p;->e:Ljava/util/List;

    .line 13
    .line 14
    iput-wide p9, p0, LD/p;->f:J

    .line 15
    .line 16
    iput-object p11, p0, LD/p;->g:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p12, p0, LD/p;->h:Landroidx/compose/foundation/lazy/layout/b;

    .line 19
    .line 20
    iput p15, p0, LD/p;->i:I

    .line 21
    .line 22
    move/from16 p1, p16

    .line 23
    .line 24
    iput p1, p0, LD/p;->j:I

    .line 25
    .line 26
    const/high16 p1, -0x80000000

    .line 27
    .line 28
    iput p1, p0, LD/p;->m:I

    .line 29
    .line 30
    move-object p1, p8

    .line 31
    check-cast p1, Ljava/util/Collection;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/4 p2, 0x0

    .line 38
    move p3, p2

    .line 39
    move p5, p3

    .line 40
    :goto_0
    if-ge p3, p1, :cond_0

    .line 41
    .line 42
    invoke-interface {p8, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p6

    .line 46
    check-cast p6, Lz0/J;

    .line 47
    .line 48
    iget p6, p6, Lz0/J;->r:I

    .line 49
    .line 50
    invoke-static {p5, p6}, Ljava/lang/Math;->max(II)I

    .line 51
    .line 52
    .line 53
    move-result p5

    .line 54
    add-int/lit8 p3, p3, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iput p5, p0, LD/p;->k:I

    .line 58
    .line 59
    add-int/2addr p4, p5

    .line 60
    if-gez p4, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move p2, p4

    .line 64
    :goto_1
    iput p2, p0, LD/p;->l:I

    .line 65
    .line 66
    iget p1, p0, LD/p;->c:I

    .line 67
    .line 68
    int-to-long p1, p1

    .line 69
    const/16 p3, 0x20

    .line 70
    .line 71
    shl-long/2addr p1, p3

    .line 72
    int-to-long p3, p5

    .line 73
    const-wide p5, 0xffffffffL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    and-long/2addr p3, p5

    .line 79
    or-long/2addr p1, p3

    .line 80
    iput-wide p1, p0, LD/p;->n:J

    .line 81
    .line 82
    const-wide/16 p1, 0x0

    .line 83
    .line 84
    iput-wide p1, p0, LD/p;->o:J

    .line 85
    .line 86
    const/4 p1, -0x1

    .line 87
    iput p1, p0, LD/p;->p:I

    .line 88
    .line 89
    iput p1, p0, LD/p;->q:I

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final a(Lz0/I;)V
    .locals 8

    .line 1
    iget v0, p0, LD/p;->m:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "position() should be called first"

    .line 9
    .line 10
    invoke-static {v0}, Lz/a;->a(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iget-object v0, p0, LD/p;->e:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_1
    if-ge v2, v1, :cond_1

    .line 21
    .line 22
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lz0/J;

    .line 27
    .line 28
    iget v4, v3, Lz0/J;->r:I

    .line 29
    .line 30
    iget-wide v4, p0, LD/p;->o:J

    .line 31
    .line 32
    iget-object v6, p0, LD/p;->h:Landroidx/compose/foundation/lazy/layout/b;

    .line 33
    .line 34
    iget-object v7, p0, LD/p;->b:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {v6, v2, v7}, Landroidx/compose/foundation/lazy/layout/b;->a(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-wide v6, p0, LD/p;->f:J

    .line 40
    .line 41
    invoke-static {v4, v5, v6, v7}, LW0/i;->c(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    invoke-static {p1, v3, v4, v5}, Lz0/I;->i(Lz0/I;Lz0/J;J)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    return-void
.end method

.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, LD/p;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LD/p;->r:Z

    .line 3
    .line 4
    return-void
.end method

.method public final e(III)V
    .locals 7

    .line 1
    const/4 v5, -0x1

    .line 2
    const/4 v6, -0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move v1, p1

    .line 6
    move v3, p2

    .line 7
    move v4, p3

    .line 8
    invoke-virtual/range {v0 .. v6}, LD/p;->k(IIIIII)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, LD/p;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public final g(I)J
    .locals 2

    .line 1
    iget-wide v0, p0, LD/p;->o:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getIndex()I
    .locals 1

    .line 1
    iget v0, p0, LD/p;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LD/p;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, LD/p;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public final i(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LD/p;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lz0/J;

    .line 8
    .line 9
    invoke-virtual {p1}, Lz0/J;->g()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final j()I
    .locals 1

    .line 1
    iget v0, p0, LD/p;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public final k(IIIIII)V
    .locals 4

    .line 1
    iput p4, p0, LD/p;->m:I

    .line 2
    .line 3
    iget-object p4, p0, LD/p;->d:LW0/l;

    .line 4
    .line 5
    sget-object v0, LW0/l;->r:LW0/l;

    .line 6
    .line 7
    if-ne p4, v0, :cond_0

    .line 8
    .line 9
    sub-int/2addr p3, p2

    .line 10
    iget p2, p0, LD/p;->c:I

    .line 11
    .line 12
    sub-int p2, p3, p2

    .line 13
    .line 14
    :cond_0
    int-to-long p2, p2

    .line 15
    const/16 p4, 0x20

    .line 16
    .line 17
    shl-long/2addr p2, p4

    .line 18
    int-to-long v0, p1

    .line 19
    const-wide v2, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v0, v2

    .line 25
    or-long p1, p2, v0

    .line 26
    .line 27
    iput-wide p1, p0, LD/p;->o:J

    .line 28
    .line 29
    iput p5, p0, LD/p;->p:I

    .line 30
    .line 31
    iput p6, p0, LD/p;->q:I

    .line 32
    .line 33
    return-void
.end method
