.class public final Lt/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/C;


# instance fields
.field public final a:Lt/q;

.field public b:Z


# direct methods
.method public constructor <init>(Lt/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt/m;->a:Lt/q;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(LB0/T;Ljava/util/List;J)Lz0/D;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    move-object v1, p2

    .line 11
    check-cast v1, Ljava/util/Collection;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    check-cast v5, Lz0/B;

    .line 27
    .line 28
    invoke-interface {v5, p3, p4}, Lz0/B;->a(J)Lz0/J;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget v6, v5, Lz0/J;->q:I

    .line 33
    .line 34
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iget v6, v5, Lz0/J;->r:I

    .line 39
    .line 40
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-interface {p1}, Lz0/E;->r()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    const-wide p3, 0xffffffffL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    const/16 v1, 0x20

    .line 60
    .line 61
    iget-object v2, p0, Lt/m;->a:Lt/q;

    .line 62
    .line 63
    if-eqz p2, :cond_1

    .line 64
    .line 65
    const/4 p2, 0x1

    .line 66
    iput-boolean p2, p0, Lt/m;->b:Z

    .line 67
    .line 68
    iget-object p2, v2, Lt/q;->a:LP/f0;

    .line 69
    .line 70
    int-to-long v5, v3

    .line 71
    shl-long v1, v5, v1

    .line 72
    .line 73
    int-to-long v5, v4

    .line 74
    and-long/2addr p3, v5

    .line 75
    or-long/2addr p3, v1

    .line 76
    new-instance v1, LW0/k;

    .line 77
    .line 78
    invoke-direct {v1, p3, p4}, LW0/k;-><init>(J)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    iget-boolean p2, p0, Lt/m;->b:Z

    .line 86
    .line 87
    if-nez p2, :cond_2

    .line 88
    .line 89
    iget-object p2, v2, Lt/q;->a:LP/f0;

    .line 90
    .line 91
    int-to-long v5, v3

    .line 92
    shl-long v1, v5, v1

    .line 93
    .line 94
    int-to-long v5, v4

    .line 95
    and-long/2addr p3, v5

    .line 96
    or-long/2addr p3, v1

    .line 97
    new-instance v1, LW0/k;

    .line 98
    .line 99
    invoke-direct {v1, p3, p4}, LW0/k;-><init>(J)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2, v1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    :goto_1
    new-instance p2, LF/y;

    .line 106
    .line 107
    const/4 p3, 0x2

    .line 108
    invoke-direct {p2, p3, v0}, LF/y;-><init>(ILjava/util/ArrayList;)V

    .line 109
    .line 110
    .line 111
    sget-object p3, Ln5/t;->q:Ln5/t;

    .line 112
    .line 113
    invoke-interface {p1, v3, v4, p3, p2}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    return-object p1
.end method
