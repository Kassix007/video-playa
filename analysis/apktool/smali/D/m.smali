.class public final LD/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LD/r;

.field public final b:I

.field public final c:I

.field public final d:LD/l;

.field public final e:LD/u;

.field public final synthetic f:LD/r;


# direct methods
.method public constructor <init>(LD/r;IILD/l;LD/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD/m;->f:LD/r;

    .line 5
    .line 6
    iput-object p1, p0, LD/m;->a:LD/r;

    .line 7
    .line 8
    iput p2, p0, LD/m;->b:I

    .line 9
    .line 10
    iput p3, p0, LD/m;->c:I

    .line 11
    .line 12
    iput-object p4, p0, LD/m;->d:LD/l;

    .line 13
    .line 14
    iput-object p5, p0, LD/m;->e:LD/u;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(II)J
    .locals 3

    .line 1
    iget-object v0, p0, LD/m;->a:LD/r;

    .line 2
    .line 3
    iget-object v1, v0, LD/r;->a:[I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne p2, v2, :cond_0

    .line 7
    .line 8
    aget p1, v1, p1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    add-int/2addr p2, p1

    .line 12
    sub-int/2addr p2, v2

    .line 13
    iget-object v0, v0, LD/r;->b:[I

    .line 14
    .line 15
    aget v2, v0, p2

    .line 16
    .line 17
    aget p2, v1, p2

    .line 18
    .line 19
    add-int/2addr v2, p2

    .line 20
    aget p1, v0, p1

    .line 21
    .line 22
    sub-int p1, v2, p1

    .line 23
    .line 24
    :goto_0
    const/4 p2, 0x0

    .line 25
    if-gez p1, :cond_1

    .line 26
    .line 27
    move p1, p2

    .line 28
    :cond_1
    if-ltz p1, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const-string v0, "width must be >= 0"

    .line 32
    .line 33
    invoke-static {v0}, LW0/h;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_1
    const v0, 0x7fffffff

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p1, p2, v0}, LW0/b;->g(IIII)J

    .line 40
    .line 41
    .line 42
    move-result-wide p1

    .line 43
    return-wide p1
.end method

.method public final b(I)LD/q;
    .locals 13

    .line 1
    iget-object v0, p0, LD/m;->e:LD/u;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LD/u;->r(I)LD/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, v0, LD/t;->a:I

    .line 8
    .line 9
    iget-object v2, v0, LD/t;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x0

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    add-int v5, v1, v3

    .line 19
    .line 20
    iget v6, p0, LD/m;->b:I

    .line 21
    .line 22
    if-ne v5, v6, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget v5, p0, LD/m;->c:I

    .line 26
    .line 27
    move v10, v5

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    move v10, v4

    .line 30
    :goto_1
    new-array v5, v3, [LD/p;

    .line 31
    .line 32
    move v8, v4

    .line 33
    :goto_2
    if-ge v4, v3, :cond_2

    .line 34
    .line 35
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    check-cast v6, LD/b;

    .line 40
    .line 41
    iget-wide v6, v6, LD/b;->a:J

    .line 42
    .line 43
    long-to-int v9, v6

    .line 44
    invoke-virtual {p0, v8, v9}, LD/m;->a(II)J

    .line 45
    .line 46
    .line 47
    move-result-wide v11

    .line 48
    iget-object v6, p0, LD/m;->d:LD/l;

    .line 49
    .line 50
    add-int v7, v1, v4

    .line 51
    .line 52
    invoke-virtual/range {v6 .. v12}, LD/l;->a(IIIIJ)LD/p;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    add-int/2addr v8, v9

    .line 57
    aput-object v6, v5, v4

    .line 58
    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    iget-object v0, v0, LD/t;->b:Ljava/util/List;

    .line 63
    .line 64
    new-instance v6, LD/q;

    .line 65
    .line 66
    iget-object v9, p0, LD/m;->f:LD/r;

    .line 67
    .line 68
    move v7, p1

    .line 69
    move-object v8, v5

    .line 70
    move v11, v10

    .line 71
    move-object v10, v0

    .line 72
    invoke-direct/range {v6 .. v11}, LD/q;-><init>(I[LD/p;LD/r;Ljava/util/List;I)V

    .line 73
    .line 74
    .line 75
    return-object v6
.end method
