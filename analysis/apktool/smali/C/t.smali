.class public final LC/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE/B;


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;

.field public final c:Lc0/c;

.field public final d:LW0/l;

.field public final e:I

.field public final f:J

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Landroidx/compose/foundation/lazy/layout/b;

.field public j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public n:Z

.field public o:I

.field public final p:[I


# direct methods
.method public constructor <init>(ILjava/util/List;Lc0/c;LW0/l;IIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/b;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LC/t;->a:I

    .line 5
    .line 6
    iput-object p2, p0, LC/t;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, LC/t;->c:Lc0/c;

    .line 9
    .line 10
    iput-object p4, p0, LC/t;->d:LW0/l;

    .line 11
    .line 12
    iput p7, p0, LC/t;->e:I

    .line 13
    .line 14
    iput-wide p8, p0, LC/t;->f:J

    .line 15
    .line 16
    iput-object p10, p0, LC/t;->g:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p11, p0, LC/t;->h:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p12, p0, LC/t;->i:Landroidx/compose/foundation/lazy/layout/b;

    .line 21
    .line 22
    const/high16 p1, -0x80000000

    .line 23
    .line 24
    iput p1, p0, LC/t;->o:I

    .line 25
    .line 26
    move-object p1, p2

    .line 27
    check-cast p1, Ljava/util/Collection;

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 p3, 0x0

    .line 34
    move p4, p3

    .line 35
    move p5, p4

    .line 36
    move p6, p5

    .line 37
    :goto_0
    if-ge p4, p1, :cond_0

    .line 38
    .line 39
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p7

    .line 43
    check-cast p7, Lz0/J;

    .line 44
    .line 45
    iget p8, p7, Lz0/J;->r:I

    .line 46
    .line 47
    add-int/2addr p5, p8

    .line 48
    iget p7, p7, Lz0/J;->q:I

    .line 49
    .line 50
    invoke-static {p6, p7}, Ljava/lang/Math;->max(II)I

    .line 51
    .line 52
    .line 53
    move-result p6

    .line 54
    add-int/lit8 p4, p4, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iput p5, p0, LC/t;->k:I

    .line 58
    .line 59
    iget p1, p0, LC/t;->e:I

    .line 60
    .line 61
    add-int/2addr p5, p1

    .line 62
    if-gez p5, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move p3, p5

    .line 66
    :goto_1
    iput p3, p0, LC/t;->l:I

    .line 67
    .line 68
    iput p6, p0, LC/t;->m:I

    .line 69
    .line 70
    iget-object p1, p0, LC/t;->b:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    mul-int/lit8 p1, p1, 0x2

    .line 77
    .line 78
    new-array p1, p1, [I

    .line 79
    .line 80
    iput-object p1, p0, LC/t;->p:[I

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final a(Lz0/I;)V
    .locals 8

    .line 1
    iget v0, p0, LC/t;->o:I

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
    iget-object v0, p0, LC/t;->b:Ljava/util/List;

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
    invoke-virtual {p0, v2}, LC/t;->g(I)J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    iget-object v6, p0, LC/t;->i:Landroidx/compose/foundation/lazy/layout/b;

    .line 35
    .line 36
    iget-object v7, p0, LC/t;->g:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v6, v2, v7}, Landroidx/compose/foundation/lazy/layout/b;->a(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-wide v6, p0, LC/t;->f:J

    .line 42
    .line 43
    invoke-static {v4, v5, v6, v7}, LW0/i;->c(JJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    invoke-static {p1, v3, v4, v5}, Lz0/I;->i(Lz0/I;Lz0/J;J)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    return-void
.end method

.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, LC/t;->b:Ljava/util/List;

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
    iput-boolean v0, p0, LC/t;->n:Z

    .line 3
    .line 4
    return-void
.end method

.method public final e(III)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, LC/t;->k(III)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, LC/t;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public final g(I)J
    .locals 6

    .line 1
    mul-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    iget-object v0, p0, LC/t;->p:[I

    .line 4
    .line 5
    aget v1, v0, p1

    .line 6
    .line 7
    add-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    aget p1, v0, p1

    .line 10
    .line 11
    int-to-long v0, v1

    .line 12
    const/16 v2, 0x20

    .line 13
    .line 14
    shl-long/2addr v0, v2

    .line 15
    int-to-long v2, p1

    .line 16
    const-wide v4, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr v2, v4

    .line 22
    or-long/2addr v0, v2

    .line 23
    return-wide v0
.end method

.method public final getIndex()I
    .locals 1

    .line 1
    iget v0, p0, LC/t;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LC/t;->g:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final i(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LC/t;->b:Ljava/util/List;

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
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final k(III)V
    .locals 7

    .line 1
    iput p1, p0, LC/t;->j:I

    .line 2
    .line 3
    iput p3, p0, LC/t;->o:I

    .line 4
    .line 5
    iget-object p3, p0, LC/t;->b:Ljava/util/List;

    .line 6
    .line 7
    move-object v0, p3

    .line 8
    check-cast v0, Ljava/util/Collection;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lz0/J;

    .line 22
    .line 23
    mul-int/lit8 v3, v1, 0x2

    .line 24
    .line 25
    iget-object v4, p0, LC/t;->c:Lc0/c;

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    iget v5, v2, Lz0/J;->q:I

    .line 30
    .line 31
    iget-object v6, p0, LC/t;->d:LW0/l;

    .line 32
    .line 33
    invoke-virtual {v4, v5, p2, v6}, Lc0/c;->a(IILW0/l;)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    iget-object v5, p0, LC/t;->p:[I

    .line 38
    .line 39
    aput v4, v5, v3

    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    aput p1, v5, v3

    .line 44
    .line 45
    iget v2, v2, Lz0/J;->r:I

    .line 46
    .line 47
    add-int/2addr p1, v2

    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const-string p1, "null horizontalAlignment when isVertical == true"

    .line 52
    .line 53
    invoke-static {p1}, Lz/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 54
    .line 55
    .line 56
    new-instance p1, LC2/e;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_1
    return-void
.end method
