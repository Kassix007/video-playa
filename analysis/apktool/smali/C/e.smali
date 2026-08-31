.class public final LC/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE/o;


# instance fields
.field public final a:LC/A;


# direct methods
.method public constructor <init>(LC/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC/e;->a:LC/A;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, LC/e;->a:LC/A;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/A;->g()LC/s;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, LC/s;->n:I

    .line 8
    .line 9
    return v0
.end method

.method public final b()I
    .locals 2

    .line 1
    invoke-virtual {p0}, LC/e;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    iget-object v1, p0, LC/e;->a:LC/A;

    .line 8
    .line 9
    invoke-virtual {v1}, LC/A;->g()LC/s;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, LC/s;->k:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v1}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, LC/t;

    .line 20
    .line 21
    iget v1, v1, LC/t;->a:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC/e;->a:LC/A;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/A;->g()LC/s;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, LC/s;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    xor-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    return v0
.end method

.method public final d()I
    .locals 7

    .line 1
    iget-object v0, p0, LC/e;->a:LC/A;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/A;->g()LC/s;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, LC/s;->k:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return v2

    .line 17
    :cond_0
    invoke-virtual {v0}, LC/A;->g()LC/s;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v3, v1, LC/s;->o:Lw/d0;

    .line 22
    .line 23
    sget-object v4, Lw/d0;->q:Lw/d0;

    .line 24
    .line 25
    if-ne v3, v4, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, LC/s;->g()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    const-wide v5, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v3, v5

    .line 37
    :goto_0
    long-to-int v1, v3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v1}, LC/s;->g()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    const/16 v1, 0x20

    .line 44
    .line 45
    shr-long/2addr v3, v1

    .line 46
    goto :goto_0

    .line 47
    :goto_1
    invoke-virtual {v0}, LC/A;->g()LC/s;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v3, v0, LC/s;->k:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v4, v3

    .line 54
    check-cast v4, Ljava/util/Collection;

    .line 55
    .line 56
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    move v5, v2

    .line 61
    :goto_2
    if-ge v2, v4, :cond_2

    .line 62
    .line 63
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    check-cast v6, LC/t;

    .line 68
    .line 69
    iget v6, v6, LC/t;->k:I

    .line 70
    .line 71
    add-int/2addr v5, v6

    .line 72
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    div-int/2addr v5, v2

    .line 80
    iget v0, v0, LC/s;->q:I

    .line 81
    .line 82
    add-int/2addr v5, v0

    .line 83
    const/4 v0, 0x1

    .line 84
    if-nez v5, :cond_3

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    div-int/2addr v1, v5

    .line 88
    if-ge v1, v0, :cond_4

    .line 89
    .line 90
    :goto_3
    return v0

    .line 91
    :cond_4
    return v1
.end method

.method public final e()I
    .locals 2

    .line 1
    iget-object v0, p0, LC/e;->a:LC/A;

    .line 2
    .line 3
    iget-object v0, v0, LC/A;->d:LC/u;

    .line 4
    .line 5
    iget-object v0, v0, LC/u;->b:LP/c0;

    .line 6
    .line 7
    invoke-virtual {v0}, LP/c0;->e()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method
